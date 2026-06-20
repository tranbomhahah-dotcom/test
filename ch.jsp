<%-- 
    Document   : ch
    Created on : Jun 13, 2026, 1:19:13 PM
    Author     : MSI
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>quan ly cua hang</title>
    </head>
    <body>
        <form>
            ID: <input type="number" name="ID" value="${form.ID}" placeholder="nhap id tai day" required><br><br>
            Tên của hàng: <input type="text" name="TenCH" value="${form.TenCH}" placeholder="nhap ten cua hang" required<br><br>
            Địa chỉ: <input type="text" name="DiaChi" value="${form.DiaChi}" placeholder="nhap dia chi" required><br><br>
            Diện tích: <input type="number" name="DT" value="${form.DT}" placeholder="nhap dien tich" required><br><br>
            Giá: <input type="number" name="Gia" value="${form.Gia}" placeholder="nhap gia" required><br><br>
            <button type="submit" name="action" value="add" class="btn-add">them</button>
            <button type="submit" name="action" value="add" class="btn-add">them</button>
            <c:if test="${erorr != null}">
                <p style="color: red">
                    ${error}
                </p>
            </c:if>
            <c:if test="${success != null}">
                <p style="color: green">
                    ${success}
                </p>
            </c:if>
        </form>
            <h2>Danh sach cua hang</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Ten cua hang</th>
                        <th>Dia chi</th>
                        <th>Dien tich</th>
                        <th>Gia thue</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="cuahang" items="${LIST_CUAHANG}">
                    <tr>
                        <td>${cuahang.ID}</td>
                        <td>${maytinh.TenCH}</td>
                        <td>${maytinh.DiaChi}</td>
                        <td>${maytinh.DT}</td>
                        <td>${maytinh.Gia}</td>
                        <td>
                            <form method="POST" style="margin:0; display:inline;">
                                <input type="hidden" name="ID" value="${cuahang.ID}">
                                <button type="submit" name="action" value="delete" class="btn-delete" onclick="return confirm('Xóa cua hang này?')">Xóa</button>
                            </form>     
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
    </body>
</html>
