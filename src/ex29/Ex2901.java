package ex29;

public class Ex2901 {
	public static void main(String[] args) {
		for (Car c: Car.values()) System.out.println(c + "ÐèÒª£º" + c.getPrice());
	}
	
}


enum Car{
	lam(900),tata(2),audi(50),fiat(15),honda(90);
	private int price;
	Car(int p){
		price = p;
	}
	
	int getPrice() {
		return price;
	}
}