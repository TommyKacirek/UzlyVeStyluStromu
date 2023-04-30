package uzlyVeStyluGrafu;

public class Spustitelna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uzel u1 = new Uzel("U1");
		Uzel u2 = new Uzel("U2");
		Uzel u3 = new Uzel("U3");
		Uzel u4 = new Uzel("U4");
		Uzel u5 = new Uzel("U5");
		Uzel u6 = new Uzel("U6");
		
		u1.pridejUzel(u4);
		u1.pridejUzel(u6);
		u1.pridejUzel(u2);
		
		u2.pridejUzel(u1);
		u2.pridejUzel(u3);
		u2.pridejUzel(u5);
		
		u5.pridejUzel(u4);
		
		System.out.println("U1 sousedi");
		u1.vypisUzly();
		System.out.println();
		System.out.println("U2 sousedi");
		u2.vypisUzly();
		System.out.println();
		System.out.println("U5 sousedi");
		u5.vypisUzly();
		System.out.println();
		
		System.out.println("Pocet spojeni U1");
		System.out.println(u1.pocetUzlu());
	}

}
