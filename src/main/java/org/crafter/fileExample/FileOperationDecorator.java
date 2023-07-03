package org.crafter.fileExample;

public abstract class FileOperationDecorator implements FileOperation{
    protected FileOperation decoratedOperation;

    public FileOperationDecorator(FileOperation decoratedOperation){
        this.decoratedOperation = decoratedOperation;
    }

    @Override
    public void openFile() {
        decoratedOperation.openFile();
    }

    @Override
    public void readFile() {
        decoratedOperation.readFile();
    }

    @Override
    public void writeFile() {
        decoratedOperation.writeFile();
    }

    @Override
    public void closeFile() {
        decoratedOperation.closeFile();
    }


}
