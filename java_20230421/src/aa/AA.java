package aa;

import java.util.Arrays;

public class AA {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv()); //100
		b.buy(new computer());//200
		b.buy(new Tv());
		b.buy(new audio());//50
		b.buy(new computer());
		b.buy(new computer());
		b.buy(new computer());
		
		b.summary();
	}

}
class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy (Product p) {
		if(p.price>money)
			System.out.println("끝");
		else {
			money-=p.price;
			add(p);
		}
			
	}
	
	void add (Product p) { 
		if(i>=cart.length) {
			Product[] tmp = new Product[cart.length*2];
			for(i=0;i<cart.length;i++)
				tmp[i]=cart[i];
			cart=tmp;
			//System.arraycopy(cart, 0, tmp, 0, cart.length);
		}
		cart[i]=p;
		i++;
	}
			
				
			
			
		
	
	void summary () {
		System.out.println(Arrays.toString(cart));
		System.out.println(money);
		
		
	}
}


class Product {
	int price;
	
	Product(int price){
		this.price=price;
		}
}



class Tv extends Product {
	Tv(){super(100);}
	public String toString() {return "Tv";}
}


class computer extends Product{
	computer() {super(200);}
	public String toString() {return "Computer";}
}


class audio extends Product{
	audio() {super(50);}
	public String toString() {return "audio";}
}
