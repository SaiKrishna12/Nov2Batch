package day20;

public class BMW  extends Car{

	String model;
	public void stop()
	{
		System.out.println("This is to stop the car");
	}
	public static void main(String[] args) {
		BMW b=new BMW();
		b.model="X1";
		b.stop();
		b.price=1111;
		b.start();

	}

}
