public class RomanNumbers {
    StringBuilder romanNumbers = new StringBuilder("");

    public String toRoman(int number) {

        if (number > 50){
            romanNumbers.append("L");
            number = number - 50;
        }

        if (number > 10 && number < 50){

            number = writeTens(romanNumbers,number);

        }


        if (number == 4){
            return romanNumbers.append("IV").toString();
        }
        if (number == 5){
            return romanNumbers.append("V").toString();
        }

        if (number == 9){
            return romanNumbers.append("IX").toString();
        }

        if (number == 10){
            return romanNumbers.append("X").toString();
        }

        if (number > 5){
            romanNumbers.append("V");
            number = number - 5;
        }

        return loopAll(number).toString();

    }

    private int writeTens(StringBuilder romanNumbers, int number) {
        String stringRoman = Integer.toString(number);
        char [] stringRomanToChar = stringRoman.toCharArray();

        int tens = Integer.parseInt(String.valueOf(stringRomanToChar[0]));

        int rest = 0;

        for (int i = 0; i < tens ; i++) {
            romanNumbers.append("X");
            rest = number -= 10;
        }
        return rest;
    }


    public StringBuilder loopAll(int number){

        for (int i = 0; i < number; i++) {

            romanNumbers.append("I");
        }
        return romanNumbers;
    }
}
