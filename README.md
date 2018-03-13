# TestFAQ
Методичка по алгоритму тестирования веб-сайтов и настройки NetBeans IDE для автоматизированного тестирования.

## <a name="autotest">Автоматизированное тестирование
* [Разворачивание проекта](#deploy)
* [Структура проекта](#struc)
* [Настройка проекта](#settings)
* [Импорт настроек NetBeans](#import)
* [Шаблоны кодов и классов NetBeans](#tmpcode)
* [Ссылки на документацию](#linkdoc)

## <a name="deploy"> Разворачивание проекта

1. Клонировать шаблон проекта командой:
<pre>
git clone http://git.nindeco.com/general.tests -b template
</pre>
2. Открыть папку проекта перейти в +src/test/+ и выдать права для файлов в папке, выполнив команду:
<pre>
chmod -R +x ./resources/
</pre>
3. Открыть NetBeans и убедиться, что есть поддержка проекта Maven.
4. Открыть проект +TestTemplate+.
5. Нажать ПКМ на Тестовые зависимости => Загрузить объявленные зависимости.
6. Нажать ПКМ на Тестовые зависимости => Загрузить документацию javadoc.
7. Собрать проект.

## <a name="struc"> Структура проекта

### Тесты

* _com.nindeco.Config_ - пакет с конфигурацией проекта.
  * _com.nindeco.Config.Browser_ - Java класс для конфигурации браузера.
* _com.nindeco.PageObject_ - пакет с Java классами, используется паттерн PageObject(Встроен в Selenide).
  * _com.nindeco.PageObject.TemplatePage_ - Java класс, содержащий объекты страницы сайта и методы для взаимодействия с ними.
* _com.nindeco.TestCase_ - пакет, содержащий тест кейсы.
  * _com.nindeco.TestCase.TemplateCase_ - Java класс, содержащий описание теста и его выполнение.

### Другие исходные файлы тестов

* _src/test/resources_ - директория, где лежат все ресурсы для тестирования.
  * _src/test/resources/drivers_ - директория, где лежат все драйвера для браузера.
  * _src/test/resources/images_ - директория, где лежат все картинки для использования их в тестах.

### Файлы проекта

* _pom.xml_ - файл в котором указывается вся информация о конфигурации проекта ( подключаемые зависимости, папки с ресурсами, плагины).

## <a name="settings"> Настройка проекта

Необходимо настроить Java класс _com.nindeco.Config.Browser_ под выполняемый проект.<br/>
В методе Connect() необходимо во вложенном методе _open("URL")_ изменить _URL_ на используемый в проекте _URL_ сайта.<br/>

## <a name="import"> Импорт настроек NetBeans

Для получения доступа к шаблонам кодов и классов, необходимо их импортировать в NetBeans.<br/>
[Файл настроек](http://task.nindeco.com/attachments/download/473/.netbeans.zip)<br/>

## <a name="tmpcode"> Шаблоны кодов и классов NetBeans

В проекте использовать шаблоны классов:
* Для пакета _com.nindeco.PageObject_ использовать класс Java - "PageObject".
* Для пакета _com.nindeco.TestCase_ использовать класс Java - "TestCase".

Шаблоны используются для облегченного и быстрого написания тестов. В шаблонах присутствует заполненная документация JavaDoc.<br/>
Применение шаблона (шаблон + TAB).<br/>
Постфикс _sm_ в шаблоне указывает на сокращение sELENIUm.<br/>
Шаблоны:
* csm - клик по объекту.
* gsm - возврат текста объекта.
* lsm - возврат List<SelenideElement>. 
* cntsm - возврат кол-во эл-в в list.

## <a name="linkdoc"> Ссылки на документацию

* [Java.](https://docs.oracle.com/javase/7/docs/api/)
* [Maven.](http://maven.apache.org/guides/)
* [Selenium.](https://www.seleniumhq.org/docs/)
* [JUnit.](https://junit.org/junit4/javadoc/latest/)
* [Selenide.](http://ru.selenide.org/documentation.html)
* [Локаторы.](https://kreisfahrer.gitbooks.io/selenium-webdriver/content/webdriver_api_slozhnie_vzaimodeistviya/lokatori_css,_xpath,_jquery.html)
* [Логирование Java.](https://habrahabr.ru/post/130195/)

