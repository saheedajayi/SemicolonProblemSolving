// Write a program using loop to print the letters of the word "VENTURES" with two letters in one line.

let letter = "VENTURES"
let length = letter.length - 1
let counter = 0

while(counter <= length){
    console.log(letter.charAt(counter) + letter.charAt(counter+1))
    counter+=2
}