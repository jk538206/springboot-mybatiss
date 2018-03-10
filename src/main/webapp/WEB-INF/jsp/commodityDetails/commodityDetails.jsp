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
    <title>Title</title>
    <link rel="stylesheet" href="../comstyle/reset.css">
    <style>
        .spDetails_nav{
            width: 100%;
            height: 40px;
            background: #fff;
            font-size: 1rem;
            line-height: 40px;
            position: fixed;
            text-align: center;
            top: 0;
            left: 0;
            right: 0;
        }
        .spDetails_nav>img{
            width: 8px;
            position: absolute;
            left: 0;
            top: 0;
            padding: 12px 20px;
        }
        .spDetails_pigImg{
            width: 100%;
            background: #fff;
            margin-top: 40px;
        }
        .spDetails_pigImg>img{
            display: block;
            width: 70%;
            margin: 0 auto;
        }
        /*åå®¹ç®ä»*/
        .spDetails_content{
            font-size: 0.8rem;
            color: #666;
        }
        .spDetails_content>p{
            background: #fff;
            padding: 0 15px;
        }
        .spDetails_c_first{
            line-height: 30px;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .spDetails_c_first>span{
            width: 50%;
            float: left;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .spDetails_c_first>span:nth-child(2){
            text-align: right;
            color: #bbb;
        }
        /*ç¬¬äºå±*/
        .spDetails_c_second{
            line-height: 30px;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .spDetails_c_second>span:first-child{
            font-size: 1rem;
            color: #fa0002;
        }
        .spDetails_c_second>del{
            color: #bbb;
        }
        .spDetails_c_second>span:last-child{
            display: inline-block;
            width: 30px;
            height: 20px;
            background: #fa0002;
            color: #fff;
            font-size: 0.7rem;
            line-height: 20px;
            text-align: center;
        }
        /*ç¬¬ä¸å±*/
        .spDetails_c_third{
            text-indent:25px;
            line-height: 22px;
        }
        /*ç¬¬åå±*/
        .spDetails_c_fourth{
            line-height: 40px;
            color: #aaa;
            border-bottom: 1px solid #ddd;
        }
        .spDetails_c_fourth>span{
            display: inline-block;
            float: left;
            padding-left: 30px;
            background: url("img/bgdui_03.png") no-repeat 10px center;
            background-size: 13px;
        }
        /*ç¬¬äºå±*/
        .spDetails_c_fifth{
            line-height: 40px;
            font-weight: bold;
            font-size: 0.9rem;
        }
        .spDetails_c_sixth,.spDetails_c_seventh{
            line-height: 32px;
            height: 32px;
        }
        .spDetails_c_sixth>span,.spDetails_c_seventh>span{
            width: 50%;
            display: block;
            float: left;
            color: #aaa;
        }
        .spDetails_c_seventh{
            margin-bottom: 8px;
        }

        /*ç­é¨æ¨è*/
        .spDetails_hotSpot{
            background: #fff;
            margin-bottom: 60px;
        }
        .spDetails_hotSpot_head{
            line-height: 40px;
            padding: 0 15px;
            font-size: 0.9rem;
            font-weight: bold;
            color: #666;
            position: relative;
            border-bottom: 2px solid #dedede;
        }
        .spDetails_hotSpot_head>span{
            position: absolute;
            right: 0;
            top: 0;
            padding: 0 20px;
            color: #999;
            font-size: 0.8rem;
            font-weight: 200;
        }

        .spDetails_hotSpot_cont{
            width: 95%;
            margin: 0 auto;
            background: #fff;
            height: 243px;
        }
        .spDetails_hotSpot_cont>div{
            width: 44%;
            float: left;
            margin: 5px 3%;
            background: #fff;
            font-size: 0.8rem;
            height: 100%;
            position: relative;
        }
        .spDetails_hotSpot_cont>div>img{
            width: 100%;
        }
        .spDetails_hotSpot_text{
            color: #666;
            line-height: 22px;
            text-indent: 25px;
        }
        .spDetails_hotSpot_money{
            line-height: 30px;
            position: absolute;
            bottom: 5px;
            left: 0;
            right: 0;
        }
        .spDetails_hotSpot_money>span:first-child{
            display: inline-block;
            width: 40%;
            height: 22px;
            border: 1px solid #aaa;
            line-height: 22px;
            text-align: center;
            color: #fa7e79;
        }
        .spDetails_hotSpot_money>span:nth-child(2){
            display: inline-block;
            float: right;
            color: #999;
        }


        /*åºé¨*/
        .details_foot{
            position: fixed;
            bottom: 0;
            right: 0;
            left: 0;
            width: 100%;
            height: 50px;
            border-top: 1px solid #aaa;
            background: #fff;
        }
        .details_foot>div{
            float: left;
            text-align: center;
            font-size: 0.8rem;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
            color: #666;
        }
        .details_foot_homePage,.details_foot_collect{
            width: 15%;
        }
        .details_foot>div.details_foot_gwc,.details_foot>div.details_foot_gm{
            width: 35%;
            line-height: 50px;
            color: #fff;
            font-weight: bold;
            font-size: 0.9rem;
        }
        .details_foot_homePage{
            padding: 0 5px;
            line-height: 25px;
            border-right: 1px solid #aaa;
        }
        .details_foot_collect{
            
        }
        .details_foot_collect img{
            width: 20px;
            padding-top: 5px;
        }
        .details_foot_gwc{
            background: #80c4ea;
            position: relative;
        }
        .details_foot_gm{
            background: #fa0002;
        }

        /*è´­ä¹°æ¨¡æ*/
        .buy_modal{
            position: fixed;
            left: 0;
            top: 0;
            right: 0;
            bottom: 0;
            width: 100%;
            height: 100%;
            background: rgba(0,0,0,.3);
            z-index: 20;
            display: none;
        }
        .buy_modal_box{
            background: #fff;
            width: 100%;
            position: absolute;
            bottom: 0;
            left: 0;
            right: 0;
        }
        .buy_modal_boxTop{
            line-height: 55px;
            border-bottom: 1px solid #f3f3ff;
        }
        .buy_modal_boxTop>div{
            width: 50%;
            float: left;
        }
        .buy_modal_boxTop>div:first-child{
            padding-left: 15px;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .buy_modal_boxTop>div:nth-child(2){
            text-align: right;
        }
        .buy_modal_boxTop>div:nth-child(2) input{
            width: 26px;
            height: 26px;
            border: 1px solid #eee;
            position: relative;
            top: -2px;
            background: #f7f7ff;
            color: #333;
            text-align: center;
            font-size: 0.8rem;
        }
        .buy_modal_boxTop>div:nth-child(2) span{
            display: inline-block;
            font-size: 1.2rem;
            margin: 0 20px;
            width: 26px;
            height: 26px;
            background: #f7f7ff;
            line-height: 24px;
            text-align: center;
            border: 1px solid #eee;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .buy_modal_boxCenter{

        }
        .buy_modal_boxCenter{
            line-height: 55px;
        }
        .buy_modal_boxCenter>div{
            width: 50%;
            float: left;
            overflow: hidden;
            text-overflow:ellipsis;
            white-space: nowrap;
        }
        .buy_modal_boxCenter>div:first-child{
            padding-left: 15px;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .buy_modal_boxCenter>div:nth-child(2){
            text-align: right;
            padding-right: 20px;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
        }
        .buy_modal_boxCenter>div:nth-child(2) span{
            color: #d61b1d;
            font-size: 0.9rem;
        }

        .buy_modal_boxBtn{
            width: 100%;
            height: 50px;
            background: #fa0002;
            color: #fff;
            font-weight: bold;
            font-size: 1rem;
            text-align: center;
            line-height: 50px;
        }
        .bgcolor_eee{
            background: #eee !important;
        }


    </style>
</head>
<body>
<div class="spDetails_nav"><img src="img/zfion_04.png" class="spDetails_nav_return"/>ååè¯¦æ</div>
<!--å¤§å¾-->
<div class="spDetails_pigImg">
    <img src="img/zhurou_03.png"/>
</div>
<!--ç®ä»-->
<div class="spDetails_content">
    <!--ç¬¬ä¸å±-->
    <p class="spDetails_c_first">
        <span>çªèç²¾è500g</span>
        <span>ééï¼659</span>
    </p>
    <!--ç¬¬äºå±-->
    <p class="spDetails_c_second">
        <span>ï¿¥<span class="presentPrice">16.66</span></span>
        <del>ï¿¥19.66</del>
        <span>ç¹ä»·</span>
    </p>
    <!--ç¬¬ä¸å±-->
    <p class="spDetails_c_third">çè§å¥½çè¿æ¯ç­åçç©ºé´åæ¥ï¼çæ¹å¼å°æ¹ï¼æ°´çµè´¹ï¼çµé£æï¼åï¼å¤å°ï¼èå¾·ï¼å¯¹åççåççï¼å°æ¹ï¼ç¨ç­ï¼æ¾æ¾çæ¹æ³</p>
   <!--ç¬¬åå±-->
    <p class="spDetails_c_fourth clear">
        <span>ä¸ä¸ªå°æ¶åè´§</span>
        <span>éè´§å°å®¶</span>
    </p>
    <!--è§æ ¼åæ°-->
    <!--ç¬¬äºå±-->
    <p class="spDetails_c_fifth">è§æ ¼åæ°</p>
    <!--ç¬¬å­å±-->
    <p class="spDetails_c_sixth">
        <span>äº§å°ï¼æ¬å°</span>
        <span>åè£ï¼æ£è£</span>
    </p>
    <!--ç¬¬ä¸å±-->
    <p class="spDetails_c_seventh">
        <span>åå«éï¼500g</span>
        <span>å¨èæ¹å¼ï¼å·è</span>
    </p>
</div>
<div class="spDetails_hotSpot">
    <p class="spDetails_hotSpot_head">ç­é¨æ¨è<span>æ´å¤</span></p>
    <div>
        <div class="spDetails_hotSpot_cont clear">
            <div>
                <img src="img/zhurou_03.png"/>
                <p class="spDetails_hotSpot_text">æ°é²çªèç²¾èçªè¹èçªèç²¾èçªè¹è</p>
                <p class="spDetails_hotSpot_money">
                    <span>ï¿¥15.55</span>
                    <span>ééï¼269</span>
                </p>
            </div>
            <div>
                <img src="img/zhurou_03.png"/>
                <p class="spDetails_hotSpot_text">æ°é²çªèç²¾èè</p>
                <p class="spDetails_hotSpot_money">
                    <span>ï¿¥15.55</span>
                    <span>ééï¼269</span>
                </p>
            </div>
        </div>
    </div>
</div>


<!--footeræé®-->
<div class="details_foot">
    <div class="details_foot_homePage">åå°é¦é¡µ</div>
    <div class="details_foot_collect">
        <img src="img/shouc_07.png"/>
        <p>æ¶è</p>
    </div>
    <!--<div>å®¢æ</div>-->
    <div class="details_foot_gwc">å å¥è´­ç©è½¦</div>
    <div class="details_foot_gm">è´­ä¹°</div>
</div>

<!--è´­ä¹°æ¨¡æ-->
<div class="buy_modal">
    <div class="buy_modal_box">
        <div class="buy_modal_boxTop clear">
            <div>è´­ä¹°æ°é</div>
            <div><span class="buy_toReduce bgcolor_eee">-</span><input type="number"  value="1" class="buy_input"/><span class="buy_add">+</span></div>
        </div>

        <div class="buy_modal_boxCenter clear">
            <div>XXXXçªèçªè</div>
            <div>ä»·æ ¼ï¼<span class="pricesShown">0</span></div>
        </div>

        <div class="buy_modal_boxBtn">ç¡®å®</div>
    </div>
</div>


<script src="../comstyle/jquery-1.11.3.js"></script>
<script>
    (function () {
        var commod = {
            init: function () {
                this.jumpPage();
                this.commodModal();
                this.commdGWC();
            },
            //è·³è½¬é¡µé¢
            jumpPage: function () {
                $('.spDetails_nav_return').on('touchend',function () {
                    window.location.href = "../åç±»/classification.html";
                })
                //è·³å°é¦é¡µ
                $('.details_foot_homePage').on('touchend',function () {
                    window.location.href="../é¦é¡µ/homePage.html";
                })
            },
            //æ¨¡æéé¢çæä½
            commodModal: function () {
                function bgColor(value) {
                    if(value==1){
                        $('.buy_toReduce').addClass('bgcolor_eee');
                    }else {
                        $('.buy_toReduce').removeClass('bgcolor_eee');
                    }
                    if(value==99){
                        $('.buy_add').addClass('bgcolor_eee');
                    }else {
                        $('.buy_add').removeClass('bgcolor_eee');
                    }
                }

                //åå°æé®
                $('.buy_toReduce').on('touchend', function () {
                    var value = parseInt($(this).siblings('.buy_input').val());
                    value = value - 1;
                    if (value < 1) {
                        value = 1;
                    }
                    $(this).siblings('.buy_input').val(value);
                    bgColor(value);
                    pice(value)
                })
                //å¢å æé®
                $('.buy_add').on('touchend', function () {
                    var value = parseInt($(this).siblings('.buy_input').val());
                    value = value + 1;
                    if (value > 99) {
                        value = 99;
                    }
                    $(this).siblings('.buy_input').val(value);
                    bgColor(value);
                    pice(value)
                })
                //ç¹å»é¤äºåå®¹ä»¥å¤çå°æ¹å³é­æ¨¡æ
                $(document).bind("click", function (e) {
                    var target = $(e.target);
                    if (target.closest(".buy_modal_box").length == 0 && target.closest(".details_foot_gm").length == 0) {
                        $('.buy_modal').fadeOut(200);
                    }
                });
                //ç¹å»è´­ä¹°æé®å¼¹åºæ¨¡æ
                $('.details_foot_gm').on('touchend', function () {
                    $('.buy_modal').fadeIn(200);
                })
                //çå¬inputåå®¹å¼æ¹åçäºä»¶
                $('.buy_input').on('input propertychange', function () {
                    var value = parseInt($(this).val())

                    if (isNaN(value)) {
                        value = 1
                    }
                    if (value < 1) {
                        value = 1
                    }else if (value > 99) {
                        value = 99
                    }
                    $(this).val(value);
                    bgColor(value);
                    pice(value);
                })
                //æ¾ç¤ºçä»·æ ¼
                function pice(value) {
                    var pic=parseFloat($('.presentPrice').text());
                    var pice=value*pic;
                    pice=pice.toFixed(2);
                    $('.pricesShown').text(pice);
                }
                pice(1);
            },
            //è´­ç©è½¦
            commdGWC:function () {
                $('.details_foot_gwc').on('touchend',function () {
                    var html="<span style='color: #fa766c;position: absolute;width: 100%;left: 0;top: 0;text-align: center;' class='gwc_text'>æ·»å æå</span>";
                    $(this).append(html);
                    $('.gwc_text').animate({
                        top:'-60px',
                        opacity:'0',
                    },2000,function () {
                        $(this).remove();
                    })
                })
            }
        }
        commod.init()
    })(jQuery)



</script>
</body>
</html>