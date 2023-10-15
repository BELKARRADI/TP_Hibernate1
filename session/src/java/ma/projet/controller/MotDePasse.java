package ma.projet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import ma.projet.entity.Client;
import ma.projet.service.ClientService;
import ma.projet.util.EmailSender;
import ma.projet.util.Utils;

/**
 *
 * @author Lachgar
 */
@WebServlet(name = "MotDePasse", urlPatterns = {"/MotDePasse"})
public class MotDePasse extends HttpServlet {

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

        String email = request.getParameter("email");
        ClientService cs = new ClientService();
        Client clt = cs.getByEmail(email);
        if (clt == null) {
            request.setAttribute("msg", "email inexistant");
            request.getRequestDispatcher("MotDePasse.jsp").forward(request, response);
        } else {
            Random random = new Random();
            int min = 1000; 
            int max = 9999; 

            int randomNumber = random.nextInt((max - min) + 1) + min;
            String corpEmail="Voila votre nouveau Code:"+randomNumber;
            clt.setCode(randomNumber);
            cs.update(clt);
            EmailSender.sendEmail(email, "Recuperation de mot de passe", corpEmail);
            HttpSession session = request.getSession();
            session.setAttribute("client", clt);
            request.getRequestDispatcher("RandomInt.jsp").forward(request, response);
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
