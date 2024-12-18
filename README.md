# YandexCourses
Courses from Yandex Practical Java Developer    

![image](https://github.com/user-attachments/assets/ded8e140-4da6-453f-8f27-92de0a5e4586)

# Sprint 1

![image](https://github.com/user-attachments/assets/2a33a62a-e1d3-490d-8770-b4f5a95f33a5)

## Техническое задание проекта №1. Список покупок  
### Постановка задачи
Василий Иванович не доверяет курьерам и любит ходить по магазинам сам. Но есть одна проблема: иногда он забывает купить что-то важное. Например, выйдя за овощами для томатного супа, он может вернуться с полным пакетом продуктов, в котором есть всё, кроме томатов.   

Напишите приложение, которое поможет Василию Ивановичу и другим пользователям делать покупки по списку и ничего не забывать. 

Итак, вам нужно написать программу с консольным интерфейсом, которая будет представлять собой цифровой список покупок. Программа должна уметь выполнять четыре действия:
* добавить товар в список,
* показать список,
* очистить список,
* завершить работу.
  
После выполнения любого из первых трёх действий программа должна снова предложить список доступных действий. При выборе пункта «завершить работу», ей нужно остановиться.

Для простоты добавим ограничение на количество товаров: в список можно добавлять не более восьми наименований. Поэтому если пользователю нужно купить больше товаров, ему придётся предварительно выбрать восемь наиболее важных из них.

# Sprint 2

![image](https://github.com/user-attachments/assets/ff24ff1d-e30f-4c4b-9cb6-4bcb1d31a9e5)

## Техническое задание проекта №2. Счётчик калорий  
### Постановка задачи
Компания по производству спортивных носков решила разработать собственный счётчик калорий. Он будет дополнительно мотивировать покупателей вести здоровый образ жизни.

Написать прототип приложения поручили вам. Он будет работать в консоли и демонстрировать основные функции будущей программы.

В приложении должна быть реализована следующая функциональность:
* консольный интерфейс для управления программой;
* хранение данных о количестве пройденных шагов за несколько месяцев;
* ввод цели по количеству шагов в день;
* ввод пройденного количества шагов за день;
* вывод статистики за определённый месяц.

# Sprint 3

![image](https://github.com/user-attachments/assets/bd338339-c4af-44a3-8f17-45b3084cbada)

## Техническое задание проекта №3. Конструктор обеда
### Постановка задачи
Повара в ресторане умеют готовить много вкусных блюд. Но скомбинировать их между собой — непростая задача, которая отнимает много времени. Так что вам поручили разработать программу — генератор комбо-обедов. С ней сотрудникам ресторана будет проще составлять разнообразные комбинации. Можно приступать!

![image](https://github.com/user-attachments/assets/559ecfd5-07ec-47f3-bc9b-d8c3a4c955ae)


### Сценарии использования
У приложения будет два основных сценария использования. Работа с ним должна происходить так:
1. Сначала администрация ресторана добавляет в программу доступные для заказа блюда. Для этого пользователь вводит тип блюда (например, Первое, Второе, Напиток) и само название. Допустим, он может добавить блюдо Солянка мясная с типом Второе.
2. Когда доступные блюда сохранены, администрация ресторана переходит к генерации комбинаций для бизнес-ланча. Для этого пользователь указывает набор типов блюд, которые должны входить в бизнес-ланч. Например, Первое, Второе и Напиток. В ответ программа выводит одну или несколько возможных комбинаций из блюд этих типов. После одобрения администрацией ресторан сможет использовать получившиеся комбинации в меню бизнес-ланчей.
   
### Требования к интерфейсу
Перейдём к планированию реализации. Склонируйте шаблон проекта с GitHub.  Как и в предыдущих заданиях, приложение будет иметь консольный интерфейс. В этот раз мы уже подготовили для вас код интерфейса — вам остаётся реализовать только логику.

Опишем, как должна работать каждая из трёх команд приложения:
* 1 — добавление нового блюда. Программа поочерёдно запрашивает у пользователя тип и название блюда и сохраняет их. Пользователь может ввести любую строку в качестве типа или названия.
  **Пример**: в качестве типа блюда пользователь ввёл Напиток, а в качестве названия — Сок яблочный.
  
  ![image](https://github.com/user-attachments/assets/09dade29-6b75-460c-98a5-813bc061f99c)
* 2 — генерация комбинаций блюд. Приложение запрашивает у пользователя количество комбинаций, а затем список типов блюд, которые должны входить в эти комбинации. Программа генерирует несколько вариантов для одного и того же набора типов блюд. Условия:
  
  * каждый тип вводится с новой строки;
  * комбинации должны быть составлены из существующих блюд этих типов случайным образом;
  * количество типов блюд в комбинации не ограничено, при этом типы могут повторяться;
  * для завершения ввода пользователь должен ещё раз нажать Enter;
  * если пользователь ввёл несуществующий тип, программа должна вывести предупреждающее сообщение и предложить ввести другой тип.
**Пример**: пользователь запросил две комбинации для набора Напиток, Гарнир, Мясо. Тогда программа может вывести следующее: Морс облепиховый, Гречка, Котлета пожарская и Сок яблочный, Картофельное пюре, Поджарка мясная.

  ![image](https://github.com/user-attachments/assets/b1f91b38-000d-47a3-95c4-cf3307489555)
* 3 — выход из программы. При выборе этой команды программа должна завершить работу.

# Sprint 4

![image](https://github.com/user-attachments/assets/61726be5-8563-4e75-ae03-2138fe5ad0f3)

# Sprint 5  

![image](https://github.com/user-attachments/assets/e01ebd95-0543-4fab-8de5-8ce33596e934)
