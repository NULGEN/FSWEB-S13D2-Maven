package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(121));
        System.out.println(isPerfectNumber(28));
        System.out.println(numberToWords(1001));
    }

    public static boolean isPalindrome(int sayi){
        sayi = Math.abs(sayi);

        char[] number =  String.valueOf(sayi).toCharArray();
        String reverse= "";

        for(int i =number.length-1; i>=0; i--) {
        reverse += number[i];

        }

        return reverse.equalsIgnoreCase(String.valueOf(number));

    }

    public  static  Boolean isPerfectNumber(int number){

        int sum = 0;

        if(number <0) return  false;

        for(int i=1; i<=number /2; i++){
            if(number %i ==0){
               sum +=i;
            }
        }
       return  number==sum;

    }

    public  static  String numberToWords(int number){

        String text= "";
        if (number<0) return "Invalid Value";
      char[] digits=  String.valueOf(number).toCharArray();

      for(char digit: digits){
          switch (digit){
              case '0':
                  text += "Zero ";
                  break;
              case '1':
                  text += "One ";
                  break;
              case '2':
                  text += "Two ";
                  break;
              case '3':
                  text += "Three ";
                  break;
              case '4':
                  text += "Four ";
                  break;
              case '5':
                  text += "Five ";
                  break;
              case '6':
                  text += "Six ";
                  break;
              case '7':
                  text += "Seven ";
                  break;
              case '8':
                  text += "Eight ";
                  break;
              case '9':
                  text += "Nine ";
                  break;
          }

      }
        return text.trim();
    }
}
