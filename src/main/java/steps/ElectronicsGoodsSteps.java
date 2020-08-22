package steps;

import pages.ElectronicsGoodsPage;
import ru.yandex.qatools.allure.annotations.Step;


public class ElectronicsGoodsSteps {

    @Step("Переход в Все фильтры")
    public void stepClickAllFiltersButton(){
        new ElectronicsGoodsPage(BaseSteps.getDriver()).clickAllFiltersButton();
    }

    @Step("Проверка: количество товаров равно {0}")
    public void stepCheckElementsQuantity(String quantity){
        new ElectronicsGoodsPage(BaseSteps.getDriver()).checkElementsQuantity(quantity);
    }

    @Step("Сохраняет наименование первого элемента")
    public void stepSaveFirstArticleText()  {
        new ElectronicsGoodsPage(BaseSteps.getDriver()).setFirstArticleText();
    }

    @Step("Вводит название первого телевизора в поисковую строку")
    public void stepInputFirstArticle() {
        ElectronicsGoodsPage electronicsGoodsPage = new ElectronicsGoodsPage(BaseSteps.getDriver());
        electronicsGoodsPage.fillField(electronicsGoodsPage.getHeaderSearch(), electronicsGoodsPage.getFirstArticleText());
    }
    @Step("Нажать Найти")
    public void stepPressSubmitButton(){
        new ElectronicsGoodsPage(BaseSteps.getDriver()).pressSubmitButton();
    }

    @Step("Проверка наименования найденного товара")
    public void stepCheckFoundTv() {
        new ElectronicsGoodsPage(BaseSteps.getDriver()).checkFounDTv();
    }


}
