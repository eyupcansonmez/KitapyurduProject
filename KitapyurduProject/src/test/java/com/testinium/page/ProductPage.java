package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void scrollAndSelect() {

        methods.sendKeys(By.id("search-input"), "oyuncak");
        methods.waitBySeconds(3);
        methods.click(By.xpath("//span[@class='common-sprite button-search']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("(//div[@class='product-cr'])[9]"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.id("bottom-button"));
        methods.waitBySeconds(3);
        logger.info("Scroll edildi.");

        methods.click(By.xpath("(//a[@class='add-to-favorites'])[9]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("(//a[@class='add-to-favorites'])[10]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("(//a[@class='add-to-favorites'])[11]"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("(//a[@class='add-to-favorites'])[12]"));
        methods.waitBySeconds(3);

        Assert.assertTrue(methods.isElementVisible(By.id("swal2-title")));
        logger.info("4 ürün favorilere eklendi.");

        methods.click(By.xpath(("//div[@class='logo-text']")));
        methods.waitBySeconds(3);

    }
    public void goPointCatalog() {

        methods.click(By.xpath(("(//a[@class='common-sprite'])[8]")));
        methods.waitBySeconds(3);

        methods.click(By.xpath(("(//img[@class='landing-button'])[2]")));
        methods.waitBySeconds(3);

        methods.selectByText(By.cssSelector(".sort>select"), "Yüksek Oylama");
        methods.waitBySeconds(5);

        // Tüm Kitaplar

        methods.click(By.xpath(("(//li[@class='has-open-menu'])[3]")));
        methods.waitBySeconds(3);

        // Hobi

        methods.click(By.xpath(("//a[@href='kategori/kitap-hobi/1_212.html']")));
        methods.waitBySeconds(3);

        // Random Ürün

        methods.click(By.xpath(("(//div[@class='name ellipsis'])[3]")));
        methods.waitBySeconds(3);

        // Sepete Ekle

        methods.click(By.xpath(("//a[@id='button-cart']")));
        methods.waitBySeconds(3);

        // Listelerim - Favlarım

        methods.click(By.xpath(("(//a[@class='common-sprite'])[3]")));
        methods.waitBySeconds(3);

        methods.click(By.xpath(("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']")));
        methods.waitBySeconds(3);

        // Favdan Sil

        methods.click(By.xpath(("(//i[@class='fa fa-heart-o'])[3]")));
        methods.waitBySeconds(3);

    }
}
