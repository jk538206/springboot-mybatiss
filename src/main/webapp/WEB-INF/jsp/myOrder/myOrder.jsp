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
<html>
<head>
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
    <title>演示页面</title>
    <link rel="stylesheet" href="css/base.css" />
    <link rel="stylesheet" href="css/demo.css" />
    <style>
        .gwc_box{
            width: 100%;
            height: 110px;
            border-bottom: 1px solid #ddd;
            background: #fff;
            padding: 0 2%;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .gwc_box>div{
            float: left;
        }
        /*.gwc_box_check{*/
        /*width: 8%;*/
        /*text-align: center;*/
        /*line-height: 110px;*/
        /*display: none;*/
        /*}*/
        /*.gwc_box_check img{*/
        /*width: 16px;*/
        /*}*/
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
            width: 40%;
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
            width: 30%;
            height: 110px;
            text-align: right;
            line-height: 40px;
        }
        .gwc_box_right>p:nth-child(1){
            padding: 0 10px;
            color: #fa0002;
            font-size: 0.9rem;
        }
        .gwc_box_right>p:nth-child(2){
            line-height: 40px;
            font-size: 0.9rem;
            padding: 0 10px;
            color: #666;
        }

        .myOrderbox{
            background: #fff;
            width: 95%;
            margin: 5px auto 0;
        }
        .myOrderbox_head{
            padding-top: 10px;
            padding-left: 10px;
            border-bottom: 1px solid #ddd;
        }
        .myOrderbox_foot{
            height: 40px;
            line-height: 40px;
            /*border-top: 1px solid #eee;*/
        }
        .myOrderbox_foot_left{
            width: 40%;
            float: left;
            padding-left: 15px;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .myOrderbox_foot_right{
            width: 60%;
            float: right;
            text-align: right;
        }
        .myOrderbox_foot_right button{
            padding: 3px 15px;
            margin: 0 15px 0 0;
            background: transparent;
            border: 1px solid #999;
            border-radius: 5px;
        }

    </style>


</head>
<body bgcolor="f4f4f4">
<div class="header">
    <div class="login le login_return">
        <img src="img/zfx_03.png" />
    </div>
    <div class="head-title">
        我的订单
    </div>
</div>
<div id="content">
    <div class="tab-title">
        <ul id="pagenavi" class="page clear">
            <li><a class="aaa active" href="javascript:;">全部</a></li>
            <li><a class="aaa" href="javascript:;">待付款</a></li>
            <li><a class="aaa"  href="javascript:;">待发货</a></li>
            <li><a class="aaa"  href="javascript:;">待收货</a></li>
            <li><a class="aaa"  href="javascript:;">待评价</a></li>
        </ul>
    </div>

    <div id="slider" class="swipe">
        <ul class="slider-list">
            <!--全部-->
            <li class="item" id="item1">

            </li>
            <li class="item" id="item2">

                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
            </li>
            <li class="item" id="item3">
                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
                <div class="myOrderbox">
                        <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                        <div class="gwc_box clear">
                            <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                            <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                            <div class="gwc_box_center">
                                <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                                <p>包邮，优惠</p>
                            </div>
                            <div class="gwc_box_right">
                                <p>￥16.66</p>
                                <p>X2</p>
                            </div>
                        </div>
                        <div class="clear myOrderbox_foot">
                            <div class="myOrderbox_foot_left">等待买家发货</div>
                            <div class="myOrderbox_foot_right">
                                <button>取消订单</button>
                                <button>付款</button>
                            </div>
                        </div>

                    </div>
            </li>
            <li class="item" id="item4">
                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
                <div class="myOrderbox">
                    <p class="myOrderbox_head">订单编号：<span>456354654554554654</span></p>
                    <div class="gwc_box clear">
                        <!--<div class="gwc_box_check"><img src="img/gouxz_03.png"/></div>-->
                        <div class="gwc_box_left"><img src="img/zhurou_03.png"/></div>
                        <div class="gwc_box_center">
                            <p>老王牌猪肉老王牌猪肉老王牌猪肉</p>
                            <p>包邮，优惠</p>
                        </div>
                        <div class="gwc_box_right">
                            <p>￥16.66</p>
                            <p>X2</p>
                        </div>
                    </div>
                    <div class="clear myOrderbox_foot">
                        <div class="myOrderbox_foot_left">等待买家发货</div>
                        <div class="myOrderbox_foot_right">
                            <button>取消订单</button>
                            <button>付款</button>
                        </div>
                    </div>

                </div>
            </li>
            <li class="item" id="item5">
            </li>
        </ul>
    </div>
</div>
</body>
<script src="../comstyle/jquery-1.11.3.js"></script>
<script src="js/touchslider.js"></script>
<script type="text/javascript">

    // 获取滑动前的text里面的内容
    var Text=$('.active').text();
    //	   刚开始的时候给父标记定义高度
    var contentHeight=$(window).height()-$('.header').height()-$('.tab-title').height();
    if($('#item1').height()<=contentHeight){
        $('#slider').css('height',contentHeight)
    }else {
        $('#slider').css('height', $('#item1').height());
    }
    //判断子标记是否有没有数据   如果没有就显示图片
    if($('#item1').children('.myOrderbox').length==0){
        $('#item1').html('<div style="width: 100%;height: 100%;"><img style="width: 100%;height: 100%;" src="img/bgImgS_02.jpg"/></div>')
    }

    var page='pagenavi';
    var mslide='slider';
    var mtitle='emtitle';
    arrdiv = 'arrdiv';

    var as=document.getElementById(page).getElementsByTagName('a');

    var tt=new TouchSlider({id:mslide,'auto':'-1',fx:'ease-out',direction:'left',speed:600,timeout:5000,'before':function(index){
        var as=document.getElementById(this.page).getElementsByTagName('a');
        as[this.p].className='';
        as[index].className='active';
        this.p=index;
        var txt=as[index].innerText;
        $("#"+this.page).parent().find('.emtitle').text(txt);
        var txturl=as[index].getAttribute('href');
        var turl=txturl.split('#');
        $("#"+this.page).parent().find('.go_btn').attr('href',turl[1]);

//            鼠标滑动成功的时候根据不同的页面执行不同的方法
        var aText=$('.active').text();
//            当执行方法前和执行方法后的text内容为一样的时候  打断方法不让执行
        if(Text==aText){
            return
        }else if(aText=="全部"){
            console.log("执行a方法");
            //        让每次触发的时候显示在顶部
            $('body').animate( {scrollTop: 0}, 0);
            //        执行成功的时候给Text重新赋值方便下一次执行时候的判断
            Text=aText;
            //		给当前的页面的父标记设置和子标记一样的高度   当内容高度太低的时候给复制和window一样的高度
            if($('#item1').height()<=contentHeight){
                $('#slider').css('height',contentHeight+'px');
                $('#item1').css('height',contentHeight+'px');
            }else {
                $('#slider').css('height', $('#item1').height());
            }
            //判断子标记是否有没有数据   如果没有就显示图片
            if($('#item1').children('.myOrderbox').length==0){
                $('#item1').html('<div style="width: 100%;height: 100%;"><img style="width: 100%;height: 100%;" src="img/bgImgS_02.jpg"/></div>')
            }

        }else if(aText=="待付款"){
            console.log("执行B方法");
            //        让每次触发的时候显示在顶部
            $('body').animate( {scrollTop: 0}, 0);
            //        执行成功的时候给Text重新赋值方便下一次执行时候的判断
            Text=aText;


            //		给当前的页面的父标记设置和子标记一样的高度
            if($('#item2').height()<=contentHeight){
                $('#slider').css('height',contentHeight);
                $('#item2').css('height',contentHeight);
            }else {
                $('#slider').css('height', $('#item2').height());
            }

            //判断子标记是否有没有数据   如果没有就显示图片
            if($('#item2').children('.myOrderbox').length==0){
                $('#item2').html('<div style="width: 100%;height: 100%;"><img style="width: 100%;height: 100%;" src="img/bgImgS_02.jpg"/></div>')
            }
        }else if(aText=="待发货"){
            console.log("执行C方法");
            //        让每次触发的时候显示在顶部
            $('body').animate( {scrollTop: 0}, 0);
            //        执行成功的时候给Text重新赋值方便下一次执行时候的判断
            Text=aText;

            //		给当前的页面的父标记设置和子标记一样的高度
            if($('#item3').height()<=contentHeight){
                $('#slider').css('height',contentHeight);
                $('#item3').css('height',contentHeight);
            }else {
                $('#slider').css('height', $('#item3').height());
            }
            //判断子标记是否有没有数据   如果没有就显示图片
            if($('#item3').children('.myOrderbox').length==0){
                $('#item3').html('<div style="width: 100%;height: 100%;"><img style="width: 100%;height: 100%;" src="img/bgImgS_02.jpg"/></div>')
            }


        }else if(aText=="待收货"){
            console.log("执行d方法");
            //        让每次触发的时候显示在顶部
            $('body').animate( {scrollTop: 0}, 0);
            //        执行成功的时候给Text重新赋值方便下一次执行时候的判断
            Text=aText;

            //		给当前的页面的父标记设置和子标记一样的高度
            if($('#item4').height()<=contentHeight){
                $('#slider').css('height',contentHeight);
                $('#item4').css('height',contentHeight);
            }else {
                $('#slider').css('height', $('#item4').height());
            }

            //判断子标记是否有没有数据   如果没有就显示图片
            if($('#item4').children('.myOrderbox').length==0){
                $('#item4').html('<div style="width: 100%;height: 100%;"><img style="width: 100%;height: 100%;" src="img/bgImgS_02.jpg"/></div>')
            }

        }else if(aText=="待评价"){
            console.log("执行e方法");
            //        让每次触发的时候显示在顶部
            $('body').animate( {scrollTop: 0}, 0);
            //        执行成功的时候给Text重新赋值方便下一次执行时候的判断
            Text=aText;

            //		给当前的页面的父标记设置和子标记一样的高度
            if($('#item5').height()<=contentHeight){
                $('#slider').css('height',contentHeight);
                $('#item5').css('height',contentHeight);
            }else {
                $('#slider').css('height', $('#item5').height());
            }

            //判断子标记是否有没有数据   如果没有就显示图片
            if($('#item5').children('.myOrderbox').length==0){
                $('#item5').html('<div style="width: 100%;height: 100%;"><img style="width: 100%;height: 100%;" src="img/bgImgS_02.jpg"/></div>')
            }

        }
    }
    });

    tt.page = page;
    tt.p = 0;
    for(var i=0;i<as.length;i++){
        (function(){
            var j=i;
            as[j].tt = tt;
            as[j].onclick=function(){
                this.tt.slide(j);
                return false;
            }
        })();
    }


    //返回按钮
    $('.login_return').click(function () {
        window.location.href="../我的/mineSetting.html";
    })




</script>

</html>
