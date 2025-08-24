public class RomanToInt {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.romanToInt("MCMXCIV")); //Expected 1994
        System.out.println(sol.romanToInt("III" )); // Expected 3
        System.out.println(sol.romanToInt("LVIII")); // Expected 58
        System.out.println(sol.romanToInt("IV")); // Expected 4
    }
}


class Solution {
    public int romanToInt(String s) {
        
        int result = 0;



        for(int i = 0; i < s.length() ; i++){


            int Roman = s.charAt(i);

            int Number = 0;

            switch(Roman){

                case 'I':
                Number = 1;
                break;

                case 'V':
                Number =5;
                break;

                case 'X':
                Number =10;
                break;

                case 'L':
                Number = 50;
                break;

                case 'C':
                Number = 100;
                break;

                case 'D':
                Number = 500;
                break;

                case 'M':
                Number = 1000;
                break;

            }




            if (i > 0 ){


                    if(s.charAt(i-1) == 'I' && (s.charAt(i) == 'V' || s.charAt(i) == 'X')) {


                    result -= 2;


                    }

                    if(s.charAt(i-1) == 'X' && (s.charAt(i) == 'L' || s.charAt(i) == 'C')) {


                        result -= 20;


                    }


                    if(s.charAt(i-1) == 'C' && (s.charAt(i) == 'D' || s.charAt(i) == 'M')) {


                        result -= 200;


                }


            }


            result += Number;


        }

        
    return result;

    }

}
