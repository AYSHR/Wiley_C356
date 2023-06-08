console.log("Starting")

function userLogin(username, pw){
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log("user logged in ");
            resolve({uname: username})
        }, 5000);
    });
}

function getProjectsByUser(username){
    return new Promise((resolve, reject) =>{
        setTimeout(()=>{
            console.log("project are here");
            resolve(["proj1", "proj2", "proj3"])
        },5000);
    });
}

function projDetails(proj){
    return new Promise((resolve, reject) =>{
        setTimeout(()=>{
           resolve("project details")
        },5000);
    });
}


//async await
async function displayUserProjectDetails(){
 try{
    let userName= await userLogin("harry","pw")
    let projects=await getProjectsByUser(userName)
    let proDetails= await projDetails(projects[0])

 }catch(error){
    console.log(error.message)
 }
}

displayUserProjectDetails()


