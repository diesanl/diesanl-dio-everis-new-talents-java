package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        Map<String, String> aluno = new HashMap<>();
        Map<String, String> aluno2 = new HashMap<>();

        //(K, V)
        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Média", "10");
        aluno.put("Turma", "3A");

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Média", "9");
        aluno2.put("Turma", "3B");

        System.out.println(aluno);

        //returns the key property
        System.out.println(aluno.keySet());

        //returns value property
        System.out.println(aluno.values());

        listaAlunos.add(aluno);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome2"));

    }
}
