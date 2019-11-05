package com.elfstudio;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private Boolean duplex;

    public Printer(int tonerLevel, Boolean duplex) {
        if (tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (this.tonerLevel + tonerAmount >100){
                System.out.println("Toner Amount is Out of Capacity");
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public Boolean getDuplex() {
        return duplex;
    }
}
