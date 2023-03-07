import java.util.*;
import java.util.logging.Handler;

public class ArrayListEx {
    public static void main(String[] args) {

        //데이터의 잦은 변경이 예상된다면 LinkedList를, 데이터의 개수가 변하지 않는다면 ArrayList를 사용
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();


        for(int i=0; i<=10; i++){
            arrayList.add(i);
        }

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            int num = iterator.next();
            if(num % 2 == 0) iterator.remove();
            System.out.println(num);
        }

        System.out.println("--------------------------------------");

        for(int j : arrayList){
            System.out.println(j);
        }


        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Go");
        languages.add("JavaScript");

        Iterator it = languages.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------------------------");

        TreeSet<String> player = new TreeSet<>();

        player.add("Kim");
        player.add("Lee");
        player.add("Park");
        player.add("Chae");

        System.out.println(player); // [Chae, Kim, Lee, Park]  -> 오름차순 정렬
        System.out.println(player.first()); // Chae
        System.out.println(player.last()); // Park
        System.out.println(player.higher("Lee")); // Park
        System.out.println(player.subSet("Kim", "Park"));

        System.out.println("--------------------------------------");

        HashMap<String, Integer> goal = new HashMap<>();

        goal.put("메시", 31);
        goal.put("호날두", 20);
        goal.put("홀란드", 30);
        goal.put("음바페", 28);

        System.out.println("entry 개수 : "+goal.size());
        System.out.println("홀란드 : " +goal.get("홀란드"));

        System.out.println("--------------------------------------");

        Set<String> keySet = goal.keySet();

        Iterator<String> keyIterator = keySet.iterator();

        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = goal.get(key);
            System.out.println(value);
        }

        System.out.println("--------------------------------------");

        goal.remove("호날두");
        System.out.println("총 엔트리 수 : "+goal.size());

        System.out.println("--------------------------------------");
        Set<Map.Entry<String, Integer>> entrySet = goal.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+" : "+value);
        }

        System.out.println("--------------------------------------");
        goal.clear();
        System.out.println("총 엔트리 수 : "+goal.size());


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //arrayList2.addAll(0, 30);

    }
}
