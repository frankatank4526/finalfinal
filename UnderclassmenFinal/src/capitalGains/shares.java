package capitalGains;

public class shares<T>
{
	private double price;
	private int days;
public shares (double price, int days){
	this.price = price;
	this.days = days;
	
}

public double getPrice(){
	return price;
	
}
public int getDays(){
	return days;
}
}
