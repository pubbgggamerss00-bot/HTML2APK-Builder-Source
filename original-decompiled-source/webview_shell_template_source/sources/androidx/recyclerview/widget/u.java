package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public r f1717c;

    /* renamed from: d, reason: collision with root package name */
    public q f1718d;

    public static int d(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public static View e(RecyclerView.m mVar, s sVar) {
        int iV = mVar.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (sVar.l() / 2) + sVar.k();
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = mVar.u(i7);
            int iAbs = Math.abs(((sVar.c(viewU) / 2) + sVar.e(viewU)) - iL);
            if (iAbs < i6) {
                view = viewU;
                i6 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.a0
    public final int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.d()) {
            iArr[0] = d(view, f(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.e()) {
            iArr[1] = d(view, g(mVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final s f(RecyclerView.m mVar) {
        q qVar = this.f1718d;
        if (qVar == null || qVar.f1713a != mVar) {
            this.f1718d = new q(mVar);
        }
        return this.f1718d;
    }

    public final s g(RecyclerView.m mVar) {
        r rVar = this.f1717c;
        if (rVar == null || rVar.f1713a != mVar) {
            this.f1717c = new r(mVar);
        }
        return this.f1717c;
    }
}
