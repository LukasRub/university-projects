package visitor;

/**
 * Created by Lukas Rubikas on 14.12.19.
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
