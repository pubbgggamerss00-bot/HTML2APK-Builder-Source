package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public final class u extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public r f2655c;

    /* renamed from: d, reason: collision with root package name */
    public q f2656d;

    public static int c(View view, s sVar) {
        return ((sVar.c(view) / 2) + sVar.e(view)) - ((sVar.l() / 2) + sVar.k());
    }

    public static View d(v.l lVar, s sVar) {
        int iV = lVar.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iL = (sVar.l() / 2) + sVar.k();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = lVar.u(i11);
            int iAbs = Math.abs(((sVar.c(viewU) / 2) + sVar.e(viewU)) - iL);
            if (iAbs < i10) {
                view = viewU;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.b0
    public final int[] a(v.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.d()) {
            iArr[0] = c(view, e(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.e()) {
            iArr[1] = c(view, f(lVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final s e(v.l lVar) {
        q qVar = this.f2656d;
        if (qVar == null || qVar.f2651a != lVar) {
            this.f2656d = new q(lVar);
        }
        return this.f2656d;
    }

    public final s f(v.l lVar) {
        r rVar = this.f2655c;
        if (rVar == null || rVar.f2651a != lVar) {
            this.f2655c = new r(lVar);
        }
        return this.f2655c;
    }
}
