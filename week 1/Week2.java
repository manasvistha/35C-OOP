// import java.util.Scanner;
// public class Week2 {
    // public static void main(String[] args) {
        // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        // Scanner scan=new Scanner(System.in);
        // System.out.println("What is your age");
        // int age=scan.nextInt();
        // if(age>18){
        //     System.out.println("You are over 18 so you can vote");
        // }else{
        //     System.out.println("You are under 18 so you cannot vote");
        // }
    
    
    // 2. Write a program to calculate SI. 

    // Formula Simple Interest = (PrincipleAmount*Time*Rate/100);

        // System.out.println("What is PrinciplrAmount");
        // int prin=scan.nextInt();
        // System.out.println("What is rate");
        // int rate=scan.nextInt();
        // System.out.println("What is time");
        // int time=scan.nextInt();

        // int si;
        // si=(prin*time)/100;
        // System.out.println("simple interest is "+si);


        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        // Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;

            // System.out.println("What is base");
            // int b=scan.nextInt();
            // System.out.println("What is height");
            // int h=scan.nextInt();
            // int area=(b*h)/2;
            // System.out.println("area os triangle is"+area);
            // System.out.println("length of cube");
            // int l=scan.nextInt();
            // System.out.println("length of cuboid?");
            // int lg=scan.nextInt();
            // System.out.println("breadth of cuboid?");
            // int bg=scan.nextInt();
            // System.out.println("height?");
            // int hg=scan.nextInt();
            // int acube=l^3;
            // System.out.println("volume of cube is"+acube);
            // int acubo=lg*bg*hg;
            // System.out.println("volume of cuboid");

         /* Qno.4 Write the ternary operator for question no. 1 */
            // int age1 = 13;
            // String check = (age1>=18) ? "Eligible to vote." : "Not eligible to vote.";
            // System.out.println(check);
     

        //   /* Qno.5 Write a program to take two integer input from the user and print the sum and product of them. */
      //   //Scanner sp = new Scanner(System.in);
      //   System.out.println("Enter number 1:");
      //   int a = task.nextInt();
      //   System.out.println("Enter number 2:");
      //   int b = task.nextInt();  
      //   int sum = a+b;
      //   int product = a*b;
      //   System.out.println("The sum of these two numbers is: " +sum);
      //   System.out.println("The product of these two numbers is: " +product);


         //   /* Qno.6 Take two integer inputs from the user. First, calculate the sum of two, then the product of two. 
      //      Finally, calculate the division of thus obtained sum and product and print the result. */
        //Scanner user = new Scanner(System.in);
        // System.out.println("Enter first number: ");
        // double c = task.nextDouble();
        // System.out.println("Enter second number: ");
        // double d = task.nextDouble();

        // double sum1 = c+d;
        // double product1 = c*d;
        // double division = (double)sum1/ (double)product1;
        // System.out.println("The sum of these two numbers is: " +sum1);
        // System.out.println("The product of these two numbers is: " +product1);
        // System.out.println("The division of obtained sum and product of two numbers is: " + division);
        


        //   /* Qno.7 Take the name, roll number and field of interest from the user and print in the format below. 
      //      Hey, my name is XYZ and my roll number is XYZ. My field of interest are XYZ. */
        // //Scanner info = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = task.nextLine();
        // System.out.println("Enter your roll number: ");
        // int roll_number = task.nextInt();
        // task.nextLine();
        // System.out.println("Enter your field of interest: ");
        // String hobby = task.nextLine();

        // System.out.print("Hey, my name is " +name);
        // System.out.print(" and my roll number is " +roll_number);
        // System.out.println(". My field of interest are " +hobby);
        

        // /* Qno.8 Take side of a square from user and print area and perimeter of it. 
        //    Also, calculate Simple Interest, Area of triangle and Volume of cube and cuboid. 
        //    Take the attributes as user input. */
        // //Scanner task = new Scanner(System.in);
        // System.out.println("Enter a side of square: ");
        // int s = task.nextInt();
        // int Area = s * s;
        // int perimeter = 4 * s;
        // System.out.println("The perimeter of square is:" +perimeter);
        // System.out.println("The area of square is:" + Area);
        
        // //calculating simple interest.
        // System.out.println("Enter principle:");
        // int p = task.nextInt();
        // System.out.println("Enter time:");
        // int t = task.nextInt();
        // System.out.println("Enter rate:");
        // int r = task.nextInt();
        // double SI = ((double)p*(double)t*(double)r)/100;
        // System.out.println("The simple interest is:" +SI);

        // //calculating area of triangle.
        // System.out.println("Enter base of triangle:");
        // double base = task.nextDouble();
        // System.out.println("Enter height of triangle:");
        // double h = task.nextDouble();
        // double A = (0.5*base*h);
        // System.out.println("The area of triangle is" + A);

      //   //calculating volume of cube and cuboid.
      //   System.out.println("Enter length of cube:");
      //   int l = task.nextInt();
      //   int V = l*l*l;
      //   System.out.println("The volume of cube is" +V);

      //   System.out.println("Enter length of cuboid:");
      //   int l1 = task.nextInt();
      //   System.out.println("Enter breadth of cuboid:");
      //   int b1 = task.nextInt();
      //   System.out.println("Enter height of cuboid:");
      //   int h1 = task.nextInt();
        
      //   int V1 = l1*b1*h1;
      //   System.out.println("The volume of cuboid is" +V1);



        /* Qno.9 Ask user to give two double input for length and breadth of a rectangle 
           and print area type casted to int. */
        // System.out.println("Enter the length of the rectangle");
        // double l = task.nextDouble();
        // System.out.println("Enter breadth of rectangle :");
        // double br = task.nextDouble();  
        // double ar= l*br;
        // System.out.println("The area of rectangle is=" + ar);
     
        /*Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        a. If equal to or more than 70 -> First Class

        b. If more than 59 -> Upper Second Class

        c. If more than 49 -> Second class

        d. If more than 39 -> Third class and if below than 40 the result is fail. 

        Hint: Use ternary operator */
        // System.out.println("Enter marks of sub 1=");
        // double p = task.nextDouble();
        // System.out.println("Enter marks of sub 2=");
        // double q = task.nextDouble();
        // System.out.println("Enter marks of sub 3=");
        // double r = task.nextDouble();
        // System.out.println("Enter marks of sub 4=");
        // double s = task.nextDouble();
        // double gt = ((p + q + r + s)/4);
        // String re = (gt>=70) ? "First class" :
        //              gt >59 ? "Upper Second class" :
        //              gt >49 ? "Second class" :
        //              gt >39 ? "Third class" :
        // "Fail";
        // System.out.println(re);

        // // SI.close();
        // // sc.close();
        // // sp.close();
        // // user.close();
        // // info.close();
        // task.close();






//     }
// }

         

    

