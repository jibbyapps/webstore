<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: vitaliiromanchenko
  Date: 26.04.16
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Product Inventory Page</h1>
            <p class="lead">this is the product inventory page</p>

        </div>

            <table class="table table-striped table-hover">
                <thead>
                <tr class="bg-success">
                    <th>Photo icon</th>
                    <th>Product name</th>
                    <th>Category</th>
                    <th>Condition</th>
                    <th>Price</th>
                    <th></th>

                </tr>
                </thead>

                <c:forEach items="${products}" var="product">
                    <tr>
                        <td><img src="<c:url value="/resources/images/${product.productId}.png"/>" alt="image"
                        style="width: 50%"/></td>
                        <td>${product.productName}</td>
                        <td>${product.productCategory}</td>
                        <td>${product.productCondition}</td>
                        <td>${product.productPrice} USD</td>
                        <td>
                            <a href= "<spring:url value="/product/viewProduct/${product.productId}"/>"
                            ><span class="glyphicon glyphicon-hand-right"></span></a>

                            <a href= "<spring:url value="/admin/product/deleteProduct/${product.productId}"/>"
                            ><span class="glyphicon glyphicon-remove"></span></a>

                            <a href= "<spring:url value="/admin/product/editProduct/${product.productId}"/>"
                            ><span class="glyphicon glyphicon-pencil"></span></a>


                        </td>

                    </tr>

                </c:forEach>


            </table>



            <a href="<spring:url value="/admin/product/addProduct"/>"  class="btn btn-primary">Add Product</a>


        <!-- FOOTER -->
        <%@include file="/WEB-INF/views/template/footer.jsp"%>
