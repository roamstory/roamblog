<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<%@ include file="./commons/_header.jspf"%>
</head>

<body>

	<%@ include file="./commons/_navi.jspf"%>

	<!-- Page Header -->
	<!-- Set your background image for this header on the line below. -->
	<header class="intro-header"
		style="background-image: url('/img/post-bg.jpg')">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<div class="post-heading">
						<h1>WORK EXPERIENCE</h1>
						<h2 class="subheading">Problems look mighty small from 150
							miles up</h2>
						<span class="meta">Posted by <a href="#">roamStory</a> 4 24, 2017
						</span>
					</div>
				</div>
			</div>
		</div>
	</header>

	<!-- Post Content -->
	<article>
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					${post }

				</div>
			</div>
		</div>
	</article>

	<hr>

	<!-- Footer -->
	<%@ include file="./commons/_footer.jspf"%>

</body>

</html>
