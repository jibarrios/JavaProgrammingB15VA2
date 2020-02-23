package day62_Collection4;
import java.util.*;
public class HashMapPractices {
    public static void main(String[] args) {

        Map rawMap = new HashMap();
        rawMap.put(1234, 1234);
        rawMap.put(true, false);
        rawMap.put("Key","Value");
        rawMap.put("Potatoes", 7.0);
        System.out.println(rawMap);

        //declare Polymorhic Maps<integer, String >
        Map<Integer,String> employees = new HashMap<>();

        HashMap<Integer,List<String>>empMap = new HashMap<>();

        List<Map<Integer,String>> List = new ArrayList<>();

        employees.put(10,"Wali");
        employees.put(20,"Nijat");
        employees.put(30,"Yassine");
        employees.put(40,"Amir");//out
        employees.put(50,"Luba");
        employees.put(60,"May");
        employees.put(70,"Imad");
        employees.put(80,"Nassif");

        System.out.println(employees.toString());

        System.out.println(80 + " - " + employees.get(80));//Nassif
        int id = 20;
        System.out.println(id + " - " + employees.get(id));

        System.out.println(employees.get(100)); //null

        //Amir - out tahmina for id 40
        employees.replace(40,"Tahmina");

        id= 40;
        System.out.println(id + "-" + employees.get(id));

        //Other way to replace
        employees.put(40,"Imtiaz");
        System.out.println(id + "-" + employees.get(id));

        System.out.println("--Size() Method ---");
        System.out.println(employees.size());


        System.out.println("--Remove(Key) method --");
        employees.remove(10);
        System.out.println(employees.toString());

        System.out.println("--Contains(key) method --");
        System.out.println(employees.containsKey(70));
        System.out.println(employees.containsKey(10));

        System.out.println("--ContainsValue(value) methods --");
        System.out.println(employees.containsValue("Nijat"));
        System.out.println(employees.containsValue("Nadir"));


        System.out.println("--isEmpty() method --");
        System.out.println(employees.isEmpty());
        System.out.println(empMap.isEmpty());

        System.out.println("--keySet() method --");
        System.out.println("keys: " + employees.keySet());
        Set <Integer> empsIDs = employees.keySet();
        System.out.println("empIds = " + empsIDs);

        System.out.println("-- values() methods --");
        System.out.println(employees.values());

        Collection <String> empNames = employees.values();
        System.out.println("empNames = " + empNames);












    }
}
