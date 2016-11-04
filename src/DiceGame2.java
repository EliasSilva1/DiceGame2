import java.util.Scanner;

public class DiceGame2 {
	
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		
		int temp,dice_max,guess,random_number=0,count=0;

		
		System.out.println("Enter the number of dices you want to roll");
		dice_max= x.nextInt();
		
		int[] roll_value;
		roll_value= new int [dice_max];
		
		for(int i=0; i<dice_max;i++)
		{
			temp=RandomNumber.GetRandom();
			random_number=random_number + temp;
			roll_value[i]=temp;
			count++;
		}
		
		System.out.println("Enter the number");
		guess=x.nextInt();
		
		for(int i=0; i<dice_max;i++)
		{
			int temp2=i+1;
			
			System.out.printf("Roll %s:%s\n",temp2,roll_value[i]);
		}
		
		System.out.printf("Total roll %s\n", random_number);
		
		boolean correct = (guess == random_number)?true:false;
		
		if(correct)
			System.out.printf("You guess %s correct!",guess);
		else
			System.out.printf("You guess %s incorrect!",guess);	
	
	}

}


// Please add comments to describe the purpose/usage of the 2 for loops/statements
