package com.company.decorator.fileDecorator;

public class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    final int number = 3;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }




}
