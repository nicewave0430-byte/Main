<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
    private String escapeHtml(String str) {
        if (str == null) {
            return "";
        }
        return str.replace("&", "&amp;")
                  .replace("<", "&lt;")
                  .replace(">", "&gt;")
                  .replace("\"", "&quot;")
                  .replace("'", "&#39;");
    }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顧客検索</title>
</head>
<body>

    <h2>顧客検索画面</h2>

    <form action="KiddaLaController" method="post">
        <input type="hidden" name="command" value="CustomerSearch">
        電話番号：
        <input type="text" name="tel"><br>
        カナ：
        <input type="text" name="kana"><br>
        <input type="submit" value="検索">
    </form>

    <hr>

<%
    String[][] tableData = (String[][])request.getAttribute("tableData");

    if (tableData != null && tableData.length > 0) {
%>
    <table border="1">
        <tr>
            <th>顧客ID</th>
            <th>顧客名</th>
            <th>カナ</th>
            <th>電話番号</th>
            <th>住所</th>
        </tr>
<%
        for (int i = 0; i < tableData.length; i++) {
%>
        <tr>
            <td><%= escapeHtml(tableData[i][0]) %></td>
            <td><%= escapeHtml(tableData[i][1]) %></td>
            <td><%= escapeHtml(tableData[i][2]) %></td>
            <td><%= escapeHtml(tableData[i][3]) %></td>
            <td><%= escapeHtml(tableData[i][4]) %></td>
        </tr>
<%
        }
%>
    </table>
<%
    } else if (tableData != null) {
%>
    <p>検索結果は0件です。</p>
<%
    }
%>

</body>
</html>