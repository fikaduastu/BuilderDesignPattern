
public class Phone {
	
	private int ram;
	private double screenSize;
	private String processor;
	private int battery;
	
	public Phone(int ram, double screenSize, String processor, int battery) {
		super();
		this.ram = ram;
		this.screenSize = screenSize;
		this.processor = processor;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", screenSize=" + screenSize + ", processor=" + processor + ", battery=" + battery
				+ "]";
	}
	
}
