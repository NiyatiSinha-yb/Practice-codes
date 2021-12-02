//Code Signal practice test for YB 

/*
Given an integer n and an array a of length n, your task is to apply the following mutation to a:

Array a mutates into a new array b of length n.
For each i from 0 to n - 1, b[i] = a[i - 1] + a[i] + a[i + 1].
If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it should be set to 0. For example, b[0] should be equal to 0 + a[0] + a[1].
Example

For n = 5 and a = [4, 0, 1, -2, 3], the output should be solution(n, a) = [4, 5, -1, 2, 1].

b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1
So, the resulting array after the mutation will be [4, 5, -1, 2, 1].

Input/Output

[execution time limit] 3 seconds (java)

[input] integer n

An integer representing the length of the given array.

Guaranteed constraints:
1 ≤ n ≤ 103.

[input] array.integer a

An array of integers that needs to be mutated.

Guaranteed constraints:
a.length = n,
-103 ≤ a[i] ≤ 103.

[output] array.integer

The resulting array after the mutation.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

*/

int[] solution(int n, int[] a) {
 int res[]=new int[n];
 if(n==1)
    return a;
 res[0]=a[0]+a[1];
 res[n-1]=a[n-1]+a[n-2];
 for(int i=1; i<n-1; i++)
 {
    res[i]=a[i-1]+a[i]+a[i+1];
     
 }
 return res;
 
}

/* OTHER QUESTIONS*/

/*
You are given three integers in the form of strings: firstnum, secondnum, and thirdnum. Your task is to check whether it is possible to erase at most one digit from firstnum, so that the resulting string contains at least one digit, has no leading zeros and the value of thirdnum is equal to the sum of the values of firstnum and secondnum.

Return true if it's possible, otherwise return false.

Note: All three strings are provided without leading zeros.

Example

For firstnum = "10534", secondnum = "67", and thirdnum = "1120", the output should be solution(firstnum, secondnum, thirdnum) = true.

By erasing the 5th digit of firstnum, the result is 1053, and 1053 + 67 = 1120. So the answer is true.

For firstnum = "10000", secondnum = "67", and thirdnum = "1120", the output should be solution(firstnum, secondnum, thirdnum) = false.

The only possible modified values of firstnum would be 10000 (nothing was deleted), 0000 (first digit was deleted), and 1000 (any zero was deleted); none of which would produce the required sum, so the answer is false.

For firstnum = "1067", secondnum = "33", and thirdnum = "100", the output should be solution(firstnum, secondnum, thirdnum) = false.

We could delete the first digit of firstnum, resulting in 067 (and 67 + 33 = 100), but since in this case new firstnum value has a leading zero, it's considered invalid. So the answer is false.

For firstnum = "153", secondnum = "153", and thirdnum = "306", the output should be solution(firstnum, secondnum, thirdnum) = true.

Because 153 + 153 = 306, there's no need to delete a digit from firstnum, and the result is true.

Input/Output

[execution time limit] 3 seconds (java)

[input] string firstnum

A string representing an integer.

Guaranteed constraints:
2 ≤ firstnum.length ≤ 9.

[input] string secondnum

A string representing an integer.

Guaranteed constraints:
1 ≤ secondnum.length ≤ 9.

[input] string thirdnum

A string representing an integer.

Guaranteed constraints:
1 ≤ thirdnum.length ≤ 9.

[output] boolean

Return true if it's possible to erase at most one digit from firstnum such that the value of thirdnum is equal to the sum of the values of firstnum and secondnum. Otherwise return false.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*/

/*
A text editor is a type of computer program that edits plain text. It consists of a string with a cursor. In the initial state, the string is empty with the cursor at the beginning of the string. Some modern text editors have a clipboard manager - they save a history of copied text.

Your task is to simulate the working process of a text editor with a simple clipboard manager which can handle six types of operations:

TYPE <text> - insert <text> after the current position of the cursor, where <text> consists of at most 50 characters including English letters, digits, whitespaces, and symbols .,?!-. The cursor moves to the end of the inserted text.
SELECT <start_index> <end_index> - select the substring of the current text [text[start_index] ... text[end_index]] (inclusive indices, 0-based) of length end_index - start_index + 1. It is guaranteed that the indices are valid. The cursor changes its position to the end of the selected area.
MOVE_CURSOR <offset> - change the cursor's current position. The <offset> specifies the direction and the value change - if it is negative the cursor moves to the left, and if it's positive the cursor moves to the right. At all times, the cursor is either located at the beginning of the string (before the first character), between two characters, or at the end of the string (after the last character) - the cursor should always be within the text bounds. If the <offset> is larger than the cursor can move, the cursor will move in that direction as much as it can. If there is a selected area, it should be cleared after this operation.
COPY - add the text from the selected area to the clipboard. If there is no selected area then do nothing.
PASTE <steps_back> - insert the copied text from the clipboard manager. The number <steps_back> specifies which of the stored copied texts to insert. If <steps_back> is 1 then insert the last copied text, if it is 2 then insert the text copied before the last, and so on. It <steps_back> is greater than the clipboard history size then ignore this operation. The cursor moves to the end of the inserted text.
PASTE - do the same as if the operation is PASTE 1.
Note: If a selected area is not empty and the next operaion is either TYPE or PASTE then the following updating process is expected during the TYPE or PASTE operation:

Delete the selected text.
Insert the new text in the place of the deleted text.
The cursor position should move to the end of the new text.
You are given operations, an array of strings where each is an operation of one of the six types above. Your task is to find the resulting text after performing the given operations.

Example

For operations = ["TYPE Great Britain is the capital of London", "SELECT 0 12", "COPY", "SELECT 32 37", "COPY", "PASTE 2", "SELECT 0 12", "PASTE", "MOVE_CURSOR 32", "TYPE !"], the output should be solution(operations) = "London is the capital of Great Britain!".

Initially the text is empty,
After the "TYPE Great Britain is the capital of London" operation, the text is "Great Britain is the capital of London|" (where the | symbol represents the cursor position),
After the "SELECT 0 12" operation, the selected text is "Great Britain", the cursor is moved to the end of the selected area "Great Britain| is the capital of London",
After the "COPY" operation, the clipboard is ["Great Britain"], the cursor doesn't move, and the selected area stays the same,
After the "SELECT 32 37" operation, the selected text is "London", the cursor is moved to the end of the selected area "Great Britain is the capital of London|",
After the "COPY" operation, the clipboard is ["Great Britain", "London"], the cursor doesn't move, and the selected area stays the same,
After the "PASTE 2" operation, since there is a selected text, it is deleted and replaced with the text "Great Britain" because it is 2 positions back in the clipboard, the cursor stays after the inserted text, so the text is "Great Britain is the capital of Great Britain|",
After the "SELECT 0 12" operation, the selected text is "Great Britain", the cursor is moved to the end of the selected area "Great Britain| is the capital of Great Britain",
After the "PASTE" operation, since there is a selected text, it is deleted and replaced with the text "London" because it is the last copied text in the clipboard, the cursor stays after the inserted text, so the text is "London| is the capital of Great Britain",
After the "MOVE_CURSOR 32", the cursor moves 32 symbols forward, so the text is "London is the capital of Great Britain|",
After the "TYPE !" operation, the text is "London is the capital of Great Britain!|",
So the final string is "London is the capital of Great Britain!".
Input/Output

[execution time limit] 3 seconds (java)

[input] array.string operations

A sequence of operations. It's guaranteed that all the operations satisfy the format described above.

Guaranteed constraints:
1 ≤ operations.length ≤ 103.

[output] string

The resulting text after performing the given sequence of operations.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}
*/

/*
A sawtooth sequence is a sequence of numbers that alternate between increasing and decreasing. In other words, each element is either strictly greater than its neighbouring elements or strictly less than its neighbouring elements.

examples

Given an array of integers arr, your task is to count the number of contiguous subarrays that represent a sawtooth sequence of at least two elements.

Example

For arr = [9, 8, 7, 6, 5], the output should be solution(arr) = 4.

Since all the elements are arranged in decreasing order, it won't be possible to form any sawtooth subarrays of length 3 or more. There are 4 possible subarrays containing two elements, so the answer is 4.

For arr = [10, 10, 10], the output should be solution(arr) = 0.

Since all of the elements are equal, none of subarrays can be sawtooth, so the answer is 0.

For arr = [1, 2, 1, 2, 1], the output should be solution(arr) = 10.

All contiguous subarrays containing at least two elements satisfy the condition of problem. There are 10 possible contiguous subarrays containing at least two elements, so the answer is 10.

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer arr

An array of integers.

Guaranteed constraints:
2 ≤ arr.length ≤ 105,
-109 ≤ arr[i] ≤ 109.

[output] integer64

Return the number of sawtooth subarrays.

[Java] Syntax Tips

// Prints help message to the console
// Returns a string
// 
// Globals declared here will cause a compilation error,
// declare variables inside the function instead!
String helloWorld(String name) {
    System.out.println("This prints to the console when you Run Tests");
    return "Hello, " + name;
}

*/
