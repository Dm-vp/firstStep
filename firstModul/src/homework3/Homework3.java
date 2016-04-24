package homework3;

/**
 * Создать класс КАААР, кот. содержиит в себе след. поля: назв, год выпуска, ширина и длина
 * (использовать дробные числа).
 * В классе д.б. методы : метод, кот. печатает назв. машины и год ее выпуска.
 * Создать класс "Гараж". В гараже есть поля: адрес, ширина и длина, а также поле,
 * содержащее машину, стоящую в гараже, либо null, если машины нет. Методы в гараже: напечатать
 * адрес и машину, кот. в нем стоит, метод "поставить машину в гараж", проверять входит ли по длине
 * машина, есть ли в гараже машина, а так же метод, достающий из гаража машину. */
public class Homework3 {

    public static void main(String[] args) {
        Car carOfEd, carOfDim, carOfDoch;
        carOfEd = new Car("Chevrolet Lacetti", 2008, 3.25, 1.95);
        carOfDim = new Car("Kia Ceed", 2009, 3.55, 1.80);
        carOfDoch = new Car("Daewoo Matiz", 2005, 1.50, 1.50);


        Garage garage1 = new Garage("12 district, Semin's estate", 3.7, 1.9);
        Garage garage2 = new Garage("Huevo-kukuevo, Poduzhailo's estate", 3.3, 2.0);

        carOfDim.printOfCar();
        carOfEd.printOfCar();
        carOfDoch.printOfCar();

        garage1.insideOfGarage();
        garage2.insideOfGarage();

        garage1.putIntoGarage(carOfDim);
        garage1.insideOfGarage();
        garage1.putIntoGarage(carOfEd);
        garage1.getOutGarage();
        garage1.putIntoGarage(carOfEd);
        garage1.putIntoGarage(carOfDoch);
        garage1.insideOfGarage();

        garage2.putIntoGarage(carOfDim);
        garage2.putIntoGarage(carOfEd);
        garage2.insideOfGarage();
        garage2.putIntoGarage(carOfDoch);
        garage2.getOutGarage();
        garage2.putIntoGarage(carOfDoch);
        garage2.insideOfGarage();

        System.out.println("ВЫВОД:  Матизы .П.Р.Е.К.Р.А.С.Н.Ы.");




    }


}
