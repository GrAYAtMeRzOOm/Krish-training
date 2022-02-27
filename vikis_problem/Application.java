import java.util.Scanner;
import java.util.HashMap;
public class Application{
	public static void main(String args[]){
	HashMap<Integer,Integer> frogVals = new HashMap<>();
	//restingDuration,jumpingMeters
	frogVals.put(1,5);
	frogVals.put(2,3);
	frogVals.put(3,1);
	Scanner scn = new Scanner(System.in);
	System.out.print("How many meters viki need to Jump - ");
	int inputDistance = Integer.valueOf(scn.nextLine());
	boolean processRunStat = true;
	int totSeconds = 0;
	int totDistance = 0;	
		while(processRunStat){
			for(int i = 1 ; i<4 ;i++){
				if(inputDistance<=totDistance){
					processRunStat = false;
				}else{
					totDistance+=frogVals.get(i);
					totSeconds += i;
				}
			}
		}
		System.out.println();
		System.out.println("Viki jumps "+inputDistance+" Meters in "+totSeconds+" Seconds");
	}
}