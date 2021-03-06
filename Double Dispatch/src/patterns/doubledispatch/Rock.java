package patterns.doubledispatch;

public class Rock implements Element{
    @Override
    public void play(Paper paper) {
        System.out.println("Paper wins.");
    }

    @Override
    public void play(Rock rock) {
        System.out.println("It's a tie.");
    }

    @Override
    public void play(Scissors scissors) {
        System.out.println("Rock wins.");
    }

    @Override
    public void play(Element element) {
        element.play(this);
    }
}
