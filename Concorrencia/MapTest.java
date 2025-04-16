import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Douglas", 10);
        notas.put("Pedro", 8);
        notas.put("Maria", 9);

        System.out.println(notas); // {Douglas=10, Pedro=8, Maria=9}

        System.out.println(notas.get("Douglas")); // 10

        for (String name : notas.keySet()) {
            System.out.println(notas.get(name)); // 10 8 9
        }

        notas.put("Pedro", 6); // Possível atualizar o valor de uma chave

        System.out.println(notas); // {Douglas=10, Pedro=6, Maria=9}
    }
}