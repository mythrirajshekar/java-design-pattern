<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- http://localhost:8080/designpatternapplication/landing.htm -->
<html>
<body>
	<h1>Java MVC Application</h1>
	<div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of users</h2></caption>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td><c:out value="${user.firstName}" /></td>
                    <td><c:out value="${user.lastName}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <h1>Java Singleton Behavior</h1>
    <h2>The Content of Singleton Class: ${singletonString}</h2>
    <h2>The Content of Singleton Class Instance X: ${singletonStringX}</h2>
    <h2>The Content of Singleton Class Instance Y: ${singletonStringY}</h2>

</body>
</html>