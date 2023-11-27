//variables 


let btn = document.querySelector('#new-quote'); 
let quote = document.querySelector('.quote'); 
let person = document.querySelector('.person'); 


const quotes = [{
    quote:  `"Lorem ipsum dolor sit amet, consectetur 
    adipiscing elit. Nunc congue mi vel efficitur bibendum."`,
    person: `John Jacob`
}, {
    quote: `Aliquam vitae ante vitae 
    orci dapibus tincidunt eu nec lectus.`, 
    person: `Jingle Heimer`
},{
    quote: `Vestibulum ante ipsum primis in faucibus orci
    luctus et ultrices posuere cubilia curae`,
    person: `Schmidt 's`,
},{
    quote: `Aenean mattis erat eu tristique mollis. Etiam mollis, massa nec pellentesque congue, sem enim venenatis 
    justo, a auctor nulla quam eu eros`,
    person: `Paul Bunyan`
},{
    quote: `Phasellus ligula augue, convallis et 
    vehicula sit amet, tincidunt ac neque`, 
    person: `David Crocket`
},{
    quote: `Lorem ipsum dolor sit amet, consectetur adipiscing elit.`, 
    person: `Arieal Land`
},
];

btn.addEventListener('click', function(){ 

    let random = Math.floor(Math.random() * quotes.length); 

    quote.innerText = quotes[random].quote; 
    person.innerText = quotes[random].person; 

})