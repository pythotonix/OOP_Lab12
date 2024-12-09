package ucu.edu.ua.task1;

public abstract class Section {
    private int denomination;
    private Section next;
    public Section(int denomination) {
        this.denomination = denomination;
    }

    public void setNext(Section next) {
        this.next = next;
    }

    private boolean hasNext() { //приклад гарної практики - уникати весь час != null
        return next != null;
    }

    public void process(int amount) {
        int left = amount % denomination;
        if (left != 0 && hasNext()) {
            next.process(left);
        }

        System.out.println("Denomination: " + denomination + " Quantity: " + amount / denomination);
    }
}
