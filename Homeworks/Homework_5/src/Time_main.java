
public class Time_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time(1,40,4);
		Time add = new Time(0,19,55);
		t.tick();
		t.add(add);
		System.out.println(t);
	}

}
