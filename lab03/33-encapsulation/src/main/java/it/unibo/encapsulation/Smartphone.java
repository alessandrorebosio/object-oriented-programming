package it.unibo.encapsulation;

public class Smartphone {

    private static final boolean DEF_HAS_GPS = true;
    private static final boolean DEF_HAS_3G = true;
    private static final boolean DEF_HAS_NFC = true;
    private static final int DEF_SD_SIZE = 65536;
    private static final int DEF_RAM_SIZE = 8192;
    private static final int DEF_N_CPU = 8;

    private final int cpuCount;
    private final int ram;
    private final int sdSize;
    private final String brand;
    private final String model;
    private final boolean hasGPS;
    private final boolean has3G;
    private final boolean hasNFC;

    public int getCpuCount() {
        return cpuCount;
    }

    public int getRam() {
        return ram;
    }

    public int getSdSize() {
        return sdSize;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public boolean isHas3G() {
        return has3G;
    }

    public boolean isHasNFC() {
        return hasNFC;
    }

    public Smartphone(
            final int cpuCount,
            final int ram,
            final int sdSize,
            final String brand,
            final String model,
            final boolean hasGPS,
            final boolean has3G,
            final boolean hasNFC) {
        this.cpuCount = cpuCount;
        this.ram = ram;
        this.sdSize = sdSize;
        this.brand = brand;
        this.model = model;
        this.hasGPS = hasGPS;
        this.has3G = has3G;
        this.hasNFC = hasNFC;
    }

    public Smartphone(final String brand, final String model) {
        this(brand, model, DEF_SD_SIZE);
    }

    public Smartphone(final String brand, final String model, final int sdSize) {
        this(DEF_N_CPU, DEF_RAM_SIZE, sdSize, brand, model, DEF_HAS_GPS, DEF_HAS_3G, DEF_HAS_NFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasNFC) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, DEF_HAS_GPS, DEF_HAS_3G, hasNFC);
    }

    public Smartphone(final String brand, final String model, final boolean hasGPS, final boolean has3G) {
        this(DEF_N_CPU, DEF_RAM_SIZE, DEF_SD_SIZE, brand, model, hasGPS, has3G, DEF_HAS_NFC);
    }

    public void printStringRep() {
        System.out.println("n CPU(s): " + cpuCount);
        System.out.println("RAM amount: " + ram);
        System.out.println("SD size: " + sdSize);
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("hasGPS: " + hasGPS);
        System.out.println("has3G: " + has3G);
        System.out.println("hasNFC: " + hasNFC + "\n");
    }

    public static void main(final String[] args) {
        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);

        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);

        final Smartphone iPhone5S = new Smartphone("Apple", "iPhone 5S", false);

        final Smartphone nexus4 = new Smartphone("Google", "Nexus 4", true, true);

        htcOne.printStringRep();
        note3.printStringRep();
        iPhone5S.printStringRep();
        nexus4.printStringRep();
    }
}
