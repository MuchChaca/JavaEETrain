package pkg1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servelet3
 */
@WebServlet("/pedobear-run")
public class Servelet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servelet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Get parameter
		String nom = req.getParameter("name");
		
		int nbVisits;
		
		try {
			nbVisits = (int)req.getSession().getAttribute("nbVisits");
		} catch (Exception ex) {
			nbVisits = 0;
		}
		
		nbVisits++;
		
		HttpSession session = req.getSession();
		String n1 = (String)session.getAttribute("n1");
		
		Cookie cookie1 = null;
		Cookie userName = null;
		Cookie[] ck = req.getCookies();
		
		for(Cookie c : ck ) {
			if (c.getName().equals("ckv1")) {
				cookie1 = c;
			}
			if (c.getName().equals("user_name")) {
				userName = c;
			}
		}
		
		req.getSession().setAttribute("nbVisits", nbVisits);
	
		resp.getWriter().print("<html><body><a href=\"/JavaEE-Project1/pedobear-hi\">Hi?</a>"
				+ "<h1>Pedobear says run !</h1><p><img src=\"https://media.tenor.com/images/c5735daabe5bf56e15371e7abc27fe5f/tenor.gif\"></p>"
				+ "<p>"+ nom +"</p>"
				+ "<p>NbVisits: "+ nbVisits +"</p>"
				+ "<p>n1: "+ n1 +"</p>"
//				+ "<p>cookie1: "+ cookie1.getValue() +"</p>"
				+ "<p>username: "+ userName.getValue() +"</p>"
				+ "</body></html>");

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String name = req.getParameter("name");
		
		Cookie cookie1 = new Cookie("user_name", name);
		resp.addCookie(cookie1);
		
		try {
			resp.getWriter().print("<html>Hello " + name + "</html>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			resp.sendRedirect("/JavaEE-Project1/pedobear-run");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
