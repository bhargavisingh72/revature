package OCAExamPractice;

interface Aquatic{
public default int getNumberOfGills(int input){
	return 2;
}
}


public class ClownFish implements Aquatic{
	public String getNumberOfGills(){
		return "4";
	}
	
	public int getNumberOfGills(String input){
		return 2;
	}
	public static void main(String[] args) {
		System.out.println(new ClownFish().getNumberOfGills(-1));
	}

}
