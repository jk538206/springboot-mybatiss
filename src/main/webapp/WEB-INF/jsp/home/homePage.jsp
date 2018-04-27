<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
<title>有一村</title>
<link rel="stylesheet" href="css/reset.css">
<style>
* {
	font-size: 0.8rem;
}

body {
	background: #f7f7ff;
}

.hp_content {
	width: 100%;
	margin: 40px auto 45px;
}

/*分类*/
.classification {
	width: 95%;
	margin: 0 auto;
	text-align: center;
	background: #fff;
	/*border: 1px solid red;*/
}

.classification>div {
	width: 25%;
	margin: 10px 0;
	/*border: 1px solid red;*/
	float: left;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	overflow: hidden;
}

.classification>div>p {
	line-height: 26px;
	color: #666;
}

.classification .classification_imgBox>img {
	width: 100%;
}

.classification_imgBox {
	width: 85%;
	margin: 0 auto;
}
/*新货热卖*/
.new_cargo {
	width: 100%;
	/*border: 1px solid red;*/
	background: #fff;
}

.new_cargo_head {
	width: 95%;
	margin: 10px auto;
	line-height: 30px;
	border-bottom: 1px solid #ddd;
}

.new_cargo_head span {
	display: block;
	font-size: 0.9rem;
}

.new_cargo_head span:nth-child(1) {
	float: left;
	padding-left: 10px;
	color: #666;
}

.new_cargo_head span:nth-child(2) {
	float: right;
	padding-right: 10px;
	color: #aaa;
}

.new_cargo_img_firsBox img {
	display: block;
	width: 80%;
	margin: 10px auto 2px;
}

.new_cargo_img_firsBox {
	width: 160px;
	float: left;
}

.new_cargo_img_firsBox>p {
	padding: 0 10px;
	line-height: 28px;
}

.new_cargo_img_firsBox>div {
	padding: 0 10px;
	line-height: 28px;
}

.new_cargo_img_firsBox>div>div {
	float: left;
}

.new_cargo_img_firsBox>div>div:nth-child(1) {
	width: 45%;
	background: rgba(66, 66, 66, .1);
	text-align: center;
	border-radius: 10px;
}

.new_cargo_img_firsBox>div>div:nth-child(2) {
	width: 55%;
	text-align: right;
	padding-right: 10px;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	color: #aaa;
}

.new_cargo_img {
	width: 100%;
	overflow-x: auto;
}

.new_cargo_img_firsBox {
	padding-bottom: 10px;
	float: left;
}

/*轮播*/
.dLunbo {
	/*margin: 0px 0;*/
	margin-bottom: 10px;
	width: 100%;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	height: 160px;
	overflow: hidden;
	position: relative;
}

.dLunbo_cont {
	position: absolute;
	left: 0;
	top: 0;
	height: 170px;
	margin-top: 10px;
}

.dLunbo_cont>li {
	height: 100%;
	color: #fff;
	font-weight: bold;
	float: left;
	overflow: hidden;
}

.dLunbo_cont>li img {
	width: 100%;
	height: 100%;
}

.dLunbo_cont_icon {
	position: absolute;
	width: 40%;
	left: 30%;
	bottom: 5px;
}

.dLunbo_cont_icon span {
	display: block;
	float: left;
	height: 7px;
	border: 1px solid #ddd;
	box-sizing: border-box;
	-webkit-box-sizing: border-box;
	background: rgba(255, 255, 255, .5);
}

.dLunbo_cont_icon span.span_active {
	background: #70bfea;
}
</style>
</head>
<body>
	<div class="hp_nav">有一村</div>
	<div style="width: 100%; transform: translate(0px, 0px)"
		class="hp_content">
		<div
			style="height: 50px; line-height: 50px; text-align: center; width: 100%; position: absolute; top: -50px">
			努力加载中...</div>
		<div style="background: #f7f7ff">
			<!--单图轮播-->
			<div class="lb_Box dLunbo">
				<ul class="dLunbo_cont">
					<li style="background-color: red"><img src="${titilImg1}"></li>
					<li style="background-color: #00ff00"><img src="${titilImg2}"></li>
					<li style="background-color: #4f8ab4"><img src="${titilImg3}"></li>
					<li style="background-color: yellow"><img src="${titilImg4}"></li>
					<li style="background-color: #678"><img src="${titilImg1}"></li>
				</ul>
				<!--图下面的提示点-->
				<div class="dLunbo_cont_icon"></div>
			</div>
			<!--<div class="lb_Box">-->

			<!--</div>-->
			<!--分类-->
			<div class="classification clear">
				<div>
					<div class="classification_imgBox">
						<img src="assets/img-home/a_03.jpg">
					</div>
					<p>鲜肉</p>
				</div>
				<div>
					<div class="classification_imgBox">
						<img src="assets/img-home/111_03.png">
					</div>
					<p>蔬菜</p>
				</div>
				<div>
					<div class="classification_imgBox">
						<img src="assets/img-home/222_06.png">
					</div>
					<p>水果</p>
				</div>
				<div>
					<div class="classification_imgBox">
						<img src="assets/img-home/333_03.png">
					</div>
					<p>蛋奶</p>
				</div>
			</div>
			<!--新货热卖-->
			<div class="new_cargo">
				<div class="new_cargo_head clear">
					<span>新货热卖</span> <span>更多</span>
				</div>
				<div class="new_cargo_img">
					<ul class="new_cargo_img_ul">
						<li class="new_cargo_img_firsBox clear"><img
							src="assets/img-home/img_07.jpg" />
							<p>新鲜西红柿</p>
							<div>
								<div>￥20.00</div>
								<div>销量 155</div>
							</div></li>
						<li class="new_cargo_img_firsBox clear"><img
							src="assets/img-home/img_07.jpg" />
							<p>新鲜西红柿</p>
							<div>
								<div>￥20.00</div>
								<div>销量 155</div>
							</div></li>
						<li class="new_cargo_img_firsBox clear"><img
							src="assets/img-home/img_07.jpg" />
							<p>新鲜西红柿</p>
							<div>
								<div>￥20.00</div>
								<div>销量 155</div>
							</div></li>
						<li class="new_cargo_img_firsBox clear"><img
							src="assets/img-home/img_07.jpg" />
							<p>新鲜西红柿</p>
							<div>
								<div>￥20.00</div>
								<div>销量 155</div>
							</div></li>
						<li class="new_cargo_img_firsBox clear"><img
							src="assets/img-home/img_07.jpg" />
							<p>新鲜西红柿</p>
							<div>
								<div>￥20.00</div>
								<div>销量 155</div>
							</div></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="hp_footer">
		<div class="hp_footer_active">
			<img src="assets/img-home/homeActive.png" />
			<!--<img src="img/homeIcon.png"/>-->
			<p>首页</p>
		</div>
		<div>
			<!--<img src="img/fenleiActive_03.png"/>-->
			<img src="assets/img-home/fenlei_03.png" />
			<p>分类</p>
		</div>
		<div>
			<!--<img src="img/gwcActive_03.png"/>-->
			<img src="assets/img-home/gwc_03.png" />
			<p>购物车</p>
		</div>
		<div>
			<!--<img src="img/wodeActive_03.png"/>-->
			<img src="assets/img-home/wode_03.png" />
			<p>我的</p>
		</div>
	</div>
	<!--<embed class="hp_footer" src="../footer/footer.html"></embed>-->
	<script src="js/jquery-1.11.3.js"></script>
	<script>
    (function () {
        var homePage={
            init:function () {  //初始加载执行
                this.divBorderRadius("classification_imgBox");
//                ul   li  类参数
                this.new_cargo(".new_cargo_img_ul",".new_cargo_img_firsBox");
//                轮播
                this.lunbo({
                    parDiv:".dLunbo",//最外层
                    chiDiv:".dLunbo_cont",//ul层
                    isTrue:true,
//                    icon:'.dLunbo_cont_icon',//提示图标
                });
                this.botNew();
                this.footDiv();
            },
            divBorderRadius:function (className) {
                //设定分类图片的高和圆角属性
                var width=$('.'+className).width();
                $('.'+className).css({
                    height:width+'px',
                    borderRadius:width/2+'px',
                })
            },
            //设定新卖热货的样式
            new_cargo:function (ulClass,liClass) {
                var liWidth=$(liClass).width();
                var len=$(liClass).length;
                $(ulClass).css({
                    width:liWidth*len+'px',
                    minWidth:'100%'
                })
            },
            lunbo:function (obj) {
                var i=1;
                var shuffling=obj;
                var htmlLi="<li style='background-color: red'>"+$(shuffling.chiDiv).children('li:first-child').html()+"</li>";
                $(shuffling.chiDiv).append(htmlLi)
                //获取页面个数
                var len=$(shuffling.chiDiv).children('li').length;
                var htmlIcon="<span></span>";
                for(var j=1;j<len;j++){
                    $('.dLunbo_cont_icon').append(htmlIcon);
                }
                $('.dLunbo_cont_icon span').css({
                    width:100/(len-1)+'%',
                });
                $('.dLunbo_cont_icon span:nth-child(1)').addClass('span_active');
                //    获取最外面盒子的宽度
                var windowWidth=$(window).width();
                $(shuffling.chiDiv).children('li').css({
                    width:windowWidth+'px',
                });
                $(shuffling.chiDiv).css({
                    width:windowWidth*len+'px',
                });
                //点击暂停轮播或者继续轮播
                $(this.parDiv).on('touchstart',function () {
                    shuffling.isTrue=true;
                });
                $(this.parDiv).on('touchend',function () {
                    shuffling.isTrue=false;
                });
                function char() {
                    if(shuffling.isTrue==false){
                        return;
                    }else {
                        i++;
                        if (i < len) {
                            $(shuffling.chiDiv).animate({
                                left: '-' + windowWidth * i + 'px',
                            }, 500, function () {
                                if (i == (len - 1)) {
                                    i = 0;
                                    $(shuffling.chiDiv).css('left', '0px');
                                }
                            });
                            $('.dLunbo_cont_icon span:nth-child('+i+')').addClass('span_active').siblings('.span_active').removeClass('span_active');
                        }
                    }
                }
                setInterval(function () {
                    char();
                },3000)
            },
            //下拉刷新
            botNew:function () {
                var slide = function (obj, offset, callback) {
                    var start,
                        end,
                        isLock = false,//是否锁定整个操作
                        isCanDo = false,//是否移动滑块
                        isTouchPad = (/hp-tablet/gi).test(navigator.appVersion),
                        hasTouch = 'ontouchstart' in window && !isTouchPad;
                    //将对象转换为jquery的对象
                    obj = $(obj);
                    var objparent = obj.parent();
                    /*操作方法*/
                    var fn =
                        {
                            //移动容器
                            translate: function (diff) {
                                obj.css({
                                    "-webkit-transform": "translate(0," + diff + "px)",
                                    "transform": "translate(0," + diff + "px)"
                                });
                            },
                            //设置效果时间
                            setTranslition: function (time) {
                                obj.css({
                                    "-webkit-transition": "all " + time + "s",
                                    "transition": "all " + time + "s"
                                });
                            },
                            //返回到初始位置
                            back: function () {
//                                console.log(offset)
                                fn.translate(0 );
                                //标识操作完成
                                isLock = false;
                            }
                        };
                    //滑动开始
                    obj.bind("touchstart", function (e) {
                        if (objparent.scrollTop() <= 0 && !isLock) {
                            var even = typeof event == "undefined" ? e : event;
                            //标识操作进行中
                            isLock = true;
                            isCanDo = true;
                            //保存当前鼠标Y坐标
                            start = hasTouch ? even.touches[0].pageY : even.pageY;
                            //消除滑块动画时间
                            fn.setTranslition(0);
                        }
                    });
                    //滑动中
                    obj.bind("touchmove", function (e) {
                        if (objparent.scrollTop() <= 0 && isCanDo) {
                            var even = typeof event == "undefined" ? e : event;
                            //保存当前鼠标Y坐标
                            end = hasTouch ? even.touches[0].pageY : even.pageY;
                            if (start < end) {
                                even.preventDefault();
                                //消除滑块动画时间
                                fn.setTranslition(0);
                                //移动滑块
                                fn.translate(end - start );
                            }
                        }
                    });
                    //滑动结束
                    obj.bind("touchend", function (e) {
                        if (isCanDo) {
                            isCanDo = false;
                            //判断滑动距离是否大于等于指定值
                            if (end - start >= offset) {
                                //设置滑块回弹时间
                                fn.setTranslition(1);
                                //保留提示部分
                                fn.translate(0);
                                //执行回调函数
                                if (typeof callback == "function") {
                                    callback.call(fn, e);
                                }
                            } else {
                                //返回初始状态
                                fn.back();
                            }
                        }
                    });
                }

                $(function () {
                    slide(".hp_content", 61, function (e) {
                        var that = this;
                        setTimeout(function () {
                            that.back.call();
                        }, 500);
                    });
                });
            },
            //点击跳转页面
            footDiv:function () {
                $('.hp_footer').on('touchend','div',function () {
                    $(this).addClass('hp_footer_active').siblings('.hp_footer_active').removeClass('hp_footer_active');
                    $('.hp_footer>div:nth-child(1)').children('img').attr('src','assets/img-home/homeIcon.png');
                    $('.hp_footer>div:nth-child(2)').children('img').attr('src','assets/img-home/fenlei_03.png');
                    $('.hp_footer>div:nth-child(3)').children('img').attr('src','assets/img-home/gwc_03.png');
                    $('.hp_footer>div:nth-child(4)').children('img').attr('src','assets/img-home/wode_03.png');
                    //首页
                    if($(this).children('p').text()=="首页"){
                        $(this).children('img').attr('src','assets/img-home/homeActive.png');
//                        $('.village').load("首页/homePage.html");
//                        window.location.href="../首页/homePage.html"
                    }
                    //分类
                    if($(this).children('p').text()=="分类"){
                        $(this).children('img').attr('src','assets/img-home/fenleiActive_03.png');
                        window.location.href="/home/toClassificationjsp";
                    }
                    //购物车
                    if($(this).children('p').text()=="购物车"){
                        $(this).children('img').attr('src','assets/img-home/gwcActive_03.png');
                        window.location.href="/home/toShoppingCartjsp"
                    }
                    //我的
                    if($(this).children('p').text()=="我的"){
                        $(this).children('img').attr('src','assets/img-home/wodeActive_03.png');
                        window.location.href="/home/toMineSettingjsp"
                    }
                })

                //点击热卖商品跳转到想对应的详情页面
                $('.new_cargo_img_firsBox').on('click',function () {
                    window.location.href="../商品详情/commodityDetails.html"
                })
                //点击种类跳转到想对应的页面
                $('.classification_imgBox').on('click',function () {
                		if($(this).next('p').text()=="鲜肉"){
                        window.location.href="/home/toClassificationjsp?type=XR"
                    }
                		if($(this).next('p').text()=="蔬菜"){
                            window.location.href="/home/toClassificationjsp?type=SC"
                        }
                		if($(this).next('p').text()=="水果"){
                            window.location.href="/home/toClassificationjsp?type=SG"
                        }
                		if($(this).next('p').text()=="蛋奶"){
                            window.location.href="/home/toClassificationjsp?type=DN"
                        }
                })
            }

        }
        homePage.init();
    })(jQuery)

</script>


</body>
</html>