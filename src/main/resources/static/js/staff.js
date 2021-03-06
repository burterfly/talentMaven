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

    AddTalent:function(){
        // 获取弹窗元素
        var modal = document.getElementById("simpleModal");

        // 获取按钮元素
        var modalBtn = document.getElementById("modalBtn");

        // 获取关闭弹窗按钮元素
        var closeBtn = document.getElementsByClassName("closeBtn")[0];

        // 监听打开弹窗事件
        modalBtn.addEventListener("click",openModal);

        // 监听关闭弹窗事件
        closeBtn.addEventListener("click",closeModal);

        // 监听window关闭弹窗事件
        window.addEventListener("click",outsideClick);

        // 弹窗事件
        function openModal () {
            modal.style.display = "block";
        }

        // 关闭弹框事件
        function closeModal () {
            modal.style.display = "none";
        }

        // outsideClick
        function outsideClick (e) {
            if(e.target == modal){
                modal.style.display = "none";
            }
        }
    },
    getQueryVariable:function(variable)
     {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == variable){return pair[1];}
    }
    return(false);
      },

    ClickMenu:function (index) {
        viewmodel.curSectionIndex =index;

        if (index==0)
        {
        }
        else if(index==1)
        {
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

var companymodle = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "companymodle",
    curSectionIndex: 1,
    business:{},
    talentList:{},
    contractList:{},

    AddTalent:function(){
        // 获取弹窗元素
        var modal = document.getElementById("simpleModal");

        // 获取按钮元素
        var modalBtn = document.getElementById("modalBtn");

        // 获取关闭弹窗按钮元素
        var closeBtn = document.getElementsByClassName("closeBtn")[0];

        // 监听打开弹窗事件
        modalBtn.addEventListener("click",openModal);

        // 监听关闭弹窗事件
        closeBtn.addEventListener("click",closeModal);

        // 监听window关闭弹窗事件
        window.addEventListener("click",outsideClick);

        // 弹窗事件
        function openModal () {
            modal.style.display = "block";
        }

        // 关闭弹框事件
        function closeModal () {
            modal.style.display = "none";
        }

        // outsideClick
        function outsideClick (e) {
            if(e.target == modal){
                modal.style.display = "none";
            }
        }
    },
    getQueryVariable:function(variable)
    {
        var query = window.location.search.substring(1);
        var vars = query.split("&");
        for (var i=0;i<vars.length;i++) {
            var pair = vars[i].split("=");
            if(pair[0] == variable){return pair[1];}
        }
        return(false);
    },
    ClickMenu:function (index) {
        viewmodel.curSectionIndex =index;

        if (index==0)
        {
        }
        else if(index==1)
        {
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

