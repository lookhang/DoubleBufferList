
public class Factory extends Thread {
	int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while(true){
			synchronized(Storge.products){
				String product="PRODUCT-"+System.currentTimeMillis();//ģ���Ʒ����
				Storge.products.add(product);
				count++;
				System.out.println("PUT:"+product+"|COUNT:"+count);
			}
			
			try {
				Thread.sleep(2000);//����ÿ2��������һ����Ʒ
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
