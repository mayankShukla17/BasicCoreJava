public class LedlightImpl implements ISwitch{

	@Override
	public void On() {
		System.out.println("Ledlight turned Onn");
	}

	@Override
	public void Off() {
		System.out.println("Ledlight turned Off");
	}
	
}
