interface ModernPrinter {
    void print();
}

class LegacyPrinter {
    void printDocument() {
        System.out.println("Печать документа");
    }
}

class PrinterAdapter implements ModernPrinter {
    private LegacyPrinter legacyPrinter;

    PrinterAdapter(LegacyPrinter printer) {
        this.legacyPrinter = printer;
    }

    public void print() {
        legacyPrinter.printDocument();
    }
}