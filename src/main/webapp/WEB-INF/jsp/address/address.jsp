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
    <title>æ°å¢æ¶è´§å°å</title>
    <link rel="stylesheet" href="../comstyle/reset.css">
    <link rel="stylesheet" href="city-menu.css">
    <style>
        .addRess_nav{
            position: fixed;
            top: 0;
            left: 0;
            right: 0;
            text-align: center;
            line-height: 40px;
            font-size: 1rem;
            background-image: radial-gradient(500px at left top,#70bfea,#A1D1EA);
            border-bottom: 1px solid #ddd;
            color: #fff;
            font-weight: bold;
        }
        .addRess_nav>img{
            position: absolute;
            left: 0;
            top: 0;
            padding: 13px 20px;
            width: 8px;
        }
        /*åå®¹åº*/
        .addRess_cont{
            margin-top: 42px;
            font-size: 0.9rem;
        }
        .addRess_cont>div{
            height: 46px;
            line-height: 46px;
            background: #fff;
            border-bottom: 1px solid #ddd;
            box-sizing: border-box;
            -webkit-box-sizing: border-box;
            overflow: hidden;
        }
        .addRess_cont>div input{
            width: 100%;
            height: 100%;
            border: 0;
            background: transparent;
            padding: 0 15px;
        }
        .addRess_cont_region,.addRess_cont_street{
            padding: 0 15px;
        }


    </style>
</head>
<body>
<div class="addRess_nav"><img src="img/zfx_03.png" id="addRess_nav_return"/>æ°å¢æ¶è´§å°å</div>
<div class="addRess_cont">
    <div><input type="text" placeholder="æ¶è´§äººå§å"/></div>
    <div><input type="text" placeholder="å«åï¼å°åï¼"/></div>
    <div><input type="text" placeholder="ææºå·ç "/></div>
    <div><input id="address1" class="pla" type="text" readonly="readonly" placeholder="è¯·éæ©å°åº"/></div>
    <!--<div class="addRess_cont_street">è¡é</div>-->
    <div><input type="text" placeholder="è¯¦ç»å°å"/></div>
</div>



<script src="../comstyle/jquery-1.11.3.js"></script>
<script src="city-menu.js"></script>
<script src="city-data1.js"></script>
<script>
    var addRess={
        init:function () {
            this.addRess_nav_return();
            this.dizhi();
        },
        addRess_nav_return:function () {
            $('#addRess_nav_return').click(function () {
                window.location.href="../æ¶è´§å°å/receivingAddress.html";
            })
        },
        dizhi:function () {
            var addrFun = new LArea();
            addrFun.init({
                'trigger':'#address1',  //è§¦åéæ©æ§ä»¶çææ¬æ¡ï¼åæ¶éæ©å®æ¯ånameå±æ§è¾åºå°è¯¥ä½ç½®
                'valueTo':'#addressVal1',  //éæ©å®æ¯åidå±æ§è¾åºå°è¯¥ä½ç½®
                'keys':{
                    id:'id',
                    name:'name'
                },  //ç»å®æ°æ®æºç¸å³å­æ®µ idå¯¹åºvalueToçvalueå±æ§è¾åº nameå¯¹åºtriggerçvalueå±æ§è¾åº
                'type':1,   //æ°æ®æºç±»å
                'data':LAreaData  //æ°æ®æº
            });
        }
    }
    addRess.init();



</script>

</body>
</html>