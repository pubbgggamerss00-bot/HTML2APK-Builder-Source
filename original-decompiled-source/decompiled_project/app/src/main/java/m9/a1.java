package m9;

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
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class a1 extends View {

    /* renamed from: l, reason: collision with root package name */
    public static final ColorMatrixColorFilter f17713l = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-0.85f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 240.0f, CropImageView.DEFAULT_ASPECT_RATIO, -0.85f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 240.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -0.85f, CropImageView.DEFAULT_ASPECT_RATIO, 240.0f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO}));

    /* renamed from: a, reason: collision with root package name */
    public double f17714a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17715b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17716c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f17717d;

    /* renamed from: e, reason: collision with root package name */
    public Bitmap f17718e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f17719f;

    /* renamed from: g, reason: collision with root package name */
    public float f17720g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f17721h;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f17722j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f17723k;

    public static final class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            kotlin.jvm.internal.r.e(view, "view");
            kotlin.jvm.internal.r.e(outline, "outline");
            a1 a1Var = a1.this;
            outline.setRect(gh.a.b(a1Var.getPageBox().left), gh.a.b(a1Var.getPageBox().top), gh.a.b(a1Var.getPageBox().right), gh.a.b(a1Var.getPageBox().bottom));
        }
    }

    public a1(Context context) {
        super(context);
        this.f17714a = Math.sqrt(2.0d);
        this.f17719f = new RectF();
        this.f17721h = new RectF();
        this.f17722j = new Paint(6);
        Paint paint = new Paint();
        paint.setColor(-1);
        this.f17723k = paint;
        setOutlineProvider(new a());
    }

    public final void a() {
        u1 u1Var;
        float f10;
        int width = getWidth();
        int height = getHeight();
        double d10 = this.f17714a;
        if (!this.f17715b || width <= 0 || height <= 0) {
            u1Var = new u1(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, width, height);
        } else {
            float f11 = width;
            float f12 = (float) (f11 * d10);
            float f13 = height;
            if (f12 > f13) {
                f10 = (float) (f13 / d10);
                f12 = f13;
            } else {
                f10 = f11;
            }
            float f14 = (f11 - f10) / 2.0f;
            float f15 = (f13 - f12) / 2.0f;
            u1Var = new u1(f14, f15, f10 + f14, f12 + f15);
        }
        this.f17721h.set(u1Var.f17959a, u1Var.f17960b, u1Var.f17961c, u1Var.f17962d);
        invalidateOutline();
        invalidate();
    }

    public final Bitmap getBase() {
        return this.f17717d;
    }

    public final Bitmap getDetail() {
        return this.f17718e;
    }

    public final RectF getDetailBox() {
        return this.f17719f;
    }

    public final float getDetailZoom() {
        return this.f17720g;
    }

    public final boolean getFitWholePage() {
        return this.f17715b;
    }

    public final boolean getNight() {
        return this.f17716c;
    }

    public final RectF getPageBox() {
        return this.f17721h;
    }

    public final double getRatio() {
        return this.f17714a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.r.e(canvas, "canvas");
        RectF rectF = this.f17721h;
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawRect(rectF, this.f17723k);
        Bitmap bitmap = this.f17717d;
        Paint paint = this.f17722j;
        if (bitmap != null) {
            if (bitmap.isRecycled()) {
                bitmap = null;
            }
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (Rect) null, rectF, paint);
            }
        }
        Bitmap bitmap2 = this.f17718e;
        if (bitmap2 != null) {
            if (bitmap2.isRecycled()) {
                bitmap2 = null;
            }
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, (Rect) null, this.f17719f, paint);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    public final void setFitWholePage(boolean z10) {
        this.f17715b = z10;
        a();
    }

    public final void setNight(boolean z10) {
        if (this.f17716c == z10) {
            return;
        }
        this.f17716c = z10;
        ColorMatrixColorFilter colorMatrixColorFilter = z10 ? f17713l : null;
        this.f17722j.setColorFilter(colorMatrixColorFilter);
        this.f17723k.setColorFilter(colorMatrixColorFilter);
        invalidate();
    }

    public final void setRatio(double d10) {
        if (this.f17714a == d10) {
            return;
        }
        this.f17714a = d10;
        a();
    }
}
