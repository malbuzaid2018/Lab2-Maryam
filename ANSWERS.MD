### What is the complexity of each of the four search methods in terms of array or list size n?

1. findTeamPosition - The notation O(n) grows linearly and in direct proportion to the size of the array

2. findTeamPosition - The notation O(n) grows linearly and in direct proportion to the size of the array

3. findTeamMinFunding - The notation O(n) grows linearly and in direct proportion to the size of the array

4. findTeamMinFundingFast - The notation O(log n), because we are not searching through every element of the array. We are splitting the number of elements in half everytime we want to search until we can't do it any more. The growth flattens out as the size of the data set grows while on peak at the start. 

### What happens in the case of binary search if the array is not sorted?

It would not work. Binary search works by splitting the number of elements in an array in half and comparing the "middle value". So, when the array is unsorted ten we wont be able to perform binary search because the array half cannot be determined properly.

### What is the purpose of constructor argument validity checking?

Validity checking will make the program fail quickly and can provide detailed exceptions and error messages. We want to caught the invalid parameters first as we dont want to detect them afterwards when they have got much harder to detect in the program.


### What is the purpose of using the keyword final with variables and arguments?

It is good practice to use the keyword final so the compiler can easily check for undesirable/illegal assignments and throw exceptions and errors. While declaring the variable final we are making sure that the variable cannot be modified after the initial assignment.


### What are alternatives to using Optional and how do they compare?

Traditionally programmers use conditional statements to check whether or not a value is null. These null checks are important because if a program tries to reference a null value, it will get a NullPointerException and stop running. Optional also clarifies the programmer's intent and can decrease the amount of null values that can cause problems later. Moreover, optional creates a scenario for the programmer where it is ok for the value to be null/missing.