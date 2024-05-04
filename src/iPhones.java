class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Здійснення дзвінка з iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Відправка текстового повідомлення з iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Перегляд інтернету з iPhone");
    }

    @Override
    public void runiOSCommands() {
        System.out.println("Виконання команд iOS на iPhone");
    }
}