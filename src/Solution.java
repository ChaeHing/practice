import java.util.Arrays;

public class Solution {

    // 재귀함수 배열 뒤집기
    public int[] reverseArr(int[] arr) {

        if(arr.length == 0) return arr;


        int tail = arr[0]; // 맨앞 숫자가 맨뒤로 간다.
        int[] head = reverseArr(Arrays.copyOfRange(arr, 1, arr.length)); // 맨앞 숫자를 뺀 나머지를 인자로 재귀함수 호출

        int[] newArr = new int[arr.length]; // reverse한 것을 복사할 배열 생성
        System.arraycopy(head, 0, newArr, 0, head.length); // 재귀 함수를 통해 구한 배열을 새배열에 앞부분부터 복사
        newArr[arr.length-1] = tail; // 맨처음 뺀 첫번째 숫자를 맨뒤에 추가

        return newArr;
    }
}
