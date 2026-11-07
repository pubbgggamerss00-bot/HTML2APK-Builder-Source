package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.v;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import y3.q0;

/* loaded from: classes.dex */
public final class l extends v.k implements v.o {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2587a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2588b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2589c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f2590d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2591e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2592f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2593g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f2594h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2595i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2596j;

    /* renamed from: k, reason: collision with root package name */
    public int f2597k;

    /* renamed from: l, reason: collision with root package name */
    public int f2598l;

    /* renamed from: m, reason: collision with root package name */
    public float f2599m;

    /* renamed from: n, reason: collision with root package name */
    public int f2600n;

    /* renamed from: o, reason: collision with root package name */
    public int f2601o;

    /* renamed from: p, reason: collision with root package name */
    public float f2602p;

    /* renamed from: s, reason: collision with root package name */
    public final v f2605s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2612z;

    /* renamed from: q, reason: collision with root package name */
    public int f2603q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2604r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2606t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2607u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2608v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2609w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2610x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2611y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            ValueAnimator valueAnimator = lVar.f2612z;
            int i10 = lVar.A;
            if (i10 == 1) {
                valueAnimator.cancel();
            } else if (i10 != 2) {
                return;
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO);
            valueAnimator.setDuration(CropImageView.DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION);
            valueAnimator.start();
        }
    }

    public class b extends v.p {
        public b() {
        }

        @Override // androidx.recyclerview.widget.v.p
        public final void b(v vVar, int i10, int i11) {
            int iComputeHorizontalScrollOffset = vVar.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = vVar.computeVerticalScrollOffset();
            l lVar = l.this;
            int i12 = lVar.f2587a;
            int iComputeVerticalScrollRange = lVar.f2605s.computeVerticalScrollRange();
            int i13 = lVar.f2604r;
            lVar.f2606t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
            int iComputeHorizontalScrollRange = lVar.f2605s.computeHorizontalScrollRange();
            int i14 = lVar.f2603q;
            boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
            lVar.f2607u = z10;
            boolean z11 = lVar.f2606t;
            if (!z11 && !z10) {
                if (lVar.f2608v != 0) {
                    lVar.g(0);
                    return;
                }
                return;
            }
            if (z11) {
                float f10 = i13;
                lVar.f2598l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
                lVar.f2597k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
            }
            if (lVar.f2607u) {
                float f11 = iComputeHorizontalScrollOffset;
                float f12 = i14;
                lVar.f2601o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
                lVar.f2600n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
            }
            int i15 = lVar.f2608v;
            if (i15 == 0 || i15 == 1) {
                lVar.g(1);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2615a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f2615a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f2615a) {
                this.f2615a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f2612z.getAnimatedValue()).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO) {
                lVar.A = 0;
                lVar.g(0);
            } else {
                lVar.A = 2;
                lVar.f2605s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f2589c.setAlpha(iFloatValue);
            lVar.f2590d.setAlpha(iFloatValue);
            lVar.f2605s.invalidate();
        }
    }

    public l(v vVar, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        this.f2612z = valueAnimatorOfFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f2589c = stateListDrawable;
        this.f2590d = drawable;
        this.f2593g = stateListDrawable2;
        this.f2594h = drawable2;
        this.f2591e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f2592f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f2595i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f2596j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f2587a = i11;
        this.f2588b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        v vVar2 = this.f2605s;
        if (vVar2 == vVar) {
            return;
        }
        if (vVar2 != null) {
            ArrayList<v.k> arrayList = vVar2.f2689r;
            v.l lVar = vVar2.f2682n;
            if (lVar != null) {
                lVar.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                vVar2.setWillNotDraw(vVar2.getOverScrollMode() == 2);
            }
            vVar2.O();
            vVar2.requestLayout();
            v vVar3 = this.f2605s;
            vVar3.f2691s.remove(this);
            if (vVar3.f2693t == this) {
                vVar3.f2693t = null;
            }
            ArrayList arrayList2 = this.f2605s.f2679l0;
            if (arrayList2 != null) {
                arrayList2.remove(bVar);
            }
            this.f2605s.removeCallbacks(aVar);
        }
        this.f2605s = vVar;
        ArrayList<v.k> arrayList3 = vVar.f2689r;
        v.l lVar2 = vVar.f2682n;
        if (lVar2 != null) {
            lVar2.c("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            vVar.setWillNotDraw(false);
        }
        arrayList3.add(this);
        vVar.O();
        vVar.requestLayout();
        this.f2605s.f2691s.add(this);
        this.f2605s.h(bVar);
    }

    public static int f(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f11 - f10) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.v.o
    public final void a(MotionEvent motionEvent) {
        if (this.f2608v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            boolean zD = d(motionEvent.getX(), motionEvent.getY());
            if (zE || zD) {
                if (zD) {
                    this.f2609w = 1;
                    this.f2602p = (int) motionEvent.getX();
                } else if (zE) {
                    this.f2609w = 2;
                    this.f2599m = (int) motionEvent.getY();
                }
                g(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2608v == 2) {
            this.f2599m = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f2602p = CropImageView.DEFAULT_ASPECT_RATIO;
            g(1);
            this.f2609w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2608v == 2) {
            h();
            int i10 = this.f2609w;
            int i11 = this.f2588b;
            if (i10 == 1) {
                float x10 = motionEvent.getX();
                int[] iArr = this.f2611y;
                iArr[0] = i11;
                int i12 = this.f2603q - i11;
                iArr[1] = i12;
                float fMax = Math.max(i11, Math.min(i12, x10));
                if (Math.abs(this.f2601o - fMax) >= 2.0f) {
                    int iF = f(this.f2602p, fMax, iArr, this.f2605s.computeHorizontalScrollRange(), this.f2605s.computeHorizontalScrollOffset(), this.f2603q);
                    if (iF != 0) {
                        this.f2605s.scrollBy(iF, 0);
                    }
                    this.f2602p = fMax;
                }
            }
            if (this.f2609w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f2610x;
                iArr2[0] = i11;
                int i13 = this.f2604r - i11;
                iArr2[1] = i13;
                float fMax2 = Math.max(i11, Math.min(i13, y10));
                if (Math.abs(this.f2598l - fMax2) < 2.0f) {
                    return;
                }
                int iF2 = f(this.f2599m, fMax2, iArr2, this.f2605s.computeVerticalScrollRange(), this.f2605s.computeVerticalScrollOffset(), this.f2604r);
                if (iF2 != 0) {
                    this.f2605s.scrollBy(0, iF2);
                }
                this.f2599m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.v.o
    public final boolean b(MotionEvent motionEvent) {
        int i10 = this.f2608v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        boolean zD = d(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zE && !zD) {
            return false;
        }
        if (zD) {
            this.f2609w = 1;
            this.f2602p = (int) motionEvent.getX();
        } else if (zE) {
            this.f2609w = 2;
            this.f2599m = (int) motionEvent.getY();
        }
        g(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.v.k
    public final void c(Canvas canvas, v vVar) {
        int i10 = this.f2603q;
        v vVar2 = this.f2605s;
        if (i10 != vVar2.getWidth() || this.f2604r != vVar2.getHeight()) {
            this.f2603q = vVar2.getWidth();
            this.f2604r = vVar2.getHeight();
            g(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2606t) {
                int i11 = this.f2603q;
                int i12 = this.f2591e;
                int i13 = i11 - i12;
                int i14 = this.f2598l;
                int i15 = this.f2597k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f2589c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f2592f;
                int i18 = this.f2604r;
                Drawable drawable = this.f2590d;
                drawable.setBounds(0, 0, i17, i18);
                Field field = q0.f33885a;
                if (vVar2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, CropImageView.DEFAULT_ASPECT_RATIO);
                    drawable.draw(canvas);
                    canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f2607u) {
                int i19 = this.f2604r;
                int i20 = this.f2595i;
                int i21 = i19 - i20;
                int i22 = this.f2601o;
                int i23 = this.f2600n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f2593g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f2603q;
                int i26 = this.f2596j;
                Drawable drawable2 = this.f2594h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, CropImageView.DEFAULT_ASPECT_RATIO);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    public final boolean d(float f10, float f11) {
        if (f11 < this.f2604r - this.f2595i) {
            return false;
        }
        int i10 = this.f2601o;
        int i11 = this.f2600n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) ((i11 / 2) + i10));
    }

    public final boolean e(float f10, float f11) {
        Field field = q0.f33885a;
        int layoutDirection = this.f2605s.getLayoutDirection();
        int i10 = this.f2591e;
        if (layoutDirection == 1) {
            if (f10 > i10) {
                return false;
            }
        } else if (f10 < this.f2603q - i10) {
            return false;
        }
        int i11 = this.f2598l;
        int i12 = this.f2597k / 2;
        return f11 >= ((float) (i11 - i12)) && f11 <= ((float) (i12 + i11));
    }

    public final void g(int i10) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f2589c;
        if (i10 == 2 && this.f2608v != 2) {
            stateListDrawable.setState(C);
            this.f2605s.removeCallbacks(aVar);
        }
        if (i10 == 0) {
            this.f2605s.invalidate();
        } else {
            h();
        }
        if (this.f2608v == 2 && i10 != 2) {
            stateListDrawable.setState(D);
            this.f2605s.removeCallbacks(aVar);
            this.f2605s.postDelayed(aVar, 1200);
        } else if (i10 == 1) {
            this.f2605s.removeCallbacks(aVar);
            this.f2605s.postDelayed(aVar, 1500);
        }
        this.f2608v = i10;
    }

    public final void h() {
        int i10 = this.A;
        ValueAnimator valueAnimator = this.f2612z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
