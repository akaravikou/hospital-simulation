package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class CardIndex {

    private static final Logger LOGGER = LogManager.getLogger(CardIndex.class);

    private List<PersonCard> cards;

    public CardIndex(List<PersonCard> cards) {
        this.cards = cards;
    }

    public List<PersonCard> getCards() {
        return cards;
    }

    public void setCards(List<PersonCard> cards) {
        this.cards = cards;
    }

    public void addCard(PersonCard card) {
        this.cards.add(card);
    }

    public void print() {
        LOGGER.info("Printing the list of cards");
        for (PersonCard card : cards) {
            LOGGER.info("-----------------------------");
            card.print();
        }
    }
}
