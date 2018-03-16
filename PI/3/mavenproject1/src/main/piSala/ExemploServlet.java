package piSala;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author andre.ayamamoto
 */
@WebServlet(name = "ExemploServlet", urlPatterns = ("/xpto"))
public class ExemploServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String msg = "Primeiro Exemplo";

        try (PrintWriter printer = resp.getWriter()) {

            resp.setStatus(200);
            resp.setContentType("text/plain");
            resp.setCharacterEncoding("UTF-8");

            printer.println(msg);
            printer.flush();
        }
    }

}
