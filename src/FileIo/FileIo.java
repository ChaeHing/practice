package FileIo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileIo {
    public static void main(String[] args) {
        try{
            //FileInputStream fileInput = new FileInputStream("test.txt"); // 파일스트림 생성, 상대경로.. 왜인지 안된다.
            FileInputStream fileInput = new FileInputStream("file.txt");
            // 파일스트림 생성, 읽어올 파일 절대경로 입력
            //BufferedInputStream bufferedInput = new BufferedInputStream(fileInput); // 파일스트림을 버퍼스트림으로

            int i = 0;
            while((i = fileInput.read()) != -1){ // fileInput.read()의 리턴값을 i에 저장, 값이 -1 인지 확인
            //while ((i = bufferedInput.read()) != -1) { // 파일스트림과 똑같이 사용
                                                 // 파일끝에 도달하면 -1을 리턴함
                System.out.print((char)i); // 파일 내용 출력
            }
            fileInput.close(); // 파일 스트림 닫기
        }
        catch (Exception e){
            System.out.println(e); // 파일이 없다면, java.io.FileNotFoundException: test.txt (지정된 파일을 찾을 수 없습니다)
        }

    }
}
