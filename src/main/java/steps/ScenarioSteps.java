package steps;

import cucumber.api.java.en.When;


public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    ElectronicsGoodsSteps electronicsGoodsSteps = new ElectronicsGoodsSteps();
    ElectronicsAllFiltersSteps electronicsAllFiltersSteps = new ElectronicsAllFiltersSteps();


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

    @When("^Переход на страницу Наушники и Bluetooth-гарнитуры$")
    public void selectHeadphonesLink() {
        electronicsSteps.stepSelectHeadphonesLink();
    }

    @When("^Переход в Все фильтры$")
    public void clickAllFiltersButton(){
        electronicsGoodsSteps.stepClickAllFiltersButton();
    }

    @When("^устанавливает нижнюю гриницу цены \"(.+)\"$")
    public void fillLowestPrice(String lowPrice){
        electronicsAllFiltersSteps.stepFillLowestPrice(lowPrice);
    }

    @When("^устанавливает марку \"(.+)\"$")
    public void selectProducer(String producer){
        electronicsAllFiltersSteps.stepSelectProducer(producer);
    }

    @When("^отображает отобранные товары")
    public void clickShowAllOffersButton(){
        electronicsAllFiltersSteps.stepСlickShowAllOffersButton();
    }

    @When("^считает колиечество товаров \"(.+)\"$")
    public void checkElementsQuantity(String quantity){
        electronicsGoodsSteps.stepCheckElementsQuantity(quantity);
    }

    @When("^Запомнить первый элемент в списке$")
    public void saveFirstArticleText() {
        electronicsGoodsSteps.stepSaveFirstArticleText();
    }

    @When("^Вводит в поисковую строку запомненное значение$")
    public void inputSavedArticle() {
        electronicsGoodsSteps.stepInputFirstArticle();
    }

    @When("^Нажимает Найти$")
    public void pressSubmitButton() {
        electronicsGoodsSteps.stepPressSubmitButton();
    }

    @When("^Проверяет наименование найденного товара$")
    public void checkFoundTv() {
        electronicsGoodsSteps.stepCheckFoundTv();
    }
}
