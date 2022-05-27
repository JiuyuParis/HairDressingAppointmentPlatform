// pages/login/login.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    phone:null,
    password:null,
    tip:""
  },
  getPassword:function(e){
    this.data.password=e.detail.value;
  },
  getPhone:function(e){
    this.data.phone=e.detail.value;
  },
   //必填项输入校验
   chekInput:function(e){
    if(e.detail.value==""){
      this.setData({
        tip:"tip:您有必填项未填！"
      })
    }
  },
    //用户登陆方法
    login:function(){
       //检查必填项
    if(this.data.password==null||this.data.phone==null){
      wx.showModal({
        title: '提示',
        content: '您有必填项未填！',
        showCancel:false,
        success (res) {
          if (res.confirm) {
            
          }
        }
      })
    }else{//去请求登陆
      var _this=this;
      console.log(_this.data.phone);
      wx.request({
        url: 'http://localhost:8080/HAP/user/login',
        method:'POST',
        header: {
          'content-type': 'application/x-www-form-urlencoded',
        },
        data:{
          phone:_this.data.phone,
          password:_this.data.password
        },
        success:function(res){
          if(res.data.success){
            wx.showToast({
              title: res.data.info,
              icon:'success',
              duration:2000
            });
            var app=getApp();
            app.globalData.userInfo=res.data.data;
            console.log(app.globalData.userInfo);
            wx.navigateBack({
              delta: 1,
            })
          }else{
            wx.showToast({
              title: res.data.info,
              icon:'error',
              duration:2000
            });
            console.log(_this.data.phone);
          }
        }
      })
    }
    },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {

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