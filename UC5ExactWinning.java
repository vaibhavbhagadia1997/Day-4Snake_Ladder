package Day4Assignment;
import java.util.Random;
public class UC5ExactWinning {


		   public static final int Ladder = 1;
		    public static final int Snake =2;
		    public static void main(String[] args) {
		    	// TODO Auto-generated method stub
		    
		        int Position = 0, Max = 6, Min = 1;
		        System.out.println("welcome player number 1");
		        while (Position < 100) {
		            int RandNum = (int) Math.floor(Math.random() * (Max - Min + 1) + Min);
		            System.out.println("number rolled in dice: " + RandNum);
		            int TempPosition = (int) Math.floor(Math.random() * 10) % 3;
		            switch (TempPosition) {
		                case Ladder:
		                    Position += RandNum;
		                    if(Position > 100)
		                        Position -= RandNum;
		                    break;
		                case Snake:
		                    Position -= RandNum;
		                    if(Position < 0)
		                        Position = 0;
		                    break;
		                default:
		                    break;
		            }
		        }
		        System.out.println("you are at "+Position+" position");
		        System.out.println("You Won !");
		    }
		}
