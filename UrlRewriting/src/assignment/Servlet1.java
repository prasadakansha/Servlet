package assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet1() {
 
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
			int pincode=Integer.parseInt(request.getParameter("pincode"));  
			String technology=request.getParameter("technology"); 
          
        
        out.print("<a href='Servlet2?pincode="+pincode+"&"+"technology="+technology+"'>visit</a>");
	}

	

}
