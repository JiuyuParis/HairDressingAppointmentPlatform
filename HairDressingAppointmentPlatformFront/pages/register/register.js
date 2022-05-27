// pages/register/register.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    user:{
      username:null,
      password:null,
      height:null,
      weight:null,
      vip:0,
      address1:"",
      phone:"",
      money:0
    },
    tip:""
  },
  getUserName:function(e){
    this.data.user.username=e.detail.value;
  },
  getPassword:function(e){
    this.data.user.password=e.detail.value;
  },
  getHeight:function(e){
    this.data.user.height=e.detail.value;
  },
  getWeight:function(e){
    this.data.user.weight=e.detail.value;
  },
  getAddress1:function(e){
    this.data.user.address1=e.detail.value;
  },
  getAddress1:function(e){
    this.data.user.address1=e.detail.value;
  },
  getPhone:function(e){
    this.data.user.phone=e.detail.value;
  },
  //必填项输入校验
  chekInput:function(e){
    if(e.detail.value==""){
      this.setData({
        tip:"tip:您有必填项未填！"
      })
    }
  },
  //用户注册方法
  register:function(){
    //检查必填项
    if(this.data.user.username==null||this.data.user.password==null||this.data.user.phone==null){
      wx.showModal({
        title: '提示',
        content: '您有必填项未填！',
        showCancel:false,
        success (res) {
          if (res.confirm) {
            
          }
        }
      })
    }else{//去请求注册
      var _this=this;
      wx.request({
        url: 'http://localhost:8080/HAP/user/addUser',
        data:this.data.user,
        method:'POST',
        success:function(res){
          if(res.data.success){
            wx.showToast({
              title: res.data.info,
              icon:'success',
              duration:2000
            });
          }else{
            wx.showToast({
              title: res.data.info,
              icon:'error',
              duration:2000
            });
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