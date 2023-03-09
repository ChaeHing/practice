package FileIo;

import java.io.*;

public class FileReaders {
    public static void main(String[] args) {

        try {
            FileReader file = new FileReader("file.txt"); // 스트림 생성
            //BufferedReader bufferedReader = new BufferedReader(file);

            int data = 0;

            while((data=file.read()) != -1) { // fileinputstream과 동일
            //while((data=bufferedReader.read()) != -1){
                System.out.print((char)data); // 파일내용 출력
            }
            file.close(); // 스트림 닫기
        }
        catch (IOException e) { // 예외처리
            e.printStackTrace();
        }
    }
}
