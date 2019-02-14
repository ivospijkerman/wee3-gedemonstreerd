package nl.spijkerman.ivo.week3app;

public class ContactRepository {
    private final static ContactRepository INSTANCE = new ContactRepository();

    private final Contact[] store;

    public static ContactRepository getInstance() {
        return INSTANCE;
    }

    private ContactRepository() {
        store = new Contact[]{
                new Contact("Harry", "de Vries"),
                new Contact("Henk", "Henk"),
                new Contact("Timon", "Peters")
        };
    }

    public Contact[] getAll() { return store;}

    public Contact get(int position) {
        if (position < 0 || position >= store.length)
            return null;
        return store[position];
    }
}
