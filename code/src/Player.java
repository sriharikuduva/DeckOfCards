public class Player extends BasePlayer {
    private int bet, totalCash;

    public int getBet() {
        return bet;
    }
    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getTotalCash() {
        return totalCash;
    }
    public void setTotalCash(int totalCash) {
        this.totalCash = totalCash;
    }
}
