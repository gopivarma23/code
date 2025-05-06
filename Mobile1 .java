public class Mobile1 {
	public void showDetails(String storeName, String brand, int price) {
	       System.out.println("store Name is"+ storeName);
	       System.out.println("mobile brand is"+ brand);
	       System.out.println("mobile price is"+ price);
		}
		public static void main(String args[]) {
		Mobile1 f2=new Mobile1();
			f2.showDetails("Tech world","Apple",900);
			f2.showDetails("Tech World","samsung",1200);
		}
	       
	}

