public class prog42 {
    public static void main(String[] args) {
        String s = "He pressed the sos button number 123321";
        String[] arr = s.split(" ");
        for (String a : arr) {
            String rev = "";
            for (int i = a.length()-1; i >= 0; i--) {
                rev += a.charAt(i);
            }
            if(rev.equals(a))
            System.out.println(a);
        }
    }
}
