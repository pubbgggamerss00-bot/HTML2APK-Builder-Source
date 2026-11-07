package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import c2.a;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
class CircleImageView extends ImageView {
    private static final int DEFAULT_BACKGROUND_COLOR = -328966;
    private static final int FILL_SHADOW_COLOR = 1023410176;
    private static final int KEY_SHADOW_COLOR = 503316480;
    private static final int SHADOW_ELEVATION = 4;
    private static final float SHADOW_RADIUS = 3.5f;
    private static final float X_OFFSET = 0.0f;
    private static final float Y_OFFSET = 1.75f;
    private int mBackgroundColor;
    private Animation.AnimationListener mListener;
    private int mShadowRadius;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class OvalShadow extends OvalShape {
        private CircleImageView mCircleImageView;
        private Paint mShadowPaint = new Paint();
        private int mShadowRadius;

        public OvalShadow(CircleImageView circleImageView, int i6) {
            this.mCircleImageView = circleImageView;
            this.mShadowRadius = i6;
            updateRadialGradient((int) rect().width());
        }

        private void updateRadialGradient(int i6) {
            float f6 = i6 / 2;
            this.mShadowPaint.setShader(new RadialGradient(f6, f6, this.mShadowRadius, new int[]{CircleImageView.FILL_SHADOW_COLOR, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.mCircleImageView.getWidth() / 2;
            float height = this.mCircleImageView.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.mShadowPaint);
            canvas.drawCircle(width, height, r0 - this.mShadowRadius, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f6, float f7) {
            super.onResize(f6, f7);
            updateRadialGradient((int) f6);
        }
    }

    public CircleImageView(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f6 = getContext().getResources().getDisplayMetrics().density;
        int i6 = (int) (Y_OFFSET * f6);
        int i7 = (int) (X_OFFSET * f6);
        this.mShadowRadius = (int) (SHADOW_RADIUS * f6);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(a.f2160a);
        this.mBackgroundColor = typedArrayObtainStyledAttributes.getColor(0, DEFAULT_BACKGROUND_COLOR);
        typedArrayObtainStyledAttributes.recycle();
        if (elevationSupported()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            f0.d.j(this, f6 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShadow(this, this.mShadowRadius));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.mShadowRadius, i7, i6, KEY_SHADOW_COLOR);
            int i8 = this.mShadowRadius;
            setPadding(i8, i8, i8, i8);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.mBackgroundColor);
        WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
        setBackground(shapeDrawable);
    }

    private boolean elevationSupported() {
        return true;
    }

    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.mListener;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        if (elevationSupported()) {
            return;
        }
        setMeasuredDimension((this.mShadowRadius * 2) + getMeasuredWidth(), (this.mShadowRadius * 2) + getMeasuredHeight());
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.mListener = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i6);
            this.mBackgroundColor = i6;
        }
    }
}
