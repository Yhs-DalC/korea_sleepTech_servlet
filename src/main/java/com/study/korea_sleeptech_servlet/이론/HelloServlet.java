package com.study.korea_sleeptech_servlet.이론;

import java.io.*;
import jakarta.servlet.http.*;

//WebServlet 어노테이션
// : 해당 서블릿을 문자열의 URL패턴과 매핑
// : "hello servlet" 요청의 경우 현재의 서블릿이 처리됨
//@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    /*
    * === helloservlet 클래스
    * : 서블릿 내부에서는 Http 요청을 처리하는 HttpServlet을 상속받는 각각의 서블릿이 존재
    *
    * 서블릿 동작 원리
    * 1) 클라이언트 요청: 사용자가 브라우저에서 http://localhost8080/hello 요청
    * 2) 톰캣 수신: 톰캣이 http요청을 받음
    * 3) 매핑 검사: 톰캣이 web.xml 또는 @webservlet에 정의된 URL패턴으로 서블릿 클래스를 탐색
    * 4) 서블릿 호출
    *   - 해당 서블릿 인스턴스를 찾아서 service 호출
    *       >> GET 요청이면 doGet(), POST 요청이면 doPost() 호출
    * 5) 응답 처리
    * `- 서블릿이 HTML, JSON 파일 등으로 요청을 생성
    * 
    * */
    private String message;

    public void init() {
        message = "첫번째 서블릿 페이지입니다";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}