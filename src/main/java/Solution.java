public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     * 
     * 
     * 
     **/

    public Solution() {}

    public boolean endsLy(String x) {

        if (2 > x.length()) {
            return false;
        } else {
            int l = x.length() - 2;
            String s = x.substring(l);
            if (s.equals("ly")) {
                return true;
            } else {
                return false;
            }
        }
    }

    public String conCat(String s1, String s2) {
        if (s1.length() == 0) {
            return s2;
        }
        if (s2.length() == 0) {
            return s1;
        }
        if (s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }

    public String withoutX(String s1) {
        if (s1.substring(0,1).equals("x")) {
            if (s1.substring(s1.length()-1).equals("x")) {
                return s1.substring(1,s1.length()-1);
            } else {
                return s1.substring(1,s1.length()-1) + s1.substring(s1.length()-1);
            }
            
        } else if (s1.substring(s1.length()-1).equals("x")) {
            return s1.substring(0,1) + s1.substring(1,s1.length()-1);
        } else {
            return s1.substring(0,1) + s1.substring(1,s1.length()-1) + s1.substring(s1.length()-1);
        }

    }

    public String fizzString(String s1) {
        if (s1.substring(0,1).equals("f")) {
            if (s1.substring(s1.length()-1).equals("b")) {
                return "FizzBuzz";
            } else {
                return "Fizz";
            }
        } else if (s1.substring(s1.length()-1).equals("b")) {
            return "Buzz";
        } else {
            return s1;
        }
    }

    public String fizzString2(int x) {
        if ((x % 3) == 0) {
            if ((x % 5) == 0) {
                return "FizzBuzz!";
            } else {
                return "Fizz!";
            }
        } else if ((x % 5) == 0) {
            return "Buzz!";
        } else {
            return x + "!";
        }
    }

}
