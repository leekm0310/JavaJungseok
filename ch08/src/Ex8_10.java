import java.io.File;

public class Ex8_10 {
    public static void main(String[] args) {
        try {
            File f = createFile("");
            System.out.println(f.getName()+"파일이 성공적으로 생성되었습니다.");
        } catch (Exception e){
            System.out.println(e.getMessage()+" 다시 입력해 주시기 바랍니다.");
        }
    }

    static File createFile(String fileName) throws Exception{
        if (fileName == null || fileName.equals("")) {
            throw new Exception("파일이름이 유효하지 않습니다.");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
//결국 예외처리를 해야하는데 예외를 떠넘길것인가 아니면 발생할 곳에서 처리할 것인지
//고민해봐야한다.