import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        /*
        O Scanner é como se fosse um <input> do HTML ou um
        "prompt" do JS. Ele basicamente permite o usuário escrever
        algo, ao invés de apenas colocar algo no terminal.

        Para usar o Scanner, é necessário primeiramente fazer o
        import dele (conseguir usar ele no seu código) e depois
        "puxar" ele de fato para ser utilizado. Aqui eu irei trazer o Scanner e
        irei fazer um pequeno código com if, else if e else.

        Além disso, aqui eu estou usado algo que anda conjunto com o scanner
        que são os ".next()". Existem vários! Eu recomendaria você pesquisar
        os tipos.

        Segue o exemplo abaixo:
         */

        var scanner = new Scanner(System.in);
            System.out.println("Qual é o seu nome?");
        var name = scanner.nextLine();
            System.out.println("Qual é a sua idade?");
        var age = scanner.nextInt();
            System.out.println("Você trabalha atualmente ou não? (Coloque apenas true' ou 'false'");
        var yesOrNo = scanner.nextBoolean();
            System.out.println("O usuário se chama: " + name + "\n" +
                               "Ele(a) tem " + age + " anos\n" +
                               "Ele(a) escolheu " + "'" + yesOrNo + "'" + " como boolean!");

    }
}