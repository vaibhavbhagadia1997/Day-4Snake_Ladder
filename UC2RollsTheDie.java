package Day4Assignment;
import java.util.Random;
public class UC2RollsTheDie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int position = 0;
		int max = 6;
		int min = 1;
		
		System.out.println("welcom player 1");
		int ran_num = (int)Math.floor(Math.random()*(max-min+1)+min);
		System.out.println("first number rolled in dice:"+ran_num);
	}

}
