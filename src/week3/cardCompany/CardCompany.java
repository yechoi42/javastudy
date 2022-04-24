package week3.cardCompany;

public class CardCompany {
    private CardCompany() {}

    static int cardNum = 1000;

    private static class CardCompanyHolder {
        private static final CardCompany instance = new CardCompany();
    }

    public static CardCompany getInstance() {
        return CardCompanyHolder.instance;
    }

    public static Card createCard() {
        ++cardNum;
        return new Card(cardNum);
    }
}
