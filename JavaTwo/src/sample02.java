//要特別指定執行父類別當中某個建構式時

//車子的類別＿既有的類別
class Smallcar{//父類別的宣告
	private int num;
	private double gas;
	public Smallcar(){
		num = 0;
		gas = 0.0;
		System.out.println("生產車車");
	}
	
	public Smallcar(int n,double g){
		num = n;
		gas = g;
		System.out.println("生產的車車車號設定為：" + num + "，汽油量：" + gas );
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
class RacingSmallcar extends Smallcar{//子類別的宣告
	private int course;//新增的欄位
	public RacingSmallcar(){//這是子類別的建構式
		course = 0;
		System.out.println("生產賽車");
		//新增的性質與功能
	}
	public RacingSmallcar(int n,double g,int c){
		super(n,g);//讓父類別的雙參數建構式能夠被呼叫
		course = c;
		System.out.println("生產的賽車編號為：" + course);
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("將賽車編號為：" + course);
	}
}



public class sample02 {
	public static void main(String[] args){
		RacingSmallcar racingSmallcar1 = new RacingSmallcar(3904,4049.54,3);
	}
	

}
