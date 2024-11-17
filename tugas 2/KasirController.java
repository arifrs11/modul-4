public class KasirController {
private Kasir model;
private KasirView view;
public KasirController(Kasir model, KasirView view) {
this.model = model;
this.view = view;
}
public void setNamaBarang (String nama_barang) {
model.setNama(nama_barang);
}
public String getNamaBarang() {
return model.getNama();
}
public void setHargaBarang(String harga_barang) {
model.setHarga(harga_barang);
}
public String getHargaBarang() {
return model.getHarga();
}
public void setStokBarang(String stok_barang) {
model.setStok(stok_barang);
}
public String getStokBarang() {
return model.getStok();
}
public void updateView() {
view.printKasirDetails(model.getNama(),
model.getHarga(), model.getStok());
}
}