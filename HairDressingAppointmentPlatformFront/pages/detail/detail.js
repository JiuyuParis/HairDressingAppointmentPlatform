// pages/detail/detail.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    id:"",
    service:{}
  },
  //跳转到预定界面
  book:function(){
    wx.navigateTo({
      url: '/pages/book/book?id='+this.data.id,
    })
  },
  //查询服务项目详情
  getServiceDetail:function(){
    var _this=this;
    wx.request({
      url: 'http://localhost:8080/HAP/service/queryServiceById',
      method:'GET',
      data:{
        serviceId:_this.data.id
      },
      success:function(res){
        if(res.data.success){
          _this.setData({
            service:res.data.data
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
    this.setData({
      id:options.id
    });
    this.getServiceDetail();
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

  }
})