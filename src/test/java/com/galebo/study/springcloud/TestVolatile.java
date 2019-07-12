package com.galebo.study.springcloud;

import java.util.concurrent.TimeUnit;

public class TestVolatile {
	private static boolean is =true;
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int i=0;
				while(TestVolatile.is) {
					i++;
				}
				System.out.print(i);
			}
			
		}).start();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		TestVolatile.is=false;
		System.out.println("被重置为false了");
	}
}
