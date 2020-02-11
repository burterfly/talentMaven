/**
 * Created by Intellij IDEA.
 * @Author LUOLIANG
 * @Date 2016/8/2
 * @Comment js文件，用于页面发送ajax请求
 */
/**
 * 控制子模块显影的
 * @type {Observer}
 */
var viewmodel = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "viewmodel",
    curSectionIndex: 0,
    business:{},
    talentList:{},
    contractList:{},

    ClickMenu:function (index) {
        viewmodel.curSectionIndex =index;
        if (index==0)
        {
            $.ajax({
                type: "get",
                url: "/staff/User",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.talentList = data;
                }
            });
        }
        else if(index==1)
        {
            $.ajax({
                type: "get",
                url: "/staff/Company",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.business = data;

                }
            });
        }else if(index==2)
        {
            $.ajax({
                type: "get",
                url: "/staff/Contract",    //向springboot请求数据的url
                data: {},
                success: function (data) {
                    viewmodel.contractList = data;

                }
            });
        }
    }
});

