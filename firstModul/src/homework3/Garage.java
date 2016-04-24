package homework3;

/**
 * Создать класс КАААР, кот. содержиит в себе след. поля: назв, год выпуска, ширина и длина
 * (использовать дробные числа).
 * В классе д.б. методы : метод, кот. печатает назв. машины и год ее выпуска.
 * Создать класс "Гараж". В гараже есть поля: адрес, ширина и длина, а также поле,
 * содержащее машину, стоящую в гараже, либо null, если машины нет. Методы в гараже: напечатать
 * адрес и машину, кот. в нем стоит, метод "поставить машину в гараж", проверять входит ли по длине
 * машина, есть ли в гараже машина, а так же метод, достающий из гаража машину. */
public class Garage {
    String address;
    double length, width;
    Car car;




    Garage (String address, double length, double width){
        this.address = address;
        this.length = length;
        this.width = width;

    }

    public void insideOfGarage(){
        if (car == null){
            System.out.println("Гараж по адресу "+address+" пуст");
        } else
        System.out.println("В гараже по адресу "+address+" стоит "+car.mark);
    }

    public void putIntoGarage ( Car newCar ){
       if (car != null){
           System.out.println( "Машине "+newCar.mark+" в доступе отказано.Тут жеж "+car.mark+" ёмаё! Убери сперва её!");
       } else if (length < newCar.length){
           System.out.println("Машине "+newCar.mark+" в доступе отказано. Cледует короче стать, чтоб наружу не торчать");
       }else if (width < newCar.width){
           System.out.println("Машине "+newCar.mark+" в доступе отказано. Вам бы надо похудеть, чтобы стены не задеть");
       }else
        car = newCar;
    }

    public Car getOutGarage(){
        if (car == null){
            System.out.println("Гараж пуст. Расходимся, нас обманули");
        } else
        System.out.println("Гараж по адресу "+address+" очищен от машины "+car.mark+". Искренне Ваша, служба угона");
        car = null;
        return car;
    }


}
