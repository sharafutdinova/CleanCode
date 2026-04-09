package patterns.adapter.distance;

public class Main {
    //    Описание
//    В проекте есть система, которая работает с мильными единицами (например, старая система),
//    но новая система должна использовать километры. Нужно создать адаптер, который будет преобразовывать мили в километры,
//    чтобы новая система могла работать с ними, не изменяя её логику.
    static void main(String[] args) {
        Miles miles = new Miles(2);
        MilesToKilometersAdapter milesToKilometersAdapter = new MilesToKilometersAdapter(miles);
        Kilometers kilometers = new Kilometers(milesToKilometersAdapter.calculateKilometers());
        System.out.println(kilometers.getDistance());
    }
}
