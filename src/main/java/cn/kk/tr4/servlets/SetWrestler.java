package cn.kk.tr4.servlets;

import cn.kk.tr4.entity.Wrestler;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SetWrestler implements Servlet {
    public void init(ServletConfig config) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest)req;
        HttpSession session = request.getSession();
        Wrestler wrestler = (Wrestler)session.getAttribute("the rock");
        wrestler.setFinisher("People's Elbow");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
