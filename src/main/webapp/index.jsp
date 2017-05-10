<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="./commons/_header.jspf" %>
</head>

<body>
	<%@ include file="./commons/_navi.jspf" %>

    <!-- Page Header -->
    <!-- Set your background image for this header on the line below. -->
    <header class="intro-header" style="background-image: url('/img/home-bg.jpg')">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                    <div class="site-heading">
                        <h1>RoamStory</h1>
                        <hr class="small">
                        <span class="subheading">Develop & Life Story by Roamstory</span>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- Main Content -->
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-preview">
                    <a href="/users/post">
                        <h2 class="post-title">
                            WORK EXPERIENCE
                        </h2>
                        <h3 class="post-subtitle">
                                                       문제는 멀리서 보면 작게 보인다.과연 멀리서 보는 것이 맞나?
                        </h3>
                    </a>
                    <p class="post-meta">Posted by <a href="#">roamStory</a> on 4 24, 2017</p>
                </div>
                <hr>
                <div class="post-preview">
                    <a href="/post.jsp">
                        <h2 class="post-title">
                                                     개발만 먼지 나도록 했다. 
                        </h2>
                        <h3 class="post-subtitle">
                                                       하지만 나에 대한 계발은 서툴렀고 이제서야 Step by Step 하고 있다.
                        </h3>
                    </a>
                    <p class="post-meta">Posted by <a href="#">roamStory</a> on 4 24, 2017</p>
                </div>
                <hr>
                <div class="post-preview">
                    <a href="#">
                        <h2 class="post-title">
                          	더 나은 개발 방향을 위하여...
                        </h2>
                        <h3 class="post-subtitle">
                          	 말하는데로...맘 먹은데로 ...
                        </h3>
                    </a>
                    <p class="post-meta">Posted by <a href="#">roamstory</a> on 4 24, 2017</p>
                </div>
                <hr>
                <!-- Pager
                <ul class="pager">
                    <li class="next">
                        <a href="#">Older Posts &rarr;</a>
                    </li>
                </ul>
                 -->
            </div>
        </div>
    </div>

    <hr>

    <!-- Footer -->
     <%@ include file="./commons/_footer.jspf" %>
</body>

</html>
