package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier repotNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        repotNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        repotNotifier.notifyManager("Everything is OK",Priority.ROUTINE);
        repotNotifier.notifyManager("Something went wrong!",Priority.IMPORTANT);
        repotNotifier.notifyManager("Houston, we had a problem here!!!",Priority.ASAP);
    }
}
