package sub1;

public class RemoteSamsung implements RemoteControl {

	@Override
	public void PowerOn() {
		System.out.println("Samsung powerOn...");
		
	}

	@Override
	public void PowerOff() {
		System.out.println("Samsung Down...");
		
	}

	@Override
	public void chUp() {
		System.out.println("Samsung chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Samsung chDown...");
		
	}

}
