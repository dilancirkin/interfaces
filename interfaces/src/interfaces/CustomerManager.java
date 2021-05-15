package interfaces;
//iþ sýnýfý bu da
//müþteri ile ilgili operasyonlarý yazýcam
public class CustomerManager {//loglamaya gevþek baðlamalýyýz
	//burada tasaýrm deseni kullanacaðýz dependency injection
	private Logger[] loggers;//deðiþkeni tanýmladým
	public CustomerManager(Logger[] loggers) {
	//buraya logger gönderdiðimiz zaman
	//referans atamasý yaptýk
		this.loggers = loggers;
	}
	public void add(Customer customer)
	{
		System.out.println("Müþteri eklendi." +customer.getFirstName());
	  
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	public void delete(Customer customer)
	{
		System.out.println("Müþteri silindi" +customer.getFirstName());
	    Utils.runLoggers(loggers,customer.getLastName());
		
	}

}
