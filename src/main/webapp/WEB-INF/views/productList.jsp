<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>All products</h1>
            <p class="lead">Check out all the products now</p>

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
                    <td><img src="#" alt="image"/></td>
                    <td>${product.productName}</td>
                    <td>${product.productCategory}</td>
                    <td>${product.productCondition}</td>
                    <td>${product.productPrice} USD</td>
                    <td><a href= "<spring:url value="/productList/viewProduct/${product.productId}"/>"
                        ><span class="glyphicon glyphicon-hand-right"></span></a></td>
                </tr>

                </c:forEach>



            </table>

        </div>
        <!-- FOOTER -->
<%@include file="/WEB-INF/views/template/footer.jsp"%>
