var viewmodel = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "viewmodel",
    curSectionIndex: 0,
    talentList:{},
    business:{},
    businessList:{},
    contractList:{},
    publicList:{},


    ClickMenu:function (index) {
        viewmodel.curSectionIndex =index;
        if (index==0)
        {

            $.ajax({
                type: "get",
                url: "/business/listBusiness",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.businessList = data;
                }
            });
        }
        else if(index==1)
        {
            $.ajax({
                type: "get",
                url: "/business/listContract",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.contractList = data;

                }
            });

        }else if(index==2)
        {
            $.ajax({
                type: "get",
                url: "/business/listUsedTalent",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.talentList = data;

                }
            });
        }
        else if(index==3)
        {
            $.ajax({
                type: "get",
                url: "/business/Publish",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.publicList = data;

                }
            });
        }
    },
    score: function (bid,eid) {
        var sco=prompt("请评分：","默认值");
        $.ajax({
            type: "get",
            url: "/business/score?eid="+eid+"&esco="+sco,    //向springboot请求数据的url
            data: {},
            success: function (data) {
                viewmodel.talentList = data;
            }
        });
    },
    deletepublic: function (eid) {
        $.ajax({
            type: "get",
            url: "/business/deletePublish?eid="+eid,    //向springboot请求数据的url
            data: {},
            success: function (data) {
                viewmodel.publicList = data;
            }
        });
    },
    editpublic: function (bid){
    var time = new Date();
        var ejob=prompt("请输入：","职务");
        var etime=prompt("请输入：","工作时间");
        $.ajax({
            type: "get",
            url: "/business/editpublish?etime="+etime+"&ejob="+ejob,    //向springboot请求数据的url
            data: {},
            success: function (data) {
                viewmodel.publicList = data;
            }
        });
    },
    hello: function (bid) {
    alert("hello");
        alert(bid);
}
});

