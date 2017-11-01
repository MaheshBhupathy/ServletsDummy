<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin::DashBoard</title>
</head>
<body>
	<header>Student Application</header>
	<hr>
	<section id="status-bar">

		<p>${status}
			<span dir="rtl"> <a href="#">Profile</a> <a href="#">logout</a>
			</span>
		</p>
	</section>
	<section id="workBoard">
		<div>
		<a href="showAllStudents">Show All Students</a>
		<br>
		<c:choose>
		<c:when test="${not empty students}">
		<table>
				<thead>
					<tr><p>Students List</p>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>STUDENT ID</td>
						<td>STUDENT NAME</td>
						<td>STUDENT MOBILE</td>
						<td>STUDENT CITY</td>
					</tr>

					<c:forEach items="${students}" var="student">
						<tr>
							<td><c:out value="${student.getStudentId()}"></c:out></td>
							<td><c:out value="${student.getStudentName()}"></c:out></td>
							<td><c:out value="${student.getStudentMobile()}"></c:out></td>
							<td><c:out value="${student.getStudentCity()}"></c:out></td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		
		</c:when>
		<c:otherwise>
		
		</c:otherwise>
		</c:choose>
		</div>
	</section>
</body>
</html>