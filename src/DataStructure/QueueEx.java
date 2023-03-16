package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {

        // queue 생성, LinkedList를 활용해야한다.
        // Queue는 collection을 상속받고 있다.
        Queue<String> queue = new LinkedList<>();

        // 데이터 입력(enqueue), add()와 offer() 사용 가능
        queue.add("first data");
        queue.add("second data");
        queue.offer("third data");
        System.out.println("----------------");
        System.out.println(queue);

        // 데이터 출력(dequeue) 1
        System.out.println("----------------");
        System.out.println("제일 먼저 입력한 데이터를 출력");
        System.out.println("데이터를 출력하고 queue에서 삭제한다. - "+queue.poll());
        System.out.println(queue);

        // 데이터 출력(dequeue) 2
        System.out.println("----------------");
        System.out.println("데이터를 출력하고 queue에서 삭제한다. - "+queue.remove());
        System.out.println(queue);

        // Queue 크기 반환
        System.out.println("----------------");
        queue.add("first data");
        queue.add("second data");
        System.out.println(queue);
        System.out.println("큐 크기 반환 : "+queue.size());

        // 가장 먼저 입력한 데이터 검색 -> 제일 먼저 출력될 데이터
        System.out.println("----------------");
        System.out.println("Queue의 가장 앞에 있는 데이터 검색 -> 가장 먼저 출력될 데이터를 뜻한다.");
        System.out.println(queue.peek()); // Queue에서 삭제하기 않고 데이터만 검색

        // queue 비우기, 전체 삭제
        queue.clear();
        System.out.println("----------------");
        System.out.println("데이터 전체 삭제");
        System.out.println(queue);

        // queue가 비었을때 출력을 하면 null이 반환 된다.
        System.out.println("----------------");
        System.out.println("queue가 비었을때 출력을 하면 "+queue.poll()+" 반환");



    }
}
