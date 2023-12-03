public class Dog implements Animal {

    @Override
    public void voice() {
        System.out.println("гав");
    }

    private Dog() {
    }

    @Override
    public void eat(String eat) {

        switch (eat) {
            case "Meat": {
                System.out.println("mmmm)");
                break;
            }
            default: {
                System.out.println("(");
            }
        }
    }

    static Animal dogCreate(){
        return new Dog();
    }
}
