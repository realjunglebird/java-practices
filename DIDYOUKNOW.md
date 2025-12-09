# Вопросы для самопроверки по Java
В этом документе собраны вопросы для самостоятельной проверки знания языка программирования Java!

## Основы Java

1.  **Что такое куча?**  
    **Куча (Heap)** — это область памяти в Java Runtime, где хранятся все объекты и массивы, создаваемые в Java-программе с использованием ключевого слова `new`. Память в куче автоматически управляется сборщиком мусора (Garbage Collector).

2.  **Из каких трёх частей состоит куча?**  
    Куча разделена на несколько областей:
    *   **Young Generation (Молодое поколение)**
    *   **Old Generation (Старое поколение)**
    *   **Metaspace (до Java 8 на её месте была Permanent Generation)**

3.  **Чем отличается PermGen от Metaspace?**  
    *   **PermGen (Permanent Generation)** - это специальное место в куче, отделенное от основной памяти. Здесь виртуальная машина хранит метаданные загруженных классов. Полностью удалена в Java 8.
    *   **Metaspace** - новая область памяти, заменившая устаревшую PermGen. Основное их отличие заключается в способе распределения памяти. Metaspace выделяется из памяти нативной ОС, а не JVM. Это улучшило масштабируемость.

4.  **Что такое стек?**  
    **Stack (Стек)** - используется для хранения примитивных типов данных (например int, float, char) и ссылок на объекты в куче. Каждый поток имеет свой собственный стек,  который управляет вызовами методов, их параметрами, локальными переменными и возвращаемыми значениями. В отличие от кучи, память в стеке выделяется и освобождается автоматически, при вызове и завершении методов. 

5.  **Какой минимальный набор методов нужен для реализации стека?**
    - `push(item)` - добавить элемент на вершину
    - `pop()` - удалить элемент с вершины и вернуть его
    - `peek()` - вернуть элемент с вершины без удаления

5.  **Что находится в библиотеке java.lang?**  
    Пакет java.lang содержит фундаментальные классы и интерфейсы Java. Он импортируется автоматически в каждую Java-программу. Основные элементы:
    *   Базовые классы: `Object`, `Class`, `String`, `StringBuilder`, `StringBuffer`.
    *   Классы-обертки для примитивов: `Integer`, `Double`, `Boolean` и т.д.
    *   Классы для работы с исключениями: `Throwable`, `Error`, `Exception`, `RuntimeException`.
    *   Системные классы: `System`, `Runtime`.
    *   Математические функции: `Math`, `StrictMath`.
    *   Классы для многопоточности: `Thread`, `Runnable`.

6.  **Что такое JDK и из чего он состоит?**  
    **JDK (Java Development Kit)** — это программный комплект разработчика приложений на Java, который предоставляет все необходимые инструменты для разработки и компиляции Java приложений. Он включает в себя:
    *   **JRE (Java Runtime Environment)** для запуска программ.
    *   **Java Compiler (javac)** - компилятор, который преобразует исходный код Java (файлы с расширением .java) в байт-код (файлы с расширением .class), который может выполняться на виртуальной машине Java (JVM).
    *   **Java Debugger (jdb)** - отладчик, позволяющий разработчикам анализировать и устранять ошибки в коде.
    *   **Javadoc** - инструмент для генерации документации на основе комментариев в исходном коде Java.

7.  **Что такое JRE и из чего оно состоит?**  
    **JRE (Java Runtime Environment)** - это окружение, необходимое для исполнения Java-программ. Оно включает в себя следующие компоненты:
    *   **JVM (Java Virtual Machine)** - виртуальная машина, которая исполняет байт-код Java. JVM отвечает за управление памятью, интерпретацию или компиляцию байт-кода, обработку исключений и управление потоками.
    *   **Библиотеки стандартных классов** - набор классов, который предоставляет функциональность, необходимую для выполнения большинства задач, таких как работа со вводом/выводом, коллекциями, сетевыми соединениями и многопоточностью.
    *   **Классы поддержки** - дополнительные классы, обеспечивающие работу JVM и взаимодействие с операционной системой.

8.  **Что такое JVM и из чего она состоит?**  
    **JVM** - это центральный компонент платформы Java, который обеспечивает независимость кода от операционной системы и аппаратной архитектуры. JVM является частью JRE. JVM состоит из следующих компонентов:
    *   **Class Loader** - модуль, который отвечает за загрузку классов в память. Class Loader выполняет динамическую загрузку классов во время выполнения программы и позоляет JVM загружать классы из различных источников, таких как файловая система или сеть.
    *   **Execution Engine** - модуль, который отвечает за выполнение байт-кода. Execution Engine может использовать интерпретацию байт-кода или **JIT( Just-In-Time)** компиляцию для преобразования байт-кода в машинный код и его выполнения.
    *   **Garbage Collector (GC)** - механизм автоматического управления памятью, который освобождает память, занимаемую объектами, которые больше не используются программой. GC помогает избежать утечек памяти и обеспечивает стабильную работу приложений.
    *   **Runtime Data Areas** - модули, которые управляют памятью, выделяемой для исполнения программы. Это включает в себя стек потока, кучу (heap), область для хранения методов и область для хранения постоянных данных.

9.  **Перечислить все примитивные типы данных?**  
    В Java 8 примитивных типов:
    *   Целочисленные: **byte** (8 бит), **short** (16 бит), **int** (32 бита), **long** (64 бита)
    *   С плавающей точкой: **float** (32 бита), **double** (64 бита)
    *   Символьный: **char** (16 бит, Unicode)
    *   Логический: **boolean** (точный размер не определен, обычно 1 бит)

10. **Перечислить диапозоны примитивных типов данных**   
    *   **`byte`** - 8 бит -> от -2^7 до 2^7 - 1
    *   **`short`** - 16 бит -> от -2^15 до 2^15 - 1
    *   **`int`** - 32 бита -> от -2^31 до 2^31 - 1
    *   **`long`** - 64 бита -> от -2^63 до 2^63 - 1

    *   **`float`** - 32 бита -> от -10^38 до 10^38
    *   **`double`** - 64 бита -> от -10^308 до 10^308

    *   **`char`** - 16 бит -> от 0 до 65'535 (2^16)


11. **Что такое инструменты для непрерывной интеграции и деплоя?**  
    Это инструменты, которые автоматизируют процессы сборки, тестирования и развертывания приложений.
    *   Непрерывная интеграция (CI): Jenkins, GitLab CI, Travis CI, CircleCI, TeamCity.
    *   Непрерывное развертывание/доставка (CD): Инструменты оркестрации, такие как Kubernetes, Docker Swarm; системы управления конфигурацией, такие как Ansible, Chef, Puppet; и серверы приложений, такие как Tomcat, JBoss.


## Интерфейсы

1.  **Что такое интерфейс?**  
    **Интерфейс** — это аналогичная классу абстрактная конструкция для определения общих операций над объектами. До Java 8 он мог содержать только объявления методов (сигнатуры без тел) и static final константы. Начиная с Java 8, интерфейсы могут содержать методы с реализацией по умолчанию (`default` methods) и статические методы (`static` methods). Интерфейс определяет контракт, который обязуются выполнять классы, его реализующие.

2.  **Какими являются поля интерфейса по умолчанию?**  
    Все поля, объявленные в интерфейсе, по умолчанию являются public, static и final. Это означает, что они:
    *   public — доступны отовсюду.
    *   static — принадлежат самому интерфейсу, а не его экземплярам.
    *   final — являются константами, их нельзя изменить после инициализации.
    Указание этих модификаторов не является обязательным, так как они добавляются компилятором автоматически.

3.  **Могут ли интерфейсы содержать конструкторы?**  
    Нет. Интерфейсы не могут содержать конструкторы. Поскольку интерфейс описывает только поведение (контракт), а не конкретную реализацию, у него нет состояния для инициализации через конструктор.

4.  **Чем отличаются интерфейс и абстрактный класс?**  
    |                     |Переменные|Конструкторы|Методы|
    |---------------------|---------|------------|------|
    |**Абстрактный класс**|Без ограничений.|Конструкторы вызываются по цепочке конструкторов. Абстрактный класс нельзя инстанциировать с помощью оператора **new**.|Без ограничений.|
    |**Интерфейс**        |Все переменные должны быть **public static final**|Конструкторы отсутствуют. Интерфейс нельзя инстанциировать с помощью оператора **new**.|Может содержать **public abstract** методы экземпляра, **public default** и **public static** методы.| 

## Классы и методы, модификатор abstract

1.  **Что такое абстрактный класс?**  
    **Абстрактный класс** — это класс, объявленный с ключевым словом abstract. Он не может быть инстанциирован (создан напрямую с помощью `new`). Его основная цель — служить шаблоном для других классов. Абстрактный класс может содержать как абстрактные методы (без реализации), так и полностью реализованные методы, конструкторы и поля.

2.  **Может ли конструктор быть абстрактным?**  
    Нет. Конструктор не может быть абстрактным. Абстрактные методы предназначены для переопределения в подклассах, а конструкторы не наследуются и не могут быть переопределены.

3.  **Что такое downcast и upcast?**  
    *   **Upcast (восходящее преобразование)** — это приведение объекта от типа подкласса к типу его суперкласса. Это преобразование безопасно и выполняется неявно (автоматически). Например: Animal animal = new Cat();
    *   **Downcast (нисходящее преобразование)** — это приведение объекта от типа суперкласса обратно к типу подкласса. Это преобразование небезопасно и требует явного указания типа в скобках. Может вызвать исключение ClassCastException, если объект на самом деле не является экземпляром целевого класса. Например: Cat cat = (Cat) animal;

4.  **Что такое инициализатор (блок инициализации) и как он выглядит?**  
    Это специальный блок кода, который выполняется раньше любого из конструкторов. Выглядит как заключенный в фигурные скобки блок кода, расположенный перед первым из конструкторов.

5.  **Какие могут быть модификаторы доступа у класса?**
    * **public**
    * **protected**
    * **package-private**
    * **private**

## Исключения и обработка исключений

1.  **Что такое исключения?**  
    **Исключения** - это условия или события, которые возникают во время выполнения программы, указывая на проблемы или неожиданные ситуации, которые обычно можно исправить или контролировать. Представлены объектом, выбрасывающимся во время выполнения.

2.  **Что такое обработка исключений как процесс?**  


3.  **Чем отличаются исключения и ошибки?**
    **Исключение (Exception)** — это нежелательное событие, которое прервало нормальный ход работы программы.
    **Ошибки (Errors)** обычно указывают на серьезные проблемы, связанные с программной средой или внутренним состоянием. В java программист имеет очень ограниченные возможности для обработки подобных ошибок.  
    **Сводная таблица различий между исключениями и ошибками:**  
    |Аспект             |Исключения                                                      |Ошибки                                                                                |
    |-------------------|----------------------------------------------------------------|--------------------------------------------------------------------------------------|
    |Определение        |Сбои в ходе программы из-за ожидаемых проблем.                  |Серьёзные проблемы, часто связанные с окружающей средой или системой.                 |
    |Иерархия           |Подклассы Exception.                                            |Подклассы Error.                                                                      |
    |Восстанавливаемость|Часто поддаётся восстановлению или управлению в коде.           |Как правило, не подлежит восстановлению или лучше всего поддаётся внешнему устранению.|
    |Причины            |Ошибки программирования, ошибки ввода, проблемы с ресурсами.    |Сбои оборудования, исчерпание ресурсов, сбои системы.                                 |
    |Механизм обработки |Управляется с помощью блоков try-catch или подобных конструкций.|Обычно не обрабатывается; программа обычно завершается.                               |
    |Роль разработчика  |Отвечает за предотвращение сбоев во время выполнения.           |Обычно не обрабатывается в коде, решается на системном уровне.                        |

4.  **Чем отличается проверяемое исключение (checked) от непроверяемого (unchecked)?**
    Проверяемые исключения компилятор требует обработать (try-catch) или объявить (throws), а непроверяемые (RuntimeException и Error) — нет.

5.  **Есть ли у исключений конструктор?**  
    Да, как и у любого другого класса.

6.  **Что такое try with resources?**
    **try with resources** - схожая с try-catch-finally конструкция, автоматически закрывающая ресурсы (реализующие `AutoCloseable`, например, потоки ввода-вывода, соединения с БД) после выполнения блока try. 

## Строки

1.  **Что такое StringBuilder и StringBuffer?**  
    **StringBuilder и StringBuffer** - классы для работы со изменяемыми строками. Они позволяют эффективно модифицировать строки (добавлять, вставлять, удалять символы), что отличает их от обычных строк класса String. StringBuffer обладает синхронизацией методов, что обеспечивает потокобезопасность (для работы в многопоточных программах), но из-за этого работает медленнее чем StringBuilder, который синхронизацией не обладает.  

2.  **Какое значение по-умолчанию у типа String?**  
    `null`.

3.  **Что такое интернированная строка?**  
    Поскольку строки являются неизменяемыми и повсеместно используются в программировании, JVM использует уникальный экземпляр для строковых литералов с одинаковой последовательностью символов, чтобы повысить эффективность и сэкономить память. Такой экземпляр называется интернированной строкой (interned string).

## Обобщения

1.  **Что такое параметризованный тип?**  
    Это тип (класс), который в качестве параметра принимает другой тип (или типы). Позволяет создавать классы, интерфейсы и методы, работающие с любыми типами данных, обеспечивая безопасность типов на этапе компиляции.

2.  **Можно ли в конструктор передать дженерик?**  
    Да, например:
    ```java
    class Box<T> {
        private T value;
    
        public Box(T value) {   // Используется дженерик класса
            this.value = value;
        }
    }
    ```
    Однако внутри конструктора или других методов нельзя создавать экземпляры дженерик-типа (через `new T();`).

3.  **Есть ли у дженерика конструктор?**  
    Нет. Дженерик - это параметр типа, а не конкретный класс. Мы также не можем создать экземпляр дженерика: попытка использовать `new T()` приведёт к ошибке компиляции.

## Графический интерфейс (GUI)

1.  **Что такое контейнер в контексте `java.awt`?**  
    В `java.awt` контейнер - это компонент, который может содержать другие компоненты.

## Коллекции

1.  **Что такое коллекция?**
    **Коллекция** - объект, который группирует несколько элементов (данных) в единое целое. Предоставляет стандартные структуры данных: списки, множества, очереди, а также операции для работы с ними (добавление, удаление, поиск).

2.  **В чём отличие методов `offer` и `add` у очереди?**  
    Оба метода добавляют указанный элемент в конец очереди. В случае неудачи (если очередь ограничена и переполнена):
    - Метод `offer` возвращает `false`.
    - Метод `add` выбрасывает исключение `IllegalStateException`.

3.  **В чём отличие методов `poll` и `remove` у очереди?**  
    Оба метода удаляют элемент из начала очереди и возвращают его. В случае если очередь пуста:
    - Метод `poll` возвращает `null`.
    - Метод `remove` выбрасывает исключение `NoSuchElementException`.

4.  **От какого класса наследуется LinkedList?**  
    LinkedList наследуется от класса `AbstractSequentalList`. Это специализированный абстрактный класс для последовательных списков. Также LinkedList напрямую реализует интерфейсы `List` и `Deque`.

## Паттерны (шаблоны) проектирования

### Порождающие паттерны

1.  **Что такое Singleton?**  
    **Singleton (Одиночка)** - гарантирует существование только одного экземпляра класса с глобальной точкой доступа к нему. Используется для управления ресурсами (например, пул соединений с БД), централизованного управления конфигурациями.

    *Пример реализации паттерна Singleton (Одиночка):*
    ```java
    public class Singleton { 
        private static Singleton instance;

        private Singleton() {}

        public static Singleton getInstance() { 
            if (instance == null) { 
                instance = new Singleton(); 
            }

            return instance; 
        } 
    }
    ```

    ---

2.  **Что такое Factory Method?**  
    **Factory Method (Фабричный метод)** - делегирует создание объектов подклассам через абстрактный метод, позволяя изменить тип создаваемого объекта. Используется для создания объектов с похожими характеристиками, но разными типами (например, в зависимости от окружения или параметров).

    *Пример реализации паттерна Factory Method (Фабричный метод):*
    ```java
    abstract class Creator {
        public abstract Product createProduct();
    }

    class ConcreteCreator extends Creator {
        @Override
        public Product createProduct() {
            return new ConcreteProduct();
        }
    }
    ```

    ---

3.  **Что такое Abstract Factory?**  
    **Abstract Factory (Абстрактная фабрика)** - создаёт целые семейства связанных объектов, скрывая их конкретные классы, например, GUI-элементы для разных ОС.

    *Пример реализации паттерна Abstract Factory (Абстрактная фабрика):*
    ```java
    interface GUIFactory { 
        Button createButton(); 
        Checkbox createCheckbox(); 
    }

    class WinFactory implements GUIFactory { 
        public Button createButton() { 
            return new WinButton(); 
        } 
        public Checkbox createCheckbox() { 
            return new WinCheckbox(); 
        }
    }
    ```

    ---

4.  **Что такое Builder?**  
    **Builder (Строитель)** - погашово конструирует сложные объекты, отделяя процесс сборки от его представления, что полезно для объектов со множеством параметров, например, сложных конфигураций или UI.

     *Пример реализации паттерна Builder (Строитель):*
    ```java
    class Product { 
        private String partA; 
        private String partB; 
        
        public void setPartA(String partA) { this.partA = partA; } 
        public void setPartB(String partB) { this.partB = partB; } 
    }

    class Builder { 
        private Product product = new Product();

        public Builder buildPartA(String partA) { 
            product.setPartA(partA); 
            return this; 
        }

        public Builder buildPartB(String partB) { 
            product.setPartB(partB); 
            return this; 
        } 
        
        public Product build() { 
            return product; 
        } 
    }
    ```

    ---

5.  **Что такое Prototype?**  
    **Prototype (Прототип)** - создаёт новые объекты путём клонирования существующего экземпляра, что эффективнее создания "с нуля" для ресурсоёмких объектов.

    *Пример реализации паттерна Prototype (Прототип):*
    ```java
    interface Prototype extends Cloneable { 
        Prototype clone();
    }

    class ConcretePrototype implements Prototype { 
        private String state;

        public void setState(String state) { this.state = state; }

        @Override 
        public Prototype clone() { 
            try {
                return (Prototype) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        } 
    }
    ```

    ---

6.  **Чем паттерн Builder отличается от фабрики?**  
    **Builder** фокусируется на пошаговом конструировании одного сложного объекта со множеством параметров. **Фабрика** отвечает за инкапсуляцию логики выбора и создания объекта определённого типа, скрывая конкретный класс.

7.  **Чем паттерн Prototype отличается от Builder?**  
    **Prototype** создаёт новый объект путём клонирования (копирования) готового экземпляра-прототипа. **Builder** же создаёт объект "с нуля", конструируя его шаг за шагом согласно заданной конфигурации, не требуя исходного образца.

### Структурные паттерны

1.  **Что такое Adapter?**  
    **Adapter (Адаптер)** - преобразует интерфейс одного класса в интерфейс, ожидаемый клиентом. Позволяет несовместимым классам работать вместе, как переходник для розетки.

    *Пример реализации паттерна Adapter (Адаптер):*
    ```java
    // Новый интерфейс USB-C 
    interface UsbC { 
        void connectUsbC(); 
    } 

    // Старый интерфейс USB 
    class Usb { 
        void connectUsb() { 
            System.out.println("Connected using USB"); 
        } 
    }

    // Адаптер для подключения USB через USB-C 
    class UsbToUsbCAdapter implements UsbC { 
        private Usb usb; 

        public UsbToUsbCAdapter(Usb usb) { 
            this.usb = usb; 
        } 

        public void connectUsbC() { 
            System.out.println("Adapter converts USB to USB-C"); 
            usb.connectUsb(); 
        } 
    }

    // Тестирование адаптера 
    public class AdapterExample { 
        public static void main(String[] args) { 
            Usb usb = new Usb(); 
            UsbC usbC = new UsbToUsbCAdapter(usb); 
            usbC.connectUsbC(); 
        } 
    }
    ```

    ---

2.  **Что такое Bridge?**  
    **Bridge (Мост)** - разделяет абстракцию и её реализацию, позволяя им изменяться независимо. Например, когда одна иерархия фигур (абстракция) должна работать с разными API для отрисовки (реализация).

    *Пример реализации паттерна Bridge (Мост):*
    ```java
    // Интерфейс реализации 
    interface Moveable { 
        void move(); 
    }

    // Конкретная реализация для наземного транспорта 
    class GroundMove implements Moveable { 
        public void move() { 
            System.out.println("Moving on the ground"); 
        } 
    }

    // Абстракция транспорта 
    abstract class Vehicle { 
        protected Moveable moveable; 

        protected Vehicle(Moveable moveable) { 
            this.moveable = moveable; 
        }

        public abstract void operate(); 
    }

    // Конкретная абстракция автомобиля 
    class Car extends Vehicle { 
        public Car(Moveable moveable) { 
            super(moveable); 
        }

        public void operate() { 
            System.out.print("Car is "); 
            moveable.move(); 
        } 
    }

    // Тестирование моста 
    public class BridgeExample {
        public static void main(String[] args) {
            Vehicle car = new Car(new GroundMove());
            car.operate(); 
        }
    }
    ```

    ---

3.  **Что такое Composite?**  
    **Composite (Компоновщик)** - позволяет работать с древовидной структурой объектов (часть-целое) единообразно. Клиент может обращаться как к отдельному объекту (листу), так и к их группе (узлу), не видя разницы.

    *Пример реализации паттерна Composite (Компоновщик):*
    ```java
    import java.util.ArrayList; 
    import java.util.List; 

    // Интерфейс для файловой системы 
    interface FileSystemComponent { 
        void display(); 
    }
 
    // Лист — файл 
    class File implements FileSystemComponent { 
        private String name; 
        
        public File(String name) { 
            this.name = name; 
        }

        public void display() { 
            System.out.println("File: " + name); 
        } 
    } 

    // Контейнер — папка 
    class Directory implements FileSystemComponent { 
        private String name; 
        private List<FileSystemComponent> components = new ArrayList<>(); 

        public Directory(String name) { 
            this.name = name; 
        }

        public void add(FileSystemComponent component) { 
            components.add(component); 
        } 
        
        public void display() { 
            System.out.println("Directory: " + name); 
            for (FileSystemComponent component : components) { 
                component.display(); 
            } 
        } 
    } 
    // Тестирование компоновщика 
    public class CompositeExample { 
        public static void main(String[] args) { 
            Directory root = new Directory("Root"); 
            root.add(new File("File1.txt")); 
            Directory subDir = new Directory("SubDir"); 
            subDir.add(new File("File2.txt")); 
            root.add(subDir); 
            root.display(); 
        } 
    }
    ```

    ---

4.  **Что такое Decorator?**  
    **Decorator (Декоратор)** - динамически добавляет объекту новые обязанности, не изменяя его код. Альтернатива наследованию для расширения функциональности объектов, когда невозможно изменить исходный код класса или нужно комбинировать разные функции.

    *Пример реализации паттерна Decorator (Декоратор):*
    ```java
    // Интерфейс уведомлений 
    interface Notification { 
        void send(); 
    } 

    // Базовая реализация уведомлений 
    class BasicNotification implements Notification { 
        public void send() { 
            System.out.println("Sending basic notification"); 
        } 
    } 
    
    // Декоратор 
    abstract class NotificationDecorator implements Notification { 
        protected Notification decoratedNotification; 

        public NotificationDecorator(Notification decoratedNotification) { 
            this.decoratedNotification = decoratedNotification; 
        }

        public void send() { 
            decoratedNotification.send(); 
        } 
    } 
    
    // Конкретный декоратор для добавления SMS-уведомления 
    class SmsNotificationDecorator extends NotificationDecorator { 
        public SmsNotificationDecorator(Notification decoratedNotification) { 
            super(decoratedNotification); 
        }

        public void send() { 
            decoratedNotification.send(); 
            System.out.println("Sending SMS notification"); 
        } 
    } 
    
    // Тестирование декоратора 
    public class DecoratorExample { 
        public static void main(String[] args) { 
            Notification notification = new SmsNotificationDecorator(new BasicNotification()); 
            notification.send(); 
        } 
    }
    ```

    ---

5.  **Что такое Facade?**  
    **Facade (Фасад)** - предоставляет простой унифицированный интерфейс для взаимодействия со сложной подсистемой или классом. Используется для упрощения доступа к сложным системам или библиотекам, предоставляя один интерфейс для управления несколькими компонентами.

    *Пример реализации паттерна Facade (Фасад):*
    ```java
    // Подсистемы 
    class CPU { 
        void start() { System.out.println("CPU is starting"); } 
    } 
    
    class Memory { 
        void load() { System.out.println("Memory is loading"); } 
    } 
    
    class HardDrive { 
        void readData() { System.out.println("Reading data from Hard Drive"); } 
    }

    // Фасад для управления компьютером 
    class ComputerFacade { 
        private CPU cpu; 
        private Memory memory; 
        private HardDrive hardDrive;

        public ComputerFacade() { 
            this.cpu = new CPU(); 
            this.memory = new Memory(); 
            this.hardDrive = new HardDrive(); 
        } 

        public void startComputer() { 
            cpu.start(); 
            memory.load(); 
            hardDrive.readData(); 
        } 
    }

    // Тестирование фасада 
    public class FacadeExample { 
        public static void main(String[] args) { 
            ComputerFacade computer = new ComputerFacade(); 
            computer.startComputer(); 
        } 
    }
    ```

    ---

6.  **Что такое Flyweight?**  
    **Flyweight (Легковес/Приспособленец)** - экономит память, разделяя общее состояние между множеством объектов. Хранит неизменяемую часть состояния (например, символ шрифта) отдельно, а изменяемую - в клиентском коде. Используется при работе с большим количеством мелких объектов, таких как символы текста или графические элементы, для уменьшения потребления ресурсов.

    *Пример реализации паттерна Flyweight (Легковес/Приспособленец):*
    ```java
    import java.util.HashMap;

    // Интерфейс символов 
    interface Character { 
        void printCharacter(); 
    } 
    
    // Конкретная реализация символа 
    class ConcreteCharacter implements Character { 
        private char symbol;

        public ConcreteCharacter(char symbol) { 
            this.symbol = symbol; 
        } 
        
        public void printCharacter() { 
            System.out.println("Character: " + symbol); 
        } 
    } 
    
    // Фабрика символов 
    class CharacterFactory { 
        private HashMap<Character, ConcreteCharacter> characterMap = new HashMap<>();

        public Character getCharacter(char symbol) { 
            if (!characterMap.containsKey(symbol)) { 
                characterMap.put(symbol, new ConcreteCharacter(symbol)); 
                System.out.println("Creating character: " + symbol); 
            }

            return characterMap.get(symbol); 
        } 
    } 
    
    // Тестирование Flyweight 
    public class FlyweightExample { 
        public static void main(String[] args) { 
            CharacterFactory factory = new CharacterFactory(); 
            factory.getCharacter('A').printCharacter(); 
            factory.getCharacter('B').printCharacter(); 
            factory.getCharacter('A').printCharacter(); // Повторное использование объекта
        } 
    }
    ```

    ---

7.  **Что такое Proxy?**  
    **Proxy (Заместитель)** - контролирует доступ к другому объекту, предоставляя его замену или дополнительный уровень управления. Используется для отложенной инициализации объектов, управления доступом или выполнения дополнительных операций (например, логирование, кэширование).

    *Пример реализации паттерна Proxy (Заместитель):*
    ```java
    // Интерфейс документа 
    interface Document { 
        void display(); 
    } 
    
    // Реальный документ 
    class RealDocument implements Document { 
        private String fileName;

        public RealDocument(String fileName) { 
            this.fileName = fileName; 
            loadFromDisk(); 
        }

        private void loadFromDisk() { 
            System.out.println("Loading document: " + fileName); 
        } 
        
        public void display() { 
            System.out.println("Displaying document: " + fileName); 
        } 
    } 
    
    // Прокси для защиты документа 
    class DocumentProxy implements Document { 
        private RealDocument realDocument; 
        private String fileName; 
        
        public DocumentProxy(String fileName) { 
            this.fileName = fileName; 
        } 
        
        public void display() { 
            if (realDocument == null) { 
                realDocument = new RealDocument(fileName); 
            }

            realDocument.display(); 
        } 
    } 
    
    // Тестирование Proxy 
    public class ProxyExample { 
        public static void main(String[] args) { 
            Document document = new DocumentProxy("SecretDoc.pdf");
            System.out.println("First call to display:");
            document.display();
            System.out.println("\nSecond call to display:");
            document.display();
        }
    }
    ```

    ---

### Поведенческие паттерны

1.	**Что такое Chain of Responsibility?**  
    **Chain of Responsibility (Цепочка обязанностей)** - передаёт запрос по цепочке обработчиков, где каждый обработчик может обработать запрос или передать его следующему. Используется для обработки событий или запросов в веб-приложениях или логгерах.

    *Пример реализации паттерна Chain of Responsibility (Цепочка обязанностей):*
    ```java
    abstract class Logger { 
        protected Logger nextLogger;

        public void setNextLogger(Logger nextLogger) { 
            this.nextLogger = nextLogger; 
        }

        public void logMessage(String message) { 
            if (nextLogger != null) { 
                nextLogger.logMessage(message); 
            }
        }
    } 

    class ConsoleLogger extends Logger { 
        public void logMessage(String message) { 
            System.out.println("Console Logger: " + message); 
        } 
    }
    ```

    ---

2.	**Что такое Command?**  
    **Command (Команда)** - инкапсулирует запрос как объект, позволяя параметризировать операции, ставить их в очередь, логировать или поддерживать отмену. Используется для реализации отмены действий (Undo/Redo), выполнения очереди команд.

    *Пример реализации паттерна Command (Команда):*
    ```java
    interface Command { void execute(); }

    class Light { 
        public void on() { System.out.println("Light is ON"); } 
    }

    class LightOnCommand implements Command { 
        private Light light;

        public LightOnCommand(Light light) { this.light = light; }

        public void execute() { light.on(); }
    }
    ```

    ---

3.	**Что такое Iterator?**  
    **Iterator (Итератор)** - предоставляет последовательный доступ к элементам коллекции, скрывая её внутреннюю структуру. Позволяет использовать единый интерфейс для обхода разных коллекций.

    *Пример реализации паттерна Iterator (Итератор):*
    ```java
    class NameRepository { 
        private String[] names = {"Alice", "Bob"}; 

        public Iterator<String> getIterator() { 
            return new ArrayIterator(); 
        } 

        private class ArrayIterator implements Iterator<String> { 
            int index = 0; 

            public boolean hasNext() { return index < names.length; } 
            
            public String next() { return names[index++]; } 
        } 
    }
    ```

    ---

4.	**Что такое Mediator?**  
    **Mediator (Посредник)** - обеспечивает централизованное взаимодействие между объектами, уменьшает их связанность. Объекты общаются не напрямую, а через посредника. Используется для управления элементами интерфейса или модулями системы.

    *Пример реализации паттерна Mediator (Посредник):*
    ```java
    class ChatRoom { 
        public static void showMessage(String user, String message) { 
            System.out.println(user + ": " + message); 
        } 
    }
    ```

    ---

5.	**Что такое Memento?**  
    **Memento (Снимок)** - сохраняет и восстанавливает внутреннее состояние объекта без нарушения инкапсуляции. Используется для реализации функции сохранения и восстановления, например, в текстовом редакторе.

    *Пример реализации паттерна Memento (Снимок):*
    ```java
    class TextEditor { 
        private String text;

        public void setText(String text) { this.text = text; } 
        
        public String save() { return text; } 
    }
    ```

    ---

6.	**Что такое Observer?**  
    **Observer (Наблюдатель)** - определяет зависимость "один ко многим", где при изменении состояния одного объекта (субъекта) все его подписчики (наблюдатели) автоматически уведомляются. Используется для реализации системы событий, например, уведомлений.

    *Пример реализации паттерна Observer (Наблюдатель):*
    ```java
    interface Observer { void update(); }

    class User implements Observer { 
        public void update() { System.out.println("User notified"); } 
    }
    ```

    ---

7.	**Что такое State?**  
    **State (Состояние)** - позволяет объекту изменять своё поведение при изменении состояния. Используется для управления состояниями объектов, например, автомат состояний заказов.

    *Пример реализации паттерна State (Состояние):*
    ```java
    interface State { void handle(); } 

    class NewOrderState implements State { 
        public void handle() { System.out.println("Processing new order"); } 
    }
    ```

    ---

8.	**Что такое Strategy?**  
    **Strategy (Стратегия)** - определяет семейство алгоритмов, инкапсулирует каждый и делает их взаимозаменяемыми. Используется для выбора алгоритма на основе условий, например, разные алгоритмы сортировки.

    *Пример реализации паттерна Strategy (Стратегия):*
    ```java
    interface DiscountStrategy { double applyDiscount(double price); } 
    
    class NoDiscount implements DiscountStrategy { 
        public double applyDiscount(double price) { return price; } 
    }
    ```

    ---

9.	**Что такое Template Method?**  
    **Template Method (Шаблонный метод)** - определяет основу алгоритма, позволяя подклассам переопределять шаги. Используется при создании алгоритмов с изменяемыми шагами, например, для обработки данных.

    *Пример реализации паттерна Template Method (Шаблонный метод):*
    ```java
    abstract class Beverage { 
        final void prepare() { 
            boilWater(); 
            brew(); 
        } 

        abstract void brew(); 
        
        void boilWater() { System.out.println("Boiling water"); } 
    }
    ```

    ---

10.	**Что такое Visitor?**  
    **Visitor (Посетитель)** - добавляет новые операции для объектов структуры без изменения их классов. Используется для выполнения операций над элементами сложной структуры, например, при обработке элементов структуры документа. 

    *Пример реализации паттерна Visitor (Посетитель):*
    ```java
    interface Element { void accept(Visitor visitor); } 

    class Paragraph implements Element { 
        public void accept(Visitor visitor) { visitor.visit(this); } 
    }
    ```

    ---