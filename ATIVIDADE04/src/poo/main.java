package poo;

public class main {

	public static void main(String[] args) {
		
		Cone cone1= new Cone (12.5 , 37.8, 2);
		System.out.println(cone1);

		Cone cone2= new Cone (14.5, 3);
		cone2.setR(23);
		System.out.println(cone2);
		
		Cone cone3= new Cone ();
		cone3.setZ(90);
		cone3.setR(23);
		cone3.setTinta(1);
		System.out.println(cone3);
		
		
		Cone cone4= new Cone (2);
		cone4.setZ(20);
		cone4.setR(40);
		System.out.println(cone4);
		
	
	}

}
