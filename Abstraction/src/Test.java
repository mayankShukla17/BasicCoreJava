public class Test {
	public static void main(String[] args) {
		ISwitch i=new TubelightIml();
		ISwitch i1=new LedlightImpl();
		i.On();
		i.Off();
		i1.On();
		i1.Off();
	}
}
