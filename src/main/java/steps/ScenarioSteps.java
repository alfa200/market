package steps;

import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TvPage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    TvSteps tvSteps = new TvSteps();
    TvAllFiltersSteps tvAllFiltersSteps = new TvAllFiltersSteps();
    BaseSteps baseSteps = new BaseSteps();

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
        tvSteps.stepCheckElementsQuantity(quantity);
    }

    @When("^Запомнить первый элемент в списке$")
    public void saveFirstArticleText() throws IOException {
        tvSteps.stepSaveFirstArticleText();
    }

    @When("^Вводит в поисковую строку запомненное значение$")
    public void inputSavedArticle() throws IOException {
        tvSteps.stepInputFirstArticle();
    }

    @When("^Нажимает Найти$")
    public void pressSubmitButton() {
        tvSteps.stepPressSubmitButton();
    }

    @When("^Проверяет наименование найденного товара$")
    public void checkFoundTv() throws IOException {
        tvSteps.stepCheckFoundTv();
    }
}
