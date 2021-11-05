package com.solvd.hospital2.maintainance;

import com.solvd.hospital2.personal_info.Dietable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Canteen<C> {

    private static final Logger LOGGER = LogManager.getLogger(Canteen.class);

    private C cooks;

    public C getCooks() {
        return cooks;
    }

    public void setCooks(C cooks) {
        this.cooks = cooks;
    }

    public void cookDinnerForPeople(List<Dietable> diets) {
        for (Dietable diet : diets) {
            LOGGER.info("Cooking dinner for a person, " + diet.getDinnerFood());
        }
    }

    public void cookBreakfastForPeople(List<Dietable> diets) {
        for (Dietable diet : diets) {
            LOGGER.info("Cooking breakfast for a person, " + diet.getBreakfastFood());
        }
    }
}

