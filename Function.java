package project_pair;

import java.util.ArrayList;

public class Function {

	// ArrayListを偶数と奇数に分ける関数
	public static Pair classifyArray(ArrayList<Integer> AL){

		ArrayList<Integer> ALe = new ArrayList<Integer>() ;
		ArrayList<Integer> ALo = new ArrayList<Integer>() ;

		// 偶数と奇数に分ける
		for(int i=0; i<AL.size(); i++){
			if(AL.get(i)%2==0)	// 偶数
				ALe.add(AL.get(i)) ;
			else				// 奇数
				ALo.add(AL.get(i)) ;
		}

		// オブジェクト作成
		Pair pairAL = new Pair(ALe,ALo) ;
		return pairAL ;

	}

	// ArrayListの内容を表示する関数
	public static void showArrayList(ArrayList<Integer> AL) {
		for(int i=0; i<AL.size(); i++){
			System.out.print(AL.get(i)) ;
			System.out.print(" ") ;
		}
		System.out.print("\n") ;
	}
}
