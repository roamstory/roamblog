package net.helloworld.support;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebFilter(urlPatterns={"/*"})
public class CharacterEncodingFilter implements Filter {
	
	private static Logger logger = LoggerFactory.getLogger(CharacterEncodingFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		logger.debug("character encoding filter init!!!!");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
		
	}

	@Override
	public void destroy() {
		
	}
	
	

}
