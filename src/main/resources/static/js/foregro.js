var viewmodel = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "viewmodel",
    curSectionIndex: 1,
    a:2,
    ClickMenu:function (index) {
        viewmodel.curSectionIndex = index;
    },
    Menu:function (s) {
        viewmodel.a = s;
        $.ajax({
            type: "get",
            url: "/foregro/toregister",    //向springboot请求数据的url
            data: {},
            success: function (data){ }

        });
    }
});




