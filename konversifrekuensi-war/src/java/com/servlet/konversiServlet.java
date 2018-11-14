/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.session.konversifrekuensi;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kent
 */
public class konversiServlet extends HttpServlet {

    @EJB
    private konversifrekuensi konversifrekuensi;

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
        PrintWriter out = response.getWriter();     
        try {            
            out.println("<html>");
            out.println("<body");
            out.println("<h1><center>Tugas RSBK Konversi Frekuensi</center></h1>");
            String frek = request.getParameter("frek");
            
            if ((frek != null) && (frek.length() > 0)) {
                double d = Double.parseDouble(frek);
                if (request.getParameter("Hertz ke KiloHertz") != null){
                    String hzkhz = konversifrekuensi.hertz_Kilohertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+hzkhz+"</p>");
                } 
                if (request.getParameter("Hertz ke MegaHertz") != null){
                    String hzmhz = konversifrekuensi.hertz_Megahertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+hzmhz+"</p>");
                }
                if (request.getParameter("Hertz ke GigaHertz") != null){
                    String hzghz = konversifrekuensi.hertz_Gigahertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+hzghz+"</p>");
                }
                if (request.getParameter("KiloHertz ke Hertz") != null){
                    String khzhz = konversifrekuensi.kilohertz_Hertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+khzhz+"</p>");
                }
                 if (request.getParameter("KiloHertz ke MegaHertz") != null){
                    String khzmhz = konversifrekuensi.kilohertz_Megahertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+khzmhz+"</p>");
                }
                  if (request.getParameter("KiloHertz ke GigaHertz") != null){
                    String khzghz = konversifrekuensi.kilohertz_Gigahertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+khzghz+"</p>");
                }
                   if (request.getParameter("MegaHertz ke Hertz") != null){
                    String mhzhz = konversifrekuensi.megahertz_Hertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+mhzhz+"</p>");
                }
                   if (request.getParameter("MegaHertz ke KiloHertz") != null){
                    String mhzkhz = konversifrekuensi.megahertz_Kilohertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+mhzkhz+"</p>");
                }
                   if (request.getParameter("MegaHertz ke GigaHertz") != null){
                    String mhzghz = konversifrekuensi.megahertz_Gigahertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+mhzghz+"</p>");
                }
                   if (request.getParameter("GigaHertz ke Hertz") != null){
                    String ghzhz = konversifrekuensi.gigahertz_Hertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+ghzhz+"</p>");
                }
                      if (request.getParameter("GigaHertz ke KiloHertz") != null){
                    String ghzkhz = konversifrekuensi.gigahertz_Kilohertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+ghzkhz+"</p>");
                }
                         if (request.getParameter("GigaHertz ke MegaHertz") != null){
                    String ghzmhz = konversifrekuensi.gigahertz_Megahertz(d);
                    out.println("<p> HASIL KONVERSI FREKUENSI: "+ghzmhz+"</p>");
                }
               
            } else {
                out.println("<center>");
                out.println("<p>Masukan Frekuensi:</p>");
                out.println("<form method=\"get\">");
                out.println("<p><input type=\"text\" name=\"frek\" size=\"20\"></p>");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"Hertz ke KiloHertz\" value=\"Hertz ke KiloHertz\">"+ "<input type=\"submit\" name=\"Hertz ke MegaHertz\" value=\"Hertz ke MegaHertz\">"+ "<input type=\"submit\" name=\"Hertz ke GigaHertz\" value=\"Hertz ke GigaHertz\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"KiloHertz ke Hertz\" value=\"KiloHertz ke Hertz\">"+ "<input type=\"submit\" name=\"KiloHertz ke MegaHertz\" value=\"KiloHertz ke MegaHertz\">"+ "<input type=\"submit\" name=\"KiloHertz ke GigaHertz\" value=\"KiloHertz ke GigaHertz\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"MegaHertz ke Hertz\" value=\"MegaHertz ke Hertz\">"+ "<input type=\"submit\" name=\"MegaHertz ke KiloHertz\" value=\"MegaHertz ke KiloHertz\">"+ "<input type=\"submit\" name=\"MegaHertz ke GigaHertz\" value=\"MegaHertz ke GigaHertz\">");
                out.println("<br/>");
                out.println("<br/>");
                out.println("<input type=\"submit\" name=\"GigaHertz ke Hertz\" value=\"GigaHertz ke Hertz\">"+ "<input type=\"submit\" name=\"GigaHertz ke KiloHertz\" value=\"GigaHertz ke KiloHertz\">"+ "<input type=\"submit\" name=\"GigaHertz ke MegaHertz\" value=\"GigaHertz ke MegaHertz\">");
                out.println("</center>");
                out.println("</form>");
            }        
        } finally {
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
            out.close();
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
