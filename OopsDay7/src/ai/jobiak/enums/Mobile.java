package ai.jobiak.enums;

public enum Mobile {

	Apple(3000),Samsung(2000),Blackberry(1500),Google(2500);

	int price;
	Mobile(int price) {
		// TODO Auto-generated constructor stub
		this.price=price;
	}
	int showprice() {
		return this.price;
	}
}
