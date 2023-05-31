package inheritance;


class teacher{
	public void teach(){
		System.out.println("teaching the class");
	}
	public void attend() {
		System.out.println("taking the attendence");
	}
	
}

class mathsteacher extends teacher{
	public void teach() {
		super.teach();
		System.out.println("mathsteacher taking the class");
	}
	
}

class scienceteacher extends teacher {
	public void teach() {
		super.teach();
		System.out.println("scienceteacher taking the attendence");
	}
	
}

public class Assheri {
	public static void main(String[] args) {
		
		mathsteacher b=new mathsteacher();
		scienceteacher c=new scienceteacher();
		b.teach();
		b.teach();
		c.attend();
		c.teach();		
	}

}
