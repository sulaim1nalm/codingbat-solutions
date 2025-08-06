//----i did all the solutions in this one java file because it's faster than doing a branch for every problem.-------

//warmup2-stringTimes
public String stringTimes(String str, int n) {
    String result="";
    for (int i=0; i<n ; i++){
        result +=str;
    }
    return result;
}

//Warmup-2 > frontTimes
public String frontTimes(String str, int n) {
    String result="";
    String front;
    if (str.length()>3){
        front= str.substring(0,3);
    }
    else{
        front = str;
    }
    for (int i=0; i<n;i++){
        result +=front;
    }
    return result;
}

//Warmup-2 > countXX
public int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
            count++;
        }
    }
    return count;
}

//Warmup-2 > doubleX
//----this my solution-----
boolean doubleX(String str) {
    for (int i =0; i<str.length()-1; i++){
        if (str.charAt(i)=='x'){
            if (str.charAt(i+1)=='x'){
                return true;
            }
        }
    }
    return false;
}
//-----and this is the way its solved in the website----
boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1) return false; // no "x" at all

    // Is char at i+1 also an "x"?
    if (i+1 >= str.length()) return false; // check i+1 in bounds?
    return str.substring(i+1, i+2).equals("x");
}


//Warmup-2 > stringBits
public String stringBits(String str) {
    String result="";
    for (int i=0; i<str.length(); i=i+2){
        result += str.charAt(i);
    }
    return result;
}

//Warmup-2 > stringSplosion
public String stringSplosion(String str) {
    String result="";
    for (int i=0; i<str.length(); i++){
        result +=str.substring(0,i);
    }
    return result + str;
}

//Warmup-2 > last2
public int last2(String str) {
    // Screen out too-short string case.
    if (str.length() < 2) return 0;

    // Note: substring() with 1 value goes through the end of the string
    String end = str.substring(str.length()-2);

    int count = 0;
    // Check each substring length 2 starting at i
    for (int i=0; i<str.length()-2; i++) {
        String sub = str.substring(i, i+2);
        if (sub.equals(end)) {  // Use .equals() with strings
            count++;
        }
    }

    return count;
}

//Warmup-2 > arrayCount9
public int arrayCount9(int[] nums) {
    int count=0;
    for (int i =0; i< nums.length; i++){
        if (nums[i]==9){
            count++;
        }
    }
    return count;
}

//Warmup-2 > arrayFront9
public boolean arrayFront9(int[] nums) {
    // First figure the end for the loop
    int end = nums.length;
    if (end > 4) end = 4;

    for (int i=0; i<end; i++) {
        if (nums[i] == 9) return true;
    }

    return false;
}

//Warmup-2 > array123
public boolean array123(int[] nums) {
    for (int i =0; i<nums.length -2; i++){
        if((nums[i]==1) && (nums[i+1]==2) && (nums[i+2]==3)){
            return true;
        }
    }
    return false;
}

//Warmup-2 > stringMatch
//-----this is my solution----
public int stringMatch(String a, String b) {
    int count=0;
    for (int i=0; i<b.length()-1 && i<a.length()-1 ; i++){
        if ((a.substring(i, i+2).equals(b.substring(i, i+2)))){
            count++;
        }
    }
    return count;
}
//-----and this is how it's done in the website---
public int stringMatch(String a, String b) {
    // Figure which string is shorter.
    int len = Math.min(a.length(), b.length());
    int count = 0;

    // Look at both substrings starting at i
    for (int i=0; i<len-1; i++) {
        String aSub = a.substring(i, i+2);
        String bSub = b.substring(i, i+2);
        if (aSub.equals(bSub)) {  // Use .equals() with strings
            count++;
        }
    }

    return count;
}

//Warmup-2 > stringX
public String stringX(String str) {
    String result="";
    for (int i =0; i< str.length(); i++){
        if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
            result = result + str.substring(i, i+1);
        }
    }
    return result;
}

//Warmup-2 > altPairs
public String altPairs(String str) {
    String result="";
    for (int i =0; i< str.length(); i+=4){
        result += str.substring(i, Math.min(i + 2, str.length()));
    }
    return result;
}

//Warmup-2 > stringYak
public String stringYak(String str) {
    String result = "";

    for (int i=0; i<str.length(); i++) {
        // Look for i starting a "yak" -- advance i in that case
        if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
            i =  i + 2;
        } else { // Otherwise do the normal append
            result = result + str.charAt(i);
        }
    }

    return result;
}

//Warmup-2 > array667
public int array667(int[] nums) {
    int count = 0;
    for (int i=0; i < (nums.length-1); i++) {
        if (nums[i] == 6) {
            if (nums[i+1] == 6 || nums[i+1] == 7) {
                count++;
            }
        }
    }
    return count;
}

//Warmup-2 > noTriples
public boolean noTriples(int[] nums) {
    int count = 0;
    for(int i =0; i<nums.length-2; i++){
        if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]){
            return false;
        }
    }
    return true;
}

//Warmup-2 > has271
public boolean has271(int[] nums) {
    for (int i=0; i < (nums.length-2); i++) {
        int val = nums[i];
        if (nums[i+1] == (val+5) &&              // the "7" check
                Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
            return true;
        }
    }
    return false;
}