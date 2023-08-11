package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kevlo
 */
@WebServlet(name = "IMCServlet", urlPatterns = {"/IMCServlet"})
public class IMCServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String tmp = null;
            float peso = 0;
            float altura = 0;
            float imc = 0;

            if(request.getParameter("peso")!=null && !request.getParameter("peso").isEmpty()){
            tmp = request.getParameter("peso");
            peso = Float.parseFloat(tmp.replaceAll(",", "."));
        }
            if(request.getParameter("altura")!=null && !request.getParameter("altura").isEmpty()){
            tmp = request.getParameter("altura");
            altura = Float.parseFloat(tmp.replaceAll(",", "."));
        
        }
            if(peso==0 && altura==0){
            request.setAttribute("imc", 0);
        }else{  
            imc = peso / (altura * altura);
              request.setAttribute("imc", imc);
        }
           
            request.getRequestDispatcher("ResultadoIMC.jsp").forward(request, response);
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