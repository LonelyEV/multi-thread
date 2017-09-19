/**
 * Project Name:multi-thread
 * File Name:Run.java
 * Package Name:com.quzhigang.conditionmanytomany
 * Date:2017年9月19日上午11:41:19
 * Copyright (c) 2017, jing9241120@sina.com
 *
*/

package com.quzhigang.conditionmanytomany;
/**
 * ClassName:Run <br/>
 * Function: TODO ADD FUNCTION. <br/>`
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 上午11:41:19 <br/>
 * @author   屈志刚  
 * @version   
 * @see 	 
 */
public class Run {
	
	public static void main(String[] args) {
		
		MyService myService = new MyService();
		
		MyThreadA[] myThreadAs = new MyThreadA[10];
		MyThreadB[] MyThreadBs = new MyThreadB[10];
		
		for(int i=0; i<10; i++){
		
			myThreadAs[i] = new MyThreadA(myService);
			MyThreadBs[i] = new MyThreadB(myService);
			myThreadAs[i].start();
			MyThreadBs[i].start();
			
		}
				
				
		
	}

}

