package GuessTheCodeNumber;

/**
 * Created by Eugene
 * create on 08/01/2026
 * Program description:
 */
/**
 * Главный класс для запуска игры "Guess the Code Number"
 */
public class Main {
    public static void main(String[] args) {
        // Запуск игры в потоке EDT (Event Dispatch Thread)
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                // Инициализация и запуск визуальной части
                Visual.createAndShowGUI();
                System.out.println("Игра запущена успешно!");
            } catch (Exception e) {
                System.err.println("Ошибка при запуске игры:");
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(
                        null,
                        "Ошибка при запуске игры: " + e.getMessage(),
                        "Ошибка",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
            }
        });
    }
}