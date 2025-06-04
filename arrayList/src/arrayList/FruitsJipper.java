package arrayList;

import java.util.ArrayList;

public class FruitsJipper {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("おすず");
        fruits.add("あまねき");
        fruits.add("まつかれ");
        fruits.add("るなぴ");
        fruits.add("ノエル");
        fruits.add("まなふぃ");
        fruits.add("ゆいちゃん");
    
        for(String fruit : fruits){
            System.out.println(fruit);
        }
	}

}
