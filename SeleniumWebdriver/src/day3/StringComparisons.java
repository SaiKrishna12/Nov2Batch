package day3;

public class StringComparisons {
	
	public static void main(String[] args) {
		String a="Selenium";
		String b="Selenium";
		if(a.equals(b))
		{
			System.out.println("Both string are same");
		}
		else
		{
			System.out.println("Strings are different");
		}
		String c="Selenium";
		String d="selenium";
		if(c.equalsIgnoreCase(d))
		{
			System.out.println("Both string are same");
		}
		else
		{
			System.out.println("Strings are different");
		}
		String e="Software Testing";
		String f="Testing";
		if(e.contains(f))
		{
			System.out.println("String present");
		}
		else
		{
			System.out.println("String not present");
		}
	}
}

