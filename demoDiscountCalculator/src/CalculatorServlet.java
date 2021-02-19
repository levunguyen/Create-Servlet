import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator", urlPatterns = "/calculator")
public class CalculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String description = request.getParameter("description");
        float price= Float.parseFloat(request.getParameter("price"));
        int discount_percent= Integer.parseInt(request.getParameter("discount_percent"));
        float discount =price*discount_percent/100;
        float total = price-discount;
        String patter ="^[]$";
        description.matches(patter);
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<h1>Description: "+description+"</h1>");
        writer.print("<h1>Price: "+price+"</h1>");
        writer.print("<h1>Discount percent: "+discount_percent+"</h1>");
        writer.print("<h1>Discount: "+discount+"</h1>");
        writer.print("<h1>Total price: "+total+"</h1>");
        writer.print("</html>");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
