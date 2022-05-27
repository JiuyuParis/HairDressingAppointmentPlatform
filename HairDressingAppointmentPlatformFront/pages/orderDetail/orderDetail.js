// pages/orderDetail/orderDetail.js
var utils=require("../../utils/util")
Page({

  /**
   * 页面的初始数据
   */
  data: {
    isLogin:false,
    serviceOrder:null,
    datetime:"",
    serviceOrderId:null,
  },
    //检查用户登陆状态
    checkLogin:function(){
      var _this=this;
      //将登录信息存储到全局变量中
      var app = getApp();
      //如果全局用户信息为空，提醒用户登陆
      if(app.globalData.userInfo==null){
              wx.showModal({
                title: '提示',
                content: '您还未登录是否立即登陆？',
                confirmText:'去登陆',
                success (res) {
                  //如果用户点击确定跳转到登陆界面
                  if (res.confirm) {
                    console.log('用户点击确定登陆');
                    wx.navigateTo({
                      url: '/pages/login/login',
                    });
                  } else if (res.cancel) {//用户不同意登陆，提示无法预定
                    wx.showModal({
                      title: '提示',
                      content: '只有登陆后才可以查看订单哦',
                      showCancel:false,
                      success (res) {
                        if (res.confirm) {
                          console.log('用户点击确定')
                        } else if (res.cancel) {
                          console.log('用户点击取消')
                        }
                      }
                    });
                  }
                }
              })
      }else{
        this.setData({
          isLogin:true
        })
      }
    },
  //查询订单功能
  findServiceOrderById:function(){
    var app=getApp();
    var _this=this;
    wx.request({
      url: 'http://localhost:8080/HAP/order/findServiceOrderById',
      data:{
        serviceOrderId:this.data.serviceOrderId
      },
      success:function(res){
        if(res.data.success){
          if(res.data.success){
            wx.showToast({
              title: res.data.info,
              icon: 'sucess',
              duration: 2000
            });
            _this.setData({
              serviceOrder:res.data.data,
              datetime:utils.formatTime(new Date()).replaceAll("/","-")
            });
            console.log(_this.data.serviceOrder);
          }else{
            wx.showToast({
              title: res.data.info,
              icon: 'error',
              duration: 2000
            })
          }
        }
      }
    })
  },
  //取消订单
  reback:function(e){
    var _this=this;
    wx.showModal({
      title: '提示',
      content: '确定取消订单吗？',
      showCancel:false,
      success (res) {
        if (res.confirm) {
          console.log('用户点击确定');
          wx.request({
            url: 'http://localhost:8080/HAP/order/deleteServiceOrderById',
            data:{
              serviceOrderId:e.currentTarget.dataset.id
            },
            success:function(res){
              if(res.data.success){
                if(res.data.success){
                  wx.showToast({
                    title: res.data.info,
                    icon: 'sucess',
                    duration: 2000
                  });
                  wx.navigateBack({
                    delta: 1,
                  })
                }else{
                  wx.showToast({
                    title: res.data.info,
                    icon: 'error',
                    duration: 2000
                  })
                }
              }
            }
          })
        } else if (res.cancel) {
          console.log('用户点击取消')
        }
      }
    });
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.setData({
      serviceOrderId:options.orderId
    })
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
    this.checkLogin();
    var app=getApp();
    if(app.globalData.userInfo!=null){
      this.findServiceOrderById();
    }
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