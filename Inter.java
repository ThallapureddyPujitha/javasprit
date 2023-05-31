package interface1;

interface car{
	void price();
	void colour();
}
interface bike{
	void price();
	void colour();
}

class details implements car{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("bike price is 100000");
		
	}


	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("car colour is blue");
		
	}
	
}
class parts implements bike{

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("bike price is 100000");
		
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("bike color is black");
		
	}
	
}


public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car ca=new details();
		ca.price();
		ca.colour();
		bike ba=new parts();
		ba.price();
		ba.colour();

	}

}
