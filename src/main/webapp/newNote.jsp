<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<title>Note Pad</title>
		<style>
			nav {
				display: flex;
				justify-content: space-around;
				align-items: center;
				min-height: 10vh;
				background: black;
				color: white;
				font-size: 22px;
				font-family: sans-serif;
			}

			.button {
				background-color: #04AA6D;
				color: white;
				padding: 15px 0;
				margin: 8px 20%;
				border: none;
				cursor: pointer;
				width: 25%;
			}

			body {
				counter-reset: Serial;
				background-color: #FFDEE9;
				background-image: linear-gradient(0deg, #FFDEE9 0%, #B5FFFC 150%);
				height: 100vh;

			}

			.button:hover {
				background-color: #45a049;
			}

			th,
			td {
				padding: 8px;
				text-align: left;
			}

			h1 {
				text-align: center;
			}

			a {
				color: aliceblue;
				text-decoration: none;
			}

			a:hover {
				color: red;
			}

			.btn {
				color: darkorange;
			}

			.btn:hover {
				color: aquamarine;
			}

			.forms * {
				vertical-align: top;
			}

			input[type=text],
			select,
			textarea {
				width: 98%;
				padding: 12px;
				border: 1px solid #ccc;
				border-radius: 4px;
				resize: vertical;
			}

			.container {
				border-radius: 5px;
				background-color: #f2f2f2;
				padding: 20px;
			}

			footer {
				position: fixed;
				padding: 10px 10px 0px 10px;
				bottom: 0;
				width: 100%;
				height: 40px;
				background: grey;
			}

			@media screen and (max-width: 600px) {

				.col-25,
				.col-75,
				input[type=submit] {
					width: 100%;
					margin-top: 0;
				}
		</style>
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
			<div class="container">
				<form class="forms" action="saveNote" modelAttribute="note">
					<div>
						<label>Title:</label>
						<input type="hidden" name="noteid" value="${note.getNoteid()}" />
						<input type="text" name="ntitle" placeholder="Title" value="${note.getNtitle()}" required />
					</div>
					<div>
						<label>Content:</label>
						<textarea type="text" name="ncon" style="height:50vh " placeholder="Content"
							required>${note.getNcon()}</textarea>
					</div>
					<div align="center">
						<button class="button">Save</button>
					</div>
				</form>
			</div>

		</main>
		<footer>
		</footer>
	</body>

	</html>