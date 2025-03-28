import java.util.Scanner;

public class WaitingList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<>();
        StringBuilder callHistory = new StringBuilder();
        int patientId = 1;

        while (true) {
            System.out.println("fila de espera");
            System.out.println("add  - adicionar paciente à fila");
            System.out.println("call - chamar próximo paciente");
            System.out.println("view - visualizar histórico de chamada");
            System.out.println("exit - para encerrar");
            System.out.print("digite um comando: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "add":
                    queue.enqueue(patientId);
                    System.out.println(
                        "paciente como o número " +
                        patientId +
                        " adicionado à fila"
                    );
                    patientId++;
                    break;
                case "call":
                    callPatient(queue, callHistory);
                    break;
                case "view":
                    System.out.println(
                        "histórico de chamada:\n" + callHistory.toString()
                    );
                    break;
                case "exit":
                    System.out.println("sistema encerrado");
                    scanner.close();
                    return;
                default:
                    System.out.println("comando inválido");
                    break;
            }
            System.out.println("fila: " + queue.toString());
        }
    }

    public static void callPatient(
        Queue<Integer> queue,
        StringBuilder callHistory
    ) {
        Integer patientID = queue.dequeue();
        if (patientID != null) {
            System.out.println("Calling patient with ID: " + patientID);
            callHistory
                .append("Patient with ID ")
                .append(patientID)
                .append(" called.\n");
        } else {
            System.out.println("No patients in the queue.");
        }
    }
}
