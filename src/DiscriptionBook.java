public class DiscriptionBook {
    private Library [] libraries = new Library[10];
    private Legal [] legals = new Legal[10];
    private int count = 0;
    private int countLegal = 0;


    public void addBook(Library library){
        if (library instanceof Legal){
            if (countLegal < legals.length){
                legals[countLegal] = (Legal) library;
                libraries[count] = library;
                countLegal++;
                count++;
            }
        }
    }



    public  void printInfo(){
        for (int i = 0; i < legals.length; i++) {
            if (legals[i] != null){
                System.out.println(legals[i]);
            }
        }
    }
}
