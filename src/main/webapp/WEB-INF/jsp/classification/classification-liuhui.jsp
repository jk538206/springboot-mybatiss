<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
    <title>分类</title>
    <link rel="stylesheet" href="../css/reset.css">
    <style>

        .ifClass_nav img{
            position: absolute;
            right: 0;
            top: 0;
            width: 24px;
            padding: 12px 15px;
        }
        .sxuan_modal{
            font-size: 12px;
            position: absolute;
            top: 40px;
            right: 0;
            width: 0;
            /*height: 0;*/
            /*border: 1px solid red;*/
            background: #fff;
            padding-bottom: 10px;
            border-bottom: 2px solid #c2e5f0;
            overflow: hidden;
        }
        .sxuan_modal button{
            display: block;
            width: 20%;
            height: 34px;
            margin: 10px 6.5% 0;
            float: left;
            background: #72c1dd;
            border: 0;
            border-radius: 5px;
            color: #fff;
        }
        .ifClass_cont_top{
            width: 100%;
            background: #fff;
        }
        .ifClass_cont_top li{
            display: block;
            width: 25%;
            float: left;
            text-align: center;
            line-height: 36px;
            border-bottom: 1px solid #f4f4ff;
            color: #666;
        }
        .ifClass_cont_top li.ifClass_top_active{
            color: #fa0002;
            border-bottom: 1px solid #fa0002;
        }









        /*内容区*/
        .ifClass_cont{
            margin: 40px auto 50px;
            /*border: 1px solid red;*/
            /*height: 1000px;*/
            box-sizing: border-box;
            font-size: 0.8rem;
            color: #666;
        }
        .ifClass_cont_ul{
            width: 95%;
            margin: 0 auto;
        }
        .ifClass_cont_ul>li{
            width: 23%;
            float: left;
            text-align: center;
            font-size: 14px;
            background: #fff;
            padding: 10px 1% 10px ;
            margin-top: 5px;
        }
        .ifClass_cont_ul>li img{
            width: 95%;
            margin: 5px auto;
            /*height: 80px;*/
        }



    </style>
</head>
<body>
    <div class="ifClass_nav">
        有一村，新鲜配送
        <input type="text" id="type" value="${type }">
    </div>
    <div class="ifClass_cont clear">
        <div>
            <ul class="clear ifClass_cont_top">
                <li class="ifClass_top_active">鲜肉</li>
                <li>蛋类</li>
                <li>蔬菜</li>
                <li>水果</li>
                <li>衣服</li>
            </ul>
        </div>
        <ul class="ifClass_cont_ul">
            
        </ul>
    </div>

    <div class="hp_footer">
        <div class="">
            <!--<img src="img/homeActive.png"/>-->
            <img src="assets/img-class/homeIcon.png"/>
            <p>首页</p>
        </div>
        <div class="hp_footer_active">
            <img src="assets/img-class/fenleiActive_03.png"/>
            <!--<img src="img/fenlei_03.png"/>-->
            <p>分类</p>
        </div>
        <div>
            <!--<img src="img/gwcActive_03.png"/>-->
            <img src="assets/img-class/gwc_03.png"/>
            <p>购物车</p>
        </div>
        <div>
            <!--<img src="img/wodeActive_03.png"/>-->
            <img src="assets/img-class/wode_03.png"/>
            <p>我的</p>
        </div>
    </div>

    <!--<embed class="hp_footer" src="../footer/footer.html"></embed>-->

<script src="../js/jquery-1.11.3.js"></script>
<script>
    //右上角的按钮
    $('.ifClass_nav_img').on('touchend',function () {
        if($('.sxuan_modal').width()==0) {
            $('.sxuan_modal').animate({
                width: '100%',
            },300)
        }else {
            $('.sxuan_modal').animate({
                width: '0%',
            },300)
        }
    });
    $(document).on("touchend",function(e){
        var target = $(e.target);
        if(target.closest(".ifClass_nav_img").length == 0&&target.closest(".sxuan_modal").length == 0){
            $('.sxuan_modal').animate({
                width: '0%',
            },300)
        }
    });
    (function () {
        $('.village').load("/home/returnHome");
        var homePage={
            init:function () {
                this.footDiv();
                this.topLiClick("ifClass_top_active");
                this.ajaxlh();
            },
            footDiv:function () {
                $('.hp_footer').on('touchend','div',function () {
                    $(this).addClass('hp_footer_active').siblings('.hp_footer_active').removeClass('hp_footer_active');
                    $('.hp_footer>div:nth-child(1)').children('img').attr('src','assets/img-class/homeIcon.png');
                    $('.hp_footer>div:nth-child(2)').children('img').attr('src','assets/img-class/fenlei_03.png');
                    $('.hp_footer>div:nth-child(3)').children('img').attr('src','assets/img-class/gwc_03.png');
                    $('.hp_footer>div:nth-child(4)').children('img').attr('src','assets/img-class/wode_03.png');
                    //首页
                    if($(this).children('p').text()=="首页"){
                        $(this).children('img').attr('src','assets/img-class/homeActive.png');
//                        $('.village').load("首页/homePage.html");
                        window.location.href="/home/returnHome"
                    }
                    //分类
                    if($(this).children('p').text()=="分类"){
                        $(this).children('img').attr('src','assets/img-class/fenleiActive_03.png');
//                        $('.village').load("分类/classification.html")
//                        window.location.href="../分类/classification.html"
                    }
                    //购物车
                    if($(this).children('p').text()=="购物车"){
                        $(this).children('img').attr('src','assets/img-class/gwcActive_03.png');
                        window.location.href="/home/toShoppingCartjsp"
                    }
                    //我的
                    if($(this).children('p').text()=="我的"){
                        $(this).children('img').attr('src','assets/img-class/wodeActive_03.png');
                        window.location.href="/home/toMineSettingjsp"
                    }
                })
                //点击商品进入商品详情
                $('.ifClass_cont_ul').on('touchend','li',function () {
                    console.log(1111);
                    window.location.href="../商品详情/commodityDetails.html"
                })

            },
            topLiClick:function (className) {
                $('.ifClass_cont_top').on('touchend','li',function () {
                    $(this).addClass(className).siblings('.'+className).removeClass(className);
                })

            },
            ajaxlh:function(){
            		var type=$("#type").val();
            		//var ul=$(".ifClass_cont_ul");
            	    //var _this=this;
            		$.ajax({ 
            				url:"class/sales",
            				type:"GET",
            				data: {itemType:'SG',page:'1'},
            				dataType:"json",
            				async : true,
            				success: function(data){	
            				        	//console.log(data); 
            				        	//console.log(data.list.length); 
            					for(var i =0,len=data.list.length;i<len;i++){
            						console.log(i);
            			            var html='<li onclick="itemdetail('+data.list[i].hotSaleId+
            			            		')">'+
            		                '<div>'+
            		                '<img src="'+data.list[i].imgUrl+'"/>'+
           		                	'<p>'+data.list[i].saleName+'</p>'+
            		               	' </div>'+
            		            	'</li>';
            					$(".ifClass_cont_ul").append(html);
								}         
            				}
            			}); 
            		
            },
            itemdetail:function (itemid) {
            	alert("ok");
            	//itemdetail(001)
            }

        }
        
        homePage.init();

    })(jQuery)


</script>
</body>
</html>
</html>