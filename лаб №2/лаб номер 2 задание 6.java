import java.util.Scanner;

public class Main {
    private Integer[] cells; 
    private int count; 

    public Main() {
        cells = new Integer[3]; 
        count = 0; 
    }

    public void addNumber(int number) {
        if (count < 3) {
            
            for (int i = 0; i < cells.length; i++) {
                if (cells[i] == null) {
                    cells[i] = number;
                    count++;
                    System.out.println("Добавлено число: " + number);
                    return;
                }
            }
        } else {
            
            int minIndex = 0;
            for (int i = 1; i < cells.length; i++) {
                if (cells[i] < cells[minIndex]) {
                    minIndex = i;
                }
            }
            System.out.println("Заменено число " + cells[minIndex] + " на " + number);
            cells[minIndex] = number; 
        }
    }

    public void displayCells() {
        System.out.print("Текущие значения в ячейках: ");
        for (Integer cell : cells) {
            if (cell != null) {
                System.out.print(cell + " ");
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main memoryCell = new Main();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число (или введите 'exit' для выхода): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break; 
            }

            try {
                int number = Integer.parseInt(input);
                memoryCell.addNumber(number);
                memoryCell.displayCells(); 
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное число.");
            }
        }

        scanner.close();
    }
}
