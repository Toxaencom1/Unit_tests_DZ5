package seminars.DZ5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NoteBookAPPTest {

//    // NoteBookService
//    @BeforeEach
//    void setup(){
//        // Делаем заготовку заглушки mock для зависимости ContactRepository или делаем Fake заглушку
//    }
//
//    @Test
//    void addContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем добавление контакта
//    }
//
//    @Test
//    void getAllContactsTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем получение списка всех контактов
//    }
//
//    @Test
//    void deleteContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем удаление контакта
//    }
//
//    @Test
//    void updateContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем обновление контакта
//    }
//
//    @Test
//    void findContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем получение контакта по Id
//    }
//
//    @Test
//    void findContactByNameTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем полученный список контактов найденных по имени
//    }

//    // NoteBookController
//    @BeforeEach
//    void setup(){
//        // Делаем заготовку mock заглушки для зависимости NoteBookService и UI
//    }
//
//    @Test
//    void findContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем вызов метода получение контакта по Id для тестов по удалению и обновлению
//    }
//
//    @Test
//    void addContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем вызов метода добавление контакта
//    }
//
//    @Test
//    void showAllContactsTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем вызов метода для показа списка всех контактов у пользователя
//    }
//
//    @Test
//    void deleteContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем вызов метода с параметром для удаления контакта
//    }
//
//    @Test
//    void updateContactTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем вызов метода с параметром для обновления контакта
//    }
//
//    @Test
//    void showContactFoundByNameTest(){
//        // Тип: Unit
//        // Краткое описание: Проверяем вызов метода с параметрами для показа списка контактов найденных по имени
//    }

    // UI tests
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7})
    void checkMenuChoice(int choice){
        // Тип: Unit
        // Краткое описание: Проверяем вызов методов с параметром
    }

    // Интеграционное тестирование:
    @Test
    void testConnectionWithDB(){
        // Тип: Integration tests
        // Краткое описание: Проверка соединения с базой данных
    }

    @Test
    void testServiceInteractionWithRepository(){
        // Тип: Integration tests
        // Краткое описание: Проверка взаимодействия классов с их реальными объектами (Controller - Repository)
    }

    @Test
    void checkingInteractionBetweenServicesAndControllerTest(){
        // Тип: Integration tests
        // Краткое описание: Проверка взаимодействия классов с их реальными объектами (Controller - Service)
    }

    @Test
    void checkingInteractionWithUserInterfaceTest(){
        // Тип: Integration tests
        // Краткое описание: Проверка взаимодействия классов с их реальными объектами (Controller - UI)
    }

    // Сквозное тестирование

    @Test
    void fastTestAddAndDisplayContact() {
        // Тип: end-to-end testing
        // Краткое описание: Быстрая проверка работы приложения в полном, интегрированном окружении, проверка,
        // что пользователь может успешно добавлять новый контакт и просматривать его в списке.
    }



    @Test
    void slowTestCheckAllFunctionsAndDisplayContacts() {
        // Тип: end-to-end testing
        // Краткое описание: Медленная проверка работы приложения в полном, интегрированном окружении,
        // проверка всех функций и просмотр списка контактов.
    }
}
