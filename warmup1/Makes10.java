public class Makes10 {
    public boolean makes10(int a, int b) {
        if (a+b==10){
            return true;
        }
        else if(a==10 || b==10){
            return true;
        }
        else {
            return false;
        }
    }
}

//--------another way solving it
//public boolean makes10(int a, int b) {
//  return (a == 10 || b == 10 || a+b == 10);
//}