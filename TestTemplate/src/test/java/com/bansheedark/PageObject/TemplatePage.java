/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bansheedark.PageObject;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import com.codeborne.selenide.SelenideElement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.Point;

/**
 * Каждая страница на сайте имеет свою PageObject в проекте.
 *
 * @author danabol
 */
public class TemplatePage
{

    /*
    Вызов шаблона кода (шаблон + TAB).
    Виды шаблонов:
    csm - клик по объекту.
    gsm - возврат текста объекта.
    lsm - возврат List<SelenideElement>. 
    cntsm - возврат кол-во эл-в в list.
     */
    // <editor-fold desc="Field">
    /**
     * Параметр log. Обращаться из класса для записи лога.
     */
    private static Logger log;
// </editor-fold>

    /**
     * Конструктор страницы объектов. Указывает имя класса, записи которого
     * будут вносится в лог.
     */
    public TemplatePage()
    {
        log = Logger.getLogger(TemplatePage.class.getName());
    }

    // <editor-fold desc="click">
    /**
     * Метод ожидает пока объект перейдет в активное состояния. Прокручивает
     * страницу до объекта и нажимает.
     *
     * @location - Вносит координаты объекта в log.
     */
    public void clickMethod()
    {
        $("selector").shouldBe(enabled).scrollIntoView("{block: \"end\"}").click();
        Point location = $("selector").getLocation();
        log.log(Level.INFO, "Clicking clickMethod: {0}", new Object[]
        {
            location
        });
    }
// </editor-fold>
    // <editor-fold desc="Get">

    /**
     * Метод возвращает текст объекта.
     *
     * @return - возвращает текст объекта в log.
     */
    public String GetMethod()
    {
        String text = $("selector").shouldBe(visible).getText();
        log.log(Level.INFO, "Get text GetMethod : {0}", new Object[]
        {
            text
        });
        return text;
    }
// </editor-fold>
    // <editor-fold desc="list">

    /**
     * Метод возвращает список объектов. Использовать логирование при
     * необходимости (замедляет выполнение теста).
     *
     * @return - возвращает объекты SelenideElement.
     */
    public List<SelenideElement> listObj()
    {
        List<SelenideElement> list = $$("selector");
        /*log.log(Level.INFO, "Get listObj: {0}", new Object[]
    {
        list.toString()
    });*/
        return list;
    }
// </editor-fold>
    // <editor-fold desc="count">

    /**
     * Метод возвращает кол-во элементов в {@code List<SelenideElement>}
     *
     * @param list - параметр принимает {@code List<SelenideElement>}
     * @return - возвращает list.size();
     */
    public int countList(List<SelenideElement> list)
    {
        int count = list.size();
        log.log(Level.INFO, "Get countList : {0}", new Object[]
        {
            count
        });
        return count;
    }
// </editor-fold>
}
