<%--
  Created by IntelliJ IDEA.
  User: vitaliiromanchenko
  Date: 26.04.16
  Time: 09:37
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Admin area</h1>
            <p class="lead">This is admin page</p>
            <h3>
                <a href="<c:url value="admin/productInventory"/> "> Product inventory</a>
            </h3>

            <p>Here you can add or modify your product</p>


        </div>
        <!-- FOOTER -->
        <%@include file="/WEB-INF/views/template/footer.jsp"%>
