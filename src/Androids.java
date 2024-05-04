class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Здійснення дзвінків з Android телефону.");
    }

    @Override
    public void sms() {
        System.out.println("Відправка текстового повідомлення з Android телефону");
    }

    @Override
    public void internet() {
        System.out.println("Перегляд інтернету з Android телефону");
    }

    @Override
    public void runLinuxCommands() {
        System.out.println("Виконання команд Linux на Android телефоні");
    }
}
