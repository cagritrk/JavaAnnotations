package com.cagri.app;

import java.lang.reflect.Method;

import com.cagri.annotations.AuthorInfo;
import com.cagri.annotations.MethodInfo;
import com.cagri.program.Program;

public class Run {

	public static void main(String[] args) {
		
		//Give me author information about Program class.
		AuthorInfo authorInfo = Program.class.getAnnotation(AuthorInfo.class);
		System.out.println("Welcome to Annotation Test Program this source code created by @"
				+ authorInfo.AuthorName()
				+ "\nfeel free to contact me if you have any questions\n Email: "
				+ authorInfo.AuthorEmail());
		
		
		Program calculator = new Program();
		
		//Find v2 Method insade (Program)calculator and run it.
		String version = "v2";
		
		Method[] methods = Program.class.getMethods();
		for(Method m : methods) {
			if(m.isAnnotationPresent(MethodInfo.class)) {
				MethodInfo methodInfo = m.getAnnotation(MethodInfo.class);
				if(methodInfo.Version().equals(version)) {
					System.out.println(
							"\nLooks like i found " + version + " method insade this class.");
					try {
						System.out.println("Result :" + m.invoke(calculator));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				
			}
		}
		
		

	}

}
