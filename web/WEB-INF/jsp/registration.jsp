<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page import="web.pizzeria.model.User"%>
<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">
    <div class="container">
      <div class="row">
        <div class="text-center center-block" style="width: 300px">
          <div >
            <form action="<c:url value="/user/registration" />" method="post" commandName="userForm">
              <div class="form-group">
                <label for="username">Name: </label>
                <input class="form-control" type="text" id="username" path="name" />
              </div>
              <div class="form-group">
                <label for="e-mail">Email: </label>
                <input class="form-control" type="text" id="e-mail" path="email" />
              </div>
              <div class="form-group">
                <label for="password">Password: </label>
                <input class="form-control" type="password" id="password" path="password"/>
              </div>
              <div class="form-group">
                <label for="passwordYet">Password yet: </label>
                <input class="form-control" type="password" id="passwordYet" path="passYet"/>
              </div>
              <input class="btn btn-success" type="submit" />
            </form>
          </div>
        </div>
      </div>
    </div>

  </tiles:putAttribute>
</tiles:insertDefinition>