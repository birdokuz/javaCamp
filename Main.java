package introo;

public class Main {

		public static void main (String[] args) {
			//camelCase
			//don't repeat yourself
			String internetSubeButonu ="internet subesi";
		double dolarDun= 8.15;
		double dolarBugun= 8.18;
		//conditional blocks
	   
		System.out.println(internetSubeButonu);
	    //if working or else working both of them not working at the same time.
	    if(dolarBugun<dolarDun) {
	    	System.out.println("Dolar d��t� resmi");
	   }else if (dolarBugun<dolarDun) {
		   System.out.println("Dolar y�kseldi resmi");
	   }
	    else {
	    	System.out.println("Dolar y�kseldi resmi");
	    }
	    String kredi1 ="H�zl� Kredi";
	    String kredi2 = "Mutlu Emekli Kredisi";
	    String kredi3 = "Konut Kredisi";
	    String kredi4 = "�ift�i Kredisi";
	    String kredi5 = "Msb Kredisi";
	    String kredi6 = "Meb Kredisi";
	    
	    System.out.println(kredi1);
	    System.out.println(kredi2);
	    System.out.println(kredi3);
	    System.out.println(kredi4);
	    System.out.println(kredi5);
	    System.out.println(kredi6);
	    
	    String [] krediler= 
	    	{
	    		"H�zl� Kredi",
	    		"Mutlu Emekli Kredisi",
	    		"Konut Kredisi",
	    		"�ift�i Kredisi",
	    		"Msb Kredisi",
	    		"Meb Kredisi"
	        };
	    //foreach 
	    for(String kredi : krediler) {
	    	System.out.println(kredi);
	    	
	    	}
	    for(int i = 0; i<krediler.length;i++){
	    	System.out.println(krediler[1]);
	    }
	    

	}

}
