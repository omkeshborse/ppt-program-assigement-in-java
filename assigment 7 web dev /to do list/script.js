/* select button  */
const addUserBtn = document.querySelector("#addUser") ;
const btnText = addUserBtn.innerText ;
const userNameTextFiled = document.querySelector("#username")
const recordsDisplay = document.querySelector("#records") ;
let edit_id = null ;
let usersArray = [] ;

let objtStr = localStorage.getItem('users') ;
if(objtStr!= null){
usersArray = JSON.parse(objtStr)
// console.log(usersArray)
}

displayInfo() ;
addUserBtn.onclick=() => {
   const Name = userNameTextFiled.value
    if(edit_id!= null) {
      /* edit */ 
      usersArray.splice(edit_id, 1, { name: Name }) ;
      edit_id = null ; 

    }else{
      // inster text
     
      usersArray.push({ name: Name })
    }
    
    console.log(usersArray) ;
    saveInfo(usersArray) ;
    userNameTextFiled.value = '' ;
    
    addUserBtn.innerText = btnText ;
}

function saveInfo(usersArray){
  let str = JSON.stringify(usersArray) ;
 
    localStorage.setItem('users' , str);
    displayInfo() ;
}

function displayInfo(){
    let statement = '' ;
    usersArray.forEach((user , i )=> {
        statement += `<tr>
      <th scope="row">${i + 1}</th>
      <td>${user.name}</td>
      <td><i class="btn text-white fa-solid fa-pen-to-square btn-info mx-2" onclick="editInfo(${i})"></i><i class="btn btn-danger text-white fa-sharp fa-solid fa-trash" onclick="deleteInfo(${i})"></i></td>
      
    </tr>` 
    });
    recordsDisplay.innerHTML = statement ;
}

function editInfo(id) {
    edit_id = id ;
    userNameTextFiled.value  = usersArray[id].name ;
    addUserBtn.innerText = "save changes" ;
}

function deleteInfo(id){
  usersArray.splice(id , 1) ;
  saveInfo(usersArray) ;
  
}