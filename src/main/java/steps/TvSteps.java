package steps;

import pages.TvPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.IOException;


public class TvSteps {

    @Step("Переход в Все фильтры")
    public void stepClickAllFiltersButton(){
        new TvPage(BaseSteps.getDriver()).clickAllFiltersButton();
    }

    @Step("Проверка: количество товаров равно {0}")
    public void stepCheckElementsQuantity(String quantity){
        new TvPage(BaseSteps.getDriver()).checkElementsQuantity(quantity);
    }

    @Step("Сохраняет наименование первого элемента")
    public void stepSaveFirstArticleText() throws IOException {
        new TvPage(BaseSteps.getDriver()).setFirstArticleText();
    }

    @Step("Вводит название первого телевизора в поисковую строку")
    public void stepInputFirstArticle() throws IOException {
        TvPage tvPage = new TvPage(BaseSteps.getDriver());
        tvPage.fillField(tvPage.getHeaderSearch(), tvPage.readFirstArticleText());
    }
    @Step("Нажать Найти")
    public void stepPressSubmitButton(){
        new TvPage(BaseSteps.getDriver()).pressSubmitButton();
    }

    @Step("Проверка наименования найденного товара")
    public void stepCheckFoundTv() throws IOException {
        new TvPage(BaseSteps.getDriver()).checkFounDTv();
    }


}
