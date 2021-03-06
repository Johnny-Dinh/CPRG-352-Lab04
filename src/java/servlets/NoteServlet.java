package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import models.Note;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 792268
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve the text file
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        // Read the text file
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        // Note object of Note Class
        Note note = new Note(br.readLine(), br.readLine());
        //br.close();
        request.setAttribute("note", note);
        
        String title = "";
        String contents = "";
        request.setAttribute("title", title);
        request.setAttribute("contents", contents);
        
        String edit = request.getParameter("edit");
        if (edit == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
        }
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        // Write to the text file
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        
        String title = request.getParameter("title");
        String contents = request.getParameter("contents");
        
        // Prints out the input into the text file
        pw.println("title");
        pw.println("contents");
        
        Note note = new Note(title, contents);
        request.setAttribute("note",note);
        
        String edit = request.getParameter("edit");
        if (edit != null || edit != "") {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, response);
        }
        return;
    }
}
