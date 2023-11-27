

//DOM Manipulation 

//STYLING ELEMENTS

// const title = document.querySelector('#main-heading'); 
// title.style.color = 'red'; 

// const listItems = document.querySelectorAll
// ('list-items');

// Creating Elements

// const ul = document.querySelector('ul'); 
// const li = document.createElement('li'); 

//Addin Elements

// ul.append(li)

// Modifying the text

// const firstListItem = document.querySelector('.list-items'); 

//Modifying the text 
// li.innerText = 'X-men'; 

//Modifying Attributes

// li.setAttribute('id', 'main-heading'); 
// li.removeAttribute('id'); 

// const title = document.querySelector('#main-heading'); 

// console.log(title.getAttribute('id'));

// li.classList.remove('list-items'); 

// console.log(li.classList.contains('list-items')); 

// Remove Elements 

// li.remove(); 

// Traverse the DOM



// Parent Node Traversal



// console.log(ul.parentNode.parentNode);
// console.log(ul.parentElement.parentNode);

// const html = document.documentElement; 
// console.log(html.parentNode);
// console.log(html.parentElement); 

// Child Node Traversal 


// console.log(ul.childNodes); 
// console.log(ul.firstChild); 
// console.log(ul.lastChild); 

// ul.childNodes[1].style.backgroundColor = 'blue'; 

// console.log(ul.children);
// console.log(ul.cfirstElementChild);
// console.log(ul.lastElementChild);

// Sibling Node Traversal

// let ul = document.querySelector('ul'); 
// const div  = document.querySelector('div'); 

// console.log(div.childNodes); 

// console.log(ul.previousSibling);
// console.log(ul.nextSibling);  

/*
elelment.addEventListner("click", funciton); 

 const buttonTwo = document.querySelector('.btn-2'); 

 function alertBtn(){
    alert('I also love JavaScript'); 
 }

 buttonTwo.addEventListener("click", alertBtn);
*/
/*
const newBackgroundColor = document.querySelector('.box-3'); 

function changeBgColor(){
    newBackgroundColor.style.backgroundColor = 'blue';

}

newBackgroundColor.addEventListener("mouseover", changeBgColor); 
*/

window.addEventListener("click", function(){
    console.log('Window'); 
},true); 

document.addEventListener("click", function(){
    console.log('Document');
},true); 

document.querySelector(".div2").addEventListener
("click", function(){
    console.log('DIV 2'); 
},true); 

// document.querySelector(".dev1").addEventListener
// ("click", function(){
//     console.log('DIV 1'); 
// },true); 

document.querySelector("button").addEventListener
("click", function(e) {
    console.log(e.target.innerText= 'clicked!');
},true); 