public class Main {
	public static void main(String[] args) {
ExClock();
	}
	public static void ExClock(){
		Clock c1 = new Clock(0,0,0);
		System.out.print("Enter Hour: ");
		c1.setHour(c1.getInput());
		System.out.print("Enter Minutes: ");
		c1.setMinutes(c1.getInput());
		System.out.print("Enter Seconds: ");
		c1.setSeconds(c1.getInput());
		c1.show();
		System.out.println();
		c1.tick();
		c1.tick();
		c1.show();
		System.out.println();
		c1.reset();
		c1.show();
		System.out.println();
		Clock c2 = new Clock(12,12,58);
		c2.show();
		System.out.println();
		c2.tick();
		c2.tick();
		c2.show();
	}
	public static void ExCar(){
		Car c1 = new Car();
		System.out.print("Enter vehicle number: ");
		c1.setNumberOfCar(c1.getInput());
		c1.showCarNumber();
		c1.showSpeed();
		System.out.println();
		System.out.println("How much speed? ");
		int speed = c1.getInput();
		for (int i = 0; i < speed; i++) {
			c1.SpeedUp();
		}
		System.out.println("After acceleration ");
		c1.showSpeed();
		System.out.println();
		c1.SlowDown();
		c1.SlowDown();
		System.out.println("After slow down ");
		c1.showSpeed();
		System.out.println();
		c1.stopCar();
		c1.showSpeed();
	}

	public static void ExPerson(){
		Person[] arr = new Person[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Person();
		}
		arr[0].setName("Yakov");
		arr[0].setHeight(187);
		arr[0].setWeight(80);

		arr[1].setName("Daniel");
		arr[1].setHeight(170);
		arr[1].setWeight(82);

		arr[2].setName("Micheal");
		arr[2].setHeight(182);
		arr[2].setWeight(77);

		System.out.print("Arr before: ");
		showPersons(arr);


		System.out.println();
		highToLow(arr);
		System.out.print("Arr after sort by height : ");
		showPersons(arr);

		System.out.println();
		sortToWight(arr);
		System.out.println("Arr after sort by wight : ");
		showPersons(arr);
	}

	public static void showPersons(Person[] arr){
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}
	}
	public static void sortToWight (Person[] arr){
		for (int i = arr.length -1 ; i > 0  ; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j].getWeight() > arr[j+1].getWeight() ){
					Person temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}

		}
	}
	public static void highToLow (Person[] arr1){
		for (int i = arr1.length -1 ; i > 0  ; i--) {
			for (int j = 0; j < i; j++) {
				if (arr1[j].getHeight() < arr1[j+1].getHeight() ){
					Person temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}

		}
	}
}