package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.cj.protocol.Resultset;

public class DAO {
	/** Modulo de conexao **/
	// Parametros de conexao
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/banco?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "12345";

	// Metodo de conexao
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/** Crud Create **/
	public void inserir(JavaBeans contato) {
		String create = "insert into conteiner (cliente, tipo, estatus, conteiner, categoria, movimentacao, horainicio, horafim, datainicio, datafim) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

		try {
			// abrir a conexao
			Connection con = conectar();
			// Preparar aa query para execucao no banco de dados
			PreparedStatement pst = con.prepareStatement(create);
			// Subistitui os sinais (?) pelo conteudo daas variaveis JavaBeans
			pst.setString(1, contato.getCliente());
			pst.setString(2, contato.getTipo());
			pst.setString(3, contato.getStatus());
			pst.setString(4, contato.getNumconteiner());
			pst.setString(5, contato.getCategoria());
			pst.setString(6, contato.getMovimentacao());
			pst.setString(7, contato.getHorainicio());
			pst.setString(8, contato.getHorafim());
			pst.setString(9, contato.getDatainicio());
			pst.setString(10, contato.getDatafim());

			// Executar a query
			pst.executeUpdate();
			// Fechar a conexao
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/** Crud Read **/
	
	public ArrayList<JavaBeans> listar() {
		// Criando Objeto para acessar JavaBeans
		ArrayList<JavaBeans> clientes = new ArrayList<JavaBeans>();
		String read = "select * from conteiner ORDER BY cliente, movimentacao;";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			//  o laço sera executado enquanto houver dados no banco
			while (rs.next()) {
				// Variaveis para armazenar dados do banco
				String cliente = rs.getString(1);
				String tipo = rs.getString(2);
				String estatus = rs.getString(3);
				String conteiner = rs.getString(4);
				String categoria = rs.getString(5);
				String movimentacao = rs.getString(6);
				String horainicio = rs.getString(7);
				String horafim = rs.getString(8);
				String datainicio = rs.getString(9);
				String datafim = rs.getString(10);
				//populando o ArrayList
				clientes.add(new JavaBeans(cliente, tipo, estatus, conteiner, categoria, movimentacao, horainicio,
						horafim, datainicio, datafim));
			}
			con.close();
			return clientes;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	
	
	

	

}