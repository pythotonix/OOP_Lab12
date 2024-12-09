package ucu.edu.ua.task1;

public class ATM {
    Section first;

    public ATM() {
        this.first = new Section_500();
        Section_200 section_200 = new Section_200();
        first.setNext(section_200);
        Section_100 section_100 = new Section_100();
        section_200.setNext(section_100);
    }

    public void getMeMoney(int amount) {
        first.process(amount);
    }
}
