package Day4Assignment;

public class UC3_Snake_Ladder {
    public static final int Ladder = 1;
    public static final int Snake = 2;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = 0;
		int max = 6;
		int min = 1;
		
		System.out.println("welcom player 1");
		int ran_num = (int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println("first number rolled in dice:"+ran_num);
	   int TempPosition = (int) Math.floor(Math.random() * 10) % 3;
	   System.out.println(TempPosition+ " is the temp number");
	    	switch (TempPosition) {
	    	case Ladder:
	    		position += ran_num;
	    		break;
	    	case Snake:
	    	position -= ran_num;
	    	break;
	    	default:
	    		break;
	    	}
	    	System.out.println("you are at the position:" +position );
	}

}
