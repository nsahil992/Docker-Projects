import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<String> items = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        // Define API Endpoints
        handler.addServletWithMapping(GetItemsServlet.class, "/items"); // GET
        handler.addServletWithMapping(AddItemServlet.class, "/items"); // POST

        server.start();
        server.join();
    }

    public static class GetItemsServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.setContentType("application/json");
            resp.getWriter().write(items.toString());
        }
    }

    public static class AddItemServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            String item = req.getReader().readLine();
            items.add(item);
            resp.getWriter().write("Item added: " + item);
        }
    }
}

