#Closest Sequence 2 Challenge
Source for challenge: https://codefights.com/challenge/Qjts7cukDvYpDW4Bc
Challenge was:

The difference between two sequences of the same length a1, a2, a3,..., an and b1, b2, b3,..., bn can be defined as the sum of absolute differences between their respective elements:

diff(a, b) = |a1 - b1| + |a2 - b2| + ... + |an - bn|.

For the given sequences a and b (not necessarily having the same lengths) find a subsequence b' of b such that diff(a, b') is minimal. Return this difference.

Example

For a = [1, 2, 6] and b = [0, 1, 3, 4, 5], the output should be
closestSequence2(a, b) = 2.

The best subsequence will be b' = [1, 3, 5] which has a difference of 2 with a.

Input/Output

[time limit] 3000ms (java)
[input] array.integer a

Constraints:
3 ≤ a.length ≤ 1000,
-1000 ≤ a[i] ≤ 1000.

[input] array.integer b

Constraints:
a.length ≤ b.length ≤ 1000,
-1000 ≤ b[i] ≤ 1000.

[output] integer

##Result:
10/10
All tests passed
Sample tests: 5/5
Hidden tests: 5/5
Score: 300/300
