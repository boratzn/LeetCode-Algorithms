class Solution {
    public int romanToInt(String s) {
        int result = 0;
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'I'){
                if(i+1 > (str.length()-1)){
                    result += 1;
                    break;
                }
                if(str.charAt(i+1) == 'V'){
                    result += 4;
                    if(i+2 > (str.length()-1)) break;
                    i = i+1;
                    continue;
                }
                else if(str.charAt(i+1) == 'X'){
                    result += 9;
                    if(i+2 > (str.length()-1)) break;
                    i = i+1;
                    continue;
                }
                result += 1;
                continue;
            }
            else if(str.charAt(i) == 'V'){
                result += 5;
                continue;                
            }
            else if(str.charAt(i) == 'X'){
                if(i+1 > (str.length()-1)) {
                    result += 10;
                    break;
                }
                if(str.charAt(i+1) == 'L'){
                    result += 40;
                    if(i+2 > (str.length()-1)) break;
                    i = i+1;
                    continue;
                }
                else if(str.charAt(i+1) == 'C'){
                    result += 90;
                    if(i+2 > (str.length()-1)) break;
                    i = i+1;
                    continue;
                }
                result += 10;
                continue;
            }
            else if(str.charAt(i) == 'L'){
                result += 50;
                continue;
            }
            else if(str.charAt(i) == 'C'){
                if(i+1 > (str.length()-1)) {
                    result += 100;
                    break;
                }
                if(str.charAt(i+1) == 'D'){
                    result += 400;
                    if(i+2 > (str.length()-1)) break;
                    i = i+1;
                    continue;
                }
                else if(str.charAt(i+1) == 'M'){
                    result += 900;
                    if(i+2 > (str.length()-1)) break;
                    i = i+1;
                    continue;
                }
                result += 100;
                continue;
            }
            else if(str.charAt(i) == 'D'){
                result += 500;
                continue;
            }
            else if(str.charAt(i) == 'M'){
                result += 1000;
                continue;
            }
        }

        return result;
    }
}
