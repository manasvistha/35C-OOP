public class variableclass
  /*Instance variable
         * Needs object to access
         * not shared in multiple object
         */
        int instanceVariable=10;
        /* Static variable
         * No need object, can be accessed using Class
         * shared in multiple object
         */
        static int staticVariable=100;
    public static void main(String[] args){
    

        /*Non Primitive Data type */
        /*Declaration */
        byte byteVariable;
        /*Initialization */
        byteVariable =100;
        /*Dclaration and Initializatin */
        short shortVariable=1000;
        /* Multiple Declation */
        int intVariable, intVariable2;
        /* Initialization */
        intVariable=10;
        intVariable=10;
        /*Multiple Declartion and Initialization */
        long longVariable1=100000, longVariable2=199999;
        float floatVariable=1.89f;// the letter 'f' is required
        double doubleVariable=189.8923;// the letter 'd' is optional 
        char charVariable='c'; // single letter enclosed in single quotation
        boolean boolenVariable= true;// small case  true/false
        /* Illegal actions */
        // byte byteVariable=30; // insteasd use reassignment
        // boolean boolVar2='false'; // should match the exact datatype
        // byte byteVariable2=1000000; // cannot exceed min or max

        /* Non-primitive date a type */
        String stringVariable="This is a string";// use double quotation""
        /* Or use the class */
        String stringVariable2=new String("String using class");
        /* Class/object */
        VariableClass variableObject=new VariableClass();
        /* uase the same class name as specified in public class <className> */
        /* Need object to access instance variable*/
        System.out.println(variableObject.instanceVariable);
        /* Can access static variable with Class only/ no object needed */
        System.out.println(VariableClass.staticVariable);
          /*Type casting */
          int intVariableConvert=10;
          double intVariableConvertToVariable=intVariableConvert;
          /*Explicit casting */
          double doubleVariableConvert=100.29;
          int doubleVariableConvertToInt=(int) doubleVariableConvert;

    }

}
