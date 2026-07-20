package CoreJava.B01_OOPs.WrapperClasses;

public class WrapperClassDemo {

    public static void main(String[] args) {

        System.out.println("========== WRAPPER CLASSES DEMO ==========\n");

        //============================================================
        // 1. Primitive Data Types
        //============================================================

        int num = 100;
        double salary = 25000.75;
        char grade = 'A';
        boolean status = true;

        System.out.println("Primitive int : " + num);
        System.out.println("Primitive double : " + salary);
        System.out.println("Primitive char : " + grade);
        System.out.println("Primitive boolean : " + status);

        //============================================================
        // 2. Boxing (Primitive -> Wrapper)
        //============================================================

        Integer i1 = Integer.valueOf(num);
        Double d1 = Double.valueOf(salary);
        Character c1 = Character.valueOf(grade);
        Boolean b1 = Boolean.valueOf(status);

        System.out.println("\nBoxing");
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(c1);
        System.out.println(b1);

        //============================================================
        // 3. Auto Boxing
        //============================================================

        Integer autoBox = 500;

        System.out.println("\nAuto Boxing");
        System.out.println(autoBox);

        //============================================================
        // 4. Unboxing
        //============================================================

        int primitive = autoBox;

        System.out.println("\nUnboxing");
        System.out.println(primitive);

        //============================================================
        // 5. valueOf()
        //============================================================

        Integer value = Integer.valueOf("200");

        System.out.println("\nvalueOf()");
        System.out.println(value);

        //============================================================
        // 6. parseInt()
        //============================================================

        String str = "350";

        int number = Integer.parseInt(str);

        System.out.println("\nparseInt()");
        System.out.println(number);

        //============================================================
        // 7. toString()
        //============================================================

        Integer x = 999;

        String s = x.toString();

        System.out.println("\ntoString()");
        System.out.println(s);
        System.out.println("Length = " + s.length());

        //============================================================
        // 8. compareTo()
        //============================================================

        Integer a = 50;
        Integer b = 100;

        System.out.println("\ncompareTo()");
        System.out.println(a.compareTo(b)); // negative
        System.out.println(b.compareTo(a)); // positive
        System.out.println(a.compareTo(50)); // zero

        //============================================================
        // 9. equals()
        //============================================================

        Integer n1 = 500;
        Integer n2 = 500;

        System.out.println("\nequals()");
        System.out.println(n1.equals(n2));

        //============================================================
        // 10. MAX_VALUE & MIN_VALUE
        //============================================================

        System.out.println("\nInteger Limits");
        System.out.println("MAX = " + Integer.MAX_VALUE);
        System.out.println("MIN = " + Integer.MIN_VALUE);

        System.out.println("\nDouble Limits");
        System.out.println("MAX = " + Double.MAX_VALUE);
        System.out.println("MIN = " + Double.MIN_VALUE);

        //============================================================
        // 11. sum(), max(), min()
        //============================================================

        System.out.println("\nUtility Methods");

        System.out.println("Sum = " + Integer.sum(10,20));
        System.out.println("Max = " + Integer.max(25,50));
        System.out.println("Min = " + Integer.min(25,50));

        //============================================================
        // 12. Character Wrapper Class
        //============================================================

        char ch = 'A';

        System.out.println("\nCharacter Class");

        System.out.println("isLetter : " + Character.isLetter(ch));
        System.out.println("isDigit : " + Character.isDigit(ch));
        System.out.println("isUpperCase : " + Character.isUpperCase(ch));
        System.out.println("isLowerCase : " + Character.isLowerCase(ch));
        System.out.println("Lower Case : " + Character.toLowerCase(ch));

        //============================================================
        // 13. Boolean Wrapper Class
        //============================================================

        Boolean flag = Boolean.valueOf("true");

        System.out.println("\nBoolean Class");
        System.out.println(flag);

        //============================================================
        // 14. Float Wrapper
        //============================================================

        Float f = Float.valueOf("123.45");

        System.out.println("\nFloat Class");
        System.out.println(f);

        //============================================================
        // 15. Double Wrapper
        //============================================================

        Double db = Double.valueOf("98765.45");

        System.out.println("\nDouble Class");
        System.out.println(db);

        //============================================================
        // 16. Wrapper to Primitive
        //============================================================

        Integer marks = 95;

        int m = marks.intValue();

        System.out.println("\nWrapper -> Primitive");
        System.out.println(m);

        //============================================================
        // 17. Primitive to Wrapper
        //============================================================

        int age = 22;

        Integer ageObj = Integer.valueOf(age);

        System.out.println("\nPrimitive -> Wrapper");
        System.out.println(ageObj);

        //============================================================
        // 18. String to Wrapper
        //============================================================

        String marksStr = "80";

        Integer markObj = Integer.valueOf(marksStr);

        System.out.println("\nString -> Wrapper");
        System.out.println(markObj);

        //============================================================
        // 19. Wrapper to String
        //============================================================

        String converted = markObj.toString();

        System.out.println("\nWrapper -> String");
        System.out.println(converted);

        //============================================================
        // 20. Conclusion
        //============================================================

        System.out.println("\n========== END OF WRAPPER CLASS DEMO ==========");
    }
}