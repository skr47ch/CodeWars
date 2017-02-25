package Find_The_Missing_Letter;

public class Main {
    public static void main(String[] args) {
        System.out.println("[a, c, d] -> " + Kata.findMissingLetter(new char[] {'a', 'c', 'd'}));
        System.out.println("[M, O, P, Q, R, S, T, U] -> " + Kata.findMissingLetter(new char[] {'M', 'O', 'P', 'Q', 'R', 'S', 'T', 'U'}));
    }
}

