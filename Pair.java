package project_pair;

import java.util.ArrayList;

public class Pair {

	// クラスが持つ変数の定義
	ArrayList<Integer> first ;
	ArrayList<Integer> second ;

	// コンストラクタ
	Pair(ArrayList<Integer> x, ArrayList<Integer> y){
		this.first = x ;
		this.second = y ;
	}

	// アクセスする関数
	public ArrayList<Integer> getFirst(){
		return first ;
	}
	public ArrayList<Integer> getSecond(){
		return second ;
	}
}
