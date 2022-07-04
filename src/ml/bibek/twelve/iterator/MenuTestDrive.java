package ml.bibek.twelve.iterator;

import java.util.Arrays;

public class MenuTestDrive {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(Arrays.asList(pancakeHouseMenu, dinerMenu, cafeMenu));

        waitress.printMenu();
    }
}
