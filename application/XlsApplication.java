package application;

public class XlsApplication extends Application {
    @Override
    protected boolean processFile(String fileName) {
        return false;
    }

    @Override
    protected boolean checkFile(String fileName) {
        // 주어진 file이 XLS 파일의 내용을 처리함
        return false;
    }
}