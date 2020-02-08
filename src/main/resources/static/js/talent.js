/**
 * Created by Intellij IDEA.
 * @Author LUOLIANG
 * @Date 2016/8/2
 * @Comment js文件，用于页面发送ajax请求
 */

//定义一个avalonjs的控制器
var persionView = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "persionView",
    persionData: {},

    request: function (tid) {
        $.ajax({
            type: "post",
            url: "/talent/listTalent?tid="+tid,    //向springboot请求数据的url
            data: {},
            success: function (data) {
                persionView.persionData = data;
            }
        });
    },

});