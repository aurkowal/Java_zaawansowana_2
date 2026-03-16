## Zadanie 1 - rozwiązywane z wykładowcą

1. Napisz program, który przy wykorzystaniu strumieni danych, dla podanej listy obiektów typu `String`:

- wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające się na literę „a” lub „s”, posortowane alfabetycznie 
- zwróci listę łańcuchów o długości równej 5 bez duplikatów.
- utworzy obiekt typu `String`, zbudowany z posortowanych elementów listy ograniczonych do 3 pierwszych znaków każdego elementu, oddzielonych przecinkami.


## Zadanie 2 - rozwiązywane z wykładowcą

2. Napisz program, który będzie posiadał klasę reprezentującą pracownika `Employee`, zawierającą atrybuty takie jak `imię`, `nazwisko`, `płeć`, `data urodzenia`, `wysokość wynagrodzenia`.
 Utwórz kilka obiektów klasy `Employee`, a następnie:
- wypisz na ekranie wszystkich pracowników, których nazwisko zaczyna się na literę „N”
- wypisz na ekranie wszystkich pracowników, którzy są w wieku między 30 a 45 lat
- daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł. 


## Zadanie 3

1. Elementy podanej listy:
````java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
````
- przekształć za pomocą:

````
n -> n * n - 5
````
- przefiltruj za pomocą:
````
n -> n < 20
````

Z tak powstałych wartości utwórz listę.


## Zadanie 4

1. Stwórz listę elementów typu `String`, następnie utwórz strumień, który:
- wypisze na konsoli długości elementów listy
- zwróci listę posortowaną alfabetycznie 
- wypisze na konsoli elementy, które zawierają literę „c”
- zwróci sumę długości wszystkich elementów
- zwróci 3 pierwsze elementy posortowane alfabetycznie 

Podczas sumowania elementów przydatna może okazać się metoda **mapToInt**
[https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)


## Zadanie 5

1. Stwórz listę elementów typu `String`, następnie utwórz strumień, który przekształcisz do postaci mapy:
````
Map<String, String>
````
gdzie kluczem będzie pierwotny napis, a wartością napis pisany od tyłu.


## Zadanie 5

1. Ze strumienia elementów (2, 4, 6, 8, 9, 10, 12) wybierz elementy od momentu, gdy napotkasz wartość nieparzystą.
2. Wybrane elementy wyświetl na konsoli.


## Zadanie 5

1. Ze strumienia elementów (2, 4, 6, 8, 9, 10, 12) wybierz elementy do momentu gdy występujące wartości będą podzielne przez 2.
2. Wybrane elementy wyświetl na konsoli.
