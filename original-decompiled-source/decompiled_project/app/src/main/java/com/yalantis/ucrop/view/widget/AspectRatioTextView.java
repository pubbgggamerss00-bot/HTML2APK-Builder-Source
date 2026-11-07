package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Locale;
import m.r;
import p3.b;
import zf.a;

/* loaded from: classes2.dex */
public class AspectRatioTextView extends r {
    private final float MARGIN_MULTIPLIER;
    private float mAspectRatio;
    private String mAspectRatioTitle;
    private float mAspectRatioX;
    private float mAspectRatioY;
    private final Rect mCanvasClipBounds;
    private Paint mDotPaint;
    private int mDotSize;

    public AspectRatioTextView(Context context) {
        this(context, null);
    }

    private void applyActiveColor(int i10) {
        Paint paint = this.mDotPaint;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i10, b.getColor(getContext(), com.basitce.htmltoapk.R.color.ucrop_color_widget)}));
    }

    private void init(TypedArray typedArray) {
        setGravity(1);
        this.mAspectRatioTitle = typedArray.getString(0);
        this.mAspectRatioX = typedArray.getFloat(1, CropImageView.DEFAULT_ASPECT_RATIO);
        float f10 = typedArray.getFloat(2, CropImageView.DEFAULT_ASPECT_RATIO);
        this.mAspectRatioY = f10;
        float f11 = this.mAspectRatioX;
        if (f11 == CropImageView.DEFAULT_ASPECT_RATIO || f10 == CropImageView.DEFAULT_ASPECT_RATIO) {
            this.mAspectRatio = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            this.mAspectRatio = f11 / f10;
        }
        this.mDotSize = getContext().getResources().getDimensionPixelSize(com.basitce.htmltoapk.R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.mDotPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        setTitle();
        applyActiveColor(getResources().getColor(com.basitce.htmltoapk.R.color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void setTitle() {
        if (!TextUtils.isEmpty(this.mAspectRatioTitle)) {
            setText(this.mAspectRatioTitle);
            return;
        }
        Locale locale = Locale.US;
        setText(((int) this.mAspectRatioX) + ":" + ((int) this.mAspectRatioY));
    }

    private void toggleAspectRatio() {
        if (this.mAspectRatio != CropImageView.DEFAULT_ASPECT_RATIO) {
            float f10 = this.mAspectRatioX;
            float f11 = this.mAspectRatioY;
            this.mAspectRatioX = f11;
            this.mAspectRatioY = f10;
            this.mAspectRatio = f11 / f10;
        }
    }

    public float getAspectRatio(boolean z10) {
        if (z10) {
            toggleAspectRatio();
            setTitle();
        }
        return this.mAspectRatio;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.mCanvasClipBounds);
            Rect rect = this.mCanvasClipBounds;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i10 = this.mDotSize;
            canvas.drawCircle(f10, f11 - (i10 * 1.5f), i10 / 2.0f, this.mDotPaint);
        }
    }

    public void setActiveColor(int i10) {
        applyActiveColor(i10);
        invalidate();
    }

    public void setAspectRatio(a aVar) {
        this.mAspectRatioTitle = aVar.f35056a;
        float f10 = aVar.f35057b;
        this.mAspectRatioX = f10;
        float f11 = aVar.f35058c;
        this.mAspectRatioY = f11;
        if (f10 == CropImageView.DEFAULT_ASPECT_RATIO || f11 == CropImageView.DEFAULT_ASPECT_RATIO) {
            this.mAspectRatio = CropImageView.DEFAULT_ASPECT_RATIO;
        } else {
            this.mAspectRatio = f10 / f11;
        }
        setTitle();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, xf.b.f33568a));
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.MARGIN_MULTIPLIER = 1.5f;
        this.mCanvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, xf.b.f33568a));
    }
}
