<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<title>index</title>
		<link href="../../css/customer.css" type="text/css" rel="stylesheet" />
	</head>
	<body>
		<jsp:include page="../../inc/header.jsp" />
		<div id="visual" class="customer">
			<div class="top-wrapper">
				
			</div>
		</div>
		<div id="main">
			<div class="top-wrapper clear">
				<div id="content">
					<h2>공지사항</h2>
					<h3 class="hidden">방문페이지위치</h3>
					<ul id="breadscrumb" class="block_hlist">
						<li>HOME</li>
						<li>
							고객센터
						</li>
						<li>
							공지사항등록
						</li>
					</ul>
					<!-- enctype="application/x-www-form-urlencoded"-->
					<form action="" method="post" enctype="multipart/form-data">
						<div id="notice-article-detail" class="article-detail margin-large" >						
							<dl class="article-detail-row">
								<dt class="article-detail-title">
									제목
								</dt>
								<dd class="article-detail-data">
									&nbsp;<input name="title"/>
								</dd>
							</dl>				
													
							<dl class="article-detail-row">
								<dt class="article-detail-title">
									첨부파일
								</dt>
								<dd class="article-detail-data">
									&nbsp;<input type="file" id="txtFile" name="file" />
								</dd>
							</dl>
	
							<div class="article-content" >
								<textarea id="txtContent" class="txtContent" name="content"></textarea>
							</div>
							
						</div>
						<p class="article-comment margin-small">						
							<input class="btn-save button" type="submit" value="저장" />
							<a class="btn-cancel button" href="list">취소</a>						
						</p>
					</form>							
				</div>				
				<div id="navi">
					<h2>고객센터</h2>
				    <h3 class="hidden">고객센터메뉴</h3>
				    <ul id="navi-menu">
					    <li>
						    <a href="">뉴렉처소식</a>
					    </li>
					    <li>
						    <a href="" class="current">공지사항</a>
					    </li>
					    <li>
						    <a href="">1:1 고객문의</a>
					    </li>
					    <li>
						    <a href="">학습도구</a>
					    </li>
					    <li>
						    <a href="">학습안내</a>
					    </li>
				    </ul>
				    <h3 id="fav-title">추천사이트</h3>
				    <ul class="margin-small">
					    <li>
						    <a href="http://www.answeris.net"><img src="../images/answeris.png" alt="앤서이즈" /></a>
					    </li>
					    <li>
						    <a href="http://www.microsoft.com"><img src="../images/microsoft.png" alt="마이크로소프트" /></a>
					    </li>
					    <li>
						    <a href="http://www.w3c.org"><img src="../images/w3c.png" alt="W3C" /></a>
					    </li>
				    </ul>
				</div>				
			</div>
		</div>
		<jsp:include page="../../inc/footer.jsp" />
	</body>
</html>
