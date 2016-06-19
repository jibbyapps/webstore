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

        </div>
        <c:if test="${pageContext.request.userPrincipal.name !=null}">
        <h2>
            Welcome: ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>

        </h2>

        </c:if>

            <h3>
                <a href="<c:url value="/admin/productInventory"/> "> Product inventory</a>
            </h3>

            <p>Here you can add or modify your product</p>



        <!-- FOOTER -->
        <%@include file="/WEB-INF/views/template/footer.jsp"%>
