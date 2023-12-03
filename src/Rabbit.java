public class Rabbit implements Animal {

    @Override
    public void voice() {
        System.out.println("=:)");
    }

    @Override
    public void eat(String eat) {

        switch (eat){
            case "Grass":{
                System.out.println("mmmm)");
                break;
            }
            default:{
                System.out.println("(");
            }

        }

    }
}