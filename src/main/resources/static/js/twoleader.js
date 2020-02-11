var viewmodel = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "viewmodel",
    datalist: {},
    curSectionIndex: 0,
    text: "请求数据",

    score: function (bid,eid) {
        alert(bid);
        alert(eid);
        var sco=prompt("请评分：","默认值");
        $.ajax({
            type: "post",
            url: "/business/score?bid="+1+"&eid="+4+"&esco="+sco,    //向springboot请求数据的url
            data: {},
            success: function (data) {
            }
        });
    },
    deletepublic: function (eid) {
        alert(eid);
        $.ajax({
            type: "post",
            url: "/business/deletePublish?bid="+1+"&eid="+3,    //向springboot请求数据的url
            data: {},
            success: function (data) {
            }
        });
    },
    editpublic: function (eid) {
        alert(eid);
        var etime=prompt("请输入：","工作时间");
        var ejob=prompt("请输入：","职务");
        //   alert(sco);
        $.ajax({
            type: "post",
            url: "/business/public?bid="+1+"&etime="+etime+"&ejob="+ejob,    //向springboot请求数据的url
            //   url: "/talent/exit",
            data: {},
            success: function (data) {
                //    alert(data);
                //     $('button').removeClass("btn-primary").addClass("btn-success").attr('disabled', true);
                //     viewmodel.datalist = data;
                //     viewmodel.text = "数据请求成功，已渲染";
            }
        });
    }
});