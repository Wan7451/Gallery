package com.wan7451.qscrollviewpager.demo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.wan7451.gallery.Gallery;
import com.wan7451.gallery.GalleryAdapter;
import com.wan7451.gallery.ViewHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery viewPager
                = (Gallery) findViewById(R.id.gallery);

        ArrayList<String> data = new ArrayList<>();
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767889071&di=41fe3e5142e978b1d7b38c6d838d4954&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F91529822720e0cf37e0fe82c0e46f21fbf09aa69.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767924866&di=42feefbeca5a78f37f042b1ff22715a4&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5882b2b7d0a20cf482c772bf73094b36acaf997f.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767943009&di=bbc650027240ffc4a069a3cf39ad95ac&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767889071&di=41fe3e5142e978b1d7b38c6d838d4954&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F91529822720e0cf37e0fe82c0e46f21fbf09aa69.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767924866&di=42feefbeca5a78f37f042b1ff22715a4&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5882b2b7d0a20cf482c772bf73094b36acaf997f.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767943009&di=bbc650027240ffc4a069a3cf39ad95ac&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767889071&di=41fe3e5142e978b1d7b38c6d838d4954&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F91529822720e0cf37e0fe82c0e46f21fbf09aa69.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767924866&di=42feefbeca5a78f37f042b1ff22715a4&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5882b2b7d0a20cf482c772bf73094b36acaf997f.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767943009&di=bbc650027240ffc4a069a3cf39ad95ac&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767889071&di=41fe3e5142e978b1d7b38c6d838d4954&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F91529822720e0cf37e0fe82c0e46f21fbf09aa69.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767924866&di=42feefbeca5a78f37f042b1ff22715a4&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5882b2b7d0a20cf482c772bf73094b36acaf997f.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767943009&di=bbc650027240ffc4a069a3cf39ad95ac&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767889071&di=41fe3e5142e978b1d7b38c6d838d4954&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F91529822720e0cf37e0fe82c0e46f21fbf09aa69.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767924866&di=42feefbeca5a78f37f042b1ff22715a4&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5882b2b7d0a20cf482c772bf73094b36acaf997f.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767943009&di=bbc650027240ffc4a069a3cf39ad95ac&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767889071&di=41fe3e5142e978b1d7b38c6d838d4954&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F91529822720e0cf37e0fe82c0e46f21fbf09aa69.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767924866&di=42feefbeca5a78f37f042b1ff22715a4&imgtype=0&src=http%3A%2F%2Fd.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5882b2b7d0a20cf482c772bf73094b36acaf997f.jpg");
        data.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1489767943009&di=bbc650027240ffc4a069a3cf39ad95ac&imgtype=0&src=http%3A%2F%2Fc.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Ff7246b600c3387448982f948540fd9f9d72aa0bb.jpg");

        viewPager.setClipWidth(dip2px(this, 20));
        viewPager.setInterval(dip2px(this, 10));

        viewPager.setAdapter(new QSAdapter(this, data));

    }


    private static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    static class QSAdapter extends GalleryAdapter<String> {

        public QSAdapter(Context context, ArrayList<String> list) {
            super(context, list);
        }

        @Override
        protected int getConvertLayout() {
            return R.layout.item_viewpager;
        }


        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            ImageView img = holder.getView(R.id.image);
            Glide.with(getContext()).load(getList().get(position))
                    .centerCrop()
                    .into(img);
        }
    }


}
