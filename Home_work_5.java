import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Home_work_5 {
public static void main(String[] args) {
// Создать словарь HashMap. Обобщение <Integer, String>.
    HashMap<Integer, String> Map = new HashMap<>();

// Заполнить тремя ключами (индекс, цвет), добавить ключ, если не было!)
    Map.put(1, "red");
    Map.put(2, "green");
    Map.put(3, "blue");
    System.out.println(Map);

// Изменить значения дописав восклицательные знаки.
    Map.forEach((k, v) -> System.out.println(k + "=" + v +"!"));

// *Создать TreeMap, заполнить аналогично.
    TreeMap<Integer,String> tMap = new TreeMap<>();
    tMap.put(1,"red");
    tMap.put(2,"green");
    tMap.put(3,"blue");
    System.out.println(tMap); 

// *Увеличить количество элементов до 1000 случайными ключами и общей строкой. (TreeMap)    
    for (int i = 0; i < 1000; i++) {
        int j = new Random().nextInt(100000);
        tMap.putIfAbsent(j,"yellow");        }
// **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
    long start1 = System.currentTimeMillis(); 
    for(Map.Entry<Integer, String> entry: tMap.entrySet()) {
        Integer key = entry.getKey();// get key
        String value = entry.getValue();// get value
    System.out.print(key + " = " + value + "; ");  }
    long finish1 = System.currentTimeMillis();

// *Увеличить количество элементов до 1000 случайными ключами и общей строкой. (Map)    
    for (int i = 0; i < 1000; i++) {
        int j = new Random().nextInt(100000);
        Map.putIfAbsent(j,"black");         }
// **Сравнить время последовательного и случайного перебора тысячи элементов словарей.
    long start2 = System.currentTimeMillis(); 
    for(Map.Entry<Integer, String> entry: Map.entrySet()) {
        Integer key = entry.getKey();// get key
        String value = entry.getValue();// get value
    System.out.print(key + " = " + value + "; ");
}
    long finish2 = System.currentTimeMillis();
    System.out.println();
    System.out.println();
    System.out.println("время выполнения перебора TreeMap: " + (finish1 - start1));
    System.out.println("время выполнения перебора Map: " + (finish2 - start2));

    
}
}