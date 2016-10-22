package com.designpattern.singleton;

public class HolderSingleton {

	/**
	 * 内部类只有在外部类被调用才加载，产生SINGLETON实例；又不用加锁。
	 * 此模式有上述两个模式的优点，屏蔽了它们的缺点，是最好的单例模式。
	 */

	private HolderSingleton() {
	}

	public static HolderSingleton getInstance() {
		return Holder.instance;
	}

	private static class Holder {
		private static final HolderSingleton instance = new HolderSingleton();
	}

}
