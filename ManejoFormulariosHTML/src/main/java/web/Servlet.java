package web;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologia");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentarios");

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Resultado Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet:</h1>");
        out.print("<table border='1'>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario");
        out.print("</td>");
        out.print("<td>");
        out.print(usuario);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Password");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologias");
        out.print("</td>");
        out.print("<td>");
        for (String tecnologia : tecnologias) {
            out.print(tecnologia);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Genero");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<td>");
        out.print("Musica Favorita");
        out.print("</td>");
        out.print("<td>");
        if (musica != null) {
            for (String m : musica) {
                out.print(musica);
                out.print(" / ");
            }
        } else {
            out.print("valor no proporcionado");
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentaios");
        out.print("</td>");
        out.print("<td>");
        out.print(comentario);
        out.print("</td>");
        out.print("</tr>");

        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
