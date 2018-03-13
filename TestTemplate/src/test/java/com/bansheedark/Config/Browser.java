/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bansheedark.Config;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;
import java.io.File;

/**
 * Конфигурация браузера. 
 * В зависимости от проекта необходимо указать URL сайта в теле метода Connect() в методе open(URL).
 * @author danabol
 * @version 1.0.0
 */
public class Browser
{
    //<editor-fold desc="Field">

    /**
     * Путь до драйвера браузера в проекте.
     */
    private static String pathToDriver = "src/test/resources/drivers/chromedriver";
    /**
     * Имя драйвера.
     */
    private static String nameDriver = "webdriver.chrome.driver";
    /**
     * Имя браузера.
     */
    private static String nameBrowser = "Chrome";
    /**
     * Страница url-а.
     */
    private static String page = "";
    /**
     * Работа браузера в фоне.
     */
    private static boolean headless = false;
    /**
     * Закрытие окна браузера после выполнения теста (закрывает при false).
     */
    private static boolean holdBrowserOpen = false;
    /**
     * Файл драйвера.
     */
    private static File file;
// </editor-fold>

    //<editor-fold desc="Body">   
    /**
     * Устанавливает подключение с браузером.
     */
    public static void Connect()
    {
        file = new File(pathToDriver);
        System.setProperty(nameDriver, file.getAbsolutePath());
        System.setProperty("selenide.browser", nameBrowser);
        Configuration.headless = headless;
        Configuration.holdBrowserOpen = holdBrowserOpen;
        open("http://task.nindeco.com/" + page);//-изменять URL в соответствии с проектом.
    }
// </editor-fold>

    // <editor-fold desc="GetMethod">
    /**
     * Метод получает значение парамера {@link Browser#holdBrowserOpen}
     *
     * @return - возвращает false, при закрытии браузера после выполнения теста.
     */
    public static boolean GetHoldBrowserOpen()
    {
        return holdBrowserOpen;
    }

    /**
     * Метод получает значение парамера {@link Browser#pathToDriver}
     *
     * @return - возвращает относительный путь до драйвера.
     */
    public static String GetPathToDriver()
    {
        return pathToDriver;
    }

    /**
     * Метод получает значение парамера {@link Browser#file}
     *
     * @return - возвращает абсолютный путь до драйвера.
     */
    public static String GetAbsolutePathToDriver()
    {
        Browser.file = new File(pathToDriver);
        return file.getAbsolutePath();
    }

    /**
     * Метод получает значение парамера {@link Browser#headless}
     *
     * @return - true, если браузер запускается в фоновом режиме.
     */
    public static boolean GetHeadless()
    {
        return headless;
    }

    /**
     * Метод получает значение парамера {@link Browser#page}
     *
     * @return - возвращает стартовую страницу.
     */
    public static String GetPage()
    {
        return page;
    }

    /**
     * Метод получает значение парамера {@link Browser#nameDriver}
     *
     * @return - возвращает имя драйвера.
     */
    public static String GetNameDriver()
    {
        return nameDriver;
    }

    /**
     * Метод получает значение парамера {@link Browser#nameBrowser}
     *
     * @return - возвращает имя браузера.
     */
    public static String GetNameBrowser()
    {
        return nameBrowser;
    }
// </editor-fold>

    // <editor-fold desc="setMethod">
    /**
     * Метод устанавливает закрытие браузера после выполнения теста. Изменяет
     * параметр {@link Browser#holdBrowserOpen}
     *
     * @param holdBrowserOpen - true, браузер не закрывается. false, браузер
     * закрывается.
     */
    public static void setHoldBrowserOpen(boolean holdBrowserOpen)
    {
        Browser.holdBrowserOpen = holdBrowserOpen;
    }

    /**
     * Метод устанавливает относительный путь до файла драйвера браузера.
     * Изменяет параметр {@link Browser#pathToDriver} По умолчанию папка с
     * драйверами: "src/test/resources/drivers".
     *
     * @param pathToDriver - относительный путь файла драйвера.
     */
    public static void setPathToDriver(String pathToDriver)
    {
        Browser.pathToDriver = pathToDriver;
        Browser.file = new File(pathToDriver);
    }

    /**
     * Метод устанавливает запуск браузера в фоновом режиме. Изменяет параметр
     * {@link Browser#headless}
     *
     * @param headless - true, браузер запускается в фоновом режиме.
     */
    public static void setHeadless(boolean headless)
    {
        Browser.headless = headless;
    }

    /**
     * Метод устанавливает стартовую страницу сайта. Изменяет параметр
     * {@link Browser#page}
     *
     * @param page - страница, которую нужно открыть внутри URL сайта.
     */
    public static void setPage(String page)
    {
        Browser.page = page;
    }

    /**
     * Метод устанавливает имя драйвера. Изменяет параметр
     * {@link Browser#nameDriver}
     *
     * @param nameDriver - имя драйвера, вида "webdriver.chrome.driver".
     */
    public static void setNameDriver(String nameDriver)
    {
        Browser.nameDriver = nameDriver;
    }

    /**
     * Метод устанавливает имя браузера. Изменяет параметр
     * {@link Browser#nameBrowser}
     *
     * @param nameBrowser - имя браузера, вида "chrome".
     */
    public static void setNameBrowser(String nameBrowser)
    {
        Browser.nameBrowser = nameBrowser;
    }
// </editor-fold>
}
