import java.util.*;

public class PleinDeServices implements Service {
	String typeActeur;
	
	public PleinDeServices(String typeActeur) {
		this.typeActeur = typeActeur;
	}
	
	public void service1() {
		System.out.println("Vous �tes un acteur de type "+ typeActeur + " et je vous le service n� 1");
	}
	public void service2() {
		System.out.println("Vous �tes un acteur de type "+ typeActeur + " et je vous le service n� 2");
	}
	public void service3() {
		System.out.println("Vous �tes un acteur de type "+ typeActeur + " et je vous le service n� 3");
	}
	public void service4() {
		System.out.println("Vous �tes un acteur de type "+ typeActeur + " et je vous le service n� 4");
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int choix;
		do {
			choix = sc.nextInt();
			switch(choix) {
				case 1 : service1(); break;
				case 2 : service2(); break;
				case 3 : service3(); break;
				case 4 : service4(); break;
			}
		}
		while(choix >= 1 && choix <= 4);
	}

}
	