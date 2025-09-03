Project: naive-ticket-machine
Authors: David Barnes and Michael Kölling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Seventh edition
   David J. Barnes and Michael Kölling
   Pearson Education

It is discussed in chapter 2.

Purpose of project: To illustrate the basics of fields, constructors, and methods.
How to start this project: Create one or more TicketMachine objects.

Lab (Week 2 for Part 1, Ms.Tessia 101 prog)
(part a is question, part b is answer.)

2a.What value is returned if you get the machine’s balance after it has printed a ticket?

2b. The return value is 0. There is nothing in my balance, even when I added an ammount
bigger than the set price.

3a.Experiment with inserting different amounts of money before printing tickets. 
Do you notice anything strange about the machine’s behavior? What happens if you 
insert too much money into the machine – do you receive any refund? What happens 
if you do not insert enough and then try to print a ticket?

3b.When I inserted more money than neccesery, it wiped away all of my balance
without giving me back the difference between my balance and ticket price.
When I put less than needed, it still printed out a ticket. The machine seems
to always be set to print when the corresponding method is called, no matter what.

5a.Create another ticket machine for tickets of a different price; remember that you
have to supply this value when you create the machine object. Buy a ticket from that 
machine. Does the printed ticket look any different from those printed by the first 
machine? If so, what is different?

5b.The overall form has not changed, the only difference lies in the set price of each
ticket, that I attributed differently for both. The ammount of cents displayed on the
tickets are different because I inputted different values for each ticket machine.

6a. Write out what you think the outer wrappers of the Student and LabClass classes 
might look like; do not worry about the inner part.

6b. (Note* = I forgot to put class after public) 
For student class :
/**
* Create a new Student with a given name and ID number 
*/
public class Student(string fullName, string studentID)
{

}

For lab class :
/**
* Create a new LabClass and input the maximum number of students.
*/
public class LabClass(int maxNumberOfStudents)
{

}

7a. Does it matter whether we write public class TicketMachine or class public 
TicketMachine in the outer wrapper of a class? Edit the source of the TicketMachine 
class to make the change, and then close the editor window. Do you notice a change 
in the class diagram? Do you notice a change in the class diagram? What error message
do you get when you now press the Compile button? Do you think this message clearly 
explains what is wrong? Change the class back to how it was, and make sure that this 
clears the error when you compile it.

7b.Yes it does matter, compiling it when class public is written shows that 8 errors
have been flagged as a result. In the now modified class, its diagram now has red lines
spanning the inside. Its a sign that an error has occured. I recieved 2 different kinds
of errors,the longest one being : "unamed classes are a preview feature and are disabled
by default. (use --enable-preview to enable unamed classes)" and the other one, repeating
7 times : "class, interface, enum, or record expected." To me, this message shows one thing
clear truth, the new phrasing has made my intention, of creating another class, unrecognizable
by the program. Other than that, Im assuming this way of writing the class'outter wrapper is
never the way you should be writing it. 

8a. Check whether or not it is possible to leave out the word public from the outer wrapper of the 
TicketMachine class.

8b.It is possible to have the class function without the modifier "public".

9a. Put back the word public, and then check whether it is possible to leave out the word 
class by trying to compile again. Make sure that both words are put back as they were 
originally before continuing

9b.Nope, the class falls apart and becomes unexecutable without specifying that "TicketMachine"
is a class.

10a.From your earlier experimentation with the ticket machine objects within BlueJ, 
you can probably remember the names of some of the methods – printTicket, for instance.
Look at the class definition in source code and use this knowledge, along with the 
additional information about ordering we have given you, to make a list of the names of
the fields, constructors, and methods in the TicketMachine class. Hint: There is only one
constructor in the class.

10b.List of the names of fields : int price, int balance, int cost and total.
Construtor : TicketMachine.
Methods : getPrice, getBalance, setBalance, insertMoney, printTicket.

11a.What are the two features of the constructor that make it look significantly 
different from the methods of the class?

11b.In the source code for this class, the two features differentiating "TicketMaster"
from the rest is the lack of a lowercase letter in its beginning and the fact its lies in
above everything else in the code, apart from the description of the machine. It's
also found in a different place than the others, rather than being encased in a yellow
rectangle, its intergrated within the outer shell that contains the yellow rectangles.
I believe the yellow rectangles are methods and these methods belong to the "TicketMachine"'s
class constructor. Since the class defines the methods and parameters.

12a.Given that the type of the price field is int, what do you think is the type of each 
of the following fields? : 
1.private int count; 
2.private Student representative;
3.private Server host;

12b. (Note* The class can be a type, these are all declarations of the Class named "..." )
1.integer
2.(Student)
3.(Server)

13a.What are the names of the following fields?
1.private boolean alive;
2.private Person tutor;
3.private Game game;

13b.
1.alive
2.tutor
3.game

14a.From what you know about the naming conventions for classes, which of the type 
names in Exercises 2.12 and 2.13 would you say are class names?

14b.Person,Student,Server,Game

15a. In the following field declaration from the TicketMachine class private int price; 
does it matter which order the three words appear in? Edit the TicketMachine class to try 
different orderings. After each change, close the editor. Does the appearance of the class 
diagram after each change give you a clue as to whether other orderings are possible? Look 
at any error messages that the editor shows you by moving the cursor over the error 
indicator. Make sure that you reinstate the original version after your experiments!

15b.Yes the order extremely matters, it becomes crossed out, meaning it is impossible to call the 
"new TicketMachine(int cost)" method. (Note* Always have the visibility = access modifier first,
then the data type and finally the name of the variable.)

16a.Is it always necessary to have a semicolon at the end of a field declaration? 
Once again, experiment via the editor. The rule you will learn here is an important 
one, so be sure to remember it.

16b. Yes, always. If not included, the program will not be able to compute the program.

17a. Write in full the declaration for a field of type int whose name is status.

17b.private int status;

18a. To what class does the following constructor belong? public Student(String name)

18b.Student

19a.How many parameters does the following constructor have, and what are their types?

public Book(String title, double price)

19b.There are 2 parameters, first one having String and the other as double.

23a.Compare the header and body of the getBalance method with the header 
and body of the getPrice method. What is the one difference between the 
headers and the one difference between the bodies?

23b.

24a.If a call to getPrice can be characterized as “What do tickets cost?” 
how would you characterize a call to getBalance?

24b.

25a.If the name of getBalance is changed to getAmount, does the return 
statement in the body of the method also need to be changed for the code to 
compile? Try it out within BlueJ. What does this tell you about the name of 
an accessor method and the name of the field associated with it?

25b.

26a.Add the getter method getTotal to the class TicketMachine to return the 
value of the total field. Check that you have done this correctly by calling 
the method when there are different amounts in the total field.

26b.

27a.Try removing the return statement from the body of getPrice. What error 
message do you see now when you try compiling the class?

27b.

28a.Compare the method headers of getPrice and printTicket from the 
TicketMachine class. Apart from their names, what is the main difference 
between them?

28b.

29a. Do the insertMoney and printTicket methods have return statements? 
Why do you think this might be?

29b.

31a. Complete the body of the following method, whose purpose is to add the
value of its parameter to a field named score.
 /**
 * Increase score by the given number of points.
 */
 public void increaseScore(int points)
 {
 // TODO: Increase score by the value in points.
 }

30b.

