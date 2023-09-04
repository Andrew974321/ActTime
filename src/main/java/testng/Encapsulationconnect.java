package testng;

public class Encapsulationconnect {

	public static void main(String[] args) {
       Encapsulation a1= new Encapsulation(10);
       int v =a1.getvalue();
       System.out.println(v);
       a1.setvalue(30);
       System.out.println(v);
	}

}
