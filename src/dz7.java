
public class dz7 {
    public static void main(String[] args) {
        // калькуляция
        System.out.println(CalcMath.<Integer>add(10, 5));
        System.out.println(CalcMath.divide(10, 0));
        System.out.println(CalcMath.multiply(10, 5));
        System.out.println(CalcMath.subtract(10, 5));

        // дженерик класс

        User <String, String>Vova = new User<>("r12", "r12_632p");
        System.out.println(Vova.getId()+" "+Vova.getCard_number());

        User <Integer, String >Petya = new User<>(102, "erjfhr68456");
        System.out.println(Petya.getId()+" "+Petya.getCard_number());

        //  принимаем список
        String[] arrayNames = {"Петя", "Валя", "Боб", "Серж", "Мари"};

        randomiser(arrayNames);

    }

    public static void randomiser(String[] arr){
        String[] array = new String[100];
        int x;
        for(int i = 0; i<=99; i++){
            x = (int)(Math.random()* arr.length);
            array[i] = arr[x];
            System.out.println(array[i]);
        }

    }
}
