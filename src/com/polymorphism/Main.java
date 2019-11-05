package com.polymorphism;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String Plot(){
        return "No plot here";
    }
}

class War extends Movie{

    public War() {
        super("War");
    }

    @Override
    public String Plot() {
        return "To finish terrorist from India";
    }
}

class HarryPotter extends Movie{

    public HarryPotter() {
        super("Harry Potter");
    }

    @Override
    public String Plot() {
        return "All about magic and to kill bed witch";
    }
}

class Ready extends Movie{

    public Ready() {
        super("Ready");
    }

    @Override
    public String Plot() {
        return "A family movie with a lot of fun";
    }
}

class StarWar extends Movie{

    public StarWar() {
        super("Star War");
    }

    @Override
    public String Plot() {
        return "Aliens attack on the space";
    }
}

class IronMan extends Movie{

    public IronMan() {
        super("Iron Man");
    }

}

public class Main {

    public static void main(String[] args){
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n"
                        +"Plot : " + movie.Plot() + "\n");
        }


    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + randomNumber);

        switch (randomNumber){
            case 1:
                return new War();
            case 2:
                return new HarryPotter();
            case 3:
                return new Ready();
            case 4:
                return new StarWar();
            case 5:
                return new IronMan();
        }
        return null;
    }
}
