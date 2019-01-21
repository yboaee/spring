package spring.chap03;

public class VersionPrinter {

	private int majorVersion;
	private int minorVersion;
	
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
	
	public void prnit() {
		System.out.printf("이 ");
	}
	
}
