package controlador;

import dao.DaoWorld;
import datos.Pais;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import javax.annotation.Resource;
import javax.sql.DataSource;

@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    @Resource(name="world")
    DataSource dataSource;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        request.setAttribute("name", name);
        DaoWorld dao=new DaoWorld();
        try {
            ArrayList<Pais> listaCiudades = (ArrayList<Pais>) dao.getPaisesByContinent(name, dataSource.getConnection());
            request.setAttribute("listaCiudades", listaCiudades);
            
            request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
            //request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("vistafinal.jsp").forward(request, response);
        } finally {

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}