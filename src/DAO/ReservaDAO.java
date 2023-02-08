package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.protocol.Resultset;
import model.Reservas;

public class ReservaDAO {
	private Connection connection;

	public ReservaDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void salvar(Reservas reserva) throws SQLException {
		String sql = "INSERT INTO reservas(data_entrada,data_saida,valor,forma_pagamento) VALUES (?,?,?,?)";
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setDate(1, reserva.getDataEntrada());
			pstm.setDate(2, reserva.getDataSaida());
			pstm.setString(3, reserva.getValor());
			pstm.setString(4, reserva.getFormaPagamento());
			pstm.executeUpdate();
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					reserva.setId(rst.getInt(1));
				}
			}
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
