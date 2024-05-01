// count how many uppercase & how many lower case character in string

public class CountCharacter {
	public static void main(String args[])
	{
		String str= "Welcome to the Java 09#";
		int number=0, upper=0, lower=0, special=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else if(ch>='a' && ch<='z')
			{
				lower++;
			}
			else if(ch>='0' && ch<='9')
			{
				number++;
			}
			else
			{
				special++;
			}
			
		}
		
		System.out.println("Upper character " +upper);
		System.out.println("Lower character " +lower);
		System.out.println("Numbers " +number);
		System.out.println("Special character " +special);
		
	}

}
