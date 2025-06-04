package arrayList;

import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("りんご");
        fruits.add("みかん");
        fruits.add("バナナ");
        fruits.add("スイカ");
        fruits.add("メロン");
        
        for(String fruit : fruits){
            System.out.println(fruit);
        }
	}

}
