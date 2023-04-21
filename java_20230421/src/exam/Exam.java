package exam;

import java.util.Arrays;

public class Exam {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());//100
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
	int money=1000;
	product[] cart = new product[3];
	int i=0;
	
	
	void buy(product p) {
			if(p.price>money) 
				System.out.println("돈부족");
			else {
				money-=p.price;
				add(p);
			}
		
	}
	
	void add(product p) {
			if(i>=cart.length) {
				product[] tmp = new product[cart.length*2];
				for(i=0;i<cart.length;i++)
					tmp[i]=cart[i];
				cart=tmp;}
				cart[i]=p;
			i++;
	}
	
	void summary() { 
//		for(i=0;i<cart.length;i++)
//			System.out.print(cart[i]+", ");
		System.out.println(Arrays.toString(cart));
		System.out.println("남은금액 : "+money);
		
	}
}
class product {
	int price;
	
	product(int price){
		this.price=price;
		}
}

class Tv extends product {
	Tv(){super(100);}
	public String toString() {return "Tv";}
}

class computer extends product{
	computer() {super(200);}
	public String toString() {return "Computer";}
}
class audio extends product{
	audio() {super(50);}
	public String toString() {return "audio";}
}



