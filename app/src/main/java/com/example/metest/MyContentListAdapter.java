package com.example.metest;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

public class MyContentListAdapter extends BaseQuickAdapter<MyContent, BaseViewHolder> {
    public MyContentListAdapter(int layoutResId, List data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyContent item) {
        helper.setText(R.id.tv_time, item.getTime());
        helper.setText(R.id.tv_location, item.getLocation());
        helper.setText(R.id.tv_content, item.getContent());
        // 加载网络图片
        //Glide.with(mContext).load(item.getUserAvatar()).crossFade().into((ImageView) helper.getView(R.id.iv));
    }
}

