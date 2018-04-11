package by.epam.java.training.entity;

public class Item {

	private Device deviceType;

	public Item() {
		this.deviceType = Device.Item;
	}

	public Item(Device deviceType) {
		this.setDeviceType(deviceType);
	}

	public Device getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Device deviceType) {
		this.deviceType = deviceType;
	}
	
	@Override
	public String toString() {
		return this.deviceType.toString();
	}

}
