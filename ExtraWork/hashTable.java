package sortingAlgorithams.ExtraWork;
import java.util.HashMap;

public class hashTable{
    public static void main(String[] args) {
        HashMap <String,Integer> hashMap = new HashMap<>();
        hashMap.put("ajith", 1245);
        hashMap.put("Sajith", 5678);
        hashMap.put("jithu", 9012);
        hashMap.put("Sarath",2345);
        hashMap.remove("jithu");
        System.out.println(hashMap);
        for (String key : hashMap.keySet()) {
            int value = hashMap.get(key);
            System.out.println(key + ": " + value);
        }
    }
}