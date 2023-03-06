package com.liferay.bucket.module.web;

public class WebHelper {
	
	public static String getUserIdFromPricipal(Principle principle) {
		
		String userScreenName = null;
		
		if(principle == null) {
			throw new NullPointerException("Null not allwed for the principle");
		}
		
		String principleName = principle.getName();
		
		long userId = Long.parseLong(userScreenName);
		
		System.out.println("getUserIdFromPricipal principleName : " + principleName);
		
		return userScreenName;
		
	}

}
