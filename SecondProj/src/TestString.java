
public class TestString {
	
	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int first = 1;
		int second = 2;
		int third = 3;
		String fourth = "c";//string pool
		String fifth = "c";
		String sixth = new String("c");//produce diff memory ref
		
		if(fourth == fifth)
			System.out.println("fourth and fifth is same : " + fourth);
			
		else
			System.out.println("fourth and fifth are not the same ");
		if(fourth == sixth)
			System.out.println("fourth and sixth is same : " + fourth);
		else
		System.out.println("fourth and sixth are not the same ");
		
		/*
		fourth = third + fourth;
		System.out.println("Now fourth is: " + fourth);
		
		fourth = second + fourth;
		System.out.println("Now fourth is: " + fourth);
		
		fourth = (String.valueOf(first)).concat(fourth);
		System.out.println("Now fourth is: " + fourth);
		*/
		
		String sms ="Selamat Datang ke Malaysia!!";
		System.out.println("SMS Size is : " + sms.length());
		System.out.println("Text at 10th position / 9th index : " + sms.charAt(9));
		System.out.println("Index of the text!: " + sms.indexOf("!"));
		System.out.println("Substring of 0 - 10: " + sms.substring(0,10));
		System.out.println("lower: " + sms.toLowerCase());
		System.out.println("UPPER: " + sms.toUpperCase());
		
		String country = "Malaysia";
		String userCountry = args[0].toLowerCase();
		if(country.equalsIgnoreCase(userCountry)) {
			System.out.println("Country is Malaysia");
		}else {
			System.out.println("Country is not Malaysia but" + userCountry);
		}
		String userCountry1 = args[0];
		if(userCountry1.startsWith("m")) {
			System.out.println("Country is Starting with m");
		}
		
		if(userCountry1.endsWith("a")) {
			System.out.println("Country is ending with a");
			
		if(userCountry1.contains("al")) {
			System.out.println("Country " + userCountry1+ " has \"al\" ");
		}

			
			
		}


	}

}
