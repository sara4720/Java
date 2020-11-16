package sub1;

public class RemoteLG implements RemoteControl{

	@Override
	public void PowerOn() {
		System.out.println("LG powerOn...");
		
	}

	@Override
	public void PowerOff() {
		System.out.println("LG Down...");
		
	}

	@Override
	public void chUp() {
		System.out.println("LG chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
		
	}

}
