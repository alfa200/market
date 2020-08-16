package steps;

import pages.TvAllFiltersPage;
import pages.TvPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TvAllFiltersSteps {

    @Step("Установить нижнию границу цены {0}")
    public void stepFillLowestPrice(String lowPrice) {
        TvAllFiltersPage tvAllFiltersPage = new TvAllFiltersPage(BaseSteps.getDriver());
        tvAllFiltersPage.fillField(tvAllFiltersPage.getLowPrice(), lowPrice);
    }

    @Step("Установить производителя {0}")
    public void stepSelectProducer(String lowPrice) {
        TvAllFiltersPage tvAllFiltersPage = new TvAllFiltersPage(BaseSteps.getDriver());
        tvAllFiltersPage.fillField(tvAllFiltersPage.getProducer(), lowPrice);
        tvAllFiltersPage.selectFirstProducer();
    }

    @Step("Нажать Показать предложения")
    public void stepСlickShowAllOffersButton() {
        TvAllFiltersPage tvAllFiltersPage = new TvAllFiltersPage(BaseSteps.getDriver());
        tvAllFiltersPage.clickShowAllOffersButton();
    }



}
