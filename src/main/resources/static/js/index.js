
'use strict'

window.onload=function (){
    //获得ul的元素
    var imgList=document.getElementById("imgList");
    //获得图片的数组
    var imgArr=document.getElementsByName("banner-img");
    var pageId=document.getElementsByClassName("page");
    var outer=document.getElementsByClassName("idx-banner");
    var allA=document.getElementsByName("page-jump");
    var btnPrev=document.getElementsByClassName("btn prev");
    var btnNext=document.getElementsByClassName("btn next")

    var index=0;
    allA[index].style.backgroundColor="rgba(255,255,255,0.4)";
    for(var i=0;i<allA.length;i++){
        allA[i].num=i;
        allA[i].onclick=function (){
            clearInterval(timer);
            index=this.num;
            setA();
            move(imgList,"left",-1200*index,150,function (){
                autoChange();
            });
        };
    }

    btnPrev[0].onclick=function(){
        clearInterval(timer);
        index--;
        if (index<0){
            index=imgArr.length-1;
            imgList.style.left=-1200*(index)+"px";
            index--;
        }

        move(imgList,"left",-1200*(index),150,function (){
            setA();
            autoChange();
        });
    }
    btnNext[0].onclick=function(){
        clearInterval(timer);
        index++;
        if(index>=imgArr.length){
            index=0;
            imgList.style.left=0;
        }

        move(imgList,"left",-1200*index,150,function (){
            setA();
            autoChange();
        });
    }

    function setA(){
        //当indcx值比图片的数目多的时候 就归0
        if(index>=imgArr.length-1){
            index=0;
            imgList.style.left=0;
        }
        for(var i=0;i<allA.length;i++){
            allA[i].style.backgroundColor="";
        }
        allA[index].style.backgroundColor="rgba(255,255,255,0.4)";
    }
    var timer;
    function autoChange(){
        timer=setInterval(function (){
            index++;
            index%=imgArr.length;
            move(imgList,"left",-1200*index,40,function (){
                setA();
            });
        },4000);
    }
        autoChange();

    //可以根据 target 参数进行判断 向哪个方向移动
    function move(obj,attr,target,speed,callback){
        var current=parseInt(getStyle(obj,attr));
        //根据目标的位置来判定 speed的值是正是负
        if(current>target){
            speed=-speed;
        }
        //自定义对象定时器 防止对象之间的混乱操作
        clearInterval(obj.timer);
        obj.timer=setInterval(function (){
            var oldValue=parseInt(getStyle(obj,attr));
            var newVal=oldValue+speed;
            //如果移动的越界 进行重置
            if((speed<0 && newVal<=target) || (speed>0 && newVal>=target)){
                newVal=target;
            }
            obj.style[attr]=newVal+"px";
            if(newVal==target){
                clearInterval(obj.timer);
                callback && callback();//回掉函数 先判断 有就执行 没有不执行
            }
        },30)
    }

    //obj:获取样式元素
    //name:获取样式名
    function getStyle(obj,name){
        if(window.getComputedStyle){
            return getComputedStyle(obj,null)[name];
        }else{
            return obj.currentStyle[name];
        }
    }
}
