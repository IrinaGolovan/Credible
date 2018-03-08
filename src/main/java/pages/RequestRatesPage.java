package pages;

import org.openqa.selenium.By;
import webcomponents.Tab;


public class RequestRatesPage {

    private Tab request_rates_tab = new Tab(By.xpath(".//li[contains(text(), 'Request Rates')]"));

    public boolean isRequestRatesPageAvailable(){
        request_rates_tab.waitForElementsToBePresent(40);
        if(request_rates_tab.isDisplayed()){
            return true;
        }
        return false;
    }
}
