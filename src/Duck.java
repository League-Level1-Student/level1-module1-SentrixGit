
public class Duck {
	int adorablness = 1000000;
	String favoriteFood = "Pizza";
	
	void turtle() {
		System.out.println("Turtle");
	}

	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.adorablness = numberOfFriends;
	}

}
