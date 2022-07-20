package memento;

public class Application {
    public static void main(String[] args) {
        CareTaker careTaker =new CareTaker();
        Cart cart =new Cart();
        cart.addItem(new Item("Book"));
        cart.addItem(new Item("Pen"));

        // let asume usert save the cart
        careTaker.save(cart);
        System.out.println(cart);
        // when you save you put entire cart to the caretaker. (version of the cart)

        cart.addItem(new Item("Phone"));
        careTaker.save(cart);
        System.out.println(cart);
        cart.addItem(new Item("Carrot"));
//        careTaker.save(cart);
//        not given to the care taker after the say no
        System.out.println(cart);

        careTaker.revert(cart);
        System.out.println(cart);

        cart.addItem(new Item("Disk"));
        careTaker.save(cart);
        System.out.println(cart);
// if you not save this, you can revert without repeatin, because then the caretaker will not care about the cart, if caretaker has last item as a cart, it wil return, caretaker always return last item (LIFO)

        careTaker.revert(cart);
        System.out.println(cart);
        careTaker.revert(cart);
        System.out.println(cart);
        careTaker.revert(cart);
        System.out.println(cart);
        // this will say no I can not undo, because this is version of this cart.


    }
}
