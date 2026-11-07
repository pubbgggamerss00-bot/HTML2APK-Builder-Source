package w2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c0 extends View {
    public static final ColorMatrixColorFilter C = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-0.85f, 0.0f, 0.0f, 0.0f, 240.0f, 0.0f, -0.85f, 0.0f, 0.0f, 240.0f, 0.0f, 0.0f, -0.85f, 0.0f, 240.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
    public final Paint A;
    public final Paint B;
    public double s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14883t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14884u;

    /* renamed from: v, reason: collision with root package name */
    public Bitmap f14885v;

    /* renamed from: w, reason: collision with root package name */
    public Bitmap f14886w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f14887x;

    /* renamed from: y, reason: collision with root package name */
    public float f14888y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f14889z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.j.e("view", view);
            kotlin.jvm.internal.j.e("outline", outline);
            c0 c0Var = c0.this;
            outline.setRect(e5.i.h(c0Var.getPageBox().left), e5.i.h(c0Var.getPageBox().top), e5.i.h(c0Var.getPageBox().right), e5.i.h(c0Var.getPageBox().bottom));
        }
    }

    public c0(Context context) {
        super(context);
        this.s = Math.sqrt(2.0d);
        this.f14887x = new RectF();
        this.f14889z = new RectF();
        this.A = new Paint(6);
        Paint paint = new Paint();
        paint.setColor(-1);
        this.B = paint;
        setOutlineProvider(new a());
    }

    public final void a() {
        m0 m0Var;
        float f6;
        int width = getWidth();
        int height = getHeight();
        double d7 = this.s;
        if (!this.f14883t || width <= 0 || height <= 0) {
            m0Var = new m0(0.0f, 0.0f, width, height);
        } else {
            float f7 = width;
            float f8 = (float) (f7 * d7);
            float f9 = height;
            if (f8 > f9) {
                f6 = (float) (f9 / d7);
                f8 = f9;
            } else {
                f6 = f7;
            }
            float f10 = (f7 - f6) / 2.0f;
            float f11 = (f9 - f8) / 2.0f;
            m0Var = new m0(f10, f11, f6 + f10, f8 + f11);
        }
        this.f14889z.set(m0Var.f14943a, m0Var.f14944b, m0Var.f14945c, m0Var.f14946d);
        invalidateOutline();
        invalidate();
    }

    public final Bitmap getBase() {
        return this.f14885v;
    }

    public final Bitmap getDetail() {
        return this.f14886w;
    }

    public final RectF getDetailBox() {
        return this.f14887x;
    }

    public final float getDetailZoom() {
        return this.f14888y;
    }

    public final boolean getFitWholePage() {
        return this.f14883t;
    }

    public final boolean getNight() {
        return this.f14884u;
    }

    public final RectF getPageBox() {
        return this.f14889z;
    }

    public final double getRatio() {
        return this.s;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.j.e("canvas", canvas);
        RectF rectF = this.f14889z;
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawRect(rectF, this.B);
        Bitmap bitmap = this.f14885v;
        Paint paint = this.A;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
            }
        }
        Bitmap bitmap2 = this.f14886w;
        if (bitmap2 != null) {
            if (bitmap2.isRecycled()) {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, (Rect) null, this.f14887x, paint);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        a();
    }

    public final void setFitWholePage(boolean z6) {
        this.f14883t = z6;
        a();
    }

    public final void setNight(boolean z6) {
        if (this.f14884u == z6) {
            return;
        }
        this.f14884u = z6;
        ColorMatrixColorFilter colorMatrixColorFilter = z6 ? C : null;
        this.A.setColorFilter(colorMatrixColorFilter);
        this.B.setColorFilter(colorMatrixColorFilter);
        invalidate();
    }

    public final void setRatio(double d7) {
        if (this.s == d7) {
            return;
        }
        this.s = d7;
        a();
    }
}
