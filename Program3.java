package Program3;

public class Program3 {
    public static void main(String[] args) {
        ProcessInvoices processor = new ProcessInvoices();

        processor.sortByPartDescription();
        processor.sortByPricePerItem();
        processor.mapToDescriptionAndQuantity();
        processor.mapToDescriptionAndValue();
        processor.filterInvoicesByValueRange();
        processor.findInvoiceContainingSaw();
    }
}
