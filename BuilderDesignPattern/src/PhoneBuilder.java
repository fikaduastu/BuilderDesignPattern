
public class PhoneBuilder {
	
	private int ram;
	private double screenSize;
	private String processor;
	private int battery;
	
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone( ram,screenSize, processor, battery);
	}

	
	
}
