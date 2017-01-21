#Instructions
1. Fork this repo into your own github account
2. Complete the task (TODO tags in the project and in the comments)
3. Commit your code to your fork (we want to be able to see your source code!)
4. Submit a publicly viewable link to your forked repo in the application form
5. If you have any comments or assumptions, add them to this README.md file

#Task
Using good coding practice and techniques, implement the functions of the simple calculator. 
The manditory functions are the +,-,x and / while the other ones are optional and for you to
show off your mad skills (e.g. trig functions, hex calculator, exp functions, etc.).

#Your comments or assumptions
- assuming there is a class called 'AnswerActivity' that retrieves and displays 
  the numerical output 
- assumes onClick() produces the numerical output of the function without 
  pressing an equals '=' button
- assuming the input buttons can only be numbers. If this assumption is wrong
  and there are input buttons like '.' or 'sqrt' then I would add a try-catch to catch exception thrown by lines
  int firstInput = Integer.parseInt(editText1.getText().toString()); and/or 
  int secondInput = Integer.parseInt(editText2.getText().toString()); for inputs that can't be properly converted to int
