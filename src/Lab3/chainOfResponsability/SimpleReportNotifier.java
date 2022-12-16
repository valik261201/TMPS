package Lab3.chainOfResponsability;

public class SimpleReportNotifier extends Notifier{

    public SimpleReportNotifier(int priority) {
        super(priority);
    }
    @Override
    public void write(String message) {
        System.out.println("Notify using simple report: " + message);
    }
}