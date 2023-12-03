public class Tiger implements Animal {

    @Override
    public void voice() {
        System.out.println("RRRR");
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
}
