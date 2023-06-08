function parentCall(ev){
    console.log("this is parent");
}

function childCall(ev){
    ev.stopPropgation();
    console.log(ev.currentTarget);
    console.log("this is child");
}

function parentCall2(ev){
    console.log("this is parent");
}

function childCall3(ev){
    console.log("this is child");
}
function childCall2(ev){
    if(true){
        ev.stopImmediatePropgation(); 
    }
   // ev.stopImmediatePropgation();
    console.log(ev.currentTarget);
    console.log("this is child");
}

function anchorEvent(ev){
    ev.preventdefault();
    console.log("event on anchor element");
}

var p1=document.getElementById("parent1");
var c1=document.getElementById("child1");
var p2=document.getElementById("parent2");
var c2=document.getElementById("child2");
var anc=document.getElementById("anc");
var c=document.getElementById("child");

anc.addEventListener("click", anchorEvent);
p1.addEventListener("click",parentCall);
p2.addEventListener("click",parentCall2);
c1.addEventListener("click",childCall);
c2.addEventListener("click",childCall3);

c.addEventListener("click",childCall);
c.addEventListener("click",childCall2);
c.addEventListener("click",childCall3);