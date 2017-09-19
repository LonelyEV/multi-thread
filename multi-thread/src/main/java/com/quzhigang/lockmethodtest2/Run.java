/**
 * Project Name:multi-thread
 * File Name:Run.java
 * Package Name:com.quzhigang.lockmethodtest2
 * Date:2017年9月19日下午9:04:40
 * author 屈志刚  email:598700560
 *
*/

package com.quzhigang.lockmethodtest2;
/**
 * ClassName:Run <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年9月19日 下午9:04:40 <br/>
 * @author   屈志刚
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */
public class Run {
	
	public static void main(String[] args) throws InterruptedException {
		
		final Service service = new Service();
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				service.serviceMethod();
				
			}
		};
		
		Thread[] threadArray = new Thread[10];
		
		for(int i=0; i<10; i++){
			threadArray[i] = new Thread(runnable);
		}
		
		for(int i=0; i<10; i++){
			threadArray[i].start();
		}
		
		Thread.sleep(2000);
		System.out.println("有线程数："+service.lock.getQueueLength()+"在等待获取锁");
		
		
		
		
	}

}

