package project_pair;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayListの作成
		ArrayList<Integer> testAL = new ArrayList<Integer>() ;
		for(int i=0; i<20; i++)
			testAL.add(i*3/2) ;

		// ArrayListの中身を表示
		System.out.println("Original numbers") ;
		Function.showArrayList(testAL) ;

		// Pair型を持つオブジェクト作成
		Pair testPair = Function.classifyArray(testAL) ;

		// ArrayListの中身を表示
		System.out.println("Even numbers") ;
		Function.showArrayList(testPair.getFirst()) ;

		System.out.println("Odd numbers") ;
		Function.showArrayList(testPair.getSecond()) ;
	}
}
