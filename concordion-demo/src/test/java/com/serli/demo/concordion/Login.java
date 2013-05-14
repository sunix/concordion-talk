package com.serli.demo.concordion;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class Login {
	
	public String accessAndFills(){
		return "access and fills";
	}
	
	public String submits(){
		return "submits";
	}
	
	public String displayDomain(){
		return "Nuxeo Platform - Default domain";
	}
}
