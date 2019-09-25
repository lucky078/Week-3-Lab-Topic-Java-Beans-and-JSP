/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 749300
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String edit = request.getParameter("edit");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        if (edit != null) {
            
// to read files 
            String firstLine;
            String secondLine;
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            firstLine = br.readLine();
            secondLine = br.readLine();

            Note n = new Note(firstLine, secondLine);
            request.setAttribute("note", n);
                getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
           

        }
            String firstLine;
            String secondLine;
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
            firstLine = br.readLine();
            secondLine = br.readLine();

            Note n = new Note(firstLine, secondLine);
            request.setAttribute("note", n);
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


  String firstLine = request.getParameter("tit");
        String secondLine = request.getParameter("con");
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // to write to a file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));        
        pw.write(firstLine);
        pw.write(secondLine);
        
        Note n = new Note(firstLine, secondLine);
        request.setAttribute("note", n);
        pw.close();
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);

    }

}
