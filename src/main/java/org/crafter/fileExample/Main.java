package org.crafter.fileExample;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new EncryptionDecorator(new BasicFileOperation());
        fileOperation.openFile();
        fileOperation.readFile();
        fileOperation.writeFile();
        fileOperation.closeFile();
    }
}
