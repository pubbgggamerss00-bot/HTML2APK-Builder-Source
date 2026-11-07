package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r extends s {
    @Override // androidx.recyclerview.widget.s
    public final int b(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f1713a.getClass();
        return view.getBottom() + ((RecyclerView.n) view.getLayoutParams()).f1493b.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f1713a.getClass();
        return RecyclerView.m.z(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int d(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f1713a.getClass();
        return RecyclerView.m.A(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int e(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        this.f1713a.getClass();
        return (view.getTop() - ((RecyclerView.n) view.getLayoutParams()).f1493b.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin;
    }

    @Override // androidx.recyclerview.widget.s
    public final int f() {
        return this.f1713a.f1485o;
    }

    @Override // androidx.recyclerview.widget.s
    public final int g() {
        RecyclerView.m mVar = this.f1713a;
        return mVar.f1485o - mVar.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int h() {
        return this.f1713a.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int i() {
        return this.f1713a.f1483m;
    }

    @Override // androidx.recyclerview.widget.s
    public final int j() {
        return this.f1713a.f1482l;
    }

    @Override // androidx.recyclerview.widget.s
    public final int k() {
        return this.f1713a.G();
    }

    @Override // androidx.recyclerview.widget.s
    public final int l() {
        RecyclerView.m mVar = this.f1713a;
        return (mVar.f1485o - mVar.G()) - mVar.D();
    }

    @Override // androidx.recyclerview.widget.s
    public final int m(View view) {
        RecyclerView.m mVar = this.f1713a;
        Rect rect = this.f1715c;
        mVar.K(view, rect);
        return rect.bottom;
    }

    @Override // androidx.recyclerview.widget.s
    public final int n(View view) {
        RecyclerView.m mVar = this.f1713a;
        Rect rect = this.f1715c;
        mVar.K(view, rect);
        return rect.top;
    }

    @Override // androidx.recyclerview.widget.s
    public final void o(int i6) {
        this.f1713a.P(i6);
    }
}
