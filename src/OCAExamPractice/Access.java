package OCAExamPractice;

public class Access {

	
	private int x = 0;
	private int y = 0;
	
	public static void main(String[] args) {
		Access acc = new Access();
		acc.printThis(1,2);
		acc.printThat(3,4);
  }
		public void printThis(int x,int y){
			x = x;
			y = y;
			System.out.println("x:"+this.x+"y:"+this.y);
		
	   }
		public void printThat(int x,int y){
			this.x = x;
			this.y = y;
			System.out.println("x:"+this.x+"y:"+this.y);
		}
	
}
