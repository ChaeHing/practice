package FileIo;

import java.io.FileOutputStream;

public class FileOutPut {
    public static void main(String[] args) {
        try{
            FileOutputStream fileOutput = new FileOutputStream("src/FileIo/file.txt");
            // 생성할 파일 경로 입력, 기존에 파일이있다면 overwrite
            String word = "file Create"; // 파일안에 입력할 내용, 문자열

            fileOutput.write(word.getBytes()); // 문자열을 바이트 배열로 반환하여 파일에 입력 및 저장
            fileOutput.close(); // 파일 스트림 닫기

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
