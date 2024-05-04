interface Smartphones {
    void call();
    void sms();
    void internet();
}

interface LinuxOS {
    void runLinuxCommands();
}

interface iOS {
    void runiOSCommands();
}

public class Main {
    public static void main(String[] args) {
        Smartphones androidPhone = new Androids();
        Smartphones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
    }
}
