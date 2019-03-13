
public class JameBond {

	static void JameBond() {
		Vault V = new Vault();
		
		System.out.println("Hacking into a vault!!");
		for (int i = 0; i < 1000001; i++) {
			System.out.println("Testing key " + i);
			if (V.tryCode(i)) {
				System.out.println("PASSWORD FOUND: " + i);
				break;
			} else {
				System.out.println(" ");
			}
		}
	}
	
	public static void main(String[] args) {
		JameBond();
	}

}
