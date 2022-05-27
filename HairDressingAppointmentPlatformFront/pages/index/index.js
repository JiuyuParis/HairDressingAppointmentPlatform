// index.js
// 获取应用实例
const app = getApp()

Page({
  data: {
    msg:"台北下了雪",
    persons:["关晓彤","古力娜扎","王嘉尔","朱丹"],
    student:{id:1,name:"白克力",age:18,class:"三班"},
    isShowImage:false
  },
  onLoad() {

    },
    show:function(){
      //设置数据的标准方法
      this.setData({
        isShowImage:!this.data.isShowImage
      })
    }
})
