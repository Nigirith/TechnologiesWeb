

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListItems
 */
@WebServlet("/ListItems")
public class ListItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String newItem = request.getParameter("newItem");
		
		if(session.isNew()) {
			ArrayList<String> items = new ArrayList<String>();
			items.add(newItem);
			session.setAttribute("items", items);
		}
		else {
			ArrayList<String> items = (ArrayList<String>)session.getAttribute("items");
			items.add(newItem);
			session.setAttribute("items", items);
		}
		
		for(int i=0 ; i<items.lenght() ; i++) {
			out.println(items.get(i));
		}
		out.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
