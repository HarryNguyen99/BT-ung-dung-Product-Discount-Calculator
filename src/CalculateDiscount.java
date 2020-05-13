import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscount", urlPatterns = "/discount")
public class CalculateDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mota = request.getParameter("mota");
        float gia = Float.parseFloat(request.getParameter("gia"));
        float chietkhau = Float.parseFloat(request.getParameter("chietkhau"));

        float Price = (float) (gia * chietkhau *0.01);
        float Amount = gia - Price;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>mota: " + mota+ "</h1>");
        writer.println("<h1>gia: " + gia+ "</h1>");
        writer.println("<h1>chietkhau: " + chietkhau+ "%</h1>");
        writer.println("<h1>Amount: " + Amount+ "</h1>");
        writer.println("<h1>Price: " + Price+ "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
