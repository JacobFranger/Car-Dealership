package com.plurasight;



public class Contract {
    private int salesContract;
    private int leaseContract;


    public int getLeaseContract() {
        return leaseContract;
    }

    public void setLeaseContract(int leaseContract) {
        this.leaseContract = leaseContract;
    }

    public int getSalesContract() {
        return salesContract;
    }

    public void setSalesContract(int salesContract) {
        this.salesContract = salesContract;
    }


    public Contract(int salesContract, int leaseContract) {
        this.salesContract = salesContract;
        this.leaseContract = leaseContract;
    }

    



}
