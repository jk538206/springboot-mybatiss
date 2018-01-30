
<!--<!DOCTYPE html>-->
<html>
<head>
    <meta charset="UTF-8">
    <title>我的</title>
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0" />
    <link rel="stylesheet" href="../comstyle/reset.css">
    <style>
        .mine_cont{
            margin: 10px auto 57px;
            /*height: 1000px;*/
            /*border: 1px solid red;*/
        }
        .mine_cont>div{
            background: #fff;
            border-bottom: 1px solid #ddd;
            font-size: 0.8rem;
            color: #555;
        }
        /*内容头部*/
        .mine_cont_head_left{
            float: left;
            width: 35%;
            height: 90px;
        }
        .mine_cont_head_left>div{
            width: 70px;
            height: 70px;
            border: 1px solid #ddd;
            border-radius: 40px;
            overflow: hidden;
            margin:  10px auto;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
            position: relative;
        }
        /*.mine_cont_head_left>div>input[type=file]{*/
            /*width: 100%;*/
            /*height: 100%;*/
            /*position: absolute;*/
            /*left: 0;*/
            /*right: 0;*/
            /*bottom: 0;*/
            /*top:0;*/
            /*opacity: 0;*/
            /*z-index: 2;*/
        /*}*/
        .mine_cont_head_left>div>img{
            width: 100%;
            height: 100%;
            position: absolute;
            left: 0;
            right: 0;
            bottom: 0;
            top:0;
        }
        /*上  中间*/
        .mine_cont_head_center{
            line-height: 90px;
            font-size: 16px;
            font-weight: bold;
            float: left;
            width: 20%;
            color: #777;
        }
        .mine_cont_head_right{
            width: 10%;
            float: right;
            line-height: 90px;
        }
        .mine_cont_head_right img{
            width: 20px;
            margin: 35px auto 0;
            display: block;
        }
        /*二层*/
        .mine_cont_second{
            padding-left: 3%;
            line-height: 40px;
            position: relative;
        }
        .mine_cont_second img.dingdanicon{
            width: 18px;
            padding: 0 5px;
            position: relative;
            top: 5px;
        }
        .mine_cont_second img.dakaiicon{
            position: absolute;
            right: 3%;
            width: 10px;
            top: 10px;
        }
        /*三层*/
        .mine_cont_three>div{
            width: 25%;
            text-align: center;
            float: left;
            position: relative;
        }
        .mine_cont_three>div>div{
            display: inline-block;
            height: 30px;
            margin: 15px auto 0;
            position: relative;
        }
        .mine_cont_three>div>div img{
            height: 100%;
        }
        .mine_cont_three>div p{
            line-height: 30px;
        }
        .mine_cont_three>div>div span{
            position: absolute;
            right: -12px;
            top: -8px;
            width: 18px;
            border-radius: 9px;
            height: 18px;
            background: #fa0002;
            color: #fff;
        }
        /*四层以后*/
        .mine_cont_nextBox{
            padding: 0 15px;
            height: 50px;
            line-height: 50px;
            position: relative;
            background: #fff;
        }
        img.nextBox_leftImg{
            /*width: 20px;*/
            height: 22px;
            position: relative;
            top: 7px;
            padding: 0 5px;
        }
        img.nextBox_rightImg{
            width: 10px;
            position: absolute;
            right: 15px;
            top: 18px;
        }

        #mine_nav{
            position: relative;
        }
        /*#mine_nav>div{*/
            /*position: absolute;*/
            /*width: 22px;*/
            /*height: 22px;*/
            /*right: 0;*/
            /*top: 0;*/
            /*padding: 9px 15px;*/
        /*}*/
        /*#mine_nav>div img{*/
            /*width: 100%;*/
            /*height: 100%;*/
        /*}*/

    </style>
</head>
<body>
<div class="hp_nav" id="mine_nav">我的
    <!--<div id="mine_iSetUp"><img src="img/shezhi.png"/></div>-->
</div>


<!--内容区-->
<div class="mine_cont">
    <!--一层-->
    <div class="mine_cont_head clear">
        <div class="mine_cont_head_left">
            <!--点击上传图片-->
            <div class="col-md-6">
                <!--<input type="file" class="form-control" id="thumbnail" name="thumbnail">-->
                <img src="img/wode_03.png">
            </div>

        </div>
        <div class="mine_cont_head_center">张三</div>
        <div class="mine_cont_head_right">
            <img src="img/xgicon.png"/>
        </div>
    </div>
    <!--二层-->
    <div class="mine_cont_second">
        <img src="img/dingdanicon.png" class="dingdanicon">我的订单
        <img src="img/dakaiicon.png" class="dakaiicon"/>
    </div>
    <!--三层-->
    <div class="mine_cont_three clear">
        <div>
            <div>
                <img src="img/dfk3x.png"/>
                <span>3</span>
            </div>
            <p>待付款</p>
        </div>
        <div>
            <div>
                <img src="img/ffh.png">
            </div>
            <p>待发货</p>
        </div>
        <div>
            <div>
                <img src="img/dsh.png">
            </div>
            <p>待收货</p>
        </div>
        <div>
            <div>
                <img src="img/dpj.png">
                <span>3</span>
            </div>
            <p>待评价</p>
        </div>
    </div>
    <!--四层，我的消息-->
    <div class="mine_cont_nextBox">
        <img src="img/wdxx.png" class="nextBox_leftImg">我的消息
        <img src="img/dakaiicon.png" class="nextBox_rightImg"/>
    </div>
    <!--，我的收货地址-->
    <div class="mine_cont_nextBox" id="MyDeliveryAddress">
        <img src="img/shdz.png" class="nextBox_leftImg">我的收货地址
        <img src="img/dakaiicon.png" class="nextBox_rightImg"/>
    </div>
    <!--，退款售后-->
    <div class="mine_cont_nextBox">
        <img src="img/tksh.png" class="nextBox_leftImg">退款售后
        <img src="img/dakaiicon.png" class="nextBox_rightImg"/>
    </div>
    <!--，常见问题-->
    <div class="mine_cont_nextBox">
        <img src="img/cjwt.png" class="nextBox_leftImg">常见问题
        <img src="img/dakaiicon.png" class="nextBox_rightImg"/>
    </div>
    <!--，我的优惠卷-->
    <!--<div class="mine_cont_nextBox">-->
        <!--<img src="img/wdyhj.png" class="nextBox_leftImg">我的优惠卷-->
        <!--<img src="img/dakaiicon.png" class="nextBox_rightImg"/>-->
    <!--</div>-->
    <!--，我的收藏-->
    <div class="mine_cont_nextBox">
        <img src="img/shouc.png" class="nextBox_leftImg">我的收藏
        <img src="img/dakaiicon.png" class="nextBox_rightImg"/>
    </div>
</div>





<div class="hp_footer">
    <div class="">
        <!--<img src="img/homeActive.png"/>-->
        <img src="img/homeIcon.png"/>
        <p>首页</p>
    </div>
    <div>
        <!--<img src="img/fenleiActive_03.png"/>-->
        <img src="img/fenlei_03.png"/>
        <p>分类</p>
    </div>
    <div>
        <!--<img src="img/gwcActive_03.png"/>-->
        <img src="img/gwc_03.png"/>
        <p>购物车</p>
    </div>
    <div class="hp_footer_active">
        <img src="img/wodeActive_03.png"/>
        <!--<img src="img/wode_03.png"/>-->
        <p>我的</p>
    </div>
</div>

<script src="../comstyle/jquery-1.11.3.js"></script>
<script>

    (function () {
        var homePage={
            init:function () {
                //点击跳转页面
                this.footDiv();
                //点击人物修复图像
//                this.userImg();
                //页面上的跳转
                this.tzhuan();
            },
            //点击跳转页面
            footDiv:function () {
                $('.hp_footer').on('touchend','div',function () {
                    $(this).addClass('hp_footer_active').siblings('.hp_footer_active').removeClass('hp_footer_active');
                    $('.hp_footer>div:nth-child(1)').children('img').attr('src','img/homeIcon.png');
                    $('.hp_footer>div:nth-child(2)').children('img').attr('src','img/fenlei_03.png');
                    $('.hp_footer>div:nth-child(3)').children('img').attr('src','img/gwc_03.png');
                    $('.hp_footer>div:nth-child(4)').children('img').attr('src','img/wode_03.png');
                    //首页
                    if($(this).children('p').text()=="首页"){
                        $(this).children('img').attr('src','img/homeActive.png');
//                        $('.village').load("首页/homePage.html");
                        window.location.href="../首页/homePage.html"
                    }
                    //分类
                    if($(this).children('p').text()=="分类"){
                        $(this).children('img').attr('src','img/fenleiActive_03.png');
                        window.location.href="../分类/classification.html"
                    }
                    //购物车
                    if($(this).children('p').text()=="购物车"){
                        $(this).children('img').attr('src','img/gwcActive_03.png');
                        window.location.href="../购物车/shoppingCart.html"
                    }
                    //我的
                    if($(this).children('p').text()=="我的"){
                        $(this).children('img').attr('src','img/wodeActive_03.png');
//                        window.location.href="../我的/mineSetting.html"
                    }
                })
            },
            //点击人物修复图像
            userImg:function () {
                function getObjectURL(file) {
                    var url = null ;
                    if (window.createObjectURL!=undefined) { // basic
                        url = window.createObjectURL(file) ;
                    } else if (window.URL!=undefined) { // mozilla(firefox)
                        url = window.URL.createObjectURL(file) ;
                    } else if (window.webkitURL!=undefined) { // webkit or chrome
                        url = window.webkitURL.createObjectURL(file) ;
                    }
                    return url ;
                }
                $('#thumbnail').change(function() {
                    $(this).siblings('img').remove();
                    var eImg = $('<img />');
                    eImg.attr('src', getObjectURL($(this)[0].files[0])); // 或 this.files[0] this->input
                    $(this).after(eImg);
                });
            },
            //跳转
            tzhuan:function () {
                //右上角的按钮跳转
                $('.mine_cont_head').click(function () {
                    window.location.href="../我的页面设置/ISetUp.html";
                })
                //我的状态跳转
                $('.mine_cont_three').click(function () {
                    window.location.href="../我的订单/myOrder.html";
                })
                //我的收货地址
                $('#MyDeliveryAddress').click(function () {
                    window.location.href="../收货地址/receivingAddress.html";
                })

            }

        }
        homePage.init();


    })(jQuery)

</script>
</body>
</html>