package cn.kk.tr4_3;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        //return new Class<?>[0];
        Class<?>[] classes = new Class[]{RootConfig.class};
        return classes;
    }

    protected Class<?>[] getServletConfigClasses() {
        //return new Class<?>[0];
        Class<?>[] classes = new Class[]{WebConfig.class};
        return classes;
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
