<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Daftar Produk</title>
        <!--<link rel="stylesheet" type="text/css" href="http://cdn.sencha.com/ext-4.1.1a-gpl/resources/css/ext-all.css" />-->
<!--        <script type="text/javascript" src="http://cdn.sencha.com/ext-4.1.1a-gpl/ext-all.js"></script>
        <script type="text/javascript" src="<%= request.getContextPath()%>/js/extjs-demo.js"></script>-->
    </head>
    <body>
        <h1>Daftar Produk</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Kode</th>
                    <th>Nama</th>
                    <th>harga</th>
                    <th>&nbsp;</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="p" items="${produk}">
                    <tr>
                        <td>${p.kode}</td>
                        <td>${p.nama}</td>
                        <td>${p.harga}</td>
                        <td>
                            <a href="view?id=${p.id}">lihat</a> |
                            <a href="form?id=${p.id}">edit</a> |
                            <a href="delete?id=${p.id}">hapus</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>