package co.edu.unipiloto;

import java.util.ArrayList;
import android.content.Context;
public class BeerExpert {

    String light[];
    String amber[];
    String brown[];
    String dark[];

    public BeerExpert(Context context){
        this.light = context.getResources().getStringArray(R.array.light);
        this.amber = context.getResources().getStringArray(R.array.amber);
        this.brown = context.getResources().getStringArray(R.array.brown);
        this.dark = context.getResources().getStringArray(R.array.dark);
    }

    public String getBrands(String brand){
        if(brand.equals("light")){
            return light[0] + "\n" + light[1] + "\n" + light[2] + "\n" + light[3];
        }
        if(brand.equals("amber")){
            return amber[0] + "\n" + amber[1] + "\n" + amber[2];
        }
        if(brand.equals("brown")){
            return brown[0] + "\n" + brown[1] + "\n" + brown[2];
        }
        if(brand.equals("dark")){
            return dark[0] + "\n" + dark[1] + "\n" + dark[2];
        }
        return "no selected beer type";
    }
}
