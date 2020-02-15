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

