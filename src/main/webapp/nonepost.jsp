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
						<h1>나만의 개발 그리고 일상 ,학습 포스트를 작성하라.</h1>
						<h5 class="subheading">아직 제대로 된 블로그는 아니지만...</h5>
						<span class="meta">Posted by <a href="#">roamstory</a> 2017.05.11
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
					<p>아직 제대로 만들어진 블로그는 아니지만 하나하나 만들어가며 기능 그리고 다른 서비스도 구현하며 발전해 나가고 싶다.</p>
					<p>지금은 servlet으로만 개발하였지만 앞으로는 Spring으로 또는 다른 언어를 통한 블로그를 개발해 나갈 예정이다.</p>
					
					<h2 class="section-heading">1.servlet으로 개발되어진 블로그를 리팩토링하며 보완해  나갈 생각이다.</h2>
					<p>좋은 기술 그리고 편한 기술을 하려기 보다 이전 방식들에서 어떻게 더 나은 기술로 발전 할 수 있고 지금 기술 자체가 얼마나 간편해지고 코딩작업에 편의성을 제공했는지 알고 진행해 가는 것이 목적이다.</p>
					<p>리팩토링 학습에 servlet으로 구현한 블로그를 보완해 나가는 데에는 더 없이 좋은 실습이 될 거라는 생각을 가지고 있다</p>
					<p>더 좋은 학습이 있다면 나에게 의견을 주면 감사하겠다</p>
					<h2 class="section-heading">2.이 후  스프링 프레임워크를 이용한 블로그를 그 다음으로 진행할 것이며 그 과정을 Git 또는 블로그에 작성할 생각이다.</h2>
					<p>스프링 프레임워크 학습을 제대로 하지 못했다. 아니 깊이 있게 하지 못했다. SI를 하면서 사실 핑계라고 할 수도 있지만 시간내서 스프링 프레임워크에 대한
					학습을 깊이 있게 하지 못했다. SI에서 개발되어지는 방식에 적응 하다보니 편한 길을 찾게 되었고 결국 위에서 말한 리팩토링은 생각하지 않고 구현을 위한 목적만
					가지고 개발을 해왔던 거 같다. 자바라는 언어의 발전성 그리고 라이브러리의 방대함 등 여러 자료들에 대한 방관된 자세를 좀 더 발전 있게 바꾸고자 한다.</p>
					
					<h2 class="section-heading">3.다른 언어를 통한 블로그를 만들면서 동시에 자바로 개발되어진 블로그와 장단점을 파악하여 포스트 할 생각이다.</h2>
					<p>다른 언어를 사용한다고 하여 자바를 잘하거나 무시하는 것이 아니라 자바개발자로써 한 발자국 발돋움 하기 위한 하나의 과정이라고 생각한다.</p>
					
					<hr>
					
					<p>개발 과정은 Github를 통해 확인 할 수 있다.</p>
					<p>https://github.com/roamstory/roamblog</p>

				</div>
			</div>
		</div>
	</article>

	<hr>

	<!-- Footer -->
	<%@ include file="./commons/_footer.jspf"%>

</body>

</html>
