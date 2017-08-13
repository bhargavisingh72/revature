package OCAExamPractice;



public class TransformNumber {
	public void transformnumber(int n){
		int radix = 2;
		int output=0;
		output += radix*n;
		radix = output/radix;
		if(output < 14){
			System.out.println( output);
			
		}
		else if(output>14){
			output = output*radix/2;
			System.out.println( output);
		}
		else{
			System.out.println(output/2);
		}
	}
public static void main(String[] args) {
	TransformNumber t = new TransformNumber();
	t.transformnumber(2);
}


}

