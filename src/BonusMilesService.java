public class BonusMilesService {
    public int calculate(int cost) {
        int condition = 20;
        int bonus = cost / condition;
        return bonus;
    }
}