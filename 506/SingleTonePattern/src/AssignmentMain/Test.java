package AssignmentMain;

import threadPackage.ThreadTest;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello");

		for (int i = 0; i < 1000; i++) {
			ThreadTest test = new ThreadTest("thread number " + Integer.toString((i + 1)));
			test.start();
		}
	}
}
