package by.epam.java.training.entity;

public enum OperatingSystem {
	Windows, Linux, MacOS;
	
	public static OperatingSystem getOSbyString(String os) {
		for(OperatingSystem sys : OperatingSystem.values()) {
			if (sys.toString().equals(os)) {
				return sys;
			}
		}	
		return null;
	}
}
