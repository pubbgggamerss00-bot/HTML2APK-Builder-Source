package j3;

import android.content.Context;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x0.x1;
import y3.i1;
import y3.q0;
import y3.x0;

/* loaded from: classes.dex */
public final class c0 extends j2.a implements y3.u {

    /* renamed from: j, reason: collision with root package name */
    public final Window f15033j;

    /* renamed from: k, reason: collision with root package name */
    public final x1 f15034k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15035l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15036m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f15037n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15038p;

    public static final class a extends x0.b {
        public a() {
            super(1);
        }

        @Override // y3.x0.b
        public final i1 d(i1 i1Var, List<x0> list) {
            c0 c0Var = c0.this;
            if (!c0Var.f15036m) {
                View childAt = c0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0Var.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    return i1Var.f33825a.r(iMax, iMax2, iMax3, iMax4);
                }
            }
            return i1Var;
        }

        @Override // y3.x0.b
        public final x0.a e(x0.a aVar) {
            c0 c0Var = c0.this;
            if (!c0Var.f15036m) {
                View childAt = c0Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, c0Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, c0Var.getHeight() - childAt.getBottom());
                if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                    r3.f fVarB = r3.f.b(iMax, iMax2, iMax3, iMax4);
                    int i10 = fVarB.f23163a;
                    r3.f fVar = aVar.f33905a;
                    int i11 = fVarB.f23164b;
                    int i12 = fVarB.f23165c;
                    int i13 = fVarB.f23166d;
                    return new x0.a(i1.a(fVar, i10, i11, i12, i13), i1.a(aVar.f33906b, i10, i11, i12, i13));
                }
            }
            return aVar;
        }
    }

    public c0(Context context, Window window) {
        super(context);
        this.f15033j = window;
        this.f15034k = bg.b.h(a0.f15023a);
        Field field = y3.q0.f33885a;
        q0.c.b(this, this);
        y3.q0.i(this, new a());
    }

    @Override // j2.a
    public final void a(int i10, x0.j jVar) {
        jVar.L(1735448596);
        ((eh.p) this.f15034k.getValue()).invoke(jVar, 0);
        jVar.B();
    }

    @Override // y3.u
    public final i1 c(View view, i1 i1Var) {
        if (!this.f15036m) {
            View childAt = getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return i1Var.f33825a.r(iMax, iMax2, iMax3, iMax4);
            }
        }
        return i1Var;
    }

    @Override // j2.a
    public final void g(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i14 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i15 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // j2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f15038p;
    }

    @Override // j2.a
    public final void h(int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i10, i11);
            return;
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        Window window = this.f15033j;
        int i12 = (mode != Integer.MIN_VALUE || this.f15035l || this.f15036m || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i12 - paddingBottom;
        int i15 = i14 >= 0 ? i14 : 0;
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i13, PKIFailureInfo.systemUnavail);
        }
        if (mode != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(i15, PKIFailureInfo.systemUnavail);
        }
        childAt.measure(i10, i11);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f15035l || this.f15036m || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
