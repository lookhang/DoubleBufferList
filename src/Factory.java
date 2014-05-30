
public class Factory extends Thread {
	int count=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		while(true){
			synchronized(Storge.products){
				String product="PRODUCT-"+System.currentTimeMillis();//模拟产品对象
				Storge.products.add(product);
				count++;
				System.out.println("PUT:"+product+"|COUNT:"+count);
			}
			
			try {
				Thread.sleep(2000);//假设每2秒钟生产一个产品
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
