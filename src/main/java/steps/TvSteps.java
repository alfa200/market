package steps;

import org.junit.Assert;
import pages.TvPage;
import ru.yandex.qatools.allure.annotations.Step;


public class TvSteps {

    @Step("Переход в Все фильтры")
    public void stepClickAllFiltersButton(){
        new TvPage(BaseSteps.getDriver()).clickAllFiltersButton();
    }

    @Step("Проверка: количество товаров равно {0}")
    public void stepCheckElementsQuantity(String quantity){
        Assert.assertTrue(String.valueOf(new TvPage(BaseSteps.getDriver()).getArticle().size()).equals(quantity));
    }

}
