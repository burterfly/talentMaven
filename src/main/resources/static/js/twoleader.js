var viewmodel = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "viewmodel",
    curSectionIndex: 0,
    talent:{},
    moneyList:{},
    contractList:{},
    experienceList:{},


    ClickMenu:function (index) {
        viewmodel.curSectionIndex =index;
        if (index==0)
        {
            $.ajax({
                type: "get",
                url: "/talent/listTalent",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.talent = data;
                }
            });
        }
        else if(index==1)
        {
            $.ajax({
                type: "get",
                url: "/talent/listExperience",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.experienceList = data;

                }
            });

        }else if(index==2)
        {
            $.ajax({
                type: "get",
                url: "/talent/listMoney",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.moneyList = data;

                }
            });
        }
        else if(index==3)
        {
            $.ajax({
                type: "get",
                url: "/talent/listContract",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.contractList = data;

                }
            });
        }
        else if(index==4)
        {
            $.ajax({
                type: "get",
                url: "/talent/now",    //向springboot请求数据的url
                data: {},
                success: function (data) {


                }
            });
        }
    }
});

