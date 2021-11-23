package application;

public class DocApplication extends Application {
    @Override
    protected boolean processFile(String fileName) {
        // 주어진 file이 DOC 파일의 내용을 처리함
        return false;
    }

    @Override
    protected boolean checkFile(String fileName) {
        // 주어진 file이 DOC의 format인지 확인함
        return false;
    }
}