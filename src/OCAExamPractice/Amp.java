package OCAExamPractice;

public class Amp {

String global = "111";
    
    public int parse(String arg){
        int value = 0;
        try{
            String global = arg;            
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
       public static void main(String[] args) {
          Amp ct = new Amp();
           System.out.print(ct.parse("333"));
       }
}
