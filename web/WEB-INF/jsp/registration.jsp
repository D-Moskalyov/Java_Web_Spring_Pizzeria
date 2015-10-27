<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false"%>
<tiles:insertDefinition name="defaultTemplate">
  <tiles:putAttribute name="body">
    <div class="container">
      <div class="row">
        <div class="text-center center-block" style="width: 300px">
          <div >
            <form action="<c:url value="/user/registration" />" modelAttribute="userDTO" method="post">
              <div class="form-group">
                <label for="username">Name: </label>
                <input class="form-control" type="text" id="username" path="name" name="name" />
                <errors path="name" element="div"/>
              </div>
              <div class="form-group">
                <label for="e-mail">Email: </label>
                <input class="form-control" type="text" id="e-mail" path="email" name="email" />
                <errors path="email" element="div"/>
              </div>
              <div class="form-group">
                <label for="password">Password: </label>
                <input class="form-control" type="password" id="password" path="password" name="password" />
                <errors path="password" element="div"/>
              </div>
              <div class="form-group">
                <label for="passwordYet">Password yet: </label>
                <%--<input class="form-control" type="password" id="passwordYet" path="passYet" name="passYet"/>--%>
                <input class="form-control" type="password" id="passwordYet" path="matchingPassword" name="matchingPassword" />
                <errors element="div"/>
              </div>
              <input class="btn btn-success" type="submit" />



              <%--<div class="form-group">--%>
                <%--<label for="username">Name: </label>--%>
                <%--<input class="form-control" type="text" id="username" field="*{name}" name="name" />--%>
                <%--<errors path="name" element="div"/>--%>
              <%--</div>--%>
              <%--<div class="form-group">--%>
                <%--<label for="e-mail">Email: </label>--%>
                <%--<input class="form-control" type="text" id="e-mail" field="*{email}" name="email" />--%>
                <%--<errors path="email" element="div"/>--%>
              <%--</div>--%>
              <%--<div class="form-group">--%>
                <%--<label for="password">Password: </label>--%>
                <%--<input class="form-control" type="password" id="password" field="*{password}" name="password" />--%>
                <%--<errors path="password" element="div"/>--%>
              <%--</div>--%>
              <%--<div class="form-group">--%>
                <%--<label for="passwordYet">Password yet: </label>--%>
                  <%--&lt;%&ndash;<input class="form-control" type="password" id="passwordYet" path="passYet" name="passYet"/>&ndash;%&gt;--%>
                <%--<input class="form-control" type="password" id="passwordYet" field="*{matchingPassword}" name="matchingPassword" />--%>
                <%--<errors element="div"/>--%>
              <%--</div>--%>
                <%--<input class="btn btn-success" type="submit" />--%>



                <%--<form action="#" th:action="@{/registration}" th:object="${userDTO}" method="post">--%>
                  <%--<table>--%>
                    <%--<tr>--%>
                      <%--<td>name:</td>--%>
                      <%--<td><input type="text" th:field="*{name}" /></td>--%>
                      <%--&lt;%&ndash;<td th:if="${#fields.hasErrors('name')}" th:errors="*{name}">Name Error</td>&ndash;%&gt;--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                      <%--<td>email:</td>--%>
                      <%--<td><input type="text" th:field="*{email}" /></td>--%>
                      <%--&lt;%&ndash;<td th:if="${#fields.hasErrors('email')}" th:errors="*{email}">Name Error</td>&ndash;%&gt;--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                      <%--<td>password:</td>--%>
                      <%--<td><input type="password" th:field="*{password}" /></td>--%>
                        <%--&lt;%&ndash;<td th:if="${#fields.hasErrors('password')}" th:errors="*{password}">Name Error</td>&ndash;%&gt;--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                      <%--<td>matchingPassword:</td>--%>
                      <%--<td><input type="password" th:field="*{matchingPassword}" /></td>--%>
                        <%--&lt;%&ndash;<td th:if="${#fields.hasErrors('matchingPassword')}" th:errors="*{matchingPassword}">Name Error</td>&ndash;%&gt;--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                      <%--<td><button type="submit">Submit</button></td>--%>
                    <%--</tr>--%>
                  <%--</table>--%>
                <%--</form>--%>
                  </form>
          </div>
        </div>
      </div>
    </div>

  </tiles:putAttribute>
</tiles:insertDefinition>