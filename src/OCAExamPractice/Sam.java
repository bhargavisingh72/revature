package OCAExamPractice;

public class Sam {
	/*protected void finalize() {
		System.out.println("Roar!");
		}

	public static void main(String[] args) {
		Sam bear = new Sam();
		bear = null;
		System.gc();*/
		
		int count;
		 public  Sam() {
		 count = 4;
		 }
		 public static void main(String[] args) {
		 Sam s = new Sam();
		 System.out.println(s.count);
		 }
}
