package day2controlandconditional;

public class SwitchCase 
{
	public static void main(String[] args) 
	{
		int time;
		time = 11;
		
		switch(time) 
		{
		case 10:
			System.out.println("Your Exam at 10Am");
			break;
		case 11:
			System.out.println("Your Exam at 11Am");
			break;
		default:
			System.out.println("Enter correct time");
			break;
		}
	}

}
