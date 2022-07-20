package memento;

import java.util.ArrayList;

public class Cart {
    // Originator
    ArrayList<Item> items = new ArrayList<>();

    // add item
    public void addItem(Item item){
        items.add(item);
    }

    public ArrayList<Item> getItems() {
        return (ArrayList<Item>) items.clone();
    }

    public CartMemento save(){
        return new CartMemento(getItems());
    }

    public void revert (CartMemento cartMemento){
        items = cartMemento.getItems();
    }

    // inner
     static class CartMemento{
        ArrayList<Item> items;
        public CartMemento(ArrayList<Item> items){
            this.items = items;
        }

        private ArrayList<Item> getItems(){
            return items;
        }

        @Override
        public String toString() {
            return "CartMemento{" +
                    "items=" + items +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}
