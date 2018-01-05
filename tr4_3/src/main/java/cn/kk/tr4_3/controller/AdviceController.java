package cn.kk.tr4_3.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理
 */
@ControllerAdvice
public class AdviceController {
    @ResponseBody
    @ExceptionHandler(NullPointerException.class)
    public String handleNullPointerException(HttpServletResponse response){
        return "ops null pointer！空指针！";
    }
    @ResponseBody
    @ExceptionHandler(IndexOutOfBoundsException.class)
    public String handleIndexOutOfBoundsException(HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        return "ops out of bounds！超边界！";
    }
}
