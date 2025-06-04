package arrayList;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	 	HashPerson p1 = new HashPerson("木村");
        HashPerson p2 = new HashPerson("山田");
        HashPerson p3 = new HashPerson("田中");
        
        Map<String,HashPerson> emp = new HashMap<>();
        
        
        emp.put("A13", p1);
        emp.put("A12", p2);
        emp.put("A14", p3);
        
//        for(String info: key) {
//            System.out.println("社員番号："+info);
//            System.out.println("私は"+value+"と申します。");
        emp.forEach((key,value) -> System.out.println("社員番号："+key + "\n" + "私は"+value.getName()+"と申します。"));


        }
        
	 
	        
	  	

}
