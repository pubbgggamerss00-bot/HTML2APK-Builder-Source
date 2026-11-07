package y0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import l.i0;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public final float[] A;
    public final float[] B;
    public final float[] C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final C0107a s;

    /* renamed from: t, reason: collision with root package name */
    public final AccelerateInterpolator f15197t;

    /* renamed from: u, reason: collision with root package name */
    public final i0 f15198u;

    /* renamed from: v, reason: collision with root package name */
    public b f15199v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f15200w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f15201x;

    /* renamed from: y, reason: collision with root package name */
    public final int f15202y;

    /* renamed from: z, reason: collision with root package name */
    public final int f15203z;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: y0.a$a, reason: collision with other inner class name */
    public static class C0107a {

        /* renamed from: a, reason: collision with root package name */
        public int f15204a;

        /* renamed from: b, reason: collision with root package name */
        public int f15205b;

        /* renamed from: c, reason: collision with root package name */
        public float f15206c;

        /* renamed from: d, reason: collision with root package name */
        public float f15207d;

        /* renamed from: e, reason: collision with root package name */
        public long f15208e;

        /* renamed from: f, reason: collision with root package name */
        public long f15209f;

        /* renamed from: g, reason: collision with root package name */
        public long f15210g;
        public float h;

        /* renamed from: i, reason: collision with root package name */
        public int f15211i;

        public final float a(long j6) {
            if (j6 < this.f15208e) {
                return 0.0f;
            }
            long j7 = this.f15210g;
            if (j7 < 0 || j6 < j7) {
                return a.b((j6 - r0) / this.f15204a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.h;
            return (a.b((j6 - j7) / this.f15211i, 0.0f, 1.0f) * f6) + (1.0f - f6);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            i0 i0Var = aVar.f15198u;
            C0107a c0107a = aVar.s;
            if (aVar.G) {
                if (aVar.E) {
                    aVar.E = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0107a.f15208e = jCurrentAnimationTimeMillis;
                    c0107a.f15210g = -1L;
                    c0107a.f15209f = jCurrentAnimationTimeMillis;
                    c0107a.h = 0.5f;
                }
                if ((c0107a.f15210g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0107a.f15210g + c0107a.f15211i) || !aVar.e()) {
                    aVar.G = false;
                    return;
                }
                if (aVar.F) {
                    aVar.F = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    i0Var.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0107a.f15209f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c0107a.a(jCurrentAnimationTimeMillis2);
                long j6 = jCurrentAnimationTimeMillis2 - c0107a.f15209f;
                c0107a.f15209f = jCurrentAnimationTimeMillis2;
                ((c) aVar).J.scrollListBy((int) (j6 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c0107a.f15207d));
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                i0Var.postOnAnimation(this);
            }
        }
    }

    public a(i0 i0Var) {
        C0107a c0107a = new C0107a();
        c0107a.f15208e = Long.MIN_VALUE;
        c0107a.f15210g = -1L;
        c0107a.f15209f = 0L;
        this.s = c0107a;
        this.f15197t = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f15200w = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f15201x = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.A = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.B = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.C = fArr5;
        this.f15198u = i0Var;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f8 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f15202y = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f15203z = I;
        c0107a.f15204a = 500;
        c0107a.f15205b = 500;
    }

    public static float b(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f6, float f7, float f8, int i6) {
        float fB;
        float interpolation;
        float fB2 = b(this.f15200w[i6] * f7, 0.0f, this.f15201x[i6]);
        float fC = c(f7 - f6, fB2) - c(f6, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f15197t;
        if (fC < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fC);
        } else {
            if (fC <= 0.0f) {
                fB = 0.0f;
                if (fB != 0.0f) {
                    return 0.0f;
                }
                float f9 = this.A[i6];
                float f10 = this.B[i6];
                float f11 = this.C[i6];
                float f12 = f9 * f8;
                return fB > 0.0f ? b(fB * f12, f10, f11) : -b((-fB) * f12, f10, f11);
            }
            interpolation = accelerateInterpolator.getInterpolation(fC);
        }
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB != 0.0f) {
        }
    }

    public final float c(float f6, float f7) {
        if (f7 != 0.0f) {
            int i6 = this.f15202y;
            if (i6 == 0 || i6 == 1) {
                if (f6 < f7) {
                    if (f6 >= 0.0f) {
                        return 1.0f - (f6 / f7);
                    }
                    if (this.G && i6 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i6 == 2 && f6 < 0.0f) {
                return f6 / (-f7);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i6 = 0;
        if (this.E) {
            this.G = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0107a c0107a = this.s;
        int i7 = (int) (jCurrentAnimationTimeMillis - c0107a.f15208e);
        int i8 = c0107a.f15205b;
        if (i7 > i8) {
            i6 = i8;
        } else if (i7 >= 0) {
            i6 = i7;
        }
        c0107a.f15211i = i6;
        c0107a.h = c0107a.a(jCurrentAnimationTimeMillis);
        c0107a.f15210g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        i0 i0Var;
        int count;
        C0107a c0107a = this.s;
        float f6 = c0107a.f15207d;
        int iAbs = (int) (f6 / Math.abs(f6));
        Math.abs(c0107a.f15206c);
        if (iAbs != 0 && (count = (i0Var = ((c) this).J).getCount()) != 0) {
            int childCount = i0Var.getChildCount();
            int firstVisiblePosition = i0Var.getFirstVisiblePosition();
            int i6 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && i0Var.getChildAt(0).getTop() >= 0)) : !(i6 >= count && i0Var.getChildAt(childCount - 1).getBottom() <= i0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i6;
        if (this.H) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.F = true;
            this.D = false;
            float x6 = motionEvent.getX();
            float width = view.getWidth();
            i0 i0Var = this.f15198u;
            float fA = a(x6, width, i0Var.getWidth(), 0);
            float fA2 = a(motionEvent.getY(), view.getHeight(), i0Var.getHeight(), 1);
            C0107a c0107a = this.s;
            c0107a.f15206c = fA;
            c0107a.f15207d = fA2;
            if (!this.G && e()) {
                if (this.f15199v == null) {
                    this.f15199v = new b();
                }
                this.G = true;
                this.E = true;
                if (this.D || (i6 = this.f15203z) <= 0) {
                    this.f15199v.run();
                } else {
                    b bVar = this.f15199v;
                    long j6 = i6;
                    WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                    i0Var.postOnAnimationDelayed(bVar, j6);
                }
                this.D = true;
            }
        }
        return false;
    }
}
