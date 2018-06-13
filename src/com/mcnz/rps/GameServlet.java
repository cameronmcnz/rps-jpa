package com.mcnz.rps;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	GameService gameService = new GameService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clientGesture = request.getParameter("choice");
		GameSummary gameSummary = gameService.playRoshambo(clientGesture, "rock");
		
		
		EntityManager em = Persistence.createEntityManagerFactory("RoshamboWeb").createEntityManager();
		em.getTransaction().begin();
		em.persist(gameSummary);	
		em.getTransaction().commit();
		
		request.setAttribute("gameSummary", gameSummary);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}


/*EntityManagerFactory emf = 

GameSummary gameSummary = GameService.playRoshambo("rock", "rock");
em.getTransaction().begin();
em.persist(gameSummary);
em.getTransaction().commit();
*/