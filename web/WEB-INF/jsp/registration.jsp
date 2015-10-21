<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">
    <div class="container">
      <div class="row">
        <div class="text-center center-block" style="width: 300px">
          <div >
            <form action="<c:url value="/user/registration" />" method="post">
              <div class="form-group">

              </div>
              <div class="form-group">

              </div>
              <div>
                <input id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
                <label for="remember_me" class="inline">Remember me</label></td>
              </div>
              <input class="btn btn-success" type="submit" />
            </form>
          </div>
        </div>
      </div>
    </div>

  </tiles:putAttribute>
</tiles:insertDefinition>