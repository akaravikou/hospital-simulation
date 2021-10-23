package com.solvd.hospital2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        Date birthResident = new Date(688797554);
        Education education = new Education();
        Resident<Education> resident = new Resident<>("Charlie Bloom", birthResident);
        resident.setEducation(education);
        Date birthPatient = new Date(892883737);
        Patient<ChronicDisease,Education> patient = new Patient<>("Mark Ashford", birthPatient);

        LocalDateTime dateOfBirth = LocalDateTime.of(1980, 9, 29, 15, 30);
        LocalDateTime dateOfApplication = LocalDateTime.of(2021, 9, 29, 15, 30);
        PatientCard card = new PatientCard("Mark Ashford", dateOfBirth, "Illness", dateOfApplication);

        Hospital hospital = new Hospital();
        List<String> doctors = new ArrayList<>();
        LocalDateTime dateOfBirth1 = LocalDateTime.of(1971, 9, 29, 15, 30);
        doctors.add("William Dunlop");
        doctors.add("Guy Martin");
        doctors.add("Valentino Rossi");
        doctors.add("Max Biaggi");
        LocalDateTime dateOfBirth3 = LocalDateTime.of(1955, 9, 29, 15, 30);
        LocalDateTime dateOfBirth5 = LocalDateTime.of(1977, 9, 29, 15, 30);

        hospital.setDoctors(doctors);

        Doctor doctor = new Doctor("Max Biagi", dateOfBirth5, "Psihoterapevt");

        Corps corps = new Corps("Surgery");
        Set<String> rooms = new HashSet<>();
        rooms.add("Physiotherapy");
        rooms.add("Surgery");
        rooms.add("Cardiology");
        rooms.add("Traumatology");

        hospital.setRooms(rooms);

        Insurance insurance = new Insurance(true);
        patient.setInsurance(insurance);

        LocalDateTime now = LocalDateTime.now();

        Procedure procedure = new Procedure("Massage");
        Set<String> procedures = new TreeSet<>();
        procedures.add("Manual therapy");
        procedures.add("Swimming pool");
        procedures.add("Acupuncture");
        procedures.add("Massage");

        hospital.setProcedures(procedures);

        NormOfTreatment norm = new NormOfTreatment();

        try {
            norm.getMaxNormOfTreatment();
        } catch (EnterException e) {
            e.printStackTrace();
        } finally {
            LOGGER.info("Operation complete");
        }

        SickLeave list = new SickLeave("Fracture", 1, "Max Biaggi", now);

        norm.getMaxNormOfTreatment();

        HospitalDocumentation sickLeave = new SickLeave("Sick leave", 2, "Guy Martin", now);

        Documentation doc = new SickLeave("Hospital doc", 23, "Guy Martin", now);
        doc.getType();
        Human human = new Resident<>("Den Aykroid", birthResident);

        Human human1 = new Patient<>("Den Dobson", birthPatient);

        Medicationable medic = new Medication("Heat");
        medic.getMedication("Break");

        List<PersonCard> cards = new ArrayList<>();
        cards.add(0, card);
        cards.add(1, card);
        cards.add(2, card);
        CardIndex cardIndex = new CardIndex(cards);
        PatientCard patientCard = new PatientCard("pacient name", dateOfBirth1, "head trauma", dateOfBirth5);
        Doctor doctorHouseCard = new Doctor("Doctor House", dateOfBirth3, "super therapeut");
        cardIndex.addCard(patientCard);
        cardIndex.addCard(doctorHouseCard);

        cardIndex.print();

        List<Dietable> patients = new ArrayList<>();
        Date date = new Date(8264876);
        Patient<ChronicDisease,Education> patient1 = new Patient<>("Vasia Pupkin", date);
        patient1.setVegetarian();
        patients.add(patient1);
        Patient<ChronicDisease,Education> patient2 = new Patient<>("Vasia Pupkin", date);
        patients.add(patient2);
        ChronicDisease chronicDisease = new ChronicDisease();
        patient1.setChronicDisease(chronicDisease);

        Cook cooks = new Cook();
        Canteen<Cook> canteen = new Canteen<>();
        canteen.setCooks(cooks);
        canteen.cookBreakfastForPeople(patients);

        TotalResultService total = new TotalResultService();
        total.takeMedication(medic.getMedication("Fracture"));

        try {
            total.takeMedication(medic.getMedication("Fracture"));
        } catch (AnswerException e) {
            e.printStackTrace();
        } finally {
            LOGGER.info("Operation complete");
        }

        try {
            total.getCondition();
        } catch (AnswerException e) {
            e.printStackTrace();
        } finally {
            LOGGER.info("Operation complete");
        }

        try (HospitalConnect resource = new HospitalConnect()) {
            LOGGER.info("Try to do connection");
        }

        List<String> patientList = new ArrayList<>();
        patientList.add("Victor Golubkov");
        patientList.add("Dmitriy Dmitriy");
        patientList.add("Igor Smolychkov");

        Map<Integer, String> residents = new HashMap<>();
        residents.put(1, "Neo");
        residents.put(2, "Morpheus");
        residents.put(3, "Trinity");
        residents.put(4, "Agent Smith");

        Nurse nurse4 = new Nurse();
    }
}


