package com.company.decorator.fileDecorator;

public interface DataSource {

    void writeData(String data);

    String readData();
}
