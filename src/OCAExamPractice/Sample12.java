package OCAExamPractice;

public class Sample12 {
	static int radix = 2;  
	static int output = 0; 
	public int transformNumber(int n){
		
		output += radix*n; 
		radix = output/radix; 
		if(output<14){    
			return output;    
			}  
		else if(output>14){ 
			output = output*radix/2;   
			return output;   
			}  
		else {
			
			
			return output/2;   
			}
	
		}
	public static void main(String[] args) {
		Sample12 obj= new Sample12();
		obj.transformNumber(2);
		System.out.println("output:"+output);
	}
	}

