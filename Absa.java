package inheritance;

abstract class flowers{
	abstract void sounds();
	public void type1() {
		System.out.println("it is a rose");
		System.out.println("rose is very beautiful");
	}
}
class animals extends flowers{
	public void sounds() {
		System.out.println("there is a lion");
		System.out.println("lion is a king of the forest");
	}
}

public class Absa {
	public static void main(String[] args) {
		System.out.println("vasavi");
		animals sp=new animals();
		sp.sounds();
		sp.type1();
		
	}

}
