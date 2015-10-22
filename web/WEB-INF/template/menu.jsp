<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<nav class="navbar navbar-inverse">
  <div class="container">

    <ul class="nav navbar-nav">
      <sec:authorize access="isAuthenticated()">
        <li><a href="<c:url value="/shop" />">Browse categories</a></li>
        <li><a href="<c:url value="/user/show" />">Profile</a></li>
        <li><a href="<c:url value="/user/logout" />">Logout</a></li>
      </sec:authorize>
      <sec:authorize access="isAnonymous()">
        <li><a href="<c:url value="/user/login" />"> Login</a> </li>
        <li><a href="<c:url value="/user/registration" />">Registration</a></li>
      </sec:authorize>
    </ul>
  </div>
</nav>