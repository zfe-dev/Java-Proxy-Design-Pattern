class Client {
	PleinDeServices pds;
	
	public static void main(String [] args) {
		PleinDeServices pds = new PleinDeServices("utilisateur");
		ProxyService cient1 = new ProxyService(100, "Abonné");
		ProxyService cient2 = new ProxyService(100, "Gratuit");
		cient2.run();
	}
}