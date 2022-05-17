package ai.jobiak.enums;

public class UseMobile {

	public static void main(String[] args) {
		
		Mobile ref;
		ref=Mobile.valueOf("Samsung");
		
		System.out.println(ref);
		System.out.println(ref.showprice());
		
		for(Mobile mobile:Mobile.values()) {
			
			System.out.println("Brand ="+mobile+"Price="+mobile.showprice()+"Index="+mobile.ordinal());
		}

	}

}
