package m9;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class u0 extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f17942s = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f17943a;

    /* renamed from: b, reason: collision with root package name */
    public float f17944b;

    /* renamed from: c, reason: collision with root package name */
    public eh.l<? super Float, String> f17945c;

    /* renamed from: d, reason: collision with root package name */
    public eh.l<? super Float, pg.f0> f17946d;

    /* renamed from: e, reason: collision with root package name */
    public eh.a<pg.f0> f17947e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17948f;

    /* renamed from: g, reason: collision with root package name */
    public final float f17949g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17950h;

    /* renamed from: j, reason: collision with root package name */
    public final float f17951j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17952k;

    /* renamed from: l, reason: collision with root package name */
    public final float f17953l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f17954m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f17955n;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f17956p;

    /* renamed from: q, reason: collision with root package name */
    public final RectF f17957q;

    /* renamed from: r, reason: collision with root package name */
    public final t0 f17958r;

    public u0(Context context, int i10) {
        super(context);
        this.f17945c = new s0();
        float f10 = getResources().getDisplayMetrics().density;
        this.f17949g = f10;
        this.f17950h = 6 * f10;
        this.f17951j = 52 * f10;
        this.f17952k = 44 * f10;
        this.f17953l = 4 * f10;
        Paint paint = new Paint(1);
        paint.setColor(i10);
        this.f17954m = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(i10);
        this.f17955n = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setTextSize(16 * f10);
        paint3.setFakeBoldText(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.f17956p = paint3;
        this.f17957q = new RectF();
        this.f17958r = new t0(this, 0);
        setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public final void a(float f10) {
        float height = getHeight();
        float f11 = this.f17951j;
        float f12 = height - f11;
        if (f12 < 1.0f) {
            f12 = 1.0f;
        }
        setFraction((f10 - (f11 / 2.0f)) / f12);
        eh.l<? super Float, pg.f0> lVar = this.f17946d;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(this.f17944b));
        }
    }

    public final boolean getDragging() {
        return this.f17948f;
    }

    public final float getFraction() {
        return this.f17944b;
    }

    public final eh.l<Float, String> getLabel() {
        return this.f17945c;
    }

    public final eh.l<Float, pg.f0> getOnScrub() {
        return this.f17946d;
    }

    public final eh.a<pg.f0> getOnScrubEnd() {
        return this.f17947e;
    }

    public final int getPageCount() {
        return this.f17943a;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f17958r);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.r.e(canvas, "canvas");
        if (this.f17943a < 2) {
            return;
        }
        float f10 = this.f17944b;
        float height = getHeight();
        float f11 = this.f17951j;
        float f12 = height - f11;
        if (f12 < CropImageView.DEFAULT_ASPECT_RATIO) {
            f12 = 0.0f;
        }
        float f13 = f10 * f12;
        float width = getWidth() - this.f17953l;
        float f14 = this.f17950h;
        float f15 = width - f14;
        RectF rectF = this.f17957q;
        rectF.set(f15, f13, width, f13 + f11);
        canvas.drawRoundRect(rectF, f14, f14, this.f17954m);
        if (this.f17948f) {
            String strInvoke = this.f17945c.invoke(Float.valueOf(this.f17944b));
            Paint paint = this.f17956p;
            float fMeasureText = paint.measureText(strInvoke);
            float f16 = this.f17949g;
            float f17 = (28 * f16) + fMeasureText;
            float f18 = (40 * f16) / 2.0f;
            float fL = jh.j.l((f11 / 2.0f) + f13, f18, getHeight() - f18);
            float f19 = f15 - (16 * f16);
            rectF.set(f19 - f17, fL - f18, f19, fL + f18);
            canvas.drawRoundRect(rectF, f18, f18, this.f17955n);
            canvas.drawText(strInvoke, rectF.centerX(), fL - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.r.e(event, "event");
        int actionMasked = event.getActionMasked();
        t0 t0Var = this.f17958r;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f17948f) {
                    this.f17948f = false;
                    invalidate();
                    eh.a<pg.f0> aVar = this.f17947e;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    postDelayed(t0Var, 1200L);
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            } else if (this.f17948f) {
                a(event.getY());
            }
            return this.f17948f;
        }
        if (getAlpha() >= 0.2f && this.f17943a >= 2) {
            float x10 = event.getX();
            float width = getWidth();
            float f10 = this.f17952k;
            if (x10 >= width - f10) {
                float f11 = this.f17944b;
                float height = getHeight();
                float f12 = this.f17951j;
                float f13 = height - f12;
                if (f13 < CropImageView.DEFAULT_ASPECT_RATIO) {
                    f13 = 0.0f;
                }
                float f14 = f11 * f13;
                if (event.getY() >= f14 - f10 && event.getY() <= f14 + f12 + f10) {
                    this.f17948f = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    removeCallbacks(t0Var);
                    animate().cancel();
                    setAlpha(1.0f);
                    a(event.getY());
                    return true;
                }
            }
        }
        return false;
    }

    public final void setFraction(float f10) {
        this.f17944b = jh.j.l(f10, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        invalidate();
    }

    public final void setLabel(eh.l<? super Float, String> lVar) {
        kotlin.jvm.internal.r.e(lVar, "<set-?>");
        this.f17945c = lVar;
    }

    public final void setOnScrub(eh.l<? super Float, pg.f0> lVar) {
        this.f17946d = lVar;
    }

    public final void setOnScrubEnd(eh.a<pg.f0> aVar) {
        this.f17947e = aVar;
    }

    public final void setPageCount(int i10) {
        this.f17943a = i10;
    }
}
