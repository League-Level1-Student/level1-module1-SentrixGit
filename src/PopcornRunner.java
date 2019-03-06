
public class PopcornRunner {

	public static void main(String[] args) {
		Microwave M = new Microwave();
		Popcorn P = new Popcorn("Butter");

		M.putInMicrowave(P);
		M.setTime(2);
		M.startMicrowave();
		P.applyHeat();
		P.eat();
	}

}
