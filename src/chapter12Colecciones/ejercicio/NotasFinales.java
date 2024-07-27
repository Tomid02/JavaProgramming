package chapter12Colecciones.ejercicio;

import java.util.Map;

public class NotasFinales {
    public static void main(String[] args) {
        Map<String, Integer> libretaNotas = ResultadosExamen.getOriginalGrades();
        Map<String, Integer> recupExamne = ResultadosExamen.getMakeUpGrades();

        for(var estudiante : recupExamne.entrySet()){
            Integer primerNota = libretaNotas.get(estudiante.getKey());
            Integer segundaNota = recupExamne.get(estudiante.getKey());

            if(segundaNota > primerNota){
                libretaNotas.put(estudiante.getKey(), segundaNota);
            }
        }
        System.out.println("Notas Finales");
        libretaNotas.forEach(
                (x,y)-> System.out.println("Alumno: " + x + " | Notas: " + y));
    }
}
