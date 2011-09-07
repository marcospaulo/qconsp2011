package br.com.delxmobile.qconsp.adapters;
import br.com.delxmobile.qconsp.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImagePalestranteAdapter extends BaseAdapter {
    private Context mContext;
   // Fotos fotos[];
    public ImagePalestranteAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return fotos.length;
    }

    public Object getItem(int position) {
        return fotos[position];
    }

    public long getItemId(int position) {
        return position;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(fotos[position]);
        return imageView;
    }
    
    public Integer[] fotos = {
    		R.drawable.w01,
			R.drawable.w02,
			R.drawable.w03,
			R.drawable.w04,
			R.drawable.w05,
			R.drawable.w06,
			R.drawable.w07,
			R.drawable.w08,
			R.drawable.w09,
			R.drawable.w10,
			R.drawable.w11,
			R.drawable.w12,
			R.drawable.w13,
			R.drawable.w14,
			R.drawable.w15,
			R.drawable.w16,
			R.drawable.w17,
			R.drawable.w18,
			R.drawable.w19,
			R.drawable.w20,
			R.drawable.w21,
			R.drawable.w22,
			R.drawable.w23,
			R.drawable.w24,
			R.drawable.w25,
			R.drawable.w26,
			R.drawable.w27,
			R.drawable.w28,
			R.drawable.w29,
			R.drawable.w30,
			R.drawable.w31,
			R.drawable.w32,
			R.drawable.w33,
			R.drawable.w34,
			R.drawable.w35,
			R.drawable.w36,
			R.drawable.w37,
			R.drawable.w38,
			R.drawable.w39,
			R.drawable.w40,
			R.drawable.w41,
			R.drawable.w42,
			R.drawable.w43,
			R.drawable.w44,
			R.drawable.w45,
			R.drawable.w46,
			R.drawable.w47,
			R.drawable.w48,
			R.drawable.w49,
			R.drawable.w50,
			R.drawable.w51,
			R.drawable.w52,
			R.drawable.w53,
			R.drawable.w54,
			R.drawable.w55,
			R.drawable.w56,
			R.drawable.w57,
			R.drawable.w58,
			R.drawable.w59,
			R.drawable.w60,
							
    };
}

			
