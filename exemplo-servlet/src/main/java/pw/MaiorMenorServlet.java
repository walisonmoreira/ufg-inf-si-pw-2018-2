package pw;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/maior-menor")
public class MaiorMenorServlet extends HttpServlet {
    @Override
    //Respode por qualquer método HTTP.
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idadeStr = request.getParameter("idade");
        int idade = 0;
        if (idadeStr != null) {
            idade = Integer.parseInt(idadeStr);
        }

        String resultado = "";
        if (MaiorMenorModel.maior(idade)) {
            resultado = "De maior! :)";
        } else {
            resultado = "De menor! :)";
        }
        //Adiciona a variável na requisição para o JSP trabalhar.
        request.setAttribute("resultado", resultado);

        //Redireciona requisição para o JSP.
        request.getRequestDispatcher("/maior-menor.jsp").forward(request, response);
    }
}