import java.util.*;


class  InvalidAgeException  extends  Exception
{    
  InvalidAgeException(String  s)
  {    
    super(s);    
  }    
}    

class Roman
 {
	static int decimalNum;
	static String romanNumeral;
    public static String IntegerToRoman(int n)
	{
        String roman="";
        int repeat;
		
        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        repeat=n/1;
        for(int x=0; n>0; x++) //x = 12
		{
            repeat=n/magnitude[x];
            for(int i=1; i<=repeat; i++)
			{
                roman=roman + symbol[x];
            }
            n=n%magnitude[x];
        }
        return roman;
    }
	
	
	public void convertToDecimal () 
		{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a Roman number: ");
            romanNumeral = scan.nextLine();
			
				
				
            romanNumeral = romanNumeral.toUpperCase();
                    
            int l=  romanNumeral.length();
            int num=0;
            int previousnum = 0;
			try{
            for (int i=l-1;i>=0;i--) //i = -1
            { 
                char x =  romanNumeral.charAt(i);
				
                x = Character.toUpperCase(x);
				
				if(x=='I' || x=='V' || x=='X' || x=='L' || x=='C' || x=='D' || x=='M')
				{
                switch(x)
                {  
                    case 'I':
						previousnum = num;
                        num = 1;
                        break;
                    case 'V':
                        previousnum = num;
                        num = 5;
                        break;
                    case 'X':
                        previousnum = num;
                        num = 10;
                        break;
                    case 'L':
                        previousnum = num;
                        num = 50;
                        break;
                    case 'C':
                        previousnum = num;
                        num = 100;
                        break;
                    case 'D':
                        previousnum = num;
                        num = 500;
                        break;
                    case 'M':
                        previousnum = num;
                        num = 1000;
                        break;
                }           
                if (num<previousnum)
                {
					decimalNum= decimalNum-num;
				}
                else
                    decimalNum= decimalNum+num;
				}
			
				else
				{
					throw new NumberFormatException("enter proper roman number.");
				}
					
			   }
			}
			      catch(NumberFormatException e)
		          {
			        System.out.println("excepton "+e);
		          }
            
        }
 
        public static void printRoman (String romanNumeral)
		{
            System.out.println ("The equivalent of the Roman numeral "+romanNumeral+" is "+decimalNum);
        }
     
        public static void printDecimal (int decimalNum)
		{
            System.out.println ("Decimal Number stored is: " + decimalNum);
        }
	
 
    public static void main(String args[])
	{
        int n,ch;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("___________________________________________________________________ ");
		System.out.println("1.integer to roman   2.roman to integer");
		ch=sc.nextInt();
		switch(ch)	
		{
	  case 1:
		System.out.println(".....coversion of integer no to roman....");

     	System.out.println("Enter the integer value=");
		n=sc.nextInt();
		try{
		if(n<1 || n>3999)
		{
			throw new NumberFormatException("enter value 1 to 3999 range ");
	
		}
		else
		{
		System.out.println("roman value "+IntegerToRoman(n));
		}
		}
		catch(NumberFormatException e)
		{
			System.out.println("excepton "+e);
		}
		break;
		case 2:
		
		
		System.out.println("...conersion of roman to integer...");
		Roman rmtoD = new Roman();
        rmtoD .convertToDecimal();
        rmtoD .printRoman(romanNumeral);
		break;
		}
		}while(ch<=2);
	}    
}
