package it.unibo.constructors;

class Smartphone {

    static final boolean DEF_HAS_GPS = true;
    static final boolean DEF_HAS_3G = true;
    static final boolean DEF_HAS_NFC = true;
    static final int DEF_SD_SIZE = 8192;
    static final int DEF_RAM_SIZE = 1024;
    static final int DEF_N_CPU = 2;

    final int nCPU;
    final int ram;
    final int sdSize;
    final String brand;
    final String model;
    final boolean hasGPS;
    final boolean has3G;
    final boolean hasNFC;

    // Full constructor with all parameters
    Smartphone(final int nCPU, final int ram, final int sdSize, final String brand, final String model,
            final boolean hasGPS, final boolean has3G, final boolean hasNFC) {
        this.nCPU = nCPU;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    // Constructor with default parameters for some fields
    Smartphone(final String brand, final String model) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    // Constructor accepting NFC as a parameter
    Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    // Constructor accepting GPS and 3G as parameters
    Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    // Constructor accepting only the SD size
    Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    // Method to print smartphone information
    void printStringRep() {
        System.out.println("Smartphone info:");
        System.out.println("n CPU(s): " + this.nCPU);
        System.out.println("RAM amount: " + this.ram);
        System.out.println("SD size: " + this.sdSize);
        System.out.println("brand: " + this.brand);
        System.out.println("model: " + this.model);
        System.out.println("hasGPS: " + this.hasGPS);
        System.out.println("has3G: " + this.has3G);
        System.out.println("hasNFC: " + this.hasNFC + "\n");
    }

    // Main method to test the constructors
    public static void main(final String[] args) {
        // 1) Create the HTC One smartphone with sdSize 1024
        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);

        // 2) Create the Samsung Galaxy Note 3 smartphone with ram 2048, cpu 4, sdSize
        // 8192, gps true, nfc true, 3g true
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);

        // 3) Create the Apple iPhone 5S smartphone with nfc false
        final Smartphone iPhone5S = new Smartphone("Apple", "iPhone 5S", false);

        // 4) Create the Google Nexus 4 smartphone with gps true and 3g true
        final Smartphone nexus4 = new Smartphone("Google", "Nexus 4", true, true);

        // 5) Use the printStringRep method to print the information of each phone
        htcOne.printStringRep();
        note3.printStringRep();
        iPhone5S.printStringRep();
        nexus4.printStringRep();
    }
}
