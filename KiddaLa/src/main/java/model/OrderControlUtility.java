package model;

import java.util.ArrayList;

public class OrderControlUtility {

    public static String[][] customerToArray(ArrayList<Customer> customerList) {

        if (customerList == null) {
            return new String[0][0];
        }

        String[][] data = new String[customerList.size()][5];

        for (int i = 0; i < customerList.size(); i++) {
            Customer customer = customerList.get(i);
            data[i][0] = String.valueOf(customer.getCustId());
            data[i][1] = customer.getCustName();
            data[i][2] = customer.getKana();
            data[i][3] = customer.getTel();
            data[i][4] = customer.getAddress();
        }

        return data;
    }
}