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

23b. The name of the methods in the headers and the variables returned in the bodies.

24a.If a call to getPrice can be characterized as “What do tickets cost?” 
how would you characterize a call to getBalance?

24b. "How much is the balance?"

25a.If the name of getBalance is changed to getAmount, does the return 
statement in the body of the method also need to be changed for the code to 
compile? Try it out within BlueJ. What does this tell you about the name of 
an accessor method and the name of the field associated with it?

25b. No, since we just changed the name of the method, meaning no variables were affected
by the minute change.

26a.Add the getter method getTotal to the class TicketMachine to return the 
value of the total field. Check that you have done this correctly by calling 
the method when there are different amounts in the total field.

26b.
   /**
     * Retreive the total amount of money collected by this machine.
     */
    public int getTotal()
    {
        return total;
    }

27a.Try removing the return statement from the body of getPrice. What error 
message do you see now when you try compiling the class?

27b. "not a statement"

28a.Compare the method headers of getPrice and printTicket from the 
TicketMachine class. Apart from their names, what is the main difference 
between them?

28b. one has the keyword "void", meaning no value is presented to the user, whilst the
other has no such keyword, meaning it returns a value ot be displayed.

29a. Do the insertMoney and printTicket methods have return statements? 
Why do you think this might be?

29b.???

31a. Complete the body of the following method, whose purpose is to add the
value of its parameter to a field named score.
 /**
 * Increase score by the given number of points.
 */
 public void increaseScore(int points)
 {
 // TODO: Increase score by the value in points.
 }

31b. 
score = score + points;

32a. The addCredits method is from the Student class in the lab-classes
project from Chapter 1:
 public void addCredits(int additionalPoints)
 {
 credits += additionalPoints;
 }
Is the addCredits method a mutator? If so, how could you demonstrate 
that with a Student object? Try it out.

32b.Yes, because it changes the value stored in a field. In this case, 
the value stored in the field "credits" is modified by adding the inputed 
int value named "additionalPoints".

33a.Complete the following method, whose purpose is to subtract the value
of its parameter from a field named price :
 /**
 * Reduce price by the given amount.
 */
 public void discount(int amount)
 {
     // TODO: Subtract amount from price
 }


33b. price = price - amount; Or? price -= amount;

34a.Write a setter method for a field called age which is of type int. 
Give the parameter the name currentAge.

34b.
public class Student
{
//Fields
private int age;

//Create a new student.
public Student(int ageInYears);
{
 ageInYears = age
 age = 0
}

//Set current age of the student.
 public void currentAge(int age);
{
 age = age
}

35a.Write a setter method for the following field:
private boolean alive;

35b.
/**
     * Set the alive state of the student
     */
    public void alive(boolean alive)
    {
        alive = true;
    }

36a. Modify the constructor TicketMachine so that its parameter is called 
price, and change the assignment to the price field to match 
(price = price). Now create a ticket machine object and bring up an 
inspector. What do you observe in the inspector about the value of the 
price field as a result of this change?

36b.Firstly, the name of the variable in the parameter : "cost" will
end up being useless, since price equals price, you'd also have to change
the name of the variable held in the parenthsis of the constructor method.
Meaning it will go to the standard value set by Java' program, 0. Since
we failed to attribute a value to it.

37a.Write down exactly what will be printed by the following statement:
System.out.println("My cat has green eyes.");

37b.Where? in the method printTicket? Outside by its lonesome? Where???

38a.Add a method called prompt to the TicketMachine class. This should 
have a void return type and take no parameters. The body of the method 
should print the following single line of output:
 Please insert the correct amount of money.

38b.
public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }

39a. What do you think would be printed if you altered the fourth 
statement of printTicket so that price also has quotes around it, as 
follows? System.out.println("# " + "price" + " cents.");

39b.It would print out the string "price" rather than the value of the
field price. So : "# price cents" is the resulting print the caller will
see in the terminal.

40a. What about the following version? 
System.out.println("# price cents.");

40b. It would almost print out the same as in question 29, "# price cents.",
the difference being the period ending the string.

41a.Add a showPrice method to the TicketMachine class. This should have a 
void return type and take no parameters. The body of the method should 
print: “The price of a ticket is xyz cents.” where xyz should be 
replaced by the value held in the price field when the method is called.

41b.
   /**
     * Show the price of tickets for this machine.
     */
    public void showPrice()
    {
        int xyz= price;
        System.out.println("The price of a ticket is " + xyz + " cents.");
    }

42a. Create two ticket machines with differently priced tickets. Do 
calls to their showPrice methods show the same output, or different? 
How do you explain this effect?

42b.They show different outputs, because I associated xyz with the
variable price in the filed named "price". So they simply take the inputed
data from first creating the machine and simpky replace it with it.

43a.Challenge exercise In the printTicket method, replace the statement 
that prints the price of the ticket with the following:
 System.out.printf(“# %d cents.%n”, price);
Note that the call is now to a printf method rather than println. Does 
it print the same output as statement it has replaced? From the line 
that it prints, can you work out what the %d and %n parts mean here?

43b. Yes, it prints the exact same one as the previous method.
I think that "%d" and ".%n" somehow act as the keywords necessary to
use the printf method rather than the printl or maybe it's added to not
confuse the computer since two different methods are being used in the
same method.

44a.Modify the constructor of TicketMachine so that it no longer has a 
parameter. Instead, the price of tickets should be fixed at 1000 cents. 
What effect does this have when you construct ticket-machine objects 
within BlueJ?

44b.The only parameter left is naming the instance created of said objects
and the other methods conform to the modified state of the constructor.

45a. Give the class two constructors. One should take a single parameter 
that specifies the price, and the other should take no parameter and set 
the price to be a default value of your choosing. Test your 
implementation by creating machines via the two different constructors.

45b. I did it! Just remember that there's no need to add anything to the
wrapper, just add the parameter to one and both constructors will be
shown available to pick when you compile. So adding a parameter will
create the second option(or whatever you add or anything to the 
parameters)

46a. Implement a method, empty, that simulates the effect of removing 
all money from the machine. This method should have a void return type, 
and its body should simply set the total field to zero. Does this method 
need to take any parameters? Test your method by creating a machine, 
inserting some money, printing some tickets, checking the total, and then
emptying the machine. Is the empty method a mutator or an accessor?


46b.No, it does not need parameters and this method is a mutator since it
changes the value of total. it is not a accessor since their role is simply
presenting the data stored in the value, without modifying.
Code for the method :
/**
     * Remove all money from the machine.
     */
    public void empty()
    {
        total = 0;
    }


