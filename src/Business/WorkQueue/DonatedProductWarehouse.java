/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Pratik Gawand
 */
public class DonatedProductWarehouse {

    public static ArrayList<DonatedProduct> donatedProductList = new ArrayList<DonatedProduct>();
    private DonatedProductWarehouse donatedProductWarehouseist;
    static DonatedProductWarehouse donationWH = null;

    public static ArrayList<DonatedProduct> getDonatedProductList() {

        if (donationWH == null) {
            donationWH = new DonatedProductWarehouse();
        }
        return donatedProductList;
    }

    private DonatedProductWarehouse() {

        DonatedProduct dp1 = new DonatedProduct("1001", "Jeans", "Clothes", "Available", 1000);
        DonatedProduct dp2 = new DonatedProduct("1002", "Shirts", "Clothes", "Available", 1000);
        DonatedProduct dp3 = new DonatedProduct("1003", "T-Shirt", "Clothes", "Available", 1000);
        DonatedProduct dp4 = new DonatedProduct("1004", "Milk", "Food", "Available", 1000);
        DonatedProduct dp5 = new DonatedProduct("1005", "Eggs", "Food", "Available", 1000);
        DonatedProduct dp6 = new DonatedProduct("1006", "Butter", "Food", "Available", 1000);
        DonatedProduct dp7 = new DonatedProduct("1007", "Chicken", "Food", "Available", 1000);
        DonatedProduct dp8 = new DonatedProduct("1008", "Turkey", "Food", "Available", 1000);
        DonatedProduct dp9 = new DonatedProduct("1009", "Ham", "Food", "Available", 1000);
        DonatedProduct dp10 = new DonatedProduct("1010", "Masks", "Hygience", "Available", 1000);
        DonatedProduct dp11 = new DonatedProduct("1011", "Santizer", "Hygience", "Available", 1000);
        DonatedProduct dp12 = new DonatedProduct("1012", "Face Shield", "Hygience", "Available", 1000);
        DonatedProduct dp13 = new DonatedProduct("1013", "Books", "Stationery", "Available", 1000);
        DonatedProduct dp14 = new DonatedProduct("1014", "Pens", "Stationery", "Available", 1000);
        DonatedProduct dp15 = new DonatedProduct("1015", "Pencil", "Stationery", "Available", 1000);
        DonatedProduct dp16 = new DonatedProduct("1016", "Kiwi", "Fruits", "Available", 1000);
        DonatedProduct dp17 = new DonatedProduct("1017", "Peach", "Fruits", "Available", 1000);
        DonatedProduct dp18 = new DonatedProduct("1018", "Apple", "Fruits", "Available", 1000);

        donatedProductList.add(dp1);
        donatedProductList.add(dp2);
        donatedProductList.add(dp3);
        donatedProductList.add(dp4);
        donatedProductList.add(dp5);
        donatedProductList.add(dp6);
        donatedProductList.add(dp7);
        donatedProductList.add(dp8);
        donatedProductList.add(dp9);
        donatedProductList.add(dp10);
        donatedProductList.add(dp11);
        donatedProductList.add(dp12);
        donatedProductList.add(dp13);
        donatedProductList.add(dp14);
        donatedProductList.add(dp15);
        donatedProductList.add(dp16);
        donatedProductList.add(dp17);
        donatedProductList.add(dp18);

    }

    public static void setDonatedProductList(ArrayList<DonatedProduct> donatedProductList) {
        DonatedProductWarehouse.donatedProductList = donatedProductList;
    }

    public ArrayList<DonatedProduct> getArrayUniqueList() {
        return donatedProductList;
    }
}
