package lessons.patterns.behavioral.iterator;

public interface IterableCollection<T> {
    Iterator<T> createIterator(); // метод по созданию итератора
}
