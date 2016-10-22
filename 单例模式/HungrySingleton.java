package com.designpattern.singleton;

public class HungrySingleton {
	
	/**
	 * 优点：没有加锁，执行效率会提高。
		缺点：类加载时就初始化，浪费内存
	 */

	private static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return instance;
	}

}
