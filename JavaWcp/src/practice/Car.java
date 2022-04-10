package practice;

public class Car {
	private double fuelCost;
	private double fuelAmount;
	
	public Car(double fuelCost, double fuelAmount) {
		this.fuelCost = fuelCost;
		this.fuelAmount = fuelAmount;
	}
	
//	moveをint型を引数にして定義
	public void move(int km) {
		System.out.println(km + "km走ります");
//		残量から走った分の燃料を計算して(km/L)引く、-=を使うことで、this.fuelAmount = this.fuelAmount - (km / fuelCost)と同義になる
		this.fuelAmount -= (km / fuelCost);
	}
	
	public double getFuelAmount() {
		return this.fuelAmount;
	}
}
