
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
					
					//����5������һ����Ʒ
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					Storge.sales.remove(0);//��������Ƴ�����
				}
			}
			
			if(count==total){
				System.out.println("����"+total+"����Ʒ��ʱ��"+(System.currentTimeMillis()-start_time));
				System.exit(0);
			}
		}
		
	}

}
