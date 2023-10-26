import java.util.*;

class romanToInt {
    public int convertRomanToInt(String s) {
        Map<Character , Integer> hMap = new HashMap<>();
        hMap.put('I', 1);
        hMap.put('V', 5);
        hMap.put('X', 10);
        hMap.put('L', 50);
        hMap.put('C', 100);
        hMap.put('D', 500);
        hMap.put('M', 1000);

        int romanVal = 0;

        // hMap.get(s.charAt(i)) <= Logic of getting the value of the char (it makes sense once you get a good look)
        // Logic: I(5) < X(10) so... romanVal += 10-1 then move to next two

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && hMap.get(s.charAt(i)) < hMap.get(s.charAt(i+1))) {
                romanVal -= hMap.get(s.charAt(i));
            } else {
                romanVal += hMap.get(s.charAt(i));
            }
        }
        return romanVal;
    }
    public static void main(String[] args) {
        romanToInt convert = new romanToInt();
        System.out.println(convert.convertRomanToInt("VII"));
        System.out.println(convert.convertRomanToInt("IV"));
        System.out.println(convert.convertRomanToInt("XII"));
        System.out.println(convert.convertRomanToInt("II"));
    }
}
