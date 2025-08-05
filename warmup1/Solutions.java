//warmup1-front3
public String front3(String str) {
    String front;
    if (str.length () >=3){
        front = str.substring(0,3);
    }
    else{
        front = str;
    }
    return front + front + front;
}


// warmup1-backAround
public String backAround(String str) {
    //this is how to get the last char --important--
    String last= str.substring(str.length() -1);
    return last + str + last;
}

//warmup1-or35
public boolean or35(int n) {
    return ((n % 3==0) || (n % 5==0));
}

//warmup1-front22
public String front22(String str) {
    String front2;
    if (str.length() >=2){
        front2 = str.substring(0,2);
    }
    else{
        front2 = str;
    }
    return front2 + str + front2;
}

//Warmup-1 > startHi
public boolean startHi(String str) {
    if (str.length() < 2) return false;
    String firstTwo=str.substring(0, 2);
    //here there is a difference when using (==) and using (.equals())
    if (firstTwo.equals("hi")){
        return true;
    }
    else{
        return false;
    }
}

//Warmup-1 > icyHot
public boolean icyHot(int temp1, int temp2) {
    return ((temp1 < 0 && temp2 > 100) || (temp2 <0 && temp1 > 100));
}

//Warmup-1 > in1020
public boolean in1020(int a, int b) {
    return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
}

//Warmup-1 > hasTeen
public boolean hasTeen(int a, int b, int c) {
    return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
}

//Warmup-1 > loneTeen --important--
public boolean loneTeen(int a, int b) {
    boolean aTeen = (a >= 13 && a <= 19);
    boolean bTeen = (b >= 13 && b <= 19);
    return aTeen ^ bTeen;  // ^ is XOR: true if exactly one is true
}

//Warmup-1 > delDel
public String delDel(String str) {
    if (str.length()>=4 && str.substring(1, 4).equals("del")) {
        // First char + rest of string starting at 4
        return str.substring(0, 1) + str.substring(4);
    }
    return str;
}

//Warmup-1 > mixStart
public boolean mixStart(String str) {
    if (str.length() < 3) return false;
    // Pull out length 2 string for the "ix" part
    // (i.e. substring starting at index 1 and stopping just before 3).
    String two = str.substring(1, 3);

    if (two.equals("ix")) {
        return true;
    } else {
        return false;
    }
    // This last part can be shortened to just:
    // return(two.equals("ix"));
}

//Warmup-1 > startOz
public String startOz(String str) {
    String result = "";

    if (str.length() >= 1 && str.charAt(0)=='o') {
        result = result + str.charAt(0);
    }

    if (str.length() >= 2 && str.charAt(1)=='z') {
        result = result + str.charAt(1);
    }

    return result;
}

//Warmup-1 > intMax
public int intMax(int a, int b, int c) {
    if (a >b && a>c){
        return a;
    }
    else if (b >a && b>c){
        return b;
    }
    else {
        return c;
    }
}

//Warmup-1 > close10
public int close10(int a, int b) {
    int aDiff = Math.abs(a - 10);
    int bDiff = Math.abs(b - 10);

    if (aDiff < bDiff) {
        return a;
    }
    if (bDiff < aDiff) {
        return b;
    }
    return 0;  // i.e. aDiff == bDiff
}

//Warmup-1 > in3050
public boolean in3050(int a, int b) {
    return ((a>=30 && a <=40) && (b>=30 && b <=40)) || ((a>=40 && a <=50) && (b>=40 && b <=50));
}

//Warmup-1 > max1020
public int max1020(int a, int b) {
    // First make it so the bigger value is in a
    if (b > a) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Knowing a is bigger, just check a first
    if (a >= 10 && a <= 20) return a;
    if (b >= 10 && b <= 20) return b;
    return 0;
}

//Warmup-1 > stringE
public boolean stringE(String str) {
    int count = 0;

    for (int i=0; i<str.length(); i++) {
        if (str.charAt(i) == 'e') count++;
        // alternately: str.substring(i, i+1).equals("e")
    }

    return (count >= 1 && count <= 3);
}

//Warmup-1 > lastDigit
public boolean lastDigit(int a, int b) {
    // True if the last digits are the same
    return(a % 10 == b % 10);
}

//Warmup-1 > endUp
public String endUp(String str) {
    if (str.length() <= 3) return str.toUpperCase();
    int cut = str.length() - 3;
    String front = str.substring(0, cut);
    String back  = str.substring(cut);  // this takes from cut to the end

    return front + back.toUpperCase();
}

//Warmup-1 > everyNth
public String everyNth(String str, int n) {
    String result = "";

    // Look at every nth char
    for (int i=0; i<str.length(); i = i + n) {
        result = result + str.charAt(i);
    }
    return result;
}