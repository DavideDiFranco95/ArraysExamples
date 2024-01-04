import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        /**
         * Array di Oggetti già inseriti
         */
         Car[] carArray = new Car[]{
                new Car("BMW","b323",2001),
                new Car("Fiat","Punto", 2000),
                new Car("AlfaRomeo","Giulia",2016)
        };

        /**
         * Array di Oggetti definiti fuori dall'Array stesso
         */

        Car[] carArrayToDefine = new Car[3];

        carArrayToDefine[0] = new Car("BMW", "b323", 2001);
        carArrayToDefine[1] = new Car("Fiat","Punto", 2000);
        carArrayToDefine[2] = new Car("AlfaRomeo","Giulia",2016);
        //carArrayToDefine[3] = new Car("Audi","TT",1998);

        /**
         * Array vuoto da riempire
         */
        Car[] carArrayEmpty = new Car[0];

        Car newCar = new Car("BMW", "b323", 2001);
        carArrayEmpty = addCarToArray(carArrayEmpty, newCar);
        Car newCar2 = new Car("Fiat","Punto", 2000);
        carArrayEmpty = addCarToArray(carArrayEmpty, newCar2);
        Car newCar3 = new Car("AlfaRomeo","Giulia",2016);
        carArrayEmpty = addCarToArray(carArrayEmpty, newCar3);



        //System.out.println("Print di CarArray: " + Arrays.toString(carArray));

        //System.out.println("Print di CarArrayToDefine: " + Arrays.toString(carArrayToDefine));

        //System.out.println(Arrays.toString(carArrayEmpty));

        //Puoi farlo con un Ciclo For ma.. perchè complicarsi la vita (Esiste Arrays.toString che risolve tutto)
        /*for (Car car : carArray) {
            System.out.println("Model: " + car.getModel() + " Type: " + car.getType() + " Year: " + car.getYear());
        }*/

        // --------------------------------------------------------------------------------------

    }

    /**
     * Metodo per aggiungere elementi in un Array ma non mi piace onestamente
     * @param originalArray Array di Origine
     * @param newCar Nuovo oggetto da aggiungere all'Array di Origine
     * @return ritorna l'Array completo di Auto :D
     */
    private static Car[] addCarToArray(Car[] originalArray, Car newCar){
        Car[] arrayDiFunzioneDelMetodo = Arrays.copyOf(originalArray,originalArray.length + 1);
        arrayDiFunzioneDelMetodo[arrayDiFunzioneDelMetodo.length - 1] = newCar;
        return arrayDiFunzioneDelMetodo;
    }

    public Car[] carArrayEmpty = new Car[3];

    // In questo caso abbiamo incapsulato i dati, quindi abbiamo dovuto utilizzare
    // il Set per poter prendere i dati, senza però, basta la dicitura qui in basso
    // Non essendo nella MAIN non abbiamo i permessi per vederli/modificarli senza Get/Set
    public void setCarArray(Car[] carArrayEmpty) {
        carArrayEmpty[0] = new Car("BMW", "b323", 2001);
        carArrayEmpty[1] = new Car("Fiat","Punto", 2000);
        carArrayEmpty[2] = new Car("AlfaRomeo","Giulia",2016);
    }


}
