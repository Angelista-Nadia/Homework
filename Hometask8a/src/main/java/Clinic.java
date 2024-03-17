public class Clinic {
    public static void main(String[] args) {
        //код 1 - лечение хирургом
        Patient patient = new Patient(1);
        System.out.println("Первый пациент (лечение): ");
        patient.assignDoctor();
        patient.performTreatment();
        //код 2 - лечение дантистом
        Patient patient1 = new Patient(2);
        System.out.println("Второй пациент (лечение): ");
        patient1.assignDoctor();
        patient1.performTreatment();
        //код (любой другой) - лечение терапевтом
        Patient patient2 = new Patient(99);
        System.out.println("Третий пациент (лечение): ");
        patient2.assignDoctor();
        patient2.performTreatment();
    }
}
