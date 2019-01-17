
public class Shop {
	public static void main(String args[]) {
		Phone p = new PhoneBuilder().setBattery(300).setRam(2).getPhone();
		System.out.println(p);
	}
	}
