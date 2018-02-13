<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<style type="text/css">
body{
	width:1200px;
}
	.left{
		width:820px;
		float:left;
	}
	.right{
		width:350px;
		margin-left:30px;
		float:left;
	}
	
	a.title:hover{
		color:#009688!important;
		cursor:pointer;
	}
	
	#article_list :hover{
		backgroud-color:#009688!important;
	}
	
	a.comment:hover{
		cursor:pointer;
		text-decoration:underline;
		color:red;
	}
	
	p{text-indent:2em;}
	
	.article{
		margin:20px 0 0 0;
	}
	
	.right{
		margin-top:20px;
	}
	
	.right .hot_article ul li{
		margin:10px 0 0 20px;
	}
	
	.hot_article{
		width:auto;
		height:230px;
		background-color:white;
		border-radius:8px;	
	}
	#demo7{
		clear:both;
		margin:0 0 5px 0px;
		float:left;
	}
	#article_li{
		background-color:white;
		margin-top:20px;
		border-radius:8px;
	}
</style>
</head>
<body class="layui-bg-gray" style="align:center; margin:auto">

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>头部</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="style/layui.css"
	media="all">
<link type="text/css" rel="stylesheet" href="style/reset.css">
<link type="text/css" rel="stylesheet" href="style/main.css">
<script src="itdage-show/layui/layui.js" charset="utf-8"></script>
<script src="itdage-show/js/jquery.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
<style type="text/css">
.header0 {
	width: auto;
	height: 60px;
	background-color: #393D49;
}

.logo {
	float: left;
	padding: 10px 0 0 20px;
}

.header1 {
	float: left;
	margin-left: 240px;
}

.header1 ul li {
	margin-left: 20px;
}

.header3 {
	float: right;
}
</style>

</head>
<body>
	<div class="layui-container header0 layui-bg-cyan">
		<div class="layui-row">
			<div class="logo">
			<ul class="layui-nav  layui-bg-cyan">
            	<li><a href="home" class="homePage" style="font-size:26px;">解忧驿站</a></li>
            </ul>
			</div>
			<div class="header3">
				<ul class="layui-nav  layui-bg-cyan">
					<li class="layui-nav-item"><a href="/itdage-show/login.jsp">登录</a></li>
					<li class="layui-nav-item"><a href="javascript:search();">注册</a></li>
				</ul>
			</div>
			
	           <!-- <div class="layui-nav-item">
   			      <div class="comWidth">
                  <div class="rightArea">
         	欢迎来到解忧驿站！<a id="userLogin" href="loginAll">[登录]</a>&nbsp;<a id="userRegist" href="regist">[免费注册]</a>
                  </div>
                  </div>
              </div> -->
					<!-- <ul id="navigation" lay-filter="navigation001">
						<li id="首页" class='layui-nav-item'><a
							href='/itdage-show/index.jsp'>首页</a></li>
						<li id="生活" class='layui-nav-item'><a
							href='javascript:/itdage-show/index.jsp'>生活</a></li>
						<li id="时间线" class='layui-nav-item'><a
							href='/itdage-show/developmentflow.jsp'>时间线</a></li>
						<li id="视频" class='layui-nav-item'><a
							href='javascript:/itdage-show/index.jsp'>视频</a></li>
						<li id="留言" class='layui-nav-item'><a
							href='/itdage-show/messageboard.jsp'>留言</a></li>
					</ul> -->
		</div>
	</div>
	<input type="hidden" value=""
		id="is_login">
	<script>
	
	layui.use(['laypage', 'layer'], function(){ 
		 var layer = layui.layer;
	
		var websocket = null;
		var host = window.location.host;
		var flag = $("#is_login").val();
		if (flag != "") {
			//登陆了 建立连接
			build();
		}

		function build() {
			if ('WebSocket' in window) {
				websocket = new WebSocket("ws://" + host
						+ "/itdage-show/websocketRemind");
				// 连接成功建立的回调方法
				websocket.onopen = function() {
					//alert('通讯连接建立成功!');
				}
				// 连接发生错误的回调方法
				websocket.onerror = function() {
					alert("通讯连接建立失败！");
				};
				// 连接关闭的回调方法
				websocket.onclose = function() {
					//alert("通讯连接关闭!");
				};
				// 接收到消息的回调方法
				websocket.onmessage = function(e) {
					//var jsonObject = JSON.parse(e.data);
					$("#remind_bage").append("<span class='layui-badge'>6</span>");
					layer.open({
						type : 2,
						title : false,
						closeBtn : 0, //不显示关闭按钮
						shade : [ 0 ],
						area : [ '340px', '215px' ],
						offset : 'rb', //右下角弹出
						time : 2000, //2秒后自动关闭
						anim : 2,
						content : [ '/itdage-show/messageRemind.jsp', 'no' ], //iframe的url，no代表不显示滚动条
						});
					}
			} else
				alert("Not Support!");
		}
	});
		window.onbeforeunload = function() {
			if (null != websocket)
				websocket.close();
		};
		function send() {
			var content = $("#content").val();
			var tousername = $("#tousername").val();
			var mes = {
				"to" : tousername,
				"content" : content
			};
			if (null != websocket)
				websocket.send(JSON.stringify(mes));
		}

		layui
				.use(
						[ 'element', 'form' ],
						function() {
							var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
							var form = layui.form;
							element.init();
							$
									.ajax({
										url : "/itdage-show/navigation/get?time="
												+ new Date(),
										dataType : "json",
										type : "GET",
										success : function(data) {
											for (var i = 0; i < data.object.length; i++) {
												var first_name = data.object[i].first_name;
												var first_href = data.object[i].first_href;
												var secondList = data.object[i].list;
												if (secondList != null) {
													var str = "<dl class='layui-nav-child layui-anim layui-anim-upbit'>";
													for (var j = 0; j < data.object[i].list.length; j++) {
														var second_href = data.object[i].list[j].second_href;
														var second_name = data.object[i].list[j].second_name;
														str = str
																+ "<dd><a href='" + second_href + "'>"
																+ second_name
																+ "</a></dd>";
													}
													str = str + "</dl>";
													$("#" + first_name).append(
															str);
												}

											}
											element.init();

										},
										error : function(data, type, err) {
											console.log("ajax错误类型2：" + type);
											console.log(err);
										}
									});
						});

		function changePassword() {
			layer.open({
				type : 2,
				title : '修改密码',
				shadeClose : true,
				shade : 0.1,
				skin : 'layui-layer-molv', //加上边框
				area : [ '400px', '250px' ], //宽高
				content : '/itdage-show/modify_password.jsp'
			});
		};

		function chat() {
			var index = layer.open({
				type : 2,
				title : '在线聊天',
				shadeClose : false,
				shade : 0.1,
				skin : 'layui-layer-molv', //加上边框
				area : [ '620px', '560px' ], //宽高
				content : '/itdage-show/chat.jsp',
				closeBtn : 0
			});

		}
		//search定义在了index中
	</script>
</body>
</html>
<div style="height:300px;">

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>轮播</title>
</head>
<body>
<div class="layui-carousel" id="test1" lay-filter="test1">
  <div carousel-item="">
    <div><img alt="" src="images/banner/bannerimg2.gif" width="100%" height="300px"></div>
    <div><img alt="" src="images/banner/bannerimg1.gif" width="100%" height="300px"></div>
 <!--    <div><img alt="" src="/itdage-show/images/4k3.jpg" width="100%" height="300px"></div>
    <div><img alt="" src="/itdage-show/images/4k4.jpg" width="100%" height="300px"></div>
    <div><img alt="" src="/itdage-show/images/4k5.jpg" width="100%" height="300px"></div> -->
  </div>
</div>
<script type="text/javascript">
//图片轮播
layui.use(['carousel', 'form'], function(){
	  var carousel = layui.carousel
	  ,form = layui.form;
	  //常规轮播
	  carousel.render({
	    elem: '#test1',
	    width: '100%',
	    height: '300px',
	    interval: '4000',
	    arrow: 'always'
	  });
	  
});

</script>
</body>
</html>
</div>
<hr>
<div>
	<div class="left">
		<div class="article">
			<ul>
				<li id="article_list"></li>
				<div id='article_li'>
					<a class='title' target='_blank' href='"+href+"'><h3 style='color:black;'>
					&nbsp;&nbsp;&nbsp;&nbsp;
					</h3><br><div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
					</div></a><br><br><div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span> + data.object[i].publish_date + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<i class='layui-icon'>&#xe612;</i>&nbsp;<span> + data.object[i].username + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span onclick=getArticleByTag('"+data.object[i].tag+"')>" + data.object[i].tag + </span></a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<img alt='' src='/itdage-show/images/look.png' width='20px;' height='13px;'>&nbsp;<span>浏览("+data.object[i].page_view+")</span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论("+data.object[i].comment+")</span></a>
					</p></div>"
				</div>
				<div id='article_li'>
					<a class='title' target='_blank' href='"+href+"'><h3 style='color:black;'>
					&nbsp;&nbsp;&nbsp;&nbsp;
					</h3><br><div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
					</div></a><br><br><div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span> + data.object[i].publish_date + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<i class='layui-icon'>&#xe612;</i>&nbsp;<span> + data.object[i].username + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span onclick=getArticleByTag('"+data.object[i].tag+"')>" + data.object[i].tag + </span></a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<img alt='' src='/itdage-show/images/look.png' width='20px;' height='13px;'>&nbsp;<span>浏览("+data.object[i].page_view+")</span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论("+data.object[i].comment+")</span></a>
					</p></div>"
				</div>
				<div id='article_li'>
					<a class='title' target='_blank' href='"+href+"'><h3 style='color:black;'>
					&nbsp;&nbsp;&nbsp;&nbsp;
					</h3><br><div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
					</div></a><br><br><div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span> + data.object[i].publish_date + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<i class='layui-icon'>&#xe612;</i>&nbsp;<span> + data.object[i].username + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span onclick=getArticleByTag('"+data.object[i].tag+"')>" + data.object[i].tag + </span></a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<img alt='' src='/itdage-show/images/look.png' width='20px;' height='13px;'>&nbsp;<span>浏览("+data.object[i].page_view+")</span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论("+data.object[i].comment+")</span></a>
					</p></div>"
				</div>
				<div id='article_li'>
					<a class='title' target='_blank' href='"+href+"'><h3 style='color:black;'>
					&nbsp;&nbsp;&nbsp;&nbsp;
					</h3><br><div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>
					</div></a><br><br><div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span> + data.object[i].publish_date + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<i class='layui-icon'>&#xe612;</i>&nbsp;<span> + data.object[i].username + </span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span onclick=getArticleByTag('"+data.object[i].tag+"')>" + data.object[i].tag + </span></a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<img alt='' src='/itdage-show/images/look.png' width='20px;' height='13px;'>&nbsp;<span>浏览("+data.object[i].page_view+")</span>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论("+data.object[i].comment+")</span></a>
					</p></div>"
				</div>
			</ul>
		</div>
</div>
	<div class="right">
		<div class="hot_article">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;热门文章
			<hr class="layui-bg-green">
			<ul id="hot_article_list">
			</ul>
		</div>
		
		<div class="hot_article" style="margin-top:20px;">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;网站公告
			<hr class="layui-bg-green">
			<ul id = 'notice'>
				<!-- <li><p style="color:black;">这是网站前台页面,配套的还有一个后台网站管理这个前台。此网站基于Java和layui开发,用到了Spring、Spring Mvc、Mybatis、Mysql等技术。</p></li> -->
			</ul>
		</div>
	</div>
</div>
<div id="demo7"></div>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>footer</title>
<style type="text/css">
	.footer{
	    float:left;
		background-color:#393D49;
		width:1200px;
		align:center;
		margin:auto;
		height:55px;
		margin-top:20px;
	}
</style>
</head>
<body>
<div align="center" class="footer  layui-bg-cyan">
	<p style="padding-top:20px">2017 - 2018 联系我们  | QQ：1091164143</p>
</div>
</body>
</html>
<script type="text/javascript">

layui.use(['laypage', 'layer'], function(){
	  var laypage = layui.laypage
	  ,layer = layui.layer;
	  var totalCount = getTotalArticle('all', null);
	  //完整功能
	  laypage.render({
	    elem: 'demo7'
	    ,count: totalCount
	    ,limit: 8
	    ,layout: ['count', 'prev', 'page', 'next',  'skip']
	  ,jump: function(obj, first){
		    //首次不执行
		    if(!first){
		      //do something
		      $("#article_list").empty();
		      getMainArticleList(obj.curr, 'select', null);
		    }
		  }
	  });
	});
	
function getArticleByTag(tag){
	$("#article_list").empty();
	getMainArticleList(1, 'getArticleByTag', tag);
	layui.use(['laypage', 'layer'], function(){
		  var laypage = layui.laypage
		  ,layer = layui.layer;
		  var totalCount = getTotalArticle('tagAll', tag);
		  //完整功能
		  laypage.render({
		    elem: 'demo7'
		    ,count: totalCount
		    ,limit: 8
		    ,layout: ['count', 'prev', 'page', 'next',  'skip']
		  ,jump: function(obj, first){
			    //obj包含了当前分页的所有参数，比如：
			    //首次不执行
			    if(!first){
			      //do something
			      $("#article_list").empty();
			      getMainArticleList(obj.curr, 'getArticleByTag', tag);
			    }
			  }
		  });
		});
}

function search(){
	layer.prompt({title: '请输入文章标签或标题', formType: 2}, function(tag, index){
		  layer.close(index);
		  getArticleByTag(tag);
		 // layer.msg(pass);
		});
}
	
	//得到主页文章(左半部分)
	function getMainArticleList(currpage, path2, tag){
		var jsonStr = null;
		if(path2 == "select"){
			//分页
			jsonStr = {"pageNo":currpage};
		}else if(path2 == "getArticleByTag"){
			jsonStr = {"pageNo":currpage,"tag":tag};
		}
		
		$.ajax({
			url : "/itdage-show/article/"+path2,
			dataType : "json",
			type : "GET",
			data : jsonStr,
			success : function(data) {
				if (data.state == 1) {
					//成功,列举数据
					for (var i = 0; i < data.object.length; i++) {
						var classStr = null;
						var id = data.object[i].id;
						var href = '/itdage-show/article/getArticle/' + id;
						if(data.object[i].type == '原创'){
							//原创
							classStr = "<span class='layui-badge'>原创</span>";
						}else{
							classStr = "<span class='layui-badge layui-bg-green'>转载</span>";
						}
						$("#article_list").append("<div id='article_li'>"
						+ "<a class='title' target='_blank' href='"+href+"'><h3 style='color:black;'>"
						+ classStr
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ data.object[i].title 
						+ "</h3><br><div id='text_id' style='width:100%;height:16px;overflow: hidden; text-overflow:ellipsis; white-space: nowrap;'>" 
						+ data.object[i].content
						+ "</div></a><br><br><div><p align='right' style='margin-right:20px;'><i class='layui-icon'>&#xe637;</i>&nbsp;<span>" + data.object[i].publish_date + "</span>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<i class='layui-icon'>&#xe612;</i>&nbsp;<span>" + data.object[i].username + "</span>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<a class='comment'><img alt='' src='/itdage-show/images/tag.png' width='20px;' height='13px;'>&nbsp;<span onclick=getArticleByTag('"+data.object[i].tag+"')>" + data.object[i].tag + "</span></a>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<img alt='' src='/itdage-show/images/look.png' width='20px;' height='13px;'>&nbsp;<span>浏览("+data.object[i].page_view+")</span>"
						+ "&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<a class='comment'><i class='layui-icon'>&#xe611;</i>&nbsp;<span>评论("+data.object[i].comment+")</span></a>"
						+ "</p></div>"
						+ "</div>");
					}
				}
			},
			error : function(data, type, err) {
					console.log("ajax错误类型3："+type);
					console.log(err); 
				}
			});
	}
	
$(function(){
	getMainArticleList(1, 'select', null);
	getHotArticle();
	getNotice();
});

 function getTotalArticle(flag, data){
	 var count = 0;
	$.ajax({
		url : "/itdage-show/article/getTotalArticle/" + flag,
		dataType : "json",
		type : "GET",
		async: false,
		data:{"tag":data},
		success : function(data) {
			if (data.state > 0) {
				count = data.state;
			}
		},
		error : function(data, type, err) {
				console.log("ajax错误类型4："+type);
				console.log(err); 
			}
		});
	return count;
}
 
 function getNotice(){
	$.ajax({
		url : "/itdage-show/notice/get",
		dataType : "json",
		type : "GET",
		success : function(data) {
			if (data.state > 0) {
				count = data.state;
				$("#notice").empty();
				$("#notice").append("<li><p style='color:black;'>"+data.object.content+"</p></li>");
			}
		},
		error : function(data, type, err) {
				console.log("ajax错误类型5："+type);
				console.log(err); 
			}
		});
}

function getHotArticle(){
	$.ajax({
		url : "/itdage-show/article/getHotArticle",
		dataType : "json",
		type : "GET",
		success : function(data) {
			if (data.state == 1) {
				//成功,关闭页面
				for (var i = 0; i < data.object.length; i++) {
					var j = i+1;
					var href = '/itdage-show/article/getArticle/' + data.object[i].id;
					$("#hot_article_list").append("<li><a target='_blank' href='"+href+"' class='title'>"+j+". "+data.object[i].title+"</a></li>");
				}
			}else{
				$("#hot_article_list").append("<li><a class='title' href='#'>获取最新文章失败</a></li>");
			}
		},
		error : function(data, type, err) {
				console.log("ajax错误类型6："+type);
				console.log(err); 
			}
		});
}
</script>

</body>
</html>