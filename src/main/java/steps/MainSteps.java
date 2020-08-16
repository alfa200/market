package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {

    @Step("Перейти в Маркет")
    public void stepSelectMarketLink(){
        MainPage mainPage = new MainPage(BaseSteps.getDriver());
        mainPage.selectMarketLink();
        mainPage.swichTab();
    }


}
