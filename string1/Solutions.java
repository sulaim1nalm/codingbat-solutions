//String-1 > helloName
public String helloName(String name) {
    return "Hello " + name +"!";
}


//String-1 > makeAbba
public String makeAbba(String a, String b) {
    return a+b+b+a;
}

//String-1 > makeTags
public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
}

//String-1 > makeOutWord
public String makeOutWord(String out, String word) {
    return out.substring(0,2) + word + out.substring(2,4);
}

//String-1 > extraEnd
public String extraEnd(String str) {
    String end = str.substring(str.length() - 2);
    return end + end + end;
}

//String-1 > firstTwo
public String firstTwo(String str) {
    if (str.length()>=2 ){
        return str.substring(0,2);
    }
    else{
        return str;
    }
}

//String-1 > firstHalf
public String firstHalf(String str) {
    return str.substring(0, str.length()/2);
}

//String-1 > withoutEnd
public String withoutEnd(String str) {
    if (str.length() >=2){
        return str.substring(1,str.length()-1);
    }
    return str;
}

