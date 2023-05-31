package inheritance;


class parent{
	int age=24;
	public void pri() {
		System.out.println("hii i am super class");
	}
}
public class Simpleinher extends parent {
    public static void main(String[] args) {
    	Simpleinher re=new Simpleinher();
    	re.pri();
    	System.out.println(re.age);
    }
}
