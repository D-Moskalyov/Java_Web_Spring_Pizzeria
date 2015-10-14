<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <div class="container">
    <div class="jumbotron">
      <h1>Browse categories</h1>
    </div>
    <div class="row">
      <div class="col-md-6">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Categories</h3>
          </div>
          <div class="panel-body">
            <ul>
              <c:forEach items="${cats}" var="cat">
                <li><a class="button" href="<c:url value="/shop/category/${cat.id}" />"> ${cat.name}</a></li>
              </c:forEach>
            </ul>
          </div>
        </div>
      </div>

      <div class="col-md-6">
        <div class="panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Basket</h3>
          </div>
          <div class="panel-body">
            <ul>
              <%--<c:forEach items="${basket}" var="item">--%>
              <%--<li>${item.value.good.name} : <span>${item.value.count}</span></li>--%>
              <%--</c:forEach>--%>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
