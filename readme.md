# Задача № 1 "Индекс Массы Тела"

## Краткое описание

1. Создано базовое приложение. 
2. Используется три переменные, типа long:
    * float mass - Масса в килограммах
    * float height - Рост в метрах
    * float bmi - значение индекса массы тела
3. Создан класс BodyMassIndexService
4. Создан метод calculate, рассчитывающий и возвращающий значение индекса.
5. Для вывода результата используется форматированный вывод.

## Код

```java
public class Main {
    public static void main(String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();
        float mass = 79.3F; // Масса в килограммах
        float height = 1.74F; // Рост в метрах
        float bmi = service.calculate(mass, height);
        System.out.printf("%.2f",bmi);
    }
}

public class BodyMassIndexService {
    public float calculate (float mass, float height) {
        float bmiResult = mass /(height * height);
        return bmiResult;
    }
}

```