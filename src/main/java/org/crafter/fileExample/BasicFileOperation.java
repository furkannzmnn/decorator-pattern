package org.crafter.fileExample;

public class BasicFileOperation implements FileOperation{
    @Override
    public void openFile() {
        System.out.println("Opening file");
    }

    @Override
    public void readFile() {
        System.out.println("Reading file");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file");
    }
}
