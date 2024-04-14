public class Patient {
    int treatmentPlan;
    Treat doctor = new Surgeon();

    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
    public void assignDoctor() {    //назначить доктора по коду лечения
        if (treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
    }
    public void performTreatment() {    //выполнить лечение
        doctor.treat();
    }
}
