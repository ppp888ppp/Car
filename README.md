# Car

 ## Description  
 * This program will create a virtual car that can then be controlled by the user through a menu of different variables.  
 * The car should have an ignition, a color, and a position (given by an x coordinate and a y coordinate).
 * The ignition state and the position state may change during the course of the program’s execution, but the color will stay the same.
 * Before the user is given control of the car via the menu, the car’s attributes should already be assigned (i.e., it will have its ignition set to “off”, it will be given a color, and it will have random position coordinates).  
 * The user will be able to turn the car on or off, and they will also be able to move the car around on a 20x20 grid. The car’s current location will be represented by a char that stands for its color (e.g., “R” for red).  
 * Specific error checking will be expected. The car should be prevented from going out of bounds, for instance. Also, if the ignition is off then the car clearly should not be able to move anywhere.  
 * Lastly, the most current grid and the status of the car should be printed after each user action (i.e., turning the ignition on/off, legal movement of the car, and when the user chooses to quit)
 
 
 
 ## Methods to implement 
 * *public static int randomizePosition* :  Generate a random number between 1 and 20 and then return it.  
     
 * *public static char assignColor* : Return one of the following colors: R, G, B, W, or S. The selection should be random.  
 * *public static boolean ignitionSwitch* : This method should take as its parameter the car’s current ignition switch and then it should return the opposite of that ignition’s value. If the car is off, then this method will return true.  
 * *public static int moveHorizontally* : This method requires the car’s x coordinate, the user’s inputted movement distance, and the ignition state of the car.
    If the ignition is off, then the method should notify the user as such and just return the current, unchanged x coordinate. If the ignition is on, then the method should check to see if the movement is in bounds. If it is, then change the x coordinate and return its value. If it is not in bounds, then notify the user as such and return the unchanged x coordinate.  .  
 
 
 * *public static int moveVertically* : This method requires the car’s y coordinate, the user’s inputted movement distance, and the ignition state of the car. If the ignition is off, then the method should notify the user as such and just return the current, unchanged y coordinate. If the ignition is on, then the method should check to see if the movement is in bounds. If it is, then change the y coordinate and return its value. If it is not in bounds, then notify the user as such and return the unchanged y coordinate.  
* *public static void reportState* : This method will need all of the car’s parameters in order to display the car’s current status and generate the grid correctly (that is, with the car in its position). The status of the car should be properly formatted, so the ignition should not say “true” or “false” but rather “on” or “off”. Similarly with the color of the car, the full word should be spelled out (“Red”, “Green”, “Black”, “White”, or “Silver”). Lastly, the position of the car should be given as an (X, Y) coordinate pair. 


## Let's Play This!
1. First, the car should be “created” through assigning values to its attributes. 
2. the program will present the user with a menu options  
3. As for the movement option, the secondary menu should be generated within the main() method - not in the moveHorizontally() or moveVertically() methods. Once the user makes a valid choice and enters a movement distance, one of the two methods may be called.  
4. for error checking, the program should be able to handle invalid input at the main menu (e.g., the user inputs “zzz”) and print a message to let the user know that what they just entered cannot be accepted. Similar error checking should occur at the movement menu, when the user inputs either “H” or “V”. You may assume that the movement distance will always be an integer, but you cannot assume that the movement will not potentially move the car out of bounds (recall that separate error checking is performed in the two movement methods).


## Example Output  

![turn one](https://user-images.githubusercontent.com/51673576/64370496-932de200-cfec-11e9-859e-9b663fd244c7.JPG)
![movethecar](https://user-images.githubusercontent.com/51673576/64370506-9923c300-cfec-11e9-921b-6ccbbddc6077.JPG)
![result](https://user-images.githubusercontent.com/51673576/64370523-a04ad100-cfec-11e9-8c1d-476d0a6b7e0b.JPG)

