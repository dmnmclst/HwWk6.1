package com.company;

public class Skeleton extends Boss{
    private int quantityOfRows;

    public int getQuantityOfRows() {
        return quantityOfRows;
    }

    public void setQuantityOfRows(int quantityOfRows) {
        this.quantityOfRows = quantityOfRows;
    }

    @Override
    public String printInfo() {
        return super.printInfo()+"" +
                "\nУ боса есть стрел: "+quantityOfRows;
    }
}
