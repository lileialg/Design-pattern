package com.designpattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseToUpper extends FilterInputStream {

	protected LowerCaseToUpper(InputStream in) {
		super(in);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int read() throws IOException {
		int c = super.read();
		
		return c != -1?Character.toUpperCase((char)c):c;
	}



	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		int end = super.read(b, off, len);
		
		for(int i=off;i<off + end;i++)
			b[i] = (byte) Character.toUpperCase((char)b[i]);
		
		return end;
	}



	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream in = new LowerCaseToUpper(new BufferedInputStream(new FileInputStream(args[0])));
		int c;
		while((c = in.read())>=0)
			System.out.print((char)c);
		
		in.close();
	}

}
