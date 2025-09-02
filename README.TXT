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

12a.

12b.

13a.

13b.

14a.

14b.

15a.

15b.

16a.

16b.

17a.

17b.

18a.

18b.

19a.

19b.

20a.

20b.

21a.

21b.

22a.

22b.

