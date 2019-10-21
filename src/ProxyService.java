import java.util.Scanner;

public class ProxyService implements Service {
	
	private String type;
	private int credits;
	private PleinDeServices services;
	
	private int service1Cost = 10;
	private int service2Cost = 50;
	private int service3Cost = 20;
	private int service4Cost = 10;
	
	public ProxyService (int cred, String type) {
		this.credits = cred;
		this.type = type;
		services = new PleinDeServices(type);
	}

	@Override
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

	@Override
	public void service1() {
		if (credits - service1Cost >= 0) {
			services.service1();
		}
		else {
			System.out.println("Pas assez de fonds pour le service 1");
		}
	}

	@Override
	public void service2() {
		if (credits - service2Cost >= 0) {
			services.service2();
		}
		else {
			System.out.println("Pas assez de fonds pour le service 2");
		}
	}

	@Override
	public void service3() {
		if (credits - service3Cost >= 0 && type == "Abonné") {
			services.service3();
		}
		else {
			System.out.println("Pas assez de fonds pour le service 3 // pas accès");
		}
	}

	@Override
	public void service4() {
		if (credits - service4Cost >= 0 && type == "Abonné") {
			services.service4();
		}
		else {
			System.out.println("Pas assez de fonds pour le service 4 // pas accès");
		}
	}
}
