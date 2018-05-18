package com.dr2kh.iris;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class IrisInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * root application context 에서 제공된 환경설정, 구성요소 등을 명세하는 메소드
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * dispatcher servlet application context 에서 제공된 환경설정, 구성요소 등을 명세하는 메소드
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {IrisConfig.class};
	}

	/**
	 * DispatcherServlet을 위한 맵핑을 명세하는 메소드
	 */
	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}
	
	

}
