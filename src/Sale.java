
public class Sale extends Thread {
	int  count=0,total=50;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		long start_time=System.currentTimeMillis();
		while(true){
			synchronized(Storge.sales){
				if(Storge.sales.size()!=0){				
					count++;
					System.out.println("GET:"+Storge.sales.get(0)+"|COUNT:"+count);
					
					//假设5秒卖出一个产品
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					Storge.sales.remove(0);//处理完成移除对象
				}
			}
			
			if(count==total){
				System.out.println("卖完"+total+"个产品用时："+(System.currentTimeMillis()-start_time));
				System.exit(0);
			}
		}
		
	}

}
