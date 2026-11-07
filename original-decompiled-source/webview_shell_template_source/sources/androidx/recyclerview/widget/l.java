package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l extends RecyclerView.l implements RecyclerView.p {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final a B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1655b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1656c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f1657d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1659f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f1660g;
    public final Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1661i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1662j;

    /* renamed from: k, reason: collision with root package name */
    public int f1663k;

    /* renamed from: l, reason: collision with root package name */
    public int f1664l;

    /* renamed from: m, reason: collision with root package name */
    public float f1665m;

    /* renamed from: n, reason: collision with root package name */
    public int f1666n;

    /* renamed from: o, reason: collision with root package name */
    public int f1667o;

    /* renamed from: p, reason: collision with root package name */
    public float f1668p;
    public final RecyclerView s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f1677z;

    /* renamed from: q, reason: collision with root package name */
    public int f1669q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1670r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1671t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1672u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f1673v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f1674w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f1675x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f1676y = new int[2];

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            ValueAnimator valueAnimator = lVar.f1677z;
            int i6 = lVar.A;
            if (i6 == 1) {
                valueAnimator.cancel();
            } else if (i6 != 2) {
                return;
            }
            lVar.A = 3;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            valueAnimator.setDuration(500);
            valueAnimator.start();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class b extends RecyclerView.q {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i6, int i7) {
            int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            l lVar = l.this;
            int i8 = lVar.f1654a;
            int iComputeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
            int i9 = lVar.f1670r;
            lVar.f1671t = iComputeVerticalScrollRange - i9 > 0 && i9 >= i8;
            int iComputeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
            int i10 = lVar.f1669q;
            boolean z6 = iComputeHorizontalScrollRange - i10 > 0 && i10 >= i8;
            lVar.f1672u = z6;
            boolean z7 = lVar.f1671t;
            if (!z7 && !z6) {
                if (lVar.f1673v != 0) {
                    lVar.h(0);
                    return;
                }
                return;
            }
            if (z7) {
                float f6 = i9;
                lVar.f1664l = (int) ((((f6 / 2.0f) + iComputeVerticalScrollOffset) * f6) / iComputeVerticalScrollRange);
                lVar.f1663k = Math.min(i9, (i9 * i9) / iComputeVerticalScrollRange);
            }
            if (lVar.f1672u) {
                float f7 = iComputeHorizontalScrollOffset;
                float f8 = i10;
                lVar.f1667o = (int) ((((f8 / 2.0f) + f7) * f8) / iComputeHorizontalScrollRange);
                lVar.f1666n = Math.min(i10, (i10 * i10) / iComputeHorizontalScrollRange);
            }
            int i11 = lVar.f1673v;
            if (i11 == 0 || i11 == 1) {
                lVar.h(1);
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1679a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f1679a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f1679a) {
                this.f1679a = false;
                return;
            }
            l lVar = l.this;
            if (((Float) lVar.f1677z.getAnimatedValue()).floatValue() == 0.0f) {
                lVar.A = 0;
                lVar.h(0);
            } else {
                lVar.A = 2;
                lVar.s.invalidate();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l lVar = l.this;
            lVar.f1656c.setAlpha(iFloatValue);
            lVar.f1657d.setAlpha(iFloatValue);
            lVar.s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i6, int i7, int i8) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1677z = valueAnimatorOfFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.f1656c = stateListDrawable;
        this.f1657d = drawable;
        this.f1660g = stateListDrawable2;
        this.h = drawable2;
        this.f1658e = Math.max(i6, stateListDrawable.getIntrinsicWidth());
        this.f1659f = Math.max(i6, drawable.getIntrinsicWidth());
        this.f1661i = Math.max(i6, stateListDrawable2.getIntrinsicWidth());
        this.f1662j = Math.max(i6, drawable2.getIntrinsicWidth());
        this.f1654a = i7;
        this.f1655b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList<RecyclerView.l> arrayList = recyclerView2.I;
            RecyclerView.m mVar = recyclerView2.F;
            if (mVar != null) {
                mVar.c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.J.remove(this);
            if (recyclerView3.K == this) {
                recyclerView3.K = null;
            }
            ArrayList arrayList2 = this.s.B0;
            if (arrayList2 != null) {
                arrayList2.remove(bVar);
            }
            this.s.removeCallbacks(aVar);
        }
        this.s = recyclerView;
        recyclerView.i(this);
        this.s.J.add(this);
        this.s.j(bVar);
    }

    public static int g(float f6, float f7, int[] iArr, int i6, int i7, int i8) {
        int i9 = iArr[1] - iArr[0];
        if (i9 != 0) {
            int i10 = i6 - i8;
            int i11 = (int) (((f7 - f6) / i9) * i10);
            int i12 = i7 + i11;
            if (i12 < i10 && i12 >= 0) {
                return i11;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void a(MotionEvent motionEvent) {
        if (this.f1673v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zF = f(motionEvent.getX(), motionEvent.getY());
            boolean zE = e(motionEvent.getX(), motionEvent.getY());
            if (zF || zE) {
                if (zE) {
                    this.f1674w = 1;
                    this.f1668p = (int) motionEvent.getX();
                } else if (zF) {
                    this.f1674w = 2;
                    this.f1665m = (int) motionEvent.getY();
                }
                h(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f1673v == 2) {
            this.f1665m = 0.0f;
            this.f1668p = 0.0f;
            h(1);
            this.f1674w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f1673v == 2) {
            i();
            int i6 = this.f1674w;
            int i7 = this.f1655b;
            if (i6 == 1) {
                float x6 = motionEvent.getX();
                int[] iArr = this.f1676y;
                iArr[0] = i7;
                int i8 = this.f1669q - i7;
                iArr[1] = i8;
                float fMax = Math.max(i7, Math.min(i8, x6));
                if (Math.abs(this.f1667o - fMax) >= 2.0f) {
                    int iG = g(this.f1668p, fMax, iArr, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.f1669q);
                    if (iG != 0) {
                        this.s.scrollBy(iG, 0);
                    }
                    this.f1668p = fMax;
                }
            }
            if (this.f1674w == 2) {
                float y2 = motionEvent.getY();
                int[] iArr2 = this.f1675x;
                iArr2[0] = i7;
                int i9 = this.f1670r - i7;
                iArr2[1] = i9;
                float fMax2 = Math.max(i7, Math.min(i9, y2));
                if (Math.abs(this.f1664l - fMax2) < 2.0f) {
                    return;
                }
                int iG2 = g(this.f1665m, fMax2, iArr2, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.f1670r);
                if (iG2 != 0) {
                    this.s.scrollBy(0, iG2);
                }
                this.f1665m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final boolean b(MotionEvent motionEvent) {
        int i6 = this.f1673v;
        if (i6 != 1) {
            return i6 == 2;
        }
        boolean zF = f(motionEvent.getX(), motionEvent.getY());
        boolean zE = e(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zF && !zE) {
            return false;
        }
        if (zE) {
            this.f1674w = 1;
            this.f1668p = (int) motionEvent.getX();
        } else if (zF) {
            this.f1674w = 2;
            this.f1665m = (int) motionEvent.getY();
        }
        h(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        int i6 = this.f1669q;
        RecyclerView recyclerView2 = this.s;
        if (i6 != recyclerView2.getWidth() || this.f1670r != recyclerView2.getHeight()) {
            this.f1669q = recyclerView2.getWidth();
            this.f1670r = recyclerView2.getHeight();
            h(0);
            return;
        }
        if (this.A != 0) {
            if (this.f1671t) {
                int i7 = this.f1669q;
                int i8 = this.f1658e;
                int i9 = i7 - i8;
                int i10 = this.f1664l;
                int i11 = this.f1663k;
                int i12 = i10 - (i11 / 2);
                StateListDrawable stateListDrawable = this.f1656c;
                stateListDrawable.setBounds(0, 0, i8, i11);
                int i13 = this.f1659f;
                int i14 = this.f1670r;
                Drawable drawable = this.f1657d;
                drawable.setBounds(0, 0, i13, i14);
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i8, i12);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i8, -i12);
                } else {
                    canvas.translate(i9, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i12);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i9, -i12);
                }
            }
            if (this.f1672u) {
                int i15 = this.f1670r;
                int i16 = this.f1661i;
                int i17 = i15 - i16;
                int i18 = this.f1667o;
                int i19 = this.f1666n;
                int i20 = i18 - (i19 / 2);
                StateListDrawable stateListDrawable2 = this.f1660g;
                stateListDrawable2.setBounds(0, 0, i19, i16);
                int i21 = this.f1669q;
                int i22 = this.f1662j;
                Drawable drawable2 = this.h;
                drawable2.setBounds(0, 0, i21, i22);
                canvas.translate(0.0f, i17);
                drawable2.draw(canvas);
                canvas.translate(i20, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i20, -i17);
            }
        }
    }

    public final boolean e(float f6, float f7) {
        if (f7 < this.f1670r - this.f1661i) {
            return false;
        }
        int i6 = this.f1667o;
        int i7 = this.f1666n;
        return f6 >= ((float) (i6 - (i7 / 2))) && f6 <= ((float) ((i7 / 2) + i6));
    }

    public final boolean f(float f6, float f7) {
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        int layoutDirection = this.s.getLayoutDirection();
        int i6 = this.f1658e;
        if (layoutDirection == 1) {
            if (f6 > i6) {
                return false;
            }
        } else if (f6 < this.f1669q - i6) {
            return false;
        }
        int i7 = this.f1664l;
        int i8 = this.f1663k / 2;
        return f7 >= ((float) (i7 - i8)) && f7 <= ((float) (i8 + i7));
    }

    public final void h(int i6) {
        a aVar = this.B;
        StateListDrawable stateListDrawable = this.f1656c;
        if (i6 == 2 && this.f1673v != 2) {
            stateListDrawable.setState(C);
            this.s.removeCallbacks(aVar);
        }
        if (i6 == 0) {
            this.s.invalidate();
        } else {
            i();
        }
        if (this.f1673v == 2 && i6 != 2) {
            stateListDrawable.setState(D);
            this.s.removeCallbacks(aVar);
            this.s.postDelayed(aVar, 1200);
        } else if (i6 == 1) {
            this.s.removeCallbacks(aVar);
            this.s.postDelayed(aVar, 1500);
        }
        this.f1673v = i6;
    }

    public final void i() {
        int i6 = this.A;
        ValueAnimator valueAnimator = this.f1677z;
        if (i6 != 0) {
            if (i6 != 3) {
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
