//以下代码是怎么把JSON转成想要的菜单样式
$(document).ready(function () {
    var member;
    $.ajax({
        // 后台处理程序
        url: "../user/getusermenu",
        // 接受数据格式
        dataType: "json",
        // 设置请求超时时间（毫秒）。
        timeout: 20000,
        // 请求成功后回调函数。
        success: function (dataObj) {
            //member = eval(dataObj);
            //member = JSON.stringify(dataObj);
            //alert(member[1].menuname+"-------"+member[2].menuname);
            //JSON对象转成字符串
            //alert(JSON.stringify(dataObj));
            /*添加无级树*/
            document.getElementById("menuTree").innerHTML = threeLevelTreeMenu(dataObj);
            /*注册事件监听,让超链接标签具备子菜单的事件响应*/
            $("a").on("click",function (){
                $('[data-submenu]').submenupicker();
            });
        }
    });

});


/*获取并渲染三级菜单*/
var str = "<li class='nav-item active'><a class='nav-link' href=\"home.html\">首页<span class='sr-only'>(current)</span></a><li>";
var threeLevelTreeMenu = function (o) {
    //一级菜单
    for (var a = 0; a < o.length; a++) {
        var urlstr = "";
        try {
            if (o[a]["url"] != "/") {
                //明细节点 一级菜单
                urlstr = "<li class='nav-item'><a class='nav-link' href=" + o[a]["url"] + ">" + o[a]["menuname"] + "</a><li>";
            } else {
                //非明细节点  一级菜单
                urlstr = "<li class='nav-item dropdown'> <a class='nav-link dropdown-toggle' href='#' id=menu" + o[a]["menuid"] +
                    " role='button' data-toggle='dropdown' data-submenu='' aria-haspopup='true' aria-expanded='false'>" + o[a]["menuname"] +
                    "</a><div class='dropdown-menu' aria-labelledby='navbarDropdown' >";
                for (var b = 0; b < o[a]["menuList"].length; b++) {

                    if (o[a]["menuList"][b]["url"] != "/") {
                        //明细节点  二级菜单
                        urlstr += "<a class='dropdown-item' href=" + o[a]["menuList"][b]["url"] + ">" + o[a]["menuList"][b]["menuname"] + "</a>";
                    } else {
                        //非明细节点  二级菜单
                        urlstr += "<div class='dropdown dropright dropdown-submenu'><a class='dropdown-item dropdown-toggle' data-toggle='dropdown'>" + o[a]["menuList"][b]["menuname"] + "</a><div class='dropdown-menu'>";
                        //console.log(o[a]["menuList"][b]["menuList"].length);
                        for (var c = 0; c < o[a]["menuList"][b]["menuList"].length; c++) {
                            console.log(o[a]["menuList"][b]["menuList"][c]["menuname"]);
                            //if(o[a]["menuList"][b]["menuList"][c]["url"] !="/"){
                            //明细节点  三级菜单
                            urlstr += "<a class='dropdown-item'  href=" + o[a]["menuList"][b]["menuList"][c]["url"] + ">" + o[a]["menuList"][b]["menuList"][c]["menuname"] + "</a>";
                            //}else{
                            //非明细节点  三级菜单
                            //}
                        }
                        urlstr += "</div></div>";
                    }
                    //str += urlstr;
                }
                urlstr += "</div></li>";
            }
            str += urlstr;
        } catch (e) {
            console.log("oneLevelErr:" + e.toString());
        }
    }
    //console.log(str);
    return str;
}