# COMP 271 002 F17 Lab 2

# Team project

YOu may work in teams of two but submit individually (see details below)

# Objectives

An understanding of the following concepts and techniques:

- entity objects
- linear search
- binary search
- algorithmic complexity
- arrays versus lists
- [optional values](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
- DRY and factoring out methods
- final-correctness
- automated unit testing using JUnit
- testing for exceptions
- test fixtures and assertions

# Instructions

1. Review the code.
2. Run the code for various inputs to gain an understanding of what it does.
3. Complete the items marked TODO in the code and get the tests to pass.
4. Create a markdown document called Answers.md and answer the questions in the next section.

# Questions

- What is the complexity of each of the four search methods in terms of array or list size n?
- What happens in the case of binary search if the array is not sorted?
- What is the purpose of constructor argument validity checking?
- What is the purpose of using the keyword `final` with variables and arguments?
- What are alternatives to using `Optional` and how do they compare?

# Deliverables and submission

Please submit the following deliverables individually:

- Individual GitHub lab2 repository 
- Individual Sakai submission under "Lab 2":
  - URL of GitHub repository
  - Brief description of your collaboration style and summary of your 
    individual contributions if you worked in a team

# Grading

- 2 Main: eliminate this code duplication
- 2 Team: constructor with validation
- 2 Team: remaining getters
- 2 Search: findTeamPosition for List
- 2 Search: findTeamMinFunding (linear search)
- 4 Search: findTeamMinFundingFast (binary search)
- 2 TestTeam: remaining tests
- 2 TestSearch: makeListFixture
- 4 TestSearch: remaining tests
- 4 correct Gradle-based project structure
- 4 correct use of Git version control
- 10 Written part
  - 6 responses to the questions above
  - 2 grammar and style
  - 2 formatting

*40 points TOTAL*
