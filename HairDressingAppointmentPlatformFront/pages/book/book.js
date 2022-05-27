// pages/book/book.js
var utils=require("../../utils/util")
Page({
  /**
   * 页面的初始数据
   */
  data: {
      serviceId:"",
      date:'2021-11-25',
      time:"19:30",
      phone:"",
      message:"",
      address:"",
      service:{}, //服务项目详情
      user:{}
  },
  // 改变地址函数
  changeAddress:function(e){
    this.setData({
      addressIndex:e.detail.value,
    })
  },
  //改变日期函数
  changeDate:function(e){
    this.setData({
      date:e.detail.value,
    })
  },
  //改变时间函数
  changeTime:function(e){
    this.setData({
      time:e.detail.value,
    })
  },
  getSubject:function(e){
    this.setData({
      phone:e.detail.value
    })
  },
  getTel:function(e){
    this.setData({
      phone:e.detail.value
    })
  },
  getAddress:function(e){
    this.setData({
      address:e.detail.value
    })
  },
  getMessage:function(e){
    this.setData({
      message:e.detail.value
    })
  },
  //查询服务项目详情
  getServiceDetail:function(){
    var _this=this;
    wx.request({
      url: 'http://localhost:8080/HAP/service/queryServiceById',
      method:'GET',
      data:{
        serviceId:_this.data.serviceId
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
  //预定订单添加
  submitReserve:function(){
    var app = getApp();
    if(app.globalData.userInfo==null){
      wx.showModal({
        title:'提示',
        content:'请先登陆',
        confirmText:'去登陆',
        success (res) {
          //如果用户点击确定跳转到登陆界面
          if (res.confirm) {
            console.log('用户点击确定登陆');
            wx.navigateTo({
              url: '/pages/login/login',
            });
          }
        }
      })
    }else{
      var _this=this;
      //进行下单最后提示
      wx.showModal({
        title: '提示',
        content: '确定下单？',
        success (res) {
          //预约
          if (res.confirm) {
            wx.request({
              url: 'http://localhost:8080/HAP/order/addOrder',
              method:"POST",
              data:{
                "serviceId":_this.data.serviceId,
                "userId":app.globalData.userInfo.id,
                "phone":_this.data.phone,
                "address":_this.data.address,
                "date":_this.data.date+" "+_this.data.time,
                "message":_this.data.message
              },
              success:function(res){
                if(res.data.success){
                  wx.showToast({
                    title: res.data.info,
                    icon: 'sucess',
                    duration: 2000
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
          } else if (res.cancel) {
           
          }
        }
      })
    }
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
                    content: '只有登陆后才可以预定哦',
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
        user:app.globalData.userInfo,
        phone:app.globalData.userInfo.phone,
        address:app.globalData.userInfo.address1,
      });
    }
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    //获取当前时间
    var dt=utils.formatTime(new Date()).split(" ");
    //初始相关数据
    this.setData({
      serviceId:options.id,//服务项目id
      date:dt[0].replaceAll("/","-"),
      time:dt[1].substring(0,5)
    });
    //查询服务项目信息
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
    //检查用户登陆状态
    this.checkLogin();
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