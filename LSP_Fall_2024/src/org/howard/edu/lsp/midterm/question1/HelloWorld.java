/**
*  Name: Abdulmujeeb Lawal
*/
package org.howard.edu.lsp.midterm.question1;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!!");
	}
}


Question 1.	
a. Firstly a class that manages user fitness shouldn’t have to worry about creating details like username, age, weight and height. That should be handles by a separate class. Also, the user meal part could also be handled by another class. On the flipside, the job of logging workouts and steps seems like a good focus for this class. 

b. To help improve cohesion, I would do something like:
    User Class: This would focus on just user personal details like name, age and weight.
    MealTracker class: this would be focused on handling stuff like counting food calories and then it could be called by another class if needed. 
    Workout tracker: this would be focused on just workouts


Question 2:
i think it should be an abstract class. Firstly, we dont want to make the mistake of creating a student object and then the student isnt in any of the other classes. so for more security an abstract class is better. Also, since basiclaly all the students share the same fucntionality, we can then define same functions in an abstract class without having to worry about mistakenly creating a "student" class since we'd just extend them for each class they students have in the school.

b. it violates the base classes should be abstract heuristic because when we get Third year from Student, that means Student might not be abstract, and subclasses aren't making proper use of inheritance and polymorphism


Question 3: 
a. its is not well-encapsulated because its fields are public. to fix it, i would make all fields private and add some public getter methods for things that may need to be gotten. 


Question 4:
a. The diagram shows between the car and trim levels but this prevents changing the trims at anytime since its set to a trim level at instantiation and cant dynamically change between.

b. I would add a TrimLevel object to the Car class and then also add a method to be able to change it.


Question 5:
a. This can be problematic since it has some dupliate code and this violates Arthur Riel’s design heuristic: “Avoid redundant code by creating shared components”. if in the future a change is to be made to the code, it would have to be made in two different places which makes it slower. To fix it i would use inheritance and then move the code to a superclass and have both class inherit from it so any changes can affect them both. This follows the “Single Responsibility Principle”.


Question 6:
a. its unwise for many reasons. it would actrually lead to a situation where both classes become tighly coupled with the databse and would mean we cant make chnages in one without conidering the other. Therefore lead to a lack of seperation of concerns.


Question 7: 
1. They should have some shared fucntionality
2. reusable code should also be considred to prevent writing code twice.
3. they should have an is-a relationship, like Mazda is  a car 
4. specilaized behaviors should also be considred in a situation where the same call causesdifferente      
behaviors amongs child classes


Question 8:
Inheritance is a relationship where a subclass inherits behavior from a superclass. It’s used when subclasses share common behavior and can extend or modify it. while composition is more of a "has-a" relationship, where a class is composed of other classes (objects) and can then dlegate tasks to them.
I would choose inheritance if i have a need for shared behavior between my classes and i would use polymorphism if i want seperation of concerns and modularity when c reating a program.


Question 9:
Cohesion basically refres to how closely related the functions of a class or module are. high cohesion means that the funcitons of the class and the module closely alsign to the intenion of the class andlow cohesion means the fucnitons and tasks to not closely align to the goal of the class.

High cohesion is better because it make the system easier to maintain and more focused respnsibilities

