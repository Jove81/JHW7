public class User<T,V> {
    private T id;
    private V card_number;

    public User(T id, V card_number) {
        this.id = id;
        this.card_number = card_number;
    }

    public T getId(){
        return id;
    }

    public V getCard_number(){
        return card_number;
    }

}
