var url="./data.json";
let api="https://jsonplaceholder.typicode.com/posts";

/*
fetch(url)
   .then(res => res.json())
   .then(data => {
      displayUserInfo(data)
   })
   .catch(error => console.log(err))


function displayUserInfo(users){
    let userEl=document.getElementById("data");

    let output= "" ;
    for(user of users){
        output +=`<div class="user">
                <div>${user.name}</div>
                <div>${user.email}</div>
                </div>`
    }

    userEl.innerHTML = output;
}

*/

fetch(api)
   .then(res => res.json())
   .then(data => {
      displayUserInfo(data);
   })
   .catch(error => console.log(error));

function displayUserInfo(users) {
    let userEl = document.getElementById("data");

    let output = "";
    for (user of users) {
        output += `<div class="user">
                <div>${user.userId}</div>
                <div>${user.id}</div>
                <div>${user.title}</div>
                <div>${user.body}</div>
                </div>`;
    }

    userEl.innerHTML = output;
}
