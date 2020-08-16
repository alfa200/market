package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

    @Step("^Перейти в раздел Электроника$")
    public void stepSelectElectronicsLink(){
        new MarketPage(BaseSteps.getDriver()).selectElectronicsLink();

    }


}
