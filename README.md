Flowchart: https://imgur.com/a/AYFxlPC
Video: https://drive.google.com/file/d/1TnvWsRWvuP_LLiZd6U-vxcTgHBMnvzWS/view?usp=sharing

I selected a sorting algorithm consisting of a for-loop that compares each number by its right-hand neighbor, switching them if it was a smaller 
number. In order to compare all numbers with their neighbors, I encased this for-loop in a while-loop that went through the list again. In effect, 
in the first iteration of the outer while-loop, the smallest number found would be thrown to the end of the list via the for-loop neighbor 
comparisons, then the outer loop would move to its second iteration and so forth until the numbers were properly sorted.

The hardest part was deciding how to convert the user input into something that could be manipulated by loops and then output. This is because 
I chose to use an ArrayList, not realizing there was a much easier way to take the input through RegEx until the next project. As a result, there 
is a lot of extra and complicated code.
