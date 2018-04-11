package com.example.rm.tutorial_viewpager;
//Passo 4 - Criar classe

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

//Passo 5 - extend PagerAdapter - implementar metodos padrão
public class ViewPagerAdapter extends PagerAdapter {

    // Passo 11 - Instanciar context e inflateter
    Context mContext;
    LayoutInflater layoutInflater;

    //Passo 20 - Criar metodo
    public ViewPagerAdapter(Context context){
        mContext = context;
    }

    //Passo 6 criar atributos
    //Passo 9 carregar itens nos atributos
    int images[] = {R.drawable.pc1,R.drawable.pc2,R.drawable.pc3,R.drawable.pc4,R.drawable.pc6,R.drawable.pc7,R.drawable.pc8};
    String[] titles = {"Foto 1","Foto 2","Foto 3","Foto 4","Foto 5","Foto 6","Foto 7"};
    String[] description = {"Imagem 1","Imagem 2","Imagem 3","Imagem 4","Imagem 5","Imagem 6","Imagem 7"};


    @Override
    public int getCount() {
        // Passo 7 - retorna tamanho do array images
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        // Passo 10 -
        return (view == (ConstraintLayout)object);
    }

    // Passo 8 -
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //Passo 12 -

        layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Passo 13 -

        View view = layoutInflater.inflate(R.layout.viewpager, container , false);
        //Passo 15 -
        ImageView vp_image = view.findViewById(R.id.vp_image);
        TextView vp_title = view.findViewById(R.id.vp_title);
        TextView vp_description = view.findViewById(R.id.vp_description);

        //Passo 16 -
        vp_image.setImageResource(images[position]);
        vp_title.setText(titles[position]);
        vp_description.setText(description[position]);

        //Passo 17 -
        container.addView(view);
        //Passo 18 -
        // De: super.instantiateItem(container, position)
        // Para: view
        return view;
    }
    // Passo 9 -
    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        // Passo 19 -
        // De:
        // super.destroyItem(container, position, object);
        // Para:
         container.removeView((ConstraintLayout)object);
    }
}
