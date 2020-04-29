package assignment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public Servlet2() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		int pincode=Integer.parseInt(request.getParameter("pincode"));  
		String technology=request.getParameter("technology"); 
		
	
        out.print("<h1>PINCODE</h1>");
        out.print(pincode);
        out.print("<h2>TECHNOLOGY</h2>");
        out.print(technology);

		Map<Integer,String> map = new HashMap();
		map.put(201308,"Delhi");
		map.put(201307,"NOIDA");
		map.put(201306,"GreaterNoida");
		map.put(201305,"Mathura");
		map.put(201304,"Gaziabad");
		
		for(Integer i:map.keySet())
		{if(i==pincode &&  technology.equalsIgnoreCase("java")) 
		{
			out.print("Related Jobs: Java core developer");
			out.print("City"+map.get(i));
			
		}else
			if(i==pincode &&  technology.equalsIgnoreCase("J2EE")) 
		{
				out.print("Related Jobs: Advance developer");
				out.print("City"+map.get(i));
		}
		}
		
	}

	
	

}
