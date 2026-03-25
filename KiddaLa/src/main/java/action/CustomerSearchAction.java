package action;

import java.util.ArrayList;

import dao.CustomerSearchDBAccess;
import model.Customer;
import model.OrderControlUtility;

public class CustomerSearchAction {

    private ArrayList<Customer> customerList;
    private String[][] tableData;
    private CustomerSearchDBAccess customerSearchDBAccess;

    public String[][] execute(String[] data) throws Exception {

        if (data[0] == null) {
            data[0] = "";
        }
        if (data[1] == null) {
            data[1] = "";
        }

        data[0] = data[0].replace(" ", "").replace("　", "");
        data[1] = data[1].replace(" ", "").replace("　", "");

        customerSearchDBAccess = new CustomerSearchDBAccess();

        if (!"".equals(data[0]) && "".equals(data[1])) {
            customerList = customerSearchDBAccess.searchCustomerByTel(data[0]);
        } else if ("".equals(data[0]) && !"".equals(data[1])) {
            customerList = customerSearchDBAccess.searchCustomerByKana(data[1]);
        } else if (!"".equals(data[0]) && !"".equals(data[1])) {
            customerList = customerSearchDBAccess.searchCustomer(data[0], data[1]);
        } else {
            customerList = new ArrayList<Customer>();
        }

        tableData = OrderControlUtility.customerToArray(customerList);

        return tableData;
    }
}