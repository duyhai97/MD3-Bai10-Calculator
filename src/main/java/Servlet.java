import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a = Double.parseDouble(request.getParameter("first"));
        double b =  Double.parseDouble(request.getParameter("second"));

        double result;

        String select = request.getParameter("operator");
        switch (select){
            case "ADD" :
              result =  Calculator.Cong(a,b);
                PrintWriter writer = response.getWriter();
                writer.println("<html>");
                writer.println("Result: " + result );
                writer.println("</html>");
                break;
            case "MIN" :
                result =  Calculator.tru(a,b);
                PrintWriter writer1 = response.getWriter();
                writer1.println("<html>");
                writer1.println("Result: " + result );
                writer1.println("</html>");
                break;
            case "MUL" :
                result =  Calculator.nhan(a,b);
                PrintWriter writer2 = response.getWriter();
                writer2.println("<html>");
                writer2.println("Result: " + result );
                writer2.println("</html>");
                break;
            case "DIV" :
                result =  Calculator.chia(a,b);
                PrintWriter writer3 = response.getWriter();
                writer3.println("<html>");
                writer3.println("Result: " + result );
                writer3.println("</html>");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
