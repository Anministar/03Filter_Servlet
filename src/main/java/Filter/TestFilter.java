package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/main.do")
//URL Mapping이 안되어 있기 때문에 주석처리하게 되면 FC(FrontController)만 나옴.
//but web.xml에 filter등록을 하게 되면 주석처리하게 되더라도 Filter가 먼저 시작되고 FrontController가 start, end 이후에 Filter가 종료됨.
public class TestFilter implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		//request에 데이터가 쌓이기(들어가기) 전에
		System.out.println("[TestFilter] Start!");
		chain.doFilter(req, resp);
		System.out.println("[TestFilter] End!");
		//후
		
	}
	
	
	
	
}
