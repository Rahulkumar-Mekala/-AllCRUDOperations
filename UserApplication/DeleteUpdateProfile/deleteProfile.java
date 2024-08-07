package DeleteUpdateProfile;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class deleteProfile extends HttpServlet {
	 public  void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		 Cookie[] cookies = request.getCookies();
		  if (cookies==null) {
			   request.setAttribute("msg", " Session Expried...");
			    request.getRequestDispatcher("msg").forward(request, response);
			
		} else {
			 String value = cookies[0].getValue();
			 request.setAttribute("fname", value);
			 request.getRequestDispatcher("deleteprofile.jsp").forward(request, response);

		}
		 
	 }

}
