package com.company;

public class Main {

    public static void main(String[] args) {

        String phoneNumber = "+)7 )(9)  3 (7) 2( 111 0 10)";
        boolean plusFlag = false;
        boolean bracketSpaceFlag = false;


        System.out.println(isCorrect(phoneNumber));

    }

    public static String isCorrect(String phoneNumber) {
        String rezultStr = new String();

        int numberLength = phoneNumber.length();
        phoneNumber = (phoneNumber.replaceAll("[)( ]", ""));
        if (numberLength != phoneNumber.length()) {
            rezultStr += "В номере есть пробелы и/или скобки; ";;
        }

        if (phoneNumber.charAt(0) == '+') {
            if (phoneNumber.charAt(1) == '7') {
                phoneNumber = phoneNumber.replaceFirst("[+]", "");
                phoneNumber = phoneNumber.replaceFirst("[7]", "8");
                rezultStr += "Замена +7 на 8; ";
            }
            else {
                return "Введен некорректный номер!" + '\n' + "Количество символов не равно 11!";
            }
        }

        if (phoneNumber.length() != 11)
            return "Введен некорректный номер!" + '\n' + "Количество символов не равно 11!";
        if (rezultStr.isEmpty()) {
            rezultStr += "Не было изменений";
        }
        return phoneNumber + '\n' + rezultStr;
    }
}
