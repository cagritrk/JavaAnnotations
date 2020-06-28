package com.cagri.program;

import com.cagri.annotations.AuthorInfo;
import com.cagri.annotations.MethodInfo;

@AuthorInfo(
		AuthorName = "Cagri TURK", 
		AuthorEmail = "haliscagri@gmail.com")
public class Program {
	
	@MethodInfo(
			Info = "Version 1 Calculation method", 
			Version = "v1")
	public String calculationA() {	
		return "calculationA done.";
	}
	
	@MethodInfo(
			Info = "Version 2 Calculation method", 
			Author = "Someone Else", 
			Version = "v2")
	public String calculationB() {	
		return "calculationB done.";
	}

}
