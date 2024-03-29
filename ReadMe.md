# Short description

1. Программа для удобства выполнена в **консольном** виде
2. В данной программе реализован паттерн **MVC**
    - У нас есть **Модель** - комплексное число и сервис который позволяет с этим числом работать
    - Также есть **Интерфейс** - **ViewInterface**, который имплементировали в класс **View**
    - Класс **View** предоставляет информацию из Модели пользователю
    - Функцию **Контроллера** выполняет Класс Controller, который обрабатывает действия пользователя 
   и вносит изменения в Модель
3. В программе соблюдаются принципы ***SOLID***
    - **№1 Single responsibility principle**
        - Каждый класс в программе имеет одну ответственность
    - **№2 Open-closed principle**
        - На основе существующих классов можно создавать новые, реализуя методы по иному 
        и расширяя новый класс новыми методами
    - **№3 Liskov substitution principle**
        - Для наглядности соблюдения этого принципа в папке Data был создан класс AnotherNumber его можно 
        использовать на месте родительского
    - **№4 Interface segregation principle**
        - Нет *"тяжёлых"* интерфейсов. Все интерфейсы реализуют методы необходимые пользователю 
        и каждый отвечает за функции одного типа
    - **№5 Dependency inversion principle**
        - Модули высокого уровня не зависят от модулей нижнего уровня
4. Логирование реализованно с помощью класса **Logger**, c записью событий в файл *log.txt*.