package services;

import entities.BasicInfo;
import entities.data.MaritalStatus;

import java.util.Scanner;

public class BasicInfoServices implements BasicInfoInterface {
    Scanner read = new Scanner(System.in);

    @Override
    public BasicInfo register() {
        BasicInfo basicInfo = new BasicInfo();
        System.out.println("Enter the person's FIRST NAME: ");
        basicInfo.setPersonFirstName(read.nextLine());
        System.out.println("Enter the person's MIDDLE NAME: ");
        basicInfo.setPersonMiddleName(read.nextLine());
        System.out.println("Enter the person's LAST NAME: ");
        basicInfo.setPersonLastName(read.nextLine());
        System.out.println("Enter the person's ID");
        basicInfo.setPersonID(Long.parseLong(read.nextLine()));
        loop:
        while (true) {
            System.out.println("Enter the person's MARITAL STATUS");
            System.out.println("1 => SINGLE");
            System.out.println("2 => MARRIED");
            System.out.println("3 => DIVORCED");
            System.out.println("4 => SEPARATED");
            System.out.println("5 => WIDOWED");
            System.out.println("6 => REGISTERED PARTNERSHIP");
            int maritalStatus = Integer.parseInt(read.nextLine());

            switch (maritalStatus) {
                case 1 -> {basicInfo.setMaritalStatus(MaritalStatus.SINGLE);break loop;}
                case 2 -> {basicInfo.setMaritalStatus(MaritalStatus.MARRIED);break loop;}
                case 3 -> {basicInfo.setMaritalStatus(MaritalStatus.DIVORCED);break loop;}
                case 4 -> {basicInfo.setMaritalStatus(MaritalStatus.SEPARATED);break loop;}
                case 5 -> {basicInfo.setMaritalStatus(MaritalStatus.WIDOWED);break loop;}
                case 6 -> {basicInfo.setMaritalStatus(MaritalStatus.REGISTERED_PARTNERSHIP);break loop;}
                default -> System.out.println("Unexpected value, try again.");
            }
        }

        return basicInfo;
    }
    @Override
    public void fetchBasicInfo(BasicInfo info) {
        System.out.println(info.getPersonLastName()+", "+info.getPersonFirstName()+" "+info.getPersonMiddleName());
        System.out.println("ID: "+info.getPersonID());
        System.out.println("MARITAL STATUS: " + info.getMaritalStatus());
    }

    @Override
    public BasicInfo update(BasicInfo oldInfo) {
        return null;
    }

    @Override
    public BasicInfo delete(BasicInfo info) {
        return null;
    }

}
