package com.zy.lib_transformer.viewpager_transformer;

import android.util.Log;
import android.view.View;

public class CubeInTransformer extends ABaseTransformer {

	@Override
	protected void onTransform(View view, float position) {
		Log.e("cubein",view.getWidth()+"："+view.getHeight());
		// Rotate the fragment on the left or right edge
		view.setPivotX(position > 0 ? 0 : view.getWidth());
		view.setPivotY(0);
		view.setRotationY(-90f * position);
	}

	@Override
	public boolean isPagingEnabled() {
		return true;
	}

}
