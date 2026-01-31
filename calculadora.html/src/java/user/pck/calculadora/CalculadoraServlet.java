/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package user.pck.calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.pck.calculadora.Calculadora;

/**
 *
 * @author joser
 */
public class CalculadoraServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            
            Calculadora calc = new Calculadora() ;
            
            double resultado = calc.calcular(Double.parseDouble(request.getParameter("numero1")),
                               Double.parseDouble(request.getParameter("numero2")), request.getParameter("operacion"));
            
        
        
        
        try (PrintWriter out = response.getWriter()) {
             
            String num1Str = request.getParameter("numero1");
            String num2Str = request.getParameter("numero2");
            String operacion = request.getParameter("operacion");
            
            
            double numero1 = Double.parseDouble(num1Str);
            double numero2 = Double.parseDouble(num2Str);
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado de la operación</h1>");
            out.println("<p>Número 1: " + numero1 + "</p>");
            out.println("<p>Número 2: " + numero2 + "</p>");
            out.println("<p>Operación: " + operacion + "</p>");
            out.println("<h2>Resultado: " + resultado + "</h2>");
            out.println("<a href=\"http://localhost:8080/calculadora.html\" class=\"btn-volver\">Volver al inicio</a>");
            out.println("</body>");
            out.println("</html>");

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
