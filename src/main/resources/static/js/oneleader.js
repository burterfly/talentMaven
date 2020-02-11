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
                url: "/business/listBusiness?bid="+1,    //向springboot请求数据的url
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
                url: "/business/listContract?bid="+1,    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.contractList = data;

                }
            });

        }else if(index==2)
        {
            $.ajax({
                type: "get",
                url: "/business/listUsedTalent?bid="+1,    //向springboot请求数据的url
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
                url: "/business/Publish?bid="+1,    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.publicList = data;

                }
            });
        }
    }
});

