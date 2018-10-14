package first.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import isep.lab1.bean.Person;

/**
 * Servlet implementation class HelloWord
 */
@WebServlet(name="MyNewFile" , urlPatterns= {"/FormServlet","/Form_Servlet"})
public class HelloWord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWord() {
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
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String birthDay = request.getParameter("birthDay");
		String sex = request.getParameter("sex");
		
		Cookie cFirstName=new Cookie("FirstName",firstName);
		Cookie cLastName=new Cookie("LastName",lastName);
		Cookie cBirthday=new Cookie("Birthday",birthDay);
		Cookie cSex=new Cookie("Sex",sex);
		
		response.setContentType("text/html");
		response.addCookie(cFirstName);
		response.addCookie(cLastName);
		response.addCookie(cBirthday);
		response.addCookie(cSex);
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>OurFirstServlet</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Tableau</H1>");
		out.println("<table><tr><td>Prénom</td>");
		out.println("<td>Nom</td>");
		out.println("<td>Anniversaire</td>");
		out.println("<td>Genre</td></tr>");
		out.println("<tr><td>");
		out.println(firstName);
		out.println("</td><td>");
		out.println(lastName);
		out.println("</td><td>");
		out.println(birthDay);
		out.println("</td><td>");
		out.println(sex);
		out.println("</td></tr></table>");
		out.println("</BODY></HTML>");
		out.close();
		
		doGet(request, response);
	}

}
