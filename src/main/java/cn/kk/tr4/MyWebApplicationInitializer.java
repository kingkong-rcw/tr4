package cn.kk.tr4;

import cn.kk.tr4.servlets.GetWrestler;
import cn.kk.tr4.servlets.InitWrestler;
import cn.kk.tr4.servlets.SetWrestler;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class MyWebApplicationInitializer implements WebApplicationInitializer{
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic servlet = servletContext.addServlet("initWrestler", InitWrestler.class);
        servlet.addMapping("/initWrestler");

        servlet = servletContext.addServlet("getWrestler", GetWrestler.class);
        servlet.addMapping("/getWrestler");

        servlet = servletContext.addServlet("setWrestler", SetWrestler.class);
        servlet.addMapping("/setWrestler");
    }
}
