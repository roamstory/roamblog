<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="./commons/_header.jspf" %>
</head>

<body>
	<%@ include file="./commons/_navi.jspf" %>
	<!-- Page Header -->
	<!-- Set your background image for this header on the line below. -->
	<header class="intro-header"
		style="background-image: url('/img/form-bg.jpg')">
	<div class="container">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
				<div class="page-heading">
					<h1>Sign In</h1>
					<hr class="small">
					<span class="subheading">Please Sign In.</span>
				</div>
			</div>
		</div>
	</div>
	</header>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-body">
                        <form action="/users/login" method="post">
                        	
                            <fieldset>
	                        	<c:if test="${not empty errorMessage }">
	                            	<div class="form-group">
	                                    <label class="label label-danger">${errorMessage }</label>
	                                </div>
                                </c:if>
                                <div class="form-group">
                                    <input class="form-control" placeholder="ID" name="userId" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Password" name="password" type="password" value="">
                                </div>
                                <!-- 
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">Remember Me
                                    </label>
                                </div>
                                 -->
                                <!-- Change this to a button or input when using this as a form -->
                                 <button type="submit" class="btn btn-default">Login</button>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    	<!-- jQuery -->
	<script src="/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Contact Form JavaScript -->
	<script src="/js/jqBootstrapValidation.js"></script>
	<script src="/js/contact_me.js"></script>

	<!-- Theme JavaScript -->
	<script src="/js/clean-blog.min.js"></script>
</body>

</html>
