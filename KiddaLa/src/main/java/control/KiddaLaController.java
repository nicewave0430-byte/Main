package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.CustomerSearchAction;

@WebServlet("/KiddaLaController")
public class KiddaLaController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String command = request.getParameter("command");
        String nextPage = null;

        try {
            if (command == null || "".equals(command)) {
                nextPage = "CustomerSearch.jsp";
            } else if ("CustomerSearchDisplay".equals(command)) {
                nextPage = "CustomerSearch.jsp";
            } else if ("CustomerSearch".equals(command)) {
                String[] data = new String[2];
                data[0] = request.getParameter("tel");
                data[1] = request.getParameter("kana");

                CustomerSearchAction action = new CustomerSearchAction();
                String[][] tableData = action.execute(data);

                request.setAttribute("tableData", tableData);
                nextPage = "CustomerSearch.jsp";
            } else {
                nextPage = "CustomerSearch.jsp";
            }

            request.getRequestDispatcher(nextPage).forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}