<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <title>Note Pad</title>
    <link rel="stylesheet" href="styles.css"/>
</head>
<body>
	<header>
		<nav>
			<a href="/">Home</a>
			<a href="/newNote">New Note</a>
		</nav>
		<h1>The Note Pad</h1>
	</header>
	<main>
		<table>
			<thead>
				<tr>
					<th>S.No.</th>
					<th>Title</th>
					<th>Data</th>
					<th>Time</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="x" items="${notes}">
                    <tr>
						<td></td>
                    	<td><a class="btn" href="/edit/${x.getNoteid()}">${x.getNtitle()}</a></td>
						<td>${x.getCdate()}</td>
						<td>${x.getCtime()}</td>
						<td><a class="btn" href="/delete/${x.getNoteid()}">delete</a></td>
					</tr>
                </c:forEach>
			</tbody>
		</table>
	</main>
	<footer>
    </footer>
</body>
</html>