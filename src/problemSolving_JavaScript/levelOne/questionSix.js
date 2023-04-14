// You just made a new friend at school and he is trying to guess your birthday. He has already
// guessed the month and year of your birth, and is now trying to guess the date d. Write a loop
// to allow your friend to keep guessing until he guesses right. Stop once he has guessed
// correctly. Print out “Incorrect Guess” if the guess is not correct,
// and “Correct Guess” if the guess is correct.
const prompt = require("prompt-sync")();


let date = 13

while(true){
    let guess = prompt("Guess the birth date: ")
    if(guess===date){
        console.log("Correct Guess")
        break;
    }
    else{
        console.log("Incorrect Guess")
    }

}

