public class prog19 {
     String userName;
     String bio;

    public void getData() {
        System.out.println(userName+" "+bio);
    }
    private void setData(String userName, String bio) {
        this.bio = bio;
        this.userName = userName;
    }
    public static void main(String[] args) {
        prog19 p = new prog19();
        p.setData("sathvik  ", "noBioBro");
        p.getData();
        child s = new child();
        s.getData();
    }
}

class child extends prog19{
    
}
