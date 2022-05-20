package com.sky.aop;

import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements ApplicationService{
	@Override
	public void processApplication() {
		System.out.println("in process application");
	}	
	@Auditable(value="check")
	public String processApplicationWithAudit()
	{
		System.out.println("process application form in service");
		return "success";
	
	}

}
