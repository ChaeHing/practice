package FileIo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {

        try {
            String fileName = "test.txt";
            FileWriter fileWriter = new FileWriter(fileName); // 스트림 생성

            String str = "file creat!! gogo"; // 파일 내용
            fileWriter.write(str); // 파일 내용 쓰기
            fileWriter.close(); // 스트림 닫기
            // 이름이 동일한 파일 존재시 overwrite

        }catch (IOException e){ // 예외 처리
            e.printStackTrace();
        }

    }

}
