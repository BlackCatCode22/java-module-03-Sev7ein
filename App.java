// 9/16/25
// s.n

public class App {
    public static void main (String [] args) {
        // creates a new object within the class Chef
        Chef normalChef = new Chef();
        normalChef.makeSpecialDish();

        ItalianChef italianChef = new ItalianChef();
        italianChef.makePasta();

        ChineseChef chineseChef = new ChineseChef();
        chineseChef.makeSpecialDish();
        //polymorph = more shapes (in latin)
    }
}
