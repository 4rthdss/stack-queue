import java.util.Scanner;

public class BrowserCLI {

    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String actutalPage;

    public BrowserCLI() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        actutalPage = null;
    }

    public void navegarPara(String endereco) {
        if (actutalPage != null) {
            backStack.push(actutalPage);
        }
        actutalPage = endereco;

        showStatus();
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(actutalPage);
            actutalPage = backStack.pop();
        } else {
            System.out.println("não há mais páginas para voltar");
        }
        showStatus();
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(actutalPage);
            actutalPage = forwardStack.pop();
        } else {
            System.out.println("não há mais páginas para avançar");
        }
        showStatus();
    }

    public void showStatus() {
        System.out.println(
            "página atual: " +
            (actutalPage != null ? actutalPage : "nenhuma página carregada")
        );
        System.out.println("back pages: " + backStack);
        System.out.println("forward pages: " + forwardStack);
        System.out.println();
    }

    public static void main(String[] args) {
        BrowserCLI browser = new BrowserCLI();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("comandos");
        System.out.println("  <url>       - acessar a página");
        System.out.println("  back        - voltar para a página anterior");
        System.out.println("  forward     - avançar para a próxima página");
        System.out.println("  exit        - finalizar a execuação");

        while (true) {
            System.out.print("digite um comando ou url: ");
            input = scanner.nextLine().trim();

            if (input.equals("exit")) {
                System.out.println("browser fechado.");
                break;
            } else if (input.equals("back")) {
                browser.back();
            } else if (input.equals("forward")) {
                browser.forward();
            } else {
                browser.navegarPara(input);
            }
        }
        scanner.close();
    }
}
