// pages/info/info.js
Page({
  /**
   * 页面的初始数据
   */
  data: {
    bannerImgs:["/images/横幅_法式中长发.jpg","/images/横幅_美容.jpg","/images/横幅_美容2.png","/images/横幅_美睫.png","/images/横幅_美发.png"],
    serviceTypes:"",//获取所有服务类型信息条目
    navigateionColors:["red","orange","yellow","green","purple"],//导航颜色
    //默认导航
    serviceTypeId:1,//当前导航
    services: [],//服务项目列表,
  },
  // 切换导航标签
  switchTap:function(e){
    var id=parseInt(e.currentTarget.dataset.id);
    this.setData({
      serviceTypeId:id
    });
    this.queryService();
  },
  //跳转到预定页面
  bookTap:function(e){
    var id=e.currentTarget.dataset.id;
    //跳转预定页
    wx.navigateTo({
      url:"/pages/book/book?id="+id
    })
  },
    //跳转到详情页面
    detail:function(e){
      var id=e.currentTarget.dataset.id;
      wx.navigateTo({
        url:"/pages/detail/detail?id="+id
      })
    },
    //查询所有导航服务项目列表
    queryServiceTypes:function(){
      var _this=this;
      wx.request({
        url: 'http://localhost:8080/HAP/service/queryServiceTypes',
        method:'POST',
        success:function(res){
          if(res.data.success){
            console.log(res.data.infoList);
            console.log(111);
            _this.setData({
              serviceTypes:res.data.infoList,
              serviceTypeId:res.data.infoList[0].id
            });
          }else{
            wx.showToast({
              title: res.data.info,
              icon: 'error',
              duration: 2000
            })
          }
        }
      })
    },
    //根据服务类型查询服务项目
    queryService:function(){
      var _this=this;
      wx.request({
        url: 'http://localhost:8080/HAP/service/queryService?serviceTypeId='+_this.data.serviceTypeId,
        method:'GET',
        success:function(res){
          if(res.data.success){
            _this.setData({
              services:res.data.infoList
            });
          }else{
            wx.showToast({
              title: res.data.info,
              icon: 'error',
              duration: 2000
            })
          }
        }
      })
    },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.queryServiceTypes();
    this.queryService();
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },
})