package controller;

import java.sql.Connection;
import java.sql.SQLException;

import DAO.ReservaDAO;
import factory.ConnectionFactory;
import model.Reservas;

public class ReservasController {
	
	private ReservaDAO reservaDAO;
	
	public ReservasController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}
	
	public void salvar(Reservas reserva) {
		try {
			this.reservaDAO.salvar(reserva);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
