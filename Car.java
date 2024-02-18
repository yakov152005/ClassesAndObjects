import java.util.Scanner;

public class Car {
	private long numberOfCar;
	private int speed;

	public void stopCar(){
		speed = 0;
	}
	public void SpeedUp (){
		speed++;
	}
	public void SlowDown (){
		if (speed == 0){
			System.out.print("The Speed is 0;");
		}else {
			speed--;
		}
	}

	public void showCarNumber (){
		if (numberOfCar < 1000000 || numberOfCar > 10000000){
			System.out.println();
		}else {
			System.out.println("The car number: " + numberOfCar);
		}
	}
	public void showSpeed(){
		if (speed ==0){
			System.out.println("The vehicle is in N mode");
		}else {
			System.out.println("The Speed is: " + speed);
		}
	}
	public long getNumberOfCar(){
		return numberOfCar;
	}
	public int getSpeed(){
		return speed;
	}

	public void setNumberOfCar(long n){
		if (n >= 1000000 && n < 10000000 ){
			numberOfCar = n;
		}else {
			System.out.println("The number is invalid.");
		}
	}
	public int getInput(){
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

}
//12-123-12
