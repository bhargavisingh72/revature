package OCAExamPractice;

import com.practice.Aquatic;

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
