package it.unibo.arrays;

class PlayWithSmartphoneArrays {

    static int search(final Smartphone[] array, final String brand) {
        int value = 0;
        for (final Smartphone phone : array) {
            if (phone.getBrand().equals(brand)) {
                value++;
            }
        }
        return value;
    }

    static int search(final Smartphone[] array, final boolean hasNFC, final boolean hasGPS) {
        int value = 0;
        for (final Smartphone phone : array) {
            if (phone.hasNFC() == hasNFC && phone.hasGPS() == hasGPS) {
                value++;
            }
        }
        return value;
    }

    static int search(final Smartphone[] array, final int nCPUs, final int sdSize, final boolean has3G) {
        int value = 0;
        for (final Smartphone phone : array) {
            if (phone.getCPUs() == nCPUs && phone.getSdSize() == sdSize && phone.has3G() == has3G) {
                value++;
            }
        }
        return value;
    }

    public static void main(final String[] args) {
        final Smartphone[] phones = new Smartphone[5];

        // 1) Create the HTC One smartphone with 1024MB RAM and sdSize
        phones[0] = new Smartphone("HTC", "One", 1024);

        // 2) Create the Samsung Galaxy Note 3 smartphone with 2048MB RAM, sdSize: 8192,
        // GPS: true, NFC: true, 3G: true
        phones[1] = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);

        // 3) Create the iPhone 5S smartphone with NFC: false
        phones[2] = new Smartphone("Apple", "iPhone 5S", false);

        // 4) Create the Google Nexus 4 smartphone with GPS: true, 3G: true
        phones[3] = new Smartphone("Google", "Nexus 4", true, true);

        // 5) Create the Acer Liquid smartphone with 2 CPUs, 512MB RAM, 8192MB sdSize,
        // GPS: true, 3G: true, NFC: false
        phones[4] = new Smartphone(2, 512, 8192, "Acer", "Liquid", true, true, false);

        // 6) Perform various search operations using the implemented search methods and
        // check the number of matching phones
        System.out.println("The number of HTC smartphones is: " + search(phones, "HTC"));
        System.out.println("The number of smartphones with NFC & GPS is: " + search(phones, true, true));
        System.out.println("The number of smartphones with 1 CPU, 2048MB RAM, 8192MB sdSize, and 3G is: "
                + search(phones, 2, 8192, true));
    }

}
