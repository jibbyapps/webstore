<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Customer register successfully!</h1>

                    <p>All the selected products in your shopping cart!!</p>
                </div>
            </div>
        </section>

        <section class="container">
<p>
            <a href="<spring:url value="/product/productList" />" class="btn btn-default">Continue Shopping</a>
</p>
        </section>

    </div>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
<script src="<c:url value="/resources/js/controller.js"/>"></script>

<!-- FOOTER -->
<%@include file="/WEB-INF/views/template/footer.jsp"%>
