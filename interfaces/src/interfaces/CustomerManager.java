package interfaces;
//i� s�n�f� bu da
//m��teri ile ilgili operasyonlar� yaz�cam
public class CustomerManager {//loglamaya gev�ek ba�lamal�y�z
	//burada tasa�rm deseni kullanaca��z dependency injection
	private Logger[] loggers;//de�i�keni tan�mlad�m
	public CustomerManager(Logger[] loggers) {
	//buraya logger g�nderdi�imiz zaman
	//referans atamas� yapt�k
		this.loggers = loggers;
	}
	public void add(Customer customer)
	{
		System.out.println("M��teri eklendi." +customer.getFirstName());
	  
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	public void delete(Customer customer)
	{
		System.out.println("M��teri silindi" +customer.getFirstName());
	    Utils.runLoggers(loggers,customer.getLastName());
		
	}

}
