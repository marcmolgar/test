public class App {

    public static void main(String[] args) {
        System.out.println("Hello UF2!!");



        String[] names = {"Laura", "Joan",
        "Cristina", "Enric"};

        String[] surnames = {"Casamitjana", "Portet",
        "Galindo", "Clotet"};

        int[] ages = new int[]{33, 22, 36, 27};

        boolean[] beques = {true, false, false, true};


        Student [] alumnes;
        alumnes = new Student[names.length];
        // [ null ,  null , null ,  null ]

        System.out.println("Variable alumnes: " + alumnes);

        for(int i = 0; i < alumnes.length; i++){

            alumnes[i] = new Student();

            alumnes[i].name = names[i]; //CORRECTE
//            alumnes.name[i] = names[i]; //INCORRECTE

            alumnes[i].surname = surnames[i];
            alumnes[i].age = ages[i];
            alumnes[i].beca = beques[i];

        }

//        saveToFile(studentsToString(alumnes));

        for(Student alumne: alumnes){
            System.out.println(studentToString(alumne));
        }

    }

 

}
