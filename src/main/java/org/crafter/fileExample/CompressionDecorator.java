package org.crafter.fileExample;

public class CompressionDecorator extends FileOperationDecorator{
    public CompressionDecorator(FileOperation decoratedOperation) {
        super(decoratedOperation);
    }

    @Override
    public void readFile() {
        System.out.println("compressed file");
    }
}
