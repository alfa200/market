package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TvPage;

import java.util.ArrayList;
import java.util.List;


public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    TvSteps tvSteps = new TvSteps();
    TvAllFiltersSteps tvAllFiltersSteps = new TvAllFiltersSteps();


    @When("^Переход на страницу Маркета$")
    public void selectMarketLink() {
        mainSteps.stepSelectMarketLink();
    }

    @When("^Переход на страницу Электроника$")
    public void selectElectronicsLink() {
        marketSteps.stepSelectElectronicsLink();
    }

    @When("^Переход на страницу Телевизоры$")
    public void selectTvLink() {
        electronicsSteps.stepSelectTvLink();
    }

    @When("^Переход в Все фильтры$")
    public void clickAllFiltersButton(){
        tvSteps.stepClickAllFiltersButton();
    }

    @When("^устанавливает нижнюю гриницу цены \"(.+)\"$")
    public void fillLowestPrice(String lowPrice){
        tvAllFiltersSteps.stepFillLowestPrice(lowPrice);
    }

    @When("^устанавливает марку \"(.+)\"$")
    public void selectProducer(String producer){
        tvAllFiltersSteps.stepSelectProducer(producer);
    }

    @When("^отображает отобранные товары")
    public void clickShowAllOffersButton(){
        tvAllFiltersSteps.stepСlickShowAllOffersButton();
    }

    @When("^считает колиечество товаров \"(.+)\"$")
    public void checkElementsQuantity(String quantity){
        BaseSteps.getDriver().switchTo().frame(0);
        List<WebElement> list = BaseSteps.getDriver().findElements(By.xpath("//div[2]/div[5]/div[6]/div/div[1]/div/div/div/article"));
        System.out.println("sdfdfdsfsdfs   " + list.size());
        //tvSteps.stepCheckElementsQuantity(quantity);
    }


}
