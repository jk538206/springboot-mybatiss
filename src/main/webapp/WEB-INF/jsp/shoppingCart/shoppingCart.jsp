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
    <title>购物车</title>
    <link rel="stylesheet" href="../css/reset.css">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
    <style>
        /*内容区*/
        .ifClass_cont{
            margin: 40px auto 90px;
            /*border: 1px solid red;*/
            /*height: 1000px;*/
            box-sizing: border-box;
        }
        .gwc_box{
            width: 100%;
            height: 110px;
            border-bottom: 1px solid #ddd;
            background: #fff;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .gwc_box>div{
            float: left;
        }
        .gwc_box_check{
            width: 8%;
            text-align: center;
            line-height: 110px;
            /*display: none;*/
        }
        .gwc_box_check img{
            width: 16px;
        }
        .gwc_box_left{
            width: 30%;
            overflow: hidden;
            height: 110px;
        }
        .gwc_box_left img{
            width: 80%;
            height: 80px;
            margin: 10px 10% 0;
        }
        .gwc_box_center{
            width: 42%;
            position: relative;
            height: 110px;
        }
        .gwc_box_center>p:nth-child(1){
            padding:  10px;%
            line-height: 24px;
            color: #444;
            font-size: 0.9rem;
        }
        .gwc_box_center>p:nth-child(2){
            padding: 0 10px;
            text-align: right;
            position: absolute;
            bottom: 0;
            right: 10px;
            line-height: 40px;
            color: #999;
            font-size: 0.8rem;
        }
        .gwc_box_right{
            width: 20%;
            height: 110px;
            text-align: right;
            line-height: 40px;
        }
        .gwc_box_right>p:nth-child(1){
            color: #fa0002;
            font-size: 0.9rem;
        }
        .gwc_box_right>p:nth-child(2){
            line-height: 40px;
            font-size: 0.9rem;
            color: #666;
            margin-top: 20px;
        }
        .gwc_box_right>p:nth-child(2) button{
            width: 28%;
            height: 20px;
            margin: 0 1%;
        }



        /*底部按钮*/
        .shopping_footerBox{
            width: 100%;
            box-sizing: border-box;
            border-top: 1px solid #ddd;
            /*border-bottom: 1px solid red;*/
            position: fixed;
            bottom: 47px;
            left: 0;
            right: 0;
            height: 40px;
            background: #fff;
        }
        .shopping_footerBox>div{
            float: right;
            text-align: center;
        }
        .shopping_footerBox_left{
            width: 30%;
            line-height: 40px;
            border-right: 1px solid #f4f4ff;
            box-sizing: border-box;
            /*display: none;*/
        }
        .shopping_footerBox_left img{
            width: 16px;
            position: relative;
            top: 2px;
            margin-right: 7px;
        }
        .shopping_footerBox_center{
            width: 40%;
            line-height: 40px;
        }
        .shopping_footerBox_right{
            width: 30%;
            line-height: 40px;
            background: #c30002;
            color: #fff;
            font-size: 0.9rem;
        }

        .ifClass_cont_head{
            width: 100%;
            height: 30px;
            line-height: 30px;
        }
        .ifClass_cont_head>div{
            width: 30%;
            float: right;
            background: #f6f6f6;
            color: #666;
            text-align: center;
            border-left: 1px solid #ddd;
        }
        /*.ifClass_nav>div{*/
            /*position: absolute;*/
            /*right: 0;*/
            /*padding: 0 20px;*/
            /*top: 0;*/
            /*font-size: 0.8rem;*/
        /*}*/





        .sil_cont ul li{
            float: left;
            /*width: 33.33%;*/
            text-align: center;
        }
        .sil_btn{
            width: 100%;
            position: relative;
            overflow-x: hidden;
            -moz-user-select: none;
            -khtml-user-select: none;
            user-select: none;
        }
        .sil_btn_container{
            width: 100%;
            position: absolute;
            top: 0;
            right:0;
            z-index: 2;
            background: #fff;
        }
        .sil_button{
            text-align: right;
            /*position: absolute;*/
            /*right: 0;*/
            /*top: 0;*/
            width: 100%;
            height: 100%;
            /*z-index: 1;*/
        }
        .sil_button button{
            width: 60px;
            background-color: #cd4932;
            color: #fff;
            display: block;
            float: right;
            height: 100%;
            border: 0;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .sil_button button:nth-child(2){
            background-color: #f0ad4e !important;
        }

    </style>
</head>
<body>
<div class="ifClass_nav">有一村，购物车
    <!--<div class="ifClass_cont_operation">操作</div>-->
</div>

<div class="ifClass_cont clear sil_cont" leftmargin=0 topmargin=0 oncontextmenu='return false' ondragstart='return false' onselectstart ='return false' onselect='document.selection.empty()'
     onbeforecopy='return false'>
    <!--<div class="ifClass_cont_head">-->
        <!--<div>操作</div>-->
    <!--</div>-->
    <div class="gwc_box sil_btn">
        <!--<div class="gwc_box_cont">-->
        <div class="sil_btn_container">
            <ul>
                <li class="gwc_box_check"><img src="assets/img-shop/gouxz_03.png"/></li>
                <li class="gwc_box_left"><img src="assets/img-shop/zhurou_03.png"/></li>
                <li class="gwc_box_center">
                    <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                    <p>包邮，优惠</p>
                </li>
                <li class="gwc_box_right">
                    <p>￥<span class="unit_price">11.10</span></p>
                    <p><button class="ReductionBtn">-</button>x<span class="the_number">2</span><button class="addBtn">+</button></p>
                </li>

            </ul>
        </div>
        <div class="sil_button">
            <button>删除</button>
        </div>
        <!--</div>-->
    </div>
    <div class="gwc_box sil_btn">
        <!--<div class="gwc_box_cont">-->
        <div class="sil_btn_container">
            <ul>
                <li class="gwc_box_check"><img src="assets/img-shop/gouxz_03.png"/></li>
                <li class="gwc_box_left"><img src="assets/img-shop/zhurou_03.png"/></li>
                <li class="gwc_box_center">
                    <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                    <p>包邮，优惠</p>
                </li>
                <li class="gwc_box_right">
                    <p>￥<span class="unit_price">11.10</span></p>
                    <p><button class="ReductionBtn">-</button>x<span class="the_number">2</span><button class="addBtn">+</button></p>
                </li>

            </ul>
        </div>
        <div class="sil_button">
            <button>删除</button>
        </div>
        <!--</div>-->
    </div>

</div>

<div class="shopping_footerBox">

    <div class="shopping_footerBox_right">立即付款</div>
    <div class="shopping_footerBox_center">实付款:<span class="RealPayment">总价数量</span></div>

    <div class="shopping_footerBox_left">
        <img src="assets/img-shop/gouxz_03.png"/>
        <!--<img src="img/gouhs_03.png"/>-->
        全选
    </div>
</div>





<div class="hp_footer">
    <div class="">
        <!--<img src="img/homeActive.png"/>-->
        <img src="assets/img-shop/homeIcon.png"/>
        <p>首页</p>
    </div>
    <div class="">
        <!--<img src="img/fenleiActive_03.png"/>-->
        <img src="assets/img-shop/fenlei_03.png"/>
        <p>分类</p>
    </div>
    <div class="hp_footer_active">
        <img src="assets/img-shop/gwcActive_03.png"/>
        <!--<img src="img/gwc_03.png"/>-->
        <p>购物车</p>
    </div>
    <div>
        <!--<img src="img/wodeActive_03.png"/>-->
        <img src="assets/img-shop/wode_03.png"/>
        <p>我的</p>
    </div>
</div>




<script src="../js/jquery-1.11.3.js"></script>
<script>
    (function () {
        var pg_gwc={
            init:function () {
                //全选
                this.shopping_footerBox_left();
                //点击单选的复选框
                this.gwc_box_check();
                //操作
                this.caozuo();
                this.footDiv();
                //计算
                this.calculate();
            },
            gwc_box_check:function () {
                $('.ifClass_cont').on('click','.gwc_box_check',function () {
                    $(this).find('input[type=checkbox]').prop('checked',!$(this).find('input[type=checkbox]').prop('checked'));
                    var str=$(this).find('img').attr('src');
                    var istrue=new RegExp('gouxz_03').test(str);
                    if(new RegExp('gouxz_03').test(str)){
                        $(this).find('img').attr('src','assets/img-shop/gouhs_03.png');
                    }else if(new RegExp('gouhs_03').test(str)){
                        $(this).find('img').attr('src','assets/img-shop/gouxz_03.png');
                    }
                    $('.shopping_footerBox_left').find('img').attr('src','assets/img-shop/gouxz_03.png');
                })
            },
            shopping_footerBox_left:function () {
                $('.shopping_footerBox_left').click(function () {
                    var str=$(this).find('img').attr('src');
                    var istrue=new RegExp('gouxz_03').test(str);
                    if(new RegExp('gouxz_03').test(str)){
                        $(this).find('img').attr('src','assets/img-shop/gouhs_03.png');
                    }else if(new RegExp('gouhs_03').test(str)){
                        $(this).find('img').attr('src','assets/img-shop/gouxz_03.png');
                    }
                    var src=$(this).find('img').attr('src');
                    $('.gwc_box_check').find('img').attr('src',src)
                })
            },
            caozuo:function () {
                $('.ifClass_cont_operation').click(function () {
                    $('.gwc_box_check').toggle();
                    $('.shopping_footerBox_left').toggle();
                    if($(this).text()=="操作"){
                        $(this).text("取消");
                        $('.gwc_box_right').css({
                            width:'20%',
                        })
                    }else {
                        $(this).text("操作");
                        $('.gwc_box_right').css({
                            width:'28%',
                        })
                    }
                })
            },
            //点击跳转页面
            footDiv:function () {
                $('.hp_footer').on('touchend','div',function () {
                    $(this).addClass('hp_footer_active').siblings('.hp_footer_active').removeClass('hp_footer_active');
                    $('.hp_footer>div:nth-child(1)').children('img').attr('src','assets/img-shop/homeIcon.png');
                    $('.hp_footer>div:nth-child(2)').children('img').attr('src','assets/img-shop/fenlei_03.png');
                    $('.hp_footer>div:nth-child(3)').children('img').attr('src','assets/img-shop/gwc_03.png');
                    $('.hp_footer>div:nth-child(4)').children('img').attr('src','assets/img-shop/wode_03.png');
                    //首页
                    if($(this).children('p').text()=="首页"){
                        $(this).children('img').attr('src','assets/img-shop/homeActive.png');
//                        $('.village').load("首页/homePage.html");
                        window.location.href="/home/returnHome"
                    }
                    //分类
                    if($(this).children('p').text()=="分类"){
                        $(this).children('img').attr('src','assets/img-shop/fenleiActive_03.png');
                        window.location.href="/home/toClassificationjsp"
                    }
                    //购物车
                    if($(this).children('p').text()=="购物车"){
                        $(this).children('img').attr('src','assets/img-shop/gwcActive_03.png');
//                        window.location.href="../购物车/shoppingCart.html"
                    }
                    //我的
                    if($(this).children('p').text()=="我的"){
                        $(this).children('img').attr('src','assets/img-shop/wodeActive_03.png');
                        window.location.href="/home/toMineSettingjsp"
                    }
                })

                //点击图片调回到详情页
                $('.gwc_box_left').on('click',function () {
                    window.location.href="../商品详情/commodityDetails.html";
                })
            },
            //计算
            calculate:function () {
                valueNumB();
                //减号
                $('.ifClass_cont').on('touchend','.ReductionBtn',function () {
                    var text=parseInt($(this).siblings('span').text())-1;
                    if(text<1){
                        text=1;
                    }
                    $(this).siblings('span').text(text);
                    valueNumB()
                });
                //加号
                $('.ifClass_cont').on('touchend','.addBtn',function () {
                    var text=parseInt($(this).siblings('span').text())+1;
                    if(text>99){
                        text=99;
                    }
                    $(this).siblings('span').text(text);
                    valueNumB()
                });
                //计算总价
                function valueNumB() {
                    var valueNum=0;
                    $('.gwc_box').each(function (index, elem) {
                        var value=$(this).find('.unit_price').text();
                        var numb=$(this).find('.the_number').text();
                        valueNum+=value*numb;
                    });
                    var valueNum=valueNum.toFixed(2);
                    //总价赋值
                    $('.RealPayment').text("￥"+valueNum);
                }
            },
        }
        pg_gwc.init();



        //手指鼠标滑动事件
            var list={
                btnParent:".sil_btn",//外面的盒子
                listContainer:".sil_btn_container",//显示的内容
                btnCont:".sil_button",//按钮的盒子
            }
            function slide(obj) {
                $.extend({},list,obj);
                this.btnParent=obj.btnParent;
                this.listContainer=obj.listContainer;
                this.btnCont=obj.btnCont;
                this.init();
            }
            slide.prototype={
                star:"",
                init:function () {
                    this.start();
                    this.pcStart();
                },
                //手机端滑动
                start:function () {
                    //记录初始时候按下的点
                    var _this=this;
                    var startMos;
                    var lastMos;
                    var lis=$(this.btnParent);
                    for(var i=0;i<lis.length;i++) {
                        lis[i].addEventListener('touchstart', function () {
                            //当前的对象
                            startMos=this;
                            // 记录开始按下时的点
                            var touches = event.touches[0];
                            sta= {
                                x : touches.pageX,
                                y : touches.pageY,
                            };
                        });
                        lis[i].addEventListener('touchmove',function () {//移动过程的点
                            var touches = event.touches[0];
                            move= {
                                x:touches.pageX-sta.x,
                                y : touches.pageY-sta.y,
                            };
                            if(Math.abs(move.x)>Math.abs(move.y)){
                                event.preventDefault();
                            }
                        });
                        lis[i].addEventListener('touchend',function (e) {//移动结束的点
                            lastMos=this;
//                            var wisthBtn=$(lastMos).find('button').width()*($(lastMos).find('button').length);
                            var wisthBtn=60;
                            chEnd = {
                                x: e.changedTouches[0].pageX - sta.x,
                                y: e.changedTouches[0].pageY - sta.y,
                            }
                            if (chEnd.x < -50) {
                                $(lastMos).children(_this.listContainer).animate({
                                    right: wisthBtn+'px',
                                }, 300)
                                $(lastMos).siblings().children(_this.listContainer).animate({
                                    right:"0",
                                },300)
                            } else if (chEnd.x > 30) {
                                $(lastMos).children(_this.listContainer).animate({
                                    right: "0px",
                                }, 300)
                            }
                        });
                    };
                },
                //兼容pc端滑动
                pcStart:function () {
                    var _this=this;
                    var pcLis=$(this.btnParent);
                    for(var i=0;i<pcLis.length;i++){
//                    鼠标点击下去的时候的位置
                        $(pcLis[i]).bind('mousedown',function (e) {
                            staX = e.clientX;
                            staObj = this; // 记录被按下的对象
                        })
                        //鼠标移动后的位置
                        $(pcLis[i]).bind('mouseup',function (e) {
//                            var wisthBtn=$(this).find('button').width()*$(this).find('button').length;
                            var wisthBtn=60;
                            var movX=e.clientX-staX;
                            if(movX<-60){
                                $(this).children(_this.listContainer).animate({
                                    right: wisthBtn+'px',
                                }, 300)

                                $(this).siblings().children(_this.listContainer).animate({
                                    right:"0",
                                },300)
                            }
                            if(movX>30){
                                $(this).children(_this.listContainer).animate({
                                    right: "0px",
                                }, 300)
                            }
                        })
                    }
                },
            };
            window.slide=slide;
    })(jQuery)

    new slide({
        btnParent:".sil_btn",//外面的盒子
        listContainer:".sil_btn_container",//显示的内容
        btnCont:".sil_button",//按钮的盒子
    })
</script>
</body>
</html>