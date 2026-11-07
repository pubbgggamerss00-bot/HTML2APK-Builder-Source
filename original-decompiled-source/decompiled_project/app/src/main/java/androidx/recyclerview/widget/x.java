package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.v;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f2819a;

    public x(v vVar) {
        this.f2819a = vVar;
    }

    public final void a(a.C0037a c0037a) {
        int i10 = c0037a.f2508a;
        v vVar = this.f2819a;
        if (i10 == 1) {
            vVar.f2682n.Y(c0037a.f2509b, c0037a.f2510c);
            return;
        }
        if (i10 == 2) {
            vVar.f2682n.b0(c0037a.f2509b, c0037a.f2510c);
        } else if (i10 == 4) {
            vVar.f2682n.c0(c0037a.f2509b, c0037a.f2510c);
        } else {
            if (i10 != 8) {
                return;
            }
            vVar.f2682n.a0(c0037a.f2509b, c0037a.f2510c);
        }
    }

    public final v.a0 b(int i10) {
        v vVar = this.f2819a;
        int iH = vVar.f2667f.h();
        int i11 = 0;
        v.a0 a0Var = null;
        while (true) {
            if (i11 >= iH) {
                break;
            }
            v.a0 a0VarJ = v.J(vVar.f2667f.g(i11));
            if (a0VarJ != null && !a0VarJ.g() && a0VarJ.f2710c == i10) {
                if (!vVar.f2667f.f2514c.contains(a0VarJ.f2708a)) {
                    a0Var = a0VarJ;
                    break;
                }
                a0Var = a0VarJ;
            }
            i11++;
        }
        if (a0Var != null) {
            if (!vVar.f2667f.f2514c.contains(a0Var.f2708a)) {
                return a0Var;
            }
            if (v.D0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public final void c(int i10, int i11) {
        int i12;
        int i13;
        v vVar = this.f2819a;
        int iH = vVar.f2667f.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = vVar.f2667f.g(i15);
            v.a0 a0VarJ = v.J(viewG);
            if (a0VarJ != null && !a0VarJ.n() && (i13 = a0VarJ.f2710c) >= i10 && i13 < i14) {
                a0VarJ.a(2);
                a0VarJ.a(1024);
                ((v.m) viewG.getLayoutParams()).f2763c = true;
            }
        }
        v.r rVar = vVar.f2661c;
        ArrayList<v.a0> arrayList = rVar.f2774c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v.a0 a0Var = arrayList.get(size);
            if (a0Var != null && (i12 = a0Var.f2710c) >= i10 && i12 < i14) {
                a0Var.a(2);
                rVar.h(size);
            }
        }
        vVar.f2683n0 = true;
    }

    public final void d(int i10, int i11) {
        v vVar = this.f2819a;
        int iH = vVar.f2667f.h();
        for (int i12 = 0; i12 < iH; i12++) {
            v.a0 a0VarJ = v.J(vVar.f2667f.g(i12));
            if (a0VarJ != null && !a0VarJ.n() && a0VarJ.f2710c >= i10) {
                if (v.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + a0VarJ + " now at position " + (a0VarJ.f2710c + i11));
                }
                a0VarJ.k(i11, false);
                vVar.f2675j0.f2802f = true;
            }
        }
        ArrayList<v.a0> arrayList = vVar.f2661c.f2774c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            v.a0 a0Var = arrayList.get(i13);
            if (a0Var != null && a0Var.f2710c >= i10) {
                if (v.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i13 + " holder " + a0Var + " now at position " + (a0Var.f2710c + i11));
                }
                a0Var.k(i11, false);
            }
        }
        vVar.requestLayout();
        vVar.f2681m0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        v vVar = this.f2819a;
        int iH = vVar.f2667f.h();
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        boolean z10 = false;
        for (int i20 = 0; i20 < iH; i20++) {
            v.a0 a0VarJ = v.J(vVar.f2667f.g(i20));
            if (a0VarJ != null && (i19 = a0VarJ.f2710c) >= i13 && i19 <= i12) {
                if (v.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i20 + " holder " + a0VarJ);
                }
                if (a0VarJ.f2710c == i10) {
                    a0VarJ.k(i11 - i10, false);
                } else {
                    a0VarJ.k(i14, false);
                }
                vVar.f2675j0.f2802f = true;
            }
        }
        ArrayList<v.a0> arrayList = vVar.f2661c.f2774c;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
            i17 = -1;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = 1;
        }
        int size = arrayList.size();
        int i21 = 0;
        while (i21 < size) {
            v.a0 a0Var = arrayList.get(i21);
            if (a0Var != null && (i18 = a0Var.f2710c) >= i16 && i18 <= i15) {
                if (i18 == i10) {
                    a0Var.k(i11 - i10, z10);
                } else {
                    a0Var.k(i17, z10);
                }
                if (v.D0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i21 + " holder " + a0Var);
                }
            }
            i21++;
            z10 = false;
        }
        vVar.requestLayout();
        vVar.f2681m0 = true;
    }
}
