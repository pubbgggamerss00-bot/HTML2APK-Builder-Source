package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class r extends s {
    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return view.getBottom() + ((v.m) view.getLayoutParams()).f2762b.bottom + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return v.l.z(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return v.l.A(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return (view.getTop() - ((v.m) view.getLayoutParams()).f2762b.top) - ((ViewGroup.MarginLayoutParams) mVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2651a.f2754o;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        v.l lVar = this.f2651a;
        return lVar.f2754o - lVar.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2651a.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2651a.f2752m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2651a.f2751l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2651a.G();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        v.l lVar = this.f2651a;
        return (lVar.f2754o - lVar.G()) - lVar.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        v.l lVar = this.f2651a;
        Rect rect = this.f2653c;
        lVar.K(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        v.l lVar = this.f2651a;
        Rect rect = this.f2653c;
        lVar.K(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i10) {
        this.f2651a.P(i10);
    }
}
