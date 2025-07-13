package Program3;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class ProcessInvoices {
    private List<Invoice> invoices;

    public ProcessInvoices() {
        invoices = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Program3.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                invoices.add(new Invoice(
                    parts[0].trim(),
                    parts[1].trim(),
                    Integer.parseInt(parts[2].trim()),
                    Double.parseDouble(parts[3].trim())
                ));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void sortByPartDescription() {
        System.out.println("=== Invoices sorted by Part Description ===");

        invoices.stream()
            .sorted(Comparator.comparing(Invoice::getPartDescription))
            .forEach(invoice -> System.out.printf(
                "Part Number: %s, Description: %s, Quantity: %d, Price per Item: $%.2f%n",
                invoice.getPartNumber(),
                invoice.getPartDescription(),
                invoice.getQuantity(),
                invoice.getPricePerItem()
            ));

        System.out.println();
    }

    public void sortByPricePerItem() {
    	
    	    System.out.println("=== Invoices sorted by Price per Item ===");

    	    invoices.stream()
    	        .sorted(Comparator.comparing(Invoice::getPricePerItem))
    	        .forEach(invoice -> System.out.printf(
    	            "Part Number: %s, Description: %s, Quantity: %d, Price per Item: $%.2f%n",
    	            invoice.getPartNumber(),
    	            invoice.getPartDescription(),
    	            invoice.getQuantity(),
    	            invoice.getPricePerItem()
    	        ));

    	    System.out.println();
    	}

      
    

    public void mapToDescriptionAndQuantity() {
    	
    	    System.out.println("=== Mapping to Description and Quantity ===");
    	    invoices.stream()
    	        .map(invoice -> String.format("Description: %s, Quantity: %d", 
    	                                      invoice.getPartDescription(), 
    	                                      invoice.getQuantity()))
    	        .forEach(System.out::println);
    	    System.out.println();
    	}

    

    public void mapToDescriptionAndValue() {
    	
    	    System.out.println("=== Mapping to Description and Invoice Value ===");
    	    invoices.stream()
    	        .map(invoice -> String.format("Description: %s, Invoice Value: $%.2f", 
    	                                      invoice.getPartDescription(), 
    	                                      invoice.getQuantity() * invoice.getPricePerItem()))
    	        .forEach(System.out::println);
    	    System.out.println();
    	}

    

    public void filterInvoicesByValueRange() {
    	
    	    System.out.println("=== Invoices with Value between $200 and $500 ===");
    	    invoices.stream()
    	        .filter(invoice -> {
    	            double value = invoice.getQuantity() * invoice.getPricePerItem();
    	            return value >= 200 && value <= 500;
    	        })
    	        .forEach(invoice -> System.out.printf(
    	            "Description: %s, Value: $%.2f%n",
    	            invoice.getPartDescription(),
    	            invoice.getQuantity() * invoice.getPricePerItem()
    	        ));
    	    System.out.println();
    	}

    

    public void findInvoiceContainingSaw() {
    	
    	    System.out.println("=== Invoices Containing 'saw' in Description ===");
    	    invoices.stream()
    	        .filter(invoice -> invoice.getPartDescription().toLowerCase().contains("saw"))
    	        .forEach(invoice -> System.out.printf(
    	            "Part Number: %s, Description: %s, Quantity: %d, Price per Item: $%.2f%n",
    	            invoice.getPartNumber(),
    	            invoice.getPartDescription(),
    	            invoice.getQuantity(),
    	            invoice.getPricePerItem()
    	        ));
    	    System.out.println();
    	}

    }


