
public class HorseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse[] hs = {new Horse("Tony",100), null, new Horse("HHH", 203)};
		HorseBarn horse = new HorseBarn(hs);
		System.out.println(horse.findHorseSpace("Tony"));
		
	}

}
