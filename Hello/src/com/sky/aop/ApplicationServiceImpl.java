package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	@Override
	public void processApplication() {
		System.out.println("in process application");
		
	}

}
