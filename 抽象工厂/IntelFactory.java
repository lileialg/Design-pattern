package com.designpattern.abstractfactory;

public class IntelFactory implements Factory {

	public IntelCpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu();
	}

	public IntelMainboard createMainboard() {
		// TODO Auto-generated method stub
		return new IntelMainboard();
	}

}
