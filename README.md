[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3851584&assignment_repo_type=AssignmentRepo)
# ICS4U OOP Assignment

[*see instructions for details*](Instructions.md)

<img src="https://github.com/SACHSTech/ics4u-oop-assignment-Ethanlai8/blob/main/src/Netflix%Class%Diagram.png">

## Summary
*Include a brief summary that describes your system that your are modelling*

The system that is being modelled is a Netflix database system. The main purpose of this system is to provide users a program that keeps track of what shows or movies they have finished watching. The program is made using five different objects. The objects are known as: Movie, Show, Item, Account, and WatchedList. 

The main object is the Account object. An instance of this object is created everytime a user signs up with a username and password. The Account object also has a WatchedList object as a property. Therefore, whenever an Account is created, a WatchedList object is also created. This is an example of the concept of aggregation.

The WatchedList object contains an arraylist of Item objects. The class that the WatchedList object belongs in also includes multiple methods that allow the program to manipulate the arraylist. For instance, there is a method that allows the user to add movies and shows to their watched list. There is also a method that gives the user recommendations based on their watched list. The purpose of this object is to contain the user's watched movies and shows in an organized list.

The Item object represents each individual movie and show available in the Netflix database. The properties of this object include the title, the genre, the director, the year released, and the rating. This object relates with the objects, Show and Movie, through the concept of inheritance. Every individual movie and show is an item. Each Movie and Show object has their own toString method since they are represented differently as a string. They may also have extra properties. An example of this is the fact that the Show object has an "episodes" property but the Movie object does not.
