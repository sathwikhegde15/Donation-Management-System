/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Pratik Gawand
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Orphanage("Orphanage"),
        NGO("NGO"),
        QualityCheck("Quality Check"),
        Distributor("Distributor"),
        Delivery("Delivery"),
        Donor("Donor");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;

        }
    }

    public enum EnumType1 {
        Orphanage("Orphanage"), OrphanageOrganization("Orphanage Organization");
        private String value;

        private EnumType1(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum EnumType2 {
        NGO("NGO"), NgoOrganization("NGO Organization");
        private String value;

        private EnumType2(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum EnumType3 {
        QualityCheck("Quality Check"), QualityCheckOrganization("Quality Checking Organization");
        private String value;

        private EnumType3(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum EnumType4 {
        Distributor("Distributor"), DistributorOrganization("Distributor Organization");
        private String value;

        private EnumType4(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum EnumType5 {
        Delivery("Delivery"), DeliveryOrganization("Delivery Organization");
        private String value;

        private EnumType5(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum EnumType6 {
        Donor("Donor"), DonorOrganization("Donor Organization");
        private String value;

        private EnumType6(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }

}
