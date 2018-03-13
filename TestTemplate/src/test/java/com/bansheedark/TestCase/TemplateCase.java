/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bansheedark.TestCase;

import static com.codeborne.selenide.Selenide.close;
import com.bansheedark.Config.Browser;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Для проверки каждого сценария функционала, необходим отдельный TestCase.
 * @author danabol
 */
public class TemplateCase
{
    //<editor-fold desc="Field">

// </editor-fold>
    /**
     * Метод устанавливает параметры браузера перед запуском теста.
     *
     * @throws Exception - исключение при ошибки в установках теста.
     */
    @BeforeClass
    public static void setupTest() throws Exception
    {
        //Browser.setHeadless(true);//-запускает браузер в фоновом режиме.
        //Browser.setHoldBrowserOpen(true);//-не закрывает браузер после завершения теста, игнорируя close().
        //Browser.setPage("page");//-устанавливает стартовую страницу.
        Browser.Connect(); //-запускает браузер.
    }

    /**
     * Метод выполняет тест.
     *
     * @throws Exception - исключение при ошибки в выполнении теста.
     */
    @Test
    public void testClassName() throws Exception//тест для удачной авторизации
    {
        
    }

    /**
     * Метод закрывает тест. Метод может содержать инструкции для закрытия
     * каких-либо подключений, браузера, сохранения логов и т.п.
     *
     * @throws Exception - исключение при ошибки после завершения теста.
     */
    @AfterClass
    public static void closeTest() throws Exception
    {
        close();// - закрывает browser. Игнорируется, если Browser.setHoldBrowserOpen(true);
    }
}
