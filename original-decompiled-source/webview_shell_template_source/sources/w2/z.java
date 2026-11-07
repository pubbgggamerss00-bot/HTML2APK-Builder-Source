package w2;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z extends View {
    public static final /* synthetic */ int I = 0;
    public final float A;
    public final float B;
    public final float C;
    public final Paint D;
    public final Paint E;
    public final Paint F;
    public final RectF G;
    public final androidx.activity.d H;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public float f15054t;

    /* renamed from: u, reason: collision with root package name */
    public p5.l<? super Float, String> f15055u;

    /* renamed from: v, reason: collision with root package name */
    public p5.l<? super Float, d5.j> f15056v;

    /* renamed from: w, reason: collision with root package name */
    public p5.a<d5.j> f15057w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15058x;

    /* renamed from: y, reason: collision with root package name */
    public final float f15059y;

    /* renamed from: z, reason: collision with root package name */
    public final float f15060z;

    public z(ComponentActivity componentActivity, int i6) {
        super(componentActivity);
        this.f15055u = new androidx.camera.camera2.internal.g0();
        float f6 = getResources().getDisplayMetrics().density;
        this.f15059y = f6;
        this.f15060z = 6 * f6;
        this.A = 52 * f6;
        this.B = 44 * f6;
        this.C = 4 * f6;
        Paint paint = new Paint(1);
        paint.setColor(i6);
        this.D = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(i6);
        this.E = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(-1);
        paint3.setTextSize(16 * f6);
        paint3.setFakeBoldText(true);
        paint3.setTextAlign(Paint.Align.CENTER);
        this.F = paint3;
        this.G = new RectF();
        this.H = new androidx.activity.d(6, this);
        setAlpha(0.0f);
    }

    public final void a(float f6) {
        float height = getHeight();
        float f7 = this.A;
        float f8 = height - f7;
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        setFraction((f6 - (f7 / 2.0f)) / f8);
        p5.l<? super Float, d5.j> lVar = this.f15056v;
        if (lVar != null) {
            lVar.invoke(Float.valueOf(this.f15054t));
        }
    }

    public final boolean getDragging() {
        return this.f15058x;
    }

    public final float getFraction() {
        return this.f15054t;
    }

    public final p5.l<Float, String> getLabel() {
        return this.f15055u;
    }

    public final p5.l<Float, d5.j> getOnScrub() {
        return this.f15056v;
    }

    public final p5.a<d5.j> getOnScrubEnd() {
        return this.f15057w;
    }

    public final int getPageCount() {
        return this.s;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.H);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        kotlin.jvm.internal.j.e("canvas", canvas);
        if (this.s < 2) {
            return;
        }
        float f6 = this.f15054t;
        float height = getHeight();
        float f7 = this.A;
        float f8 = height - f7;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        float f9 = f6 * f8;
        float width = getWidth() - this.C;
        float f10 = this.f15060z;
        float f11 = width - f10;
        RectF rectF = this.G;
        rectF.set(f11, f9, width, f9 + f7);
        canvas.drawRoundRect(rectF, f10, f10, this.D);
        if (this.f15058x) {
            String strInvoke = this.f15055u.invoke(Float.valueOf(this.f15054t));
            Paint paint = this.F;
            float fMeasureText = paint.measureText(strInvoke);
            float f12 = this.f15059y;
            float f13 = (28 * f12) + fMeasureText;
            float f14 = (40 * f12) / 2.0f;
            float fO = u5.d.o((f7 / 2.0f) + f9, f14, getHeight() - f14);
            float f15 = f11 - (16 * f12);
            rectF.set(f15 - f13, fO - f14, f15, fO + f14);
            canvas.drawRoundRect(rectF, f14, f14, this.E);
            canvas.drawText(strInvoke, rectF.centerX(), fO - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kotlin.jvm.internal.j.e("event", motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        androidx.activity.d dVar = this.H;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.f15058x) {
                    this.f15058x = false;
                    invalidate();
                    p5.a<d5.j> aVar = this.f15057w;
                    if (aVar != null) {
                        aVar.a();
                    }
                    postDelayed(dVar, 1200L);
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
            } else if (this.f15058x) {
                a(motionEvent.getY());
            }
            return this.f15058x;
        }
        if (getAlpha() >= 0.2f && this.s >= 2) {
            float x6 = motionEvent.getX();
            float width = getWidth();
            float f6 = this.B;
            if (x6 >= width - f6) {
                float f7 = this.f15054t;
                float height = getHeight();
                float f8 = this.A;
                float f9 = height - f8;
                if (f9 < 0.0f) {
                    f9 = 0.0f;
                }
                float f10 = f7 * f9;
                if (motionEvent.getY() >= f10 - f6 && motionEvent.getY() <= f10 + f8 + f6) {
                    this.f15058x = true;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    removeCallbacks(dVar);
                    animate().cancel();
                    setAlpha(1.0f);
                    a(motionEvent.getY());
                    return true;
                }
            }
        }
        return false;
    }

    public final void setFraction(float f6) {
        this.f15054t = u5.d.o(f6, 0.0f, 1.0f);
        invalidate();
    }

    public final void setLabel(p5.l<? super Float, String> lVar) {
        kotlin.jvm.internal.j.e("<set-?>", lVar);
        this.f15055u = lVar;
    }

    public final void setOnScrub(p5.l<? super Float, d5.j> lVar) {
        this.f15056v = lVar;
    }

    public final void setOnScrubEnd(p5.a<d5.j> aVar) {
        this.f15057w = aVar;
    }

    public final void setPageCount(int i6) {
        this.s = i6;
    }
}
