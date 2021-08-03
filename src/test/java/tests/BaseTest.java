package tests;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import pages.PracticeFormPage;

public class BaseTest {

    protected PracticeFormPage practiceFormPage = new PracticeFormPage();
    protected Faker faker = new Faker();

    @BeforeAll
    static void setUp(){
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = false;
    }
}
