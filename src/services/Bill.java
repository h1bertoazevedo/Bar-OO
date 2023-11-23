package services;

public class Bill {
	
	public char gender;
	public int  beer;
	public int  barbecue;
	public int  softDrink;
	
    // cover()
	public double cover() {
		if (feeding() > 30.00) {
			return 0.00;
		}else {
			return 4.00;
		}
	}
	
    // feeding()
	public double feeding() {
		return (beer* 5) + (barbecue*7) + (softDrink*3);
	}
	
    // ticket()
	public double ticket() {
	    if (gender == 'M') {
	        return 10.00;
	    } else {
	        return 8.00;
	    }
	}
	
	//total()
	public double total() {
		return ticket() + feeding() + cover();
		
	}

}
