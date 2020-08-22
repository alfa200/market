package steps;

import pages.ElectronicsAllFiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicsAllFiltersSteps {

    @Step("Установить нижнию границу цены {0}")
    public void stepFillLowestPrice(String lowPrice) {
        ElectronicsAllFiltersPage electronicsAllFiltersPage = new ElectronicsAllFiltersPage(BaseSteps.getDriver());
        electronicsAllFiltersPage.fillField(electronicsAllFiltersPage.getLowPrice(), lowPrice);
    }

    @Step("Установить производителя {0}")
    public void stepSelectProducer(String lowPrice) {
        ElectronicsAllFiltersPage electronicsAllFiltersPage = new ElectronicsAllFiltersPage(BaseSteps.getDriver());
        electronicsAllFiltersPage.fillField(electronicsAllFiltersPage.getProducer(), lowPrice);
        electronicsAllFiltersPage.selectFirstProducer();
    }

    @Step("Нажать Показать предложения")
    public void stepСlickShowAllOffersButton() {
        ElectronicsAllFiltersPage electronicsAllFiltersPage = new ElectronicsAllFiltersPage(BaseSteps.getDriver());
        electronicsAllFiltersPage.clickShowAllOffersButton();
    }



}
