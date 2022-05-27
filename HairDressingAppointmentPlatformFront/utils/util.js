const formatTime = date => {
  const year = date.getFullYear()
  const month = date.getMonth() + 1
  const day = date.getDate()
  const hour = date.getHours()
  const minute = date.getMinutes()
  const second = date.getSeconds()

  return `${[year, month, day].map(formatNumber).join('/')} ${[hour, minute, second].map(formatNumber).join(':')}`
}

const formatNumber = n => {
  n = n.toString()
  return n[1] ? n : `0${n}`
}

module.exports = {
  formatTime,
  addressTransfer:addressTransfer
}
//进行地址转换，
function addressTransfer(address,isReplace){
  //设置一个新地址
  var newAddress=[];
  for(var i=0;i<address.length;i++){
    var phone=address[i].phone;
    address[i].phone=phone.replace(phone.substring(3,7),"****");//进行替代加密手机号
    newAddress[i]=address[i].name+"  "+address[i].phone+address[i].province+address[i].city+address[i].addr;
  }
  return newAddress;
}