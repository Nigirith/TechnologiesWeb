package lab.mvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lab.mvc.model.Person;
import javax.servlet.RequestDispatcher;

/**
 * Servlet implementation class Controller
 */
@WebServlet(name = "Controller", urlPatterns = { "/Controller" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		Person personne = new Person();
		personne.setFirstName(request.getParameter("firstName"));
		personne.setLastName(request.getParameter("lastName"));
		personne.setBirthDay(request.getParameter("birthDay"));
		personne.setSex(request.getParameter("sex"));
		request.setAttribute("bean", personne);
		String year = personne.getBirthDay().substring(personne.getBirthDay().length() - 4);
		
		if(Integer.parseInt(year)<1990) {
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/old.jsp");
			dispatcher.include(request, response);
		}
		else {
			RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/young.jsp");
			dispatcher.include(request, response);
		}
	}

}
