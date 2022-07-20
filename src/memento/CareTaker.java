package memento;

import java.util.Stack;

public class CareTaker {
    // add new items (LiFO) implement as a Stack

    Stack<Cart.CartMemento> history = new Stack<>();

    public void save(Cart cart){
        history.push(cart.save());
    }
    public void revert(Cart cart){
        if(!history.isEmpty())
            cart.revert(history.pop());
        else
            System.out.println("Cannot undo");
    }

}
