//執行緒的基礎知識＿啟動執行緒
class smallCar1 extends Thread{
	private String name;
	public smallCar1(String nm){
		name = nm;
	}
	public void run(){
		for(int i=0 ; i<5 ; i++){
			System.out.println("正在進行" + name + "的處理工作");
		}
	}
}


public class sample08 {
	public static void main(String[] args){
		smallCar1 sc1 = new smallCar1("第一台車車");
		sc1.start();
		
		for(int i=0 ; i<5 ; i++){
			System.out.println("正在進行main()");
		}
	}

}
