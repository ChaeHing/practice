package FileIo;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        //File file = new File("../testfile.txt");
        File file = new File("src/FileIo", "testfile.txt"); // 인스턴스생성
        // 첫번째 인자 경로, 두번쨰 인자 파일이름
        file.createNewFile(); // 해당 메소드를 호출해야 파일이 생성됨

        System.out.println(file.getPath()); // 상대경로 반환
        System.out.println(file.getParent()); // 상위디렉토리 상대경로 반환
        System.out.println(file.getCanonicalPath()); // 절대경로 반환
        System.out.println(file.canWrite()); // 파일 쓰기가 가능한지 여부 반환 boolean
    }
}