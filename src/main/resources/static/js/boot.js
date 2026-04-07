const lines = [
"Initializing system...",
"Loading developer profile...",
"Checking dependencies...",
"Booting modules...",
"Handling exceptions...",
"Exception handled successfully."
];

let index = 0;

const terminal = document.getElementById("terminal");

function typeLine(){

    if(index < lines.length){

        terminal.innerHTML += lines[index] + "\n";

        index++;

        setTimeout(typeLine,700);

    }else{

        setTimeout(()=>{
            window.location.href="/index";
        },1000);

    }

}

typeLine();