package presencial;

public class Main {
    public static void main(String[] args) {
        Capitan capitan = new Capitan("Omar","Espinosa","1324");

        Velero miVelero = new Velero(capitan, 20000, 5000, 2022, 10, 5);

        Yate miYate = new Yate(capitan,20000,5000,2022,10,1);
        Yate yateOtroWey = new Yate(capitan,10000,5000,2022,10,4);

        if(miYate.comparar(yateOtroWey)){
            System.out.println("Mi yate es mas lujoso");
        } else {
            System.out.println("Su yate es mas lujoso");
        }

        miYate.camarotes = 5;

        if(miYate.comparar(yateOtroWey)){
            System.out.println("Mi yate es mas lujoso");
        } else {
            System.out.println("Su yate es mas lujoso");
        }

        if(miVelero.evaluar()){
            System.out.println("Mi velero es lujoso");
        } else {
            System.out.println("Mi velero no es lujoso");
        }
    }
}
