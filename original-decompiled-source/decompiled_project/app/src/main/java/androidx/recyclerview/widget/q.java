package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class q extends s {
    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return view.getRight() + ((v.m) view.getLayoutParams()).f2762b.right + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return v.l.A(view) + ((ViewGroup.MarginLayoutParams) mVar).leftMargin + ((ViewGroup.MarginLayoutParams) mVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return v.l.z(view) + ((ViewGroup.MarginLayoutParams) mVar).topMargin + ((ViewGroup.MarginLayoutParams) mVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        v.m mVar = (v.m) view.getLayoutParams();
        this.f2651a.getClass();
        return (view.getLeft() - ((v.m) view.getLayoutParams()).f2762b.left) - ((ViewGroup.MarginLayoutParams) mVar).leftMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f2651a.f2753n;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        v.l lVar = this.f2651a;
        return lVar.f2753n - lVar.F();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f2651a.F();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f2651a.f2751l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f2651a.f2752m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f2651a.E();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        v.l lVar = this.f2651a;
        return (lVar.f2753n - lVar.E()) - lVar.F();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        v.l lVar = this.f2651a;
        Rect rect = this.f2653c;
        lVar.K(view, rect);
        return rect.right;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        v.l lVar = this.f2651a;
        Rect rect = this.f2653c;
        lVar.K(view, rect);
        return rect.left;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i10) {
        this.f2651a.O(i10);
    }
}
