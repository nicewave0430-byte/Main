package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Customer;

public class CustomerSearchDBAccess {

    private static final String URL =
            "jdbc:mysql://localhost:3306/KIDDA_LA?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Tokyo&characterEncoding=UTF-8";
    private static final String USER = "root";
    private static final String PASS = ""; //ローカル実行環境に合わせて接続情報は変更しています。メソッド構成・処理内容は設計書準拠です。

    private Connection createConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(URL, USER, PASS);
        return con;
    }

    private void closeConnection(Connection con) throws Exception {
        if (con != null) {
            con.close();
        }
    }

    public ArrayList<Customer> searchCustomerByTel(String tel) throws Exception {
        ArrayList<Customer> list = new ArrayList<Customer>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = createConnection();

            String sql = "SELECT CUSTID, CUSTNAME, KANA, TEL, ADDRESS FROM CUSTOMER WHERE TEL = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tel);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustId(rs.getInt("CUSTID"));
                customer.setCustName(rs.getString("CUSTNAME"));
                customer.setKana(rs.getString("KANA"));
                customer.setTel(rs.getString("TEL"));
                customer.setAddress(rs.getString("ADDRESS"));
                list.add(customer);
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            closeConnection(con);
        }

        return list;
    }

    public ArrayList<Customer> searchCustomerByKana(String kana) throws Exception {
        ArrayList<Customer> list = new ArrayList<Customer>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = createConnection();

            String sql = "SELECT CUSTID, CUSTNAME, KANA, TEL, ADDRESS FROM CUSTOMER WHERE KANA LIKE ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + kana + "%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustId(rs.getInt("CUSTID"));
                customer.setCustName(rs.getString("CUSTNAME"));
                customer.setKana(rs.getString("KANA"));
                customer.setTel(rs.getString("TEL"));
                customer.setAddress(rs.getString("ADDRESS"));
                list.add(customer);
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            closeConnection(con);
        }

        return list;
    }

    public ArrayList<Customer> searchCustomer(String tel, String kana) throws Exception {
        ArrayList<Customer> list = new ArrayList<Customer>();
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            con = createConnection();

            String sql = "SELECT CUSTID, CUSTNAME, KANA, TEL, ADDRESS FROM CUSTOMER WHERE TEL = ? AND KANA LIKE ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tel);
            pstmt.setString(2, "%" + kana + "%");

            rs = pstmt.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustId(rs.getInt("CUSTID"));
                customer.setCustName(rs.getString("CUSTNAME"));
                customer.setKana(rs.getString("KANA"));
                customer.setTel(rs.getString("TEL"));
                customer.setAddress(rs.getString("ADDRESS"));
                list.add(customer);
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            closeConnection(con);
        }

        return list;
    }
}