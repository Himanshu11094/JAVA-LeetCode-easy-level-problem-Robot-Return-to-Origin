 
 import java.util.Scanner;
 
 class backend
 
 {
	 int x=0,y=0;
	 
	 boolean status()
	 {
		 if(x==0 && y==0)
			 
		 {return true;}
		 
		 else 
		return false;
	 }
	 
	 boolean check(String move)
	 
	 {
		 char checkValue;
		 
		 move =  move.toUpperCase();
         
		 for (int i=0; i< move.length();i++)
			 
		 {
			 checkValue = move.charAt(i);
			 
			 if (checkValue == 'U')
			 {y++;} 
				 
			 else if (checkValue == 'D')
			 {y--;} 
			 
			 else if (checkValue == 'L')
			 {x--;} 
			 
			 else if (checkValue == 'R')
			 {x++;} 
			 
			 else 
			 {System.out.println("Please enter the valid move!!!");
			 return false;
			 }
		 }
			 
			 System.out.printf("\nHere are the Coordinates: (%d,%d)", x,y);
			 
			 return true;
			 
		 }
	 }
	 
 


public class RobotMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String status = null;
		boolean check;
		
		backend obj = new backend();
		
		Scanner move = new Scanner(System.in);
		
		
		
		do {
		
			System.out.println("\nEnter the move (as left, right, up, down): ");
	 check = obj.check(move.nextLine());
	
	 if (check == true)
	 {status = String.valueOf(obj.status());}
	 
	 else 
	 { check = false;}
	 
	System.out.println("\nStatus of movement:  "+ status);

	}
	
	while(check != false);

}
}
