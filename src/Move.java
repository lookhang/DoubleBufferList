public class Move extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			synchronized (Storge.sales) {
				synchronized (Storge.products) {
					if (Storge.sales.size() == 0) {
						System.out.println("--==--½ø»õ--==--");
						Storge.sales.addAll(Storge.products);
						Storge.products.clear();
					}
				}
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
