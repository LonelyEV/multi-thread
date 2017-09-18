/**
 * Project Name:multi-thread
 * File Name:ReenTrantLockRun2.java
 * Package Name:com.quzhigang.reentrantlocktest2
 * Date:2017年9月18日下午2:56:34
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.reentrantlocktest2;
/**
 * ClassName:ReenTrantLockRun2 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月18日 下午2:56:34 <br/>
 * @author   屈志刚  
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class ReenTrantLockRun2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyService myService = new MyService();
		
		ThreadA a = new ThreadA(myService);
		a.setName("A");
		a.start();
		
		ThreadAA aa = new ThreadAA(myService);
		aa.setName("AA");
		aa.start();
		
		Thread.sleep(100);
		
		ThreadB b = new ThreadB(myService);
		b.setName("b");
		b.start();
		
		ThreadBB bb = new ThreadBB(myService);
		bb.setName("bb");
		bb.start();
		
		
	}

}

