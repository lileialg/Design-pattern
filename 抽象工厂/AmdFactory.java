package com.designpattern.abstractfactory;

public class AmdFactory implements Factory {

	public AmdCpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu();
	}

	public AmdMainboard createMainboard() {
		// TODO Auto-generated method stub
		return new AmdMainboard();
	}

}
