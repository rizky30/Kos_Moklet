package id.sch.smktelkom_mlg.project2.xirpl60203122324.kos_moklet.kost;

import android.graphics.drawable.Drawable;

/**
 * Created by user on 30/03/2017.
 */

public class Kost {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Kost(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
