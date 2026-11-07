package c4;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import m.v;
import y3.q0;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: s, reason: collision with root package name */
    public static final int f4732s = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final C0058a f4733a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f4734b;

    /* renamed from: c, reason: collision with root package name */
    public final v f4735c;

    /* renamed from: d, reason: collision with root package name */
    public b f4736d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f4737e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f4738f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4739g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4740h;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f4741j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f4742k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f4743l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4744m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4745n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4746p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4747q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4748r;

    /* renamed from: c4.a$a, reason: collision with other inner class name */
    public static class C0058a {

        /* renamed from: a, reason: collision with root package name */
        public int f4749a;

        /* renamed from: b, reason: collision with root package name */
        public int f4750b;

        /* renamed from: c, reason: collision with root package name */
        public float f4751c;

        /* renamed from: d, reason: collision with root package name */
        public float f4752d;

        /* renamed from: e, reason: collision with root package name */
        public long f4753e;

        /* renamed from: f, reason: collision with root package name */
        public long f4754f;

        /* renamed from: g, reason: collision with root package name */
        public long f4755g;

        /* renamed from: h, reason: collision with root package name */
        public float f4756h;

        /* renamed from: i, reason: collision with root package name */
        public int f4757i;

        public final float a(long j10) {
            if (j10 < this.f4753e) {
                return CropImageView.DEFAULT_ASPECT_RATIO;
            }
            long j11 = this.f4755g;
            if (j11 < 0 || j10 < j11) {
                return a.b((j10 - r0) / this.f4749a, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * 0.5f;
            }
            float f10 = this.f4756h;
            return (a.b((j10 - j11) / this.f4757i, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f) * f10) + (1.0f - f10);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            v vVar = aVar.f4735c;
            C0058a c0058a = aVar.f4733a;
            if (aVar.f4747q) {
                if (aVar.f4745n) {
                    aVar.f4745n = false;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0058a.f4753e = jCurrentAnimationTimeMillis;
                    c0058a.f4755g = -1L;
                    c0058a.f4754f = jCurrentAnimationTimeMillis;
                    c0058a.f4756h = 0.5f;
                }
                if ((c0058a.f4755g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0058a.f4755g + c0058a.f4757i) || !aVar.e()) {
                    aVar.f4747q = false;
                    return;
                }
                if (aVar.f4746p) {
                    aVar.f4746p = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                    vVar.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (c0058a.f4754f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fA = c0058a.a(jCurrentAnimationTimeMillis2);
                long j10 = jCurrentAnimationTimeMillis2 - c0058a.f4754f;
                c0058a.f4754f = jCurrentAnimationTimeMillis2;
                ((c) aVar).f4759t.scrollListBy((int) (j10 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * c0058a.f4752d));
                Field field = q0.f33885a;
                vVar.postOnAnimation(this);
            }
        }
    }

    public a(v vVar) {
        C0058a c0058a = new C0058a();
        c0058a.f4753e = Long.MIN_VALUE;
        c0058a.f4755g = -1L;
        c0058a.f4754f = 0L;
        this.f4733a = c0058a;
        this.f4734b = new AccelerateInterpolator();
        float[] fArr = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
        this.f4737e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4738f = fArr2;
        float[] fArr3 = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
        this.f4741j = fArr3;
        float[] fArr4 = {CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO};
        this.f4742k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4743l = fArr5;
        this.f4735c = vVar;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr5[0] = f11;
        fArr5[1] = f11;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f12;
        fArr4[1] = f12;
        this.f4739g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f4740h = f4732s;
        c0058a.f4749a = CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION;
        c0058a.f4750b = CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f10, float f11, float f12, int i10) {
        float fB;
        float interpolation;
        float fB2 = b(this.f4737e[i10] * f11, CropImageView.DEFAULT_ASPECT_RATIO, this.f4738f[i10]);
        float fC = c(f11 - f10, fB2) - c(f10, fB2);
        AccelerateInterpolator accelerateInterpolator = this.f4734b;
        if (fC < CropImageView.DEFAULT_ASPECT_RATIO) {
            interpolation = -accelerateInterpolator.getInterpolation(-fC);
        } else {
            if (fC <= CropImageView.DEFAULT_ASPECT_RATIO) {
                fB = 0.0f;
                if (fB != CropImageView.DEFAULT_ASPECT_RATIO) {
                    return CropImageView.DEFAULT_ASPECT_RATIO;
                }
                float f13 = this.f4741j[i10];
                float f14 = this.f4742k[i10];
                float f15 = this.f4743l[i10];
                float f16 = f13 * f12;
                return fB > CropImageView.DEFAULT_ASPECT_RATIO ? b(fB * f16, f14, f15) : -b((-fB) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(fC);
        }
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB != CropImageView.DEFAULT_ASPECT_RATIO) {
        }
    }

    public final float c(float f10, float f11) {
        if (f11 != CropImageView.DEFAULT_ASPECT_RATIO) {
            int i10 = this.f4739g;
            if (i10 == 0 || i10 == 1) {
                if (f10 < f11) {
                    if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO) {
                        return 1.0f - (f10 / f11);
                    }
                    if (this.f4747q && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f10 < CropImageView.DEFAULT_ASPECT_RATIO) {
                return f10 / (-f11);
            }
        }
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final void d() {
        int i10 = 0;
        if (this.f4745n) {
            this.f4747q = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C0058a c0058a = this.f4733a;
        int i11 = (int) (jCurrentAnimationTimeMillis - c0058a.f4753e);
        int i12 = c0058a.f4750b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0058a.f4757i = i10;
        c0058a.f4756h = c0058a.a(jCurrentAnimationTimeMillis);
        c0058a.f4755g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        v vVar;
        int count;
        C0058a c0058a = this.f4733a;
        float f10 = c0058a.f4752d;
        int iAbs = (int) (f10 / Math.abs(f10));
        Math.abs(c0058a.f4751c);
        if (iAbs != 0 && (count = (vVar = ((c) this).f4759t).getCount()) != 0) {
            int childCount = vVar.getChildCount();
            int firstVisiblePosition = vVar.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && vVar.getChildAt(0).getTop() >= 0)) : !(i10 >= count && vVar.getChildAt(childCount - 1).getBottom() <= vVar.getHeight())) {
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
        int i10;
        if (this.f4748r) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f4746p = true;
            this.f4744m = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            v vVar = this.f4735c;
            float fA = a(x10, width, vVar.getWidth(), 0);
            float fA2 = a(motionEvent.getY(), view.getHeight(), vVar.getHeight(), 1);
            C0058a c0058a = this.f4733a;
            c0058a.f4751c = fA;
            c0058a.f4752d = fA2;
            if (!this.f4747q && e()) {
                if (this.f4736d == null) {
                    this.f4736d = new b();
                }
                this.f4747q = true;
                this.f4745n = true;
                if (this.f4744m || (i10 = this.f4740h) <= 0) {
                    this.f4736d.run();
                } else {
                    b bVar = this.f4736d;
                    long j10 = i10;
                    Field field = q0.f33885a;
                    vVar.postOnAnimationDelayed(bVar, j10);
                }
                this.f4744m = true;
            }
        }
        return false;
    }
}
