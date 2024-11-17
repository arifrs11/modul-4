public class MVCPatternDemo {
public static void main(String[] args) {
Kasir model = retriveKasirFromDatabase(); 
KasirView view = new KasirView();
KasirController controller = new KasirController(model, view);
controller.updateView(); //update model data 
controller.setNamaBarang("AMD RX 6600");
System.out.println("\nAfter updating, Transaction Details are as follows");
controller.updateView();
}
private static Kasir retriveKasirFromDatabase() { 
Kasir kasir = new Kasir(); 
kasir.setNama("AMD Ryzen 3 3200g"); 
kasir.setHarga("Rp,2.000.000"); 
kasir.setStok("10");
return kasir;
}
}
