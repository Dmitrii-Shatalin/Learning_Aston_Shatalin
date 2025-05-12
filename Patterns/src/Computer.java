class Computer {
    private String CPU;
    private String RAM;
    private String SSD;

    private Computer() {}

    void showSpecs() {
        System.out.printf("Компьютер: %s | %s | %s\n", CPU, RAM, SSD);
    }

    static class Builder {
        private Computer computer = new Computer();

        Builder setCPU(String cpu) {
            computer.CPU = cpu;
            return this;
        }

        Builder setRAM(String ram) {
            computer.RAM = ram;
            return this;
        }

        Builder setSSD(String ssd) {
            computer.SSD = ssd;
            return this;
        }

        Computer build() {
            return computer;
        }
    }
}
