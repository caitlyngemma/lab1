object HelloWorld {
   def main(args: Array[String]) {
      object Lab1 {
   def main(args: Array[Int]) {
      /*
    1) 1/0: Int
            Answer: java.lang.ArithmeticException: / by zero ... 31 elided
            Type: Int
            What Happens & Why?: Throws an exception because you cannot divide anything by 0
            
    2) if ((1/0)==42) 1 else 2
            Answer: java.lang.ArithmeticException: / by zero ... 31 elided
            Type: Int
            What Happens & Why?:Throws an exception because you cannot divide anything by 0
      
    3) true * 3
            Answer: value * is not a member of Boolean
            Type: No Type Specified
            What Happens & Why?:Throws an error because you cannot multiply booleans
         
       true * 3: Boolean
            Answer: value * is not a member of Boolean
            Type: Boolean
            What Happens & Why?:Throws an error because you cannot multiply booleans
            
       true * 3: Int
            Answer: value * is not a member of Boolean
            Type: Int
            What Happens & Why?:Throws an error because you cannot multiply booleans
    
    4) if (true) 1/0 else 2
            Answer: java.lang.ArithmeticException: / by zero ... 31 elided
            Type: Int
            What Happens & Why?: Throws an exception because you cannot divide anything by 0
            
    5) if (false) 1/0 else 2
            Answer: Int = 2
            Type: Int
            What Happens & Why?: The program executes the "else" and prints 2
            
    6) (if (true) 42 else true): Boolean
            Answer: error: type mismatch; found: Int(42) required: Boolean
            Type: Boolean
            What Happens & Why?: The program is of type Boolean, therefore it cannot print an Int
            
    7) (if (true) 42 else true): Int
            Answer: error: type mismatch; found: Boolean(true) required: Int
            Type: Int
            What Happens & Why?: The program is of type Int, therefore the answer cannot be a Boolean
    
    8) (if (true) 42 else true)
            Answer: AnyVal = 42
            Type: Int
            What Happens & Why?: Since the statement is "true", it executes the first item which is 42
                                without realizing that the "else" is a Boolean
    
    9) true && true
            Answer: Boolean = true
            Type: Boolean
            What Happens & Why?: x + x = x

    10) true && false
            Answer: Boolean = false
            Type: Boolean
            What Happens & Why?: x and y =/= x... must be false
            
    11) false && {val x:Int=1/0; false}
            Answer: Boolean = false
            Type: Boolean
            What Happens & Why?: When the first statement is false it is automatically false
            
    12) give similar examples to 9-12 using disjuction e1||e2
    
    9b) true || true
            Answer: Boolean = true
            Type: Boolean
            What Happens & Why?: x  or  x could be either x or x.. therefore it's x!

    10b) true || false
            Answer: Boolean = true
            Type: Boolean
            What Happens & Why?: x or y could be either x or y. Therefore either is true.
            
    11b) false || {val x:Int=1/0; false}
            Answer: java.lang.ArithmeticException: / by zero ... 31 elided
            Type: Boolean
            What Happens & Why?: You cannot divide by 0.. When you have an or statement it must evaluate both sides
      */
   }
}


   }
}

