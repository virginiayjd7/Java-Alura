import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ejemplo3 {
    public static void main(String[] args) {
        String curso1 = "Geometria";
        String curso2 = "Fisica";
        String curso3 = "Quimica";
        String curso4 = "Historia";
        ArrayList<String> cursos =new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        /*System.out.println(cursos);
        Collections.sort(cursos);
        System.out.println(cursos);
        Collections.sort(cursos, Collections.reverseOrder());
        System.out.println(cursos);*/
        //cursos.sort(Comparator.reverseOrder());
        //cursos.sort(Comparator.naturalOrder());
        List<String> cursoList = cursos.stream().sorted().collect(Collectors.toList());
        System.out.println(cursoList);

    
    }
    
}
