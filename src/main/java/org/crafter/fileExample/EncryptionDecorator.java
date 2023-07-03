package org.crafter.fileExample;

public class EncryptionDecorator extends FileOperationDecorator{
    public EncryptionDecorator(FileOperation decoratedOperation) {
        super(decoratedOperation);
    }

    public void writeFile() {
        System.out.println("encrypted file");
        super.writeFile();
    }
}
