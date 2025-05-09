package com.bridgelabz.SystemInterface;

import java.time.LocalDate;
import java.util.*;
 class Policy implements Comparable<Policy> {
    private String policyNumber;
    private String policyHolder;
    private LocalDate expiryDate;
    private double premium;

    public Policy(String policyNumber, String policyHolder, LocalDate expiryDate, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolder = policyHolder;
        this.expiryDate = expiryDate;
        this.premium = premium;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public double getPremium() {
        return premium;
    }

    @Override
    public String toString() {
        return String.format("Policy[%s, %s, Expiry: %s, Premium: %.2f]",
                policyNumber, policyHolder, expiryDate, premium);
    }

    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }
}


 class PolicyManager {

    private Map<String, Policy> policyMap = new HashMap<>();
    private LinkedHashMap<String, Policy> insertionOrderMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, Policy> sortedByExpiry = new TreeMap<>();

    // Add policy to all collections
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderMap.put(policy.getPolicyNumber(), policy);
        sortedByExpiry.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate threshold = today.plusDays(30);

        List<Policy> expiringPolicies = new ArrayList<>();

        for (Map.Entry<LocalDate, Policy> entry : sortedByExpiry.entrySet()) {
            if (entry.getKey().isAfter(today) && entry.getKey().isBefore(threshold)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String holderName) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyHolder().equalsIgnoreCase(holderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, Policy>> iterator = sortedByExpiry.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, Policy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                Policy expiredPolicy = entry.getValue();
                policyMap.remove(expiredPolicy.getPolicyNumber());
                insertionOrderMap.remove(expiredPolicy.getPolicyNumber());
                iterator.remove();
            }
        }
    }

    // Display all policies (in insertion order)
    public void displayPolicies() {
        System.out.println("All Policies (Insertion Order):");
        for (Policy policy : insertionOrderMap.values()) {
            System.out.println(policy);
        }
    }
}


public class PolicyManagement {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        // Adding sample policies
        manager.addPolicy(new Policy("101", "Aaryan",LocalDate.now().plusDays(20), 1500));
        manager.addPolicy(new Policy("102", "Hitesh", LocalDate.now().plusDays(35), 2000));
        manager.addPolicy(new Policy("103", "Yash", LocalDate.now().minusDays(10), 1300));
        manager.addPolicy(new Policy("104", "Rahul", LocalDate.now().plusDays(5), 1800));
        manager.addPolicy(new Policy("105", "Mohit", LocalDate.now().plusDays(50), 2200));

        System.out.println("\n--- All Policies ---");
        manager.displayPolicies();

        System.out.println("\n--- Expiring within 30 days ---");
        for (Policy policy : manager.getExpiringPolicies()) {
            System.out.println(policy);
        }

        System.out.println("\n--- Policies for Alice ---");
        for (Policy policy : manager.getPoliciesByHolder("Alice")) {
            System.out.println(policy);
        }

        System.out.println("\n--- Removing Expired Policies ---");
        manager.removeExpiredPolicies();
        manager.displayPolicies();
    }
}

//--- All Policies ---
// All Policies (Insertion Order):
// Policy[101, Aaryan, Expiry: 2025-04-18, Premium: 1500.00]
// Policy[102, Hitesh, Expiry: 2025-05-03, Premium: 2000.00]
// Policy[103, Yash, Expiry: 2025-03-19, Premium: 1300.00]
// Policy[104, Rahul, Expiry: 2025-04-03, Premium: 1800.00]
// Policy[105, Mohit, Expiry: 2025-05-18, Premium: 2200.00]
//
//         --- Expiring within 30 days ---
// Policy[104, Rahul, Expiry: 2025-04-03, Premium: 1800.00]
// Policy[101, Aaryan, Expiry: 2025-04-18, Premium: 1500.00]
//
//         --- Policies for Alice ---
//
//         --- Removing Expired Policies ---
// All Policies (Insertion Order):
// Policy[101, Aaryan, Expiry: 2025-04-18, Premium: 1500.00]
// Policy[102, Hitesh, Expiry: 2025-05-03, Premium: 2000.00]
// Policy[104, Rahul, Expiry: 2025-04-03, Premium: 1800.00]
// Policy[105, Mohit, Expiry: 2025-05-18, Premium: 2200.00]