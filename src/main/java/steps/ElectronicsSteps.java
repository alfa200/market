package steps;

import pages.BasePage;
import pages.ElectronicsPage;
import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicsSteps {

    @Step("Перейти в раздел Телевизоры")
    public void stepSelectTvLink(){
        new ElectronicsPage(BaseSteps.getDriver()).selectTvLink();
    }
}
