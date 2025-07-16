abstract class prog22 {
    public void fly() {
        System.out.println("flying");
    }
    abstract void carry();

    public static void main(String[] args) {
        cargo_plane cp = new cargo_plane();
        passanger_plane pp = new passanger_plane();
        prog22 p = new cargo_plane();
        p.fly();
        cp.carry();
        pp.carry();
    }
}

class cargo_plane extends prog22 {
    public void carry() {
        System.out.println("Carrying in cargo");
    }
}

class passanger_plane extends prog22 {
    public void carry() {
        System.out.println("Carrying in passenger");
    }
}