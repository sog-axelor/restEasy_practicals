package com.example.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/restApi")
public class TestApplication extends Application{

	private Set<Object> singletons = new HashSet<>();
	
	public TestApplication () {
	this.singletons.add(new Test());
	}
	
		@Override
		public Set<Object> getSingletons(){
			return singletons;
		}
}
