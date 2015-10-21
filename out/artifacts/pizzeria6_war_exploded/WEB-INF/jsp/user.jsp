<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">
    <html>
      <head>
          <title>${title}</title>
      </head>
      <body>
        <div class="container">
          <div class="jumbotron">
            <h1>${current.name}'s Profile</h1>
          </div>
          <div class="row">
            <div class="col-md-6">
              <div class="panel panel-default">
                <div class="panel-heading">
                  <h3 class="panel-title">Selected User</h3>
                </div>
                <div class="panel-body">
                  <div>${user.name}</div>
                  <div>${user.email}</div>
                </div>
              </div>
            </div>

            <div class="col-md-6">
              <div class="panel panel-default">
                <div class="panel-heading">
                  <h3 class="panel-title">Current User</h3>
                </div>
                <div class="panel-body">
                  <div>${current.name}</div>
                  <div>${current.email}</div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </body>
    </html>

  </tiles:putAttribute>
</tiles:insertDefinition>