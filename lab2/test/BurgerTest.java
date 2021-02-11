/*
 * BurgerTest file. 
 */
import java.util.*;
import org.junit.jupiter.api.Test; //JUnit5
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


/**
 *
 * @author lipan
 */
public class BurgerTest {

    public int sum(ArrayList<Integer> list) {
        int total = 0;
        for (Integer n : list) {
            total += n;
        }
        return total;
    }

    @Test
    public void Cost_NeverbeenFeta_Burger_Equal_258Cents() {
        Burger burger = new Burger();
        ArrayList<Integer> NeverBeenFetaBurger = new ArrayList<Integer>();
        NeverBeenFetaBurger = burger.NeverBeenFeta;
        assertEquals(258, sum(NeverBeenFetaBurger));
    }

    @Test
    public void Cost_EggersNotCheesers_Burger_Equal_252Cents() {
        Burger burger = new Burger();
        ArrayList<Integer> EggersNotCheesersBurger = new ArrayList<Integer>();
        EggersNotCheesersBurger = burger.EggersNotCheesers;
        assertEquals(252, sum(EggersNotCheesersBurger));
    }

    @Test
    public void Cost_PoutineOnTheRitz_Burger_Equal_435Cents() {
        Burger burger = new Burger();
        ArrayList<Integer> PoutineOnTheRitzBurger = new ArrayList<Integer>();
        PoutineOnTheRitzBurger = burger.PoutineOnTheRitz;
        assertEquals(435, sum(PoutineOnTheRitzBurger));
    }

    @Test
    public void Cost_BabyYouCanChiveMyCar_Burger_Equal_219Cents() {
        Burger burger = new Burger();
        ArrayList<Integer> BabyYouCanChiveMyCarBurger = new ArrayList<Integer>();
        BabyYouCanChiveMyCarBurger = burger.BabyYouCanChiveMyCar;
        assertEquals(219, sum(BabyYouCanChiveMyCarBurger));
    }

    @Test
    public void Cost_BetItAllOnBlackGarlic_Burger_Equal_253Cents() {
        Burger burger = new Burger();
        ArrayList<Integer> BetItAllOnBlackGarlicBurger = new ArrayList<Integer>();
        BetItAllOnBlackGarlicBurger = burger.BetItAllOnBlackGarlic;
        assertEquals(253, sum(BetItAllOnBlackGarlicBurger));
    }

    @Test
    public void Cost_Cheese_Burger_Not_Equal_595Cents() {

        Ingredient ingredient = new Ingredient();

        ArrayList<Integer> CheeseBurger = new ArrayList<Integer>();

        CheeseBurger.add(ingredient.getBun());
        CheeseBurger.add(ingredient.getCheddar());
        CheeseBurger.add(ingredient.getIceburg());

        assertNotEquals(595, sum(CheeseBurger));
    }

    @Test
    public void Build_A_Burger_With_Ingredient() {

        Ingredient ingredient = new Ingredient();

        ArrayList<Integer> Burger = new ArrayList<Integer>();

        Burger.add(ingredient.getBun());

        assertNotNull(Burger);
    }

    @Test
    public void Ingredient_Exit_In_List() {

        Ingredient ingredient = new Ingredient();

        assertNotNull(ingredient.getBlackGarlic());
    }



}
