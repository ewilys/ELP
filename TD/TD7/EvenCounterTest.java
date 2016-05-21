 class EvenCounterTest{

	public static void main(String[] args){
	
		EvenCounter ec=new EvenCounter();
		Thread t1= new Thread(ec);
		Thread t2= new Thread(ec);
		t1.start();
		t2.start();

	}

}
