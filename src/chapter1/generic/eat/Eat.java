package chapter1.generic.eat;

/**
 * 吃
 *
 * @param <T>
 */
public class Eat<T> {
    /**
     * 吃
     *
     * @param something
     */
    public Eat(T something) {
        this.something = something;
    }

    public T getSomething() {
        return something;
    }

    public void setSomething(T something) {
        this.something = something;
    }

    private T something;

}
