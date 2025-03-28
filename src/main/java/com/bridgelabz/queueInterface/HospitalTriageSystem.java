package com.bridgelabz.queueInterface;

import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalTriageSystem {

    // Define a Patient class with name and severity level
    static class Patient {
        String name;
        int severity;

        // Constructor
        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        // Getter methods
        public String getName() {
            return name;
        }

        public int getSeverity() {
            return severity;
        }

        // Override toString for better output display
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Create a PriorityQueue with a custom comparator (max-heap based on severity)
        PriorityQueue<Patient> pq = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                // Reverse the order for max-heap behavior (higher severity first)
                return Integer.compare(p2.getSeverity(), p1.getSeverity());
            }
        });

        // Add patients to the priority queue
        pq.offer(new Patient("John", 3));
        pq.offer(new Patient("Alice", 5));
        pq.offer(new Patient("Bob", 2));

        // Simulate treating patients in order of priority (highest severity first)
        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) {
            Patient patient = pq.poll();  // Get and remove the patient with highest priority
            System.out.println(patient.getName());
        }
    }
}
