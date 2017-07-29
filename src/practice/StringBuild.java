package practice;

public class StringBuild {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("rumble");
	
	sb.append(4).deleteCharAt(3).delete(3,sb.length()-1);
	System.out.println(sb);
}
}
