package com.company;

public class Information {
    String name;
    int id;
    String address;

  void fee_structure(int fee,int tuition,int security_deposit) {
      System.out.println(fee+security_deposit+tuition);
  }

    public static void main(String[] args) {

      Information s1=new Information();
      s1.name="anuska";
      s1.address = "Munalpath";
      s1.id=15;
        System.out.println(s1.name);
        System.out.println(s1.address);
        System.out.println(s1.id);
      s1.fee_structure(20000,1500,1000);

    }

}
