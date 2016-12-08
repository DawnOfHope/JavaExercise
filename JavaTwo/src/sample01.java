//關於類別的繼承＿延伸extends

//車子的類別＿既有的類別
class Car{//父類別的宣告
	private int num;
	private double gas;
	public Car(){
		num = 0;
		gas = 0.0;
		System.out.println("生產車車");
	}
	public void setCar(int n,double g){
		num = n;
		gas = g;
		System.out.println("將車號設定為：" + num + "，汽油量：" + gas );
		
	}
	
	public void show(){
		System.out.println("車號是：" + num );
		System.out.println("汽油量是：" + gas );
	}
	
}
//賽車的類別＿“新”的類別
class RacingCar extends Car{//子類別的宣告
	private int course;//新增的欄位
	public RacingCar(){//這是子類別的建構式
		course = 0;
		System.out.println("生產賽車");
		//新增的性質與功能
	} 
	public void setCourse(int c){
		course = c;
		System.out.println("將賽車編號為：" + course);
	}
}



public class sample01 {
	public static void main(String[] args){
		RacingCar racingCar1 = new RacingCar();
		racingCar1.setCar(4466, 45840.5858);//這是繼承而來的呼叫方法
		racingCar1.setCourse(5);
	}
	

}
