package com.designpattern.singleton;

public class LazySingleton {
	
	/**
	 * 优点：第一次调用才初始化，避免内存浪费。
	     缺点：必须加锁synchronized 才能保证单例，
		（如果两个线程同时调用getInstance方法，会chuxia）但加锁会影响效率。
	 */

	private static LazySingleton instance;
	
	private LazySingleton(){}
	
	public static synchronized LazySingleton getInstance(){
		
		if (instance == null)
			instance = new LazySingleton();
		
		return instance;
		
	}
	
}
