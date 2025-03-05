package src;


import src.cats.Cat;
import src.cats.CatListGenerator;
import src.shawarma.Shawarma;
import src.shawarma.ShawarmaMaker;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        /* Задачи с котиками */
        ShawarmaMaker aas = new ShawarmaMaker();
        List<Shawarma> asas = aas.generateShawarma(1000);
//        System.out.println(asas);
        List<Cat> cats = new CatListGenerator().randomCats(1000);
        String[] colors = {"Рыжий", "Серый", "Чёрный",
                "Белый", "Коричневый", "Пятнистый"};
        String[] names = {"Боря", "Сэм", "Флекс",
                "Гаррис", "Феликс", "Форекс",
                "Эрик", "Джес", "Томас",
                "Хисс", "Вася", "Тэля",
                "Лара", "Фена", "Кнопа",
                "Шлёпа", "Файна", "Мик",
                "Клавир", "Дайс", "Фокс"};
        String[] breeds = {"Метис", "Персидская", "Мейн-кун",
                "Британская короткошёрстная", "Сиамская", "Бенгальская",
                "Сфинкс", "Рэгдолл", "Манчкин"};
        String randomColor = colors[ThreadLocalRandom.current().nextInt(colors.length)];
        String randomName = names[ThreadLocalRandom.current().nextInt(names.length)];
        String randomBreed = breeds[ThreadLocalRandom.current().nextInt(breeds.length)];
//        System.out.println(cats);
        //TODO найти одного кота с датой вакицинации за семь дней до текущей
//        System.out.println(cats.parallelStream()
//                .filter(z->z.getVetBook().getLastVaccination().equals(LocalDate.now().minusDays(7)))
//                .limit(1)
//                .toList());
        //TODO вывести всех котов, у которых день рождения в определённую дату
        //skip
        //TODO сгруппировать котов по датам рождения
//        System.out.println(cats.parallelStream().collect(Collectors.groupingBy(
//                Cat::getBirthDate
//        )));
        //TODO сгруппировать котов по породе\окрасу\возрасту
//        Map<String, Map<String, Map<Integer, List<Cat>>>> ada = cats.parallelStream()
//                .collect(Collectors.groupingBy(
//                                Cat::getBreed,
//                                Collectors.groupingBy(
//                                        Cat::getColor,
//                                        Collectors.groupingBy(
//                                                Cat::getAge)
//                                )
//                        )
//                );
//        TODO всем котам установить новый случайный окрас
//        System.out.println(cats.stream()
//                .peek(c -> c.setColor(randomColor))
//                .toList());
        //TODO получить список веткнижек котов
//        System.out.println(cats.parallelStream()
//                .map(Cat::getVetBook)
//                .toList());
        //TODO подсчитать сколько котов с указанным именем
//        System.out.println(cats.parallelStream()
//                .filter(z->z.getColor().equals(randomColor))
//                .count());
        //TODO удалить котов определёной породы
//        System.out.println(cats.parallelStream()
//                        .filter(a-> !Objects.equals(a.getBreed(), randomBreed))
//                        .toList()
//                );
        //TODO удалять из потока данных котов, пока не будет достигнут кот с определёнными условиями
//        System.out.println(cats.parallelStream()
//                .dropWhile(a->!a.getName().equals(randomName)).toList());
        //TODO подсчитать сколько котов родилось в период между двумя датами
//        LocalDate bef = LocalDate.of(2023, 12, 1);
//        LocalDate after = LocalDate.of(2023, 12, 31);
//        System.out.println(cats.parallelStream()
//                .filter(cat -> !cat.getBirthDate().isBefore(bef) && !cat.getBirthDate().isAfter(after))
//                .sorted(Comparator.comparing(Cat::getBirthDate))
//                .count());
        //TODO вывести котов рождённых в период между двумя датами
//        LocalDate bef = LocalDate.of(2023, 12, 1);
//        LocalDate after = LocalDate.of(2023, 12, 31);
//        System.out.println(cats.parallelStream()
//                .filter(cat -> !cat.getBirthDate().isBefore(bef) && !cat.getBirthDate().isAfter(after))
//                .sorted(Comparator.comparing(Cat::getBirthDate))
//                .toList());
        //TODO подсчитать средний возраст котов
//        System.out.println(cats.parallelStream()
//                .mapToInt(Cat::getAge)
//                .average().orElse(-1)
//        );
        //TODO подсчитать средний вес котов
//        System.out.println(cats.parallelStream()
//                .collect(Collectors.summarizingInt(Cat::getWeight))
//                .getAverage()
//        );
        //TODO найти самого взрослого\маленького котика
//        System.out.println(cats.parallelStream()
//                .max(Comparator.comparingInt(Cat::getAge)).orElse(null)
//        );
        //TODO найти котика, который родился в ближайшую от сегодняшней дату
//        System.out.println(cats.parallelStream()
//                .max(Comparator.comparing(Cat::getBirthDate))
//        );
        //TODO найти котика, который родился ровно год назад
//        System.out.println(cats.parallelStream()
//                .filter(a->a.getBirthDate().equals(LocalDate.now().minusYears(1)))
//                .toList()
//        );
        //TODO всем котам обновить дату вакцинации
//        System.out.println(cats.parallelStream()
//                .peek(a->a.getVetBook().setLastVaccination(LocalDate.now()))
//                .toList()
//        );

        /* задачи с шаурмой */

        //TODO найти самую дорогую шаурму
//        OptionalInt sa = asas.stream().mapToInt(Shawarma::getPrice).max();
//        System.out.println(sa.orElse(-1));
        //TODO найти самую дешёвую шаурму
//        System.out.println(asas.stream().mapToInt(Shawarma::getPrice).min());
        //TODO вычислить среднюю цену шаурмы
//        System.out.println(asas.stream().mapToInt(Shawarma::getPrice).boxed().collect(Collectors.summarizingInt(a-> a)).getAverage());
        //TODO найти шаурму, у которой самый долгий срок годности
//        System.out.println(asas.stream());
        //TODO сгруппировать шаурму по её типу
//        System.out.println(asas.stream().collect(Collectors.groupingBy(Shawarma::getShawarmaType)));
        //TODO найти самый популярный вкус
//        System.out.println(asas.stream()
//                .collect(Collectors.groupingBy(z->z.getShawarmaType(), Collectors.counting())).entrySet().stream().map(Map.Entry::getValue).max(Long::compareTo).orElse(1121L));
        //TODO снизить цену всех шаурм на 10%
//        System.out.println(asas.stream().flatMapToDouble(s-> DoubleStream.of(s.getPrice()*0.9)));
    }
}
