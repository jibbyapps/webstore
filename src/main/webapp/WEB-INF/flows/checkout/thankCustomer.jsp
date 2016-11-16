<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp"%>


<div class="container-wrapper">
    <div class="container">
        <section>
            <div class="jumbotron">
                <div class="container">
                    <h1>Thank you for your business</h1>
                    <p>your order will be shipped in several days </p>
                </div>
            </div>
        </section>

        <section class="container">
            <p>
                <p href="<spring:url value="/" />" class="btn btn-default">OK</a>
            </p>

        </section>

    </div>
</div>


<!-- FOOTER -->
<%@include file="/WEB-INF/views/template/footer.jsp"%>
