<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
				<c:choose>
					<c:when test="${isUpdate }">
					   <h1>My info</h1>
					   <hr class="small">
					   <span class="subheading">Welcome to Roamstory.</span>
					</c:when>
					<c:otherwise>
						<h1>Member Join</h1>
					   <hr class="small">
					   <span class="subheading">Welcome to Roamstory.</span>
					</c:otherwise>
				</c:choose>
					
				</div>
			</div>
		</div>
	</div>
	</header>
	   <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <c:choose>
                    <c:when test="${isUpdate }">
                      <c:set var="pageName" value="My Info" />
                      <c:set var="action" value="update" />
                   </c:when>
                   <c:otherwise>
                       <c:set var="pageName" value="Member Join" />
                       <c:set var="action" value="create" />
                   </c:otherwise>
                </c:choose>
                <p>${pageName }</p>
                <form name="joinForm" id="joinForm" action="/users/${action }" method="post">
                    <c:if test="${not empty errorMessage }">
                    	<div class="form-group">
                            <label class="label label-danger">${errorMessage }</label>
                        </div>
                    </c:if>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>아이디</label>
                            <c:choose>
                               <c:when test="${isUpdate }">
                                   <input type="hidden" name="userId" id="userId" value="${user.userId }">
                                   ${user.userId }
                               </c:when>
                               <c:otherwise>
                                   <input type="text" class="form-control" placeholder="아이디" name="userId" id="userId" value="${user.userId }"
                                          required data-validation-required-message="Please enter your ID.">
                               </c:otherwise>
                            </c:choose>
                           
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>비밀번호</label>
                            <input type="password" class="form-control" placeholder="비밀번호" name="password" id="password" value="${user.password }"
                            required data-validation-required-message="Please enter your password.">
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>이름</label>
                            <input type="text" class="form-control" placeholder="이름" name="name" id="name" value="${user.name }"
                            required data-validation-required-message="Please enter your name.">
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <div class="row control-group">
                        <div class="form-group col-xs-12 floating-label-form-group controls">
                            <label>이메일</label>
                            <input type="email" class="form-control" placeholder="이메일" name="email" id="email" value="${user.email }"
                            required data-validation-required-message="Please enter your email">
                            <p class="help-block text-danger"></p>
                        </div>
                    </div>
                    <br>
                    <div id="success"></div>
                    <div class="row">
                        <div class="form-group col-xs-12">
                            <button type="submit" class="btn btn-default">${action }</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
	<hr>

	<!-- Footer -->
     <%@ include file="./commons/_footer.jspf" %>
</body>
</html>