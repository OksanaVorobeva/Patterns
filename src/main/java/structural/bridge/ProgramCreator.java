package structural.bridge;



public class ProgramCreator {
    public static void main(String[] args) {
        Program [] programs;
        programs = new Program[]{
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }
    }
}
