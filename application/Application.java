package application;

public abstract class Application {
    public boolean open(String fileName) {

        boolean canRead = false;
        // check whether the file can be read!
        canRead = checkFile(fileName);

        if (canRead == false)
            return false;

        boolean result = false;
        // read and process the file
        result = processFile(fileName);

        return result;
    }

    protected abstract boolean processFile(String fileName);

    protected abstract boolean checkFile(String fileName);

}
