import javax.swing.*;
import java.awt.*;

<<<<<<< HEAD

public class YourName_Assignment_01 
{
=======
//inconsistent indentation and spacing.
public class YourName_Assignment_01 {
>>>>>>> 3955adb8514d5ef6de84797be57d4df74736121d
	public static int[] toSum = {10, 100, 1000, 10000, 100000, 1000000};
	public static long[] timeOfA = new long[6];
	public static long[] timeOfB = new long[6];
	public static long[] timeOfC = new long[6];
	public static int N = 0;
	public static int sum = 0;
	
public static void timeOfA(int N) {
	sum = 0;
	for (int i = 1; i <= N; i++) {
	sum = sum + 1;
}
}
//This algorithm B is incorrect: inner loop should go from 1 to i, inclusively.
public static void timeOfB(int N) {
	sum = 0;
	for (int i=1; i<= N; i++) {
	for (int j = 1; j <= i; j++) {
	sum = sum +1;
		}
	}
}

public static void timeOfC(int N) {
	sum = N * (N + 1) /2;
}

public static void TotalTimes() {
	long loopAStartTime;
	long loopBStartTime;
	long loopAEndTime;
	long loopBEndTime;
	long loopCStartTime;
	long loopCEndTime;

for (int i =0; i < toSum.length; i++) {
	loopAStartTime = System.nanoTime();
	timeOfA(toSum[i]);
	loopAEndTime = System.nanoTime();
	long totalATime = loopAEndTime - loopAStartTime;
	timeOfA[i] = totalATime;	
	loopBStartTime = System.nanoTime();
	timeOfB(toSum[i]);
	loopBEndTime = System.nanoTime();
	long totalBTime = loopBEndTime - loopBStartTime;
	timeOfB[i] = totalBTime;
	loopCStartTime = System.nanoTime();
	timeOfC(toSum[i]);
	loopCEndTime = System.nanoTime();
	long totalCTime = loopCEndTime - loopCStartTime;
	timeOfC[i] = totalCTime;
}	
}

public static void Display() {
	System.out.println("CS2050 Assignment-01\n");
	System.out.println("N\t\tTime A(ns)\tTime B(ns)\tTime C(ns)");
	System.out.println(toSum[0] + "\t\t" + timeOfA[0] + "\t\t" + timeOfB[0] + "\t\t"+ timeOfC[0]);
	System.out.println(toSum[1] + "\t\t" + timeOfA[1] + "\t\t" + timeOfB[1] + "\t\t"+ timeOfC[1]);
	System.out.println(toSum[2] + "\t\t" + timeOfA[2] + "\t\t" + timeOfB[2] + "\t\t"+ timeOfC[2]);
	System.out.println(toSum[3] + "\t\t" + timeOfA[3] + "\t\t" + timeOfB[3] + "\t"+ timeOfC[3]);
	System.out.println(toSum[4] + "\t\t" + timeOfA[4] + "\t\t" + timeOfB[4] + "\t\t"+ timeOfC[4]);
	System.out.println(toSum[5] + "\t\t" + timeOfA[5] + "\t\t" + timeOfB[5] + "\t\t"+ timeOfC[5]);
	JFrame jFrame = new JFrame("CS2050 Assignment-01\n");
	jFrame.setLayout(new FlowLayout());
	jFrame.setSize(420, 420);
	jFrame.add(new JLabel("\t\t         Results         "));
	jFrame.add(new JTextField("    N \tTime A(ns)\tTime B(ns)\tTime C(ns)        "));
	jFrame.setLocation(600,200);
	
	for(int i = 0; i < toSum.length; i++) {
	jFrame.add(new JTextField("   " + toSum[i] + "\t" + timeOfA[i] + "\t" + timeOfB[i] + "\t" + timeOfC[i] + "\t"));
	}
	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jFrame.setVisible(true);
}


public static void main(String[] args) {
	TotalTimes();
	Display();
	
	
	
		
}





}

