//使用抽象類別

//交通工具類別
abstract  class Vehicle{//這是抽象類別
	protected int speed;
	public void setSpeed(int s){
		speed = s;
		System.out.println("將速度設定為：" + speed);
	}
	abstract void show();//這是抽象方法show()
}

//車車類別
class BZCar extends Vehicle{//延伸抽象類別
	private int num;
	private double gas;
	public BZCar(int n,double g){
		num = n;
		gas = g;
		System.out.println("生產的車車 車號為：" + num + "汽油量：" + gas);
	}
	public void show(){
		System.out.println("車號：" + num);
		System.out.println("油量：" + gas);
		System.out.println("速度：" + speed);
		//定義show()方法的處理內容
	}
	
}

//飛機類別、
class Plane extends Vehicle{
	private int flight;
	public Plane(int f){
		flight = f;
		System.out.println("生產了" + flight + "班次的飛機");
	}
	public void show(){
		System.out.println("飛機班次：" + flight );
		System.out.println("速度是：" + speed);
	}
}


public class sample04 {
	public static void main(String[] args){
		Vehicle[] vc = new Vehicle[2];// 準備抽象類別的陣列
		vc[0] = new BZCar(4343,434.9);//第一個物件是BZCar類別
		vc[0].setSpeed(85);
		
		vc[1] = new Plane(489);//第二個物件是Plane類別
		vc[1].setSpeed(756);
		
		for(int i=0 ; i<vc.length ; i++){
			vc[i].show();//只要呼叫出show()方法
		}
	}

}
