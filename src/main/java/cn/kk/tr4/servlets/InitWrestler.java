package cn.kk.tr4.servlets;

import cn.kk.tr4.entity.Wrestler;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class InitWrestler implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpSession session = request.getSession();

        Wrestler wrestler = new Wrestler();
        wrestler.setName("The Rock");
        wrestler.setFinisher("Rock Bottom");
        session.setAttribute("the rock",wrestler);

        servletResponse.getWriter().write("this is my servlet");
    }

    public void destroy() {

    }
}
