
/*
 * The Burger class includes instances of Burger and the methods of Burger.
 */
import java.util.*;

/**
 *
 * @author lipan
 */

public class Burger {

    String name;

    Ingredient ingredient = new Ingredient();

    Burger() {
    }

    Burger(String name) {
        name = this.name;
    }

    int addIngrerdient(int a) {
        return a;
    }

    ArrayList<Integer> NeverBeenFeta = new ArrayList<Integer>(
            Arrays.asList(ingredient.getCiabatta(), ingredient.getPatty(), ingredient.getFeta(), ingredient.getMayo(),
                    ingredient.getMustard(), ingredient.getArugula(), ingredient.getFries()));

    ArrayList<Integer> EggersNotCheesers = new ArrayList<Integer>(
            Arrays.asList(ingredient.getEnglishMuffin(), ingredient.getPatty(), ingredient.getCheddar(),
                    ingredient.getEgg(), ingredient.getIceburg(), ingredient.getFries()));

    ArrayList<Integer> PoutineOnTheRitz = new ArrayList<Integer>(Arrays.asList(ingredient.getBun(),
            ingredient.getPatty(), ingredient.getIceburg(), ingredient.getTomato(), ingredient.getRedOnion(),
            ingredient.getRitzCrackers(), ingredient.getFries(), ingredient.getGravy(), ingredient.getCheeseCurds()));

    ArrayList<Integer> BabyYouCanChiveMyCar = new ArrayList<Integer>(
            Arrays.asList(ingredient.getBun(), ingredient.getPatty(), ingredient.getFeta(), ingredient.getMustard(),
                    ingredient.getSourCream(), ingredient.getChives(), ingredient.getPickle(), ingredient.getFries()));

    ArrayList<Integer> BetItAllOnBlackGarlic = new ArrayList<Integer>(Arrays.asList(ingredient.getBun(),
            ingredient.getPatty(), ingredient.getMozzarella(), ingredient.getMayo(), ingredient.getSriracha(),
            ingredient.getBlackGarlic(), ingredient.getSpinach(), ingredient.getFries()));

}
