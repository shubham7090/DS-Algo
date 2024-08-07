package Problems;

public class LeetCode273 {
    public static void run(){
        System.out.println(numberToWords(12345678));
    }

    public static String numberToWords(int num) {
        if(num==0)return "Zero";
        int mask = 1000;
        int count = 0;
        String ans ="";
        while(num>0){
            int threeDigit = num%mask;
            String thirdDigitStr = threeDigitToWord(threeDigit);
            if(!thirdDigitStr.equals("")){switch(count){
                case 1:
                    thirdDigitStr+="Thousand ";
                    break;
                case 2:
                    thirdDigitStr+="Million ";
                    break;
                case 3:
                    thirdDigitStr+="Billion ";
                    break;
            }}

            count++;
            num/=mask;

            ans = thirdDigitStr + ans;
        }
        return ans.trim();
    }

    public static String threeDigitToWord(int num){
        int thirdDigit = num/100;
        if(thirdDigit==0){
            return twoDigitToWord(num);
        }
        String thirdDigitStr = oneDigitToWord(thirdDigit);
        if(!thirdDigitStr.equals("")){
            thirdDigitStr+="Hundred ";
        }
        return  thirdDigitStr + twoDigitToWord(num%100);
    }

    public static String twoDigitToWord(int num){
        if(num<10)return oneDigitToWord(num);
        String ans = "";
        if(num<20){
            switch(num){
                case 10:
                    ans = "Ten ";
                    break;
                case 11:
                    ans = "Eleven ";
                    break;
                case 12:
                    ans = "Twelve ";
                    break;
                case 13:
                    ans = "Thirteen ";
                    break;
                case 14:
                    ans = "Fourteen ";
                    break;
                case 15:
                    ans = "Fifteen ";
                    break;
                case 16:
                    ans = "Sixteen ";
                    break;
                case 17:
                    ans = "Seventeen ";
                    break;
                case 18:
                    ans = "Eighteen ";
                    break;
                case 19:
                    ans = "Nineteen ";
                    break;
            }
            return ans;
        }else if(num<30){
            ans="Twenty ";
        }else if(num<40){
            ans="Thirty ";
        }else if(num<50){
            ans="Forty ";
        }else if(num<60){
            ans="Fifty ";
        }else if(num<70){
            ans="Sixty ";
        }else if(num<80){
            ans="Seventy ";
        }else if(num <90){
            ans="Eighty ";
        }else if(num<100){
            ans="Ninety ";
        }
        return ans + oneDigitToWord(num%10);
    }
    public static String oneDigitToWord(int num){
        switch (num){
            case 1:
                return "One ";
            case 2:
                return "Two ";
            case 3:
                return "Three ";
            case 4:
                return "Four ";
            case 5:
                return "Five ";
            case 6:
                return "Six ";
            case 7:
                return "Seven ";
            case 8:
                return "Eight ";
            case 9:
                return "Nine ";
        }
        return "";
    }
}
