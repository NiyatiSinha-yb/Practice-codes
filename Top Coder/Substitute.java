//https://arena.topcoder.com/#/u/practiceCode/1282/1262/1333/2/1282

/*
Problem Statement
A simple, easy to remember system for encoding integer amounts can be very useful. For example, dealers at flea markets put the information about an item on a card that they let potential buyers see. They find it advantageous to encode the amount they originally paid for the item on the card.
A good system is to use a substitution code, in which each digit is encoded by a letter. An easy to remember 10-letter word or phrase, the key, is chosen. Every '1' in the value is replaced by the first letter of the key, every '2' is replaced by the second letter of the key, and so on. Every '0' is replaced by the last letter of the key. Letters that do not appear in the key can be inserted anywhere without affecting the value represented by the code.. This helps to make the resulting code much harder to break (without knowing the key).

Create a class Substitute that contains the method getValue that is given the s key and code as input and that returns the decoded value.

Definition
Class: Substitute
Method: getValue
Parameters: String, String
Returns: int
Method signature: int getValue(String key, String code)
(be sure your method is public)
Limits
Time limit (s): 840.000
Memory limit (MB): 64
Constraints
- code contains between 1 and 9 characters inclusive, all uppercase letters 'A'-'Z'
- code contains at least one letter that is found in key
- key contains exactly 10 uppercase letters 'A'-'Z', all distinct from each other
Examples
0)
"TRADINGFEW"
"LGXWEV"
Returns: 709
The L,X, and V are ignored since they do not appear in the key. G is the seventh letter in the key, W is the 10th letter, and E is the 9th letter.
1)
"ABCDEFGHIJ"
"XJ"
Returns: 0
2)
"CRYSTALBUM"
"MMA"
Returns: 6
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
*/

public class Substitute
    {
    public int getValue(String key, String code)
        {
        	int res=0;
        	for( int i =0; i<code.length(); i++)
                {
                	if(key.indexOf(code.charAt(i))==key.length()-1)
                        {
                        	res=10*res+0;
                        }
                	else if(key.indexOf(code.charAt(i))>=0)
                        {
                        	res=10*res+(1+key.indexOf(code.charAt(i)));
                        }
                }
        	return res;
        }
    }
