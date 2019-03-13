import java.util.Random;

public class Vault {
	private int Pass = new Random().nextInt(1000000);
			
	
	boolean tryCode(int key) {
		if (key == Pass) {
			return true;
		} else {
			return false;
		}
	}
}
