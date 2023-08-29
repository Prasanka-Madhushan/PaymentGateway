

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/PaymentServices"})
public class PaymentServices extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        String Name=request.getParameter("uname");
        
        out.print(Name);
        out.print("\n");
        
        String Phno=request.getParameter("tp");
        
        out.print(Phno);
        out.print("\n");
        
        String Email=request.getParameter("email");
        
        out.print(Email);
        out.print("\n");
        
        String Address=request.getParameter("address");
        
        out.print(Address);
        out.print("\n");
        
        String City=request.getParameter("city");
        
        out.print(City);
        out.print("\n");
        
        String State=request.getParameter("state");
        
        out.print(State);
        out.print("\n");
        
        String Zip=request.getParameter("zipcode");
        
        out.print(Zip);
        out.print("\n");
        
        String Holdname=request.getParameter("holdername");
        
        out.print(Holdname);
        out.print("\n");
        
        String Cno=request.getParameter("cardno");
        
        out.print(Cno);
        out.print("\n");
        
        String Cexp=request.getParameter("expmonth");
        
        out.print(Cexp);
        out.print("\n");
        
        String Expyr=request.getParameter("expyr");
        
        out.print(Expyr);
        out.print("\n");
        
        String Cvv=request.getParameter("cvvno");
        
        out.print(Cvv);
        out.print("\n");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
