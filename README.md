Ellipse Calculation
Write a Java program to calculate the focus, the area, and the circumference of an ellipse. An ellipse looks like an oval:

The program should read from user input the value of the semi major radius (a) and the semi minor radius (b) in this order. Input numbers can have decimal fractions.  You can assume that the semi major radius (first input) is greater than or equal to the semi minor radius (second input).

The focus of the ellipse is calculated as:


The area of the ellipse is πab, where value of a and b are the ellipse's major and minor radii respectively and π is the PI value.

The circumference of the ellipse can be approximated using this formula:

The focus of the ellipse is calculated as:


The area of the ellipse is πab, where value of a and b are the ellipse's major and minor radii respectively and π is the PI value.

The circumference of the ellipse can be approximated using this formula:


Use the Math.PI constant of the Java Math class. DO NOT DEFINE YOUR OWN PI CONSTANT. The square root function is also in the Math class. Use the Math.sqrt() method to get the square root value.

Import and use the Java class java.util.Scanner to read use data input as double type values.



Testing: Test your code with various input values of semi major axis a and semi minor axis b

Sample program run 1:
This program calculates the focus, area, and circumference of an ellipse.
Program written by XXXXX XXXXX.

Enter the semi-major axis value: 5.5
Enter the semi-minor axis value: 3.3
The focus of the ellipse is	           	 XXXX
The ellipse area is  		           	     XXXX
The ellipse circumference is	 	         XXXX

-------------------------------------
Sample program run 2:

This program calculates the focus, area, and circumference of an ellipse.
Program written by XXXXX XXXXX.

Enter the semi-major axis value: 15.4
Enter the semi-minor axis value: 7.7
The focus of the ellipse is	           	   XXXX
The ellipse area is 	   	           	     XXXX
The ellipse circumference is  	  	       XXXX
