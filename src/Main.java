//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Artistic artistic = new Artistic("Опрокинутый мир","Кристофер Прист",1974,5);
        Legal legal = new Legal("Хороший юрист, плохой юрист","Вячеслав Оробинский",2021,4);
        Technical technical= new Technical("Хаус и философия. Все врут!","Генри Д. Якоби",2008,3);

        DiscriptionBook discriptionBook = new DiscriptionBook();
        discriptionBook.addBook(legal);
        discriptionBook.printInfo();



    }
}