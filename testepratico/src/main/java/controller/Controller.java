package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;


@WebServlet(urlPatterns = {"/Controller", "/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	JavaBeans contato = new JavaBeans();

	
       
    
    public Controller() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		
		if (action.equals("/main")){
			contatos(request, response);
		} else if (action.equals("/insert")) {
			novoContato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}
	
	// Listar
	protected void contatos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Criando objeeto que irá rreceber os dados JavaBeans
		ArrayList<JavaBeans> lista = dao.listar();
		// Encaminhar a listaa ao documento agenda.jsp
		request.setAttribute("contato", lista);
		RequestDispatcher rd =  request.getRequestDispatcher("agenda.jsp");
		rd.forward(request, response);
	}
	
	// Novo Cadastro
		protected void novoContato(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			//setar as variaveis javabeans
			contato.setCategoria(request.getParameter("categoria"));
			contato.setCliente(request.getParameter("cliente"));
			contato.setDatafim(request.getParameter("datafim"));
			contato.setDatainicio(request.getParameter("datainicio"));
			contato.setHorafim(request.getParameter("horafinal"));
			contato.setHorainicio(request.getParameter("horainicio"));
			contato.setMovimentacao(request.getParameter("tmovimentacao"));
			contato.setStatus(request.getParameter("status"));
			contato.setTipo(request.getParameter("tipo"));
			contato.setNumconteiner(request.getParameter("numconteiner"));
			//invocar o metodo inserir
			dao.inserir(contato);
			// redirecionar para o documento de movimentacoes
			response.sendRedirect("index.html");
			
			
		
			
		}

}
