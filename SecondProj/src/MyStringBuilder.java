
public class MyStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing the StringBuilder class with string passed via command Line
		StringBuilder sb = new StringBuilder("I am Studying Java");
		String constant = "Studying";
		
		System.out.println("Given String:" + sb + " with length " + sb.length());
		System.out.println("First three: " + sb.substring(0,3));
		System.out.println("Last three: " + sb.substring(sb.length()-3));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Print out: " + sb.substring(startOfConstant,endOfConstant));

		//Insert < ur nama
		sb.insert((sb.indexOf("am")+ 2), " Umairah");
		System.out.println("After Insert: " + sb);
		sb.delete(sb.indexOf("am"), sb.indexOf("am")+2);
		System.out.println("After Delete: " + sb);
		System.out.println("Reverse: " + sb.reverse());

		StringBuilder sb2 = new StringBuilder (args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert((sb.indexOf("am")+2), " Umairah"));
		System.out.println(sb == sb3);

		sb = null;
		sb2 = null;
		sb3 = null;

		
		System.out.println("sb:" + sb);
		System.out.println("sb3:" + sb3);


		}
		

	}


