
public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		factory.start();
		
		Sale sale=new Sale();
		sale.start();
		
		Move move=new Move();
		move.start();
	}

}
