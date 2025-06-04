package arrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<String> fruits = new ArrayList<>();
        fruits.add("りんご");
        fruits.add("みかん");
        fruits.add("バナナ");
        fruits.add("スイカ");
        fruits.add("メロン");
        
        fruits.remove(2);
 

        for (String f : fruits) {
            System.out.println(f);
        }
	}

}
