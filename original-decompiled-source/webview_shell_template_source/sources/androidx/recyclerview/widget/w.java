package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1720a;

    public w(RecyclerView recyclerView) {
        this.f1720a = recyclerView;
    }

    public final void a(a.C0018a c0018a) {
        int i6 = c0018a.f1581a;
        RecyclerView recyclerView = this.f1720a;
        if (i6 == 1) {
            recyclerView.F.Y(c0018a.f1582b, c0018a.f1583c);
            return;
        }
        if (i6 == 2) {
            recyclerView.F.b0(c0018a.f1582b, c0018a.f1583c);
        } else if (i6 == 4) {
            recyclerView.F.c0(c0018a.f1582b, c0018a.f1583c);
        } else {
            if (i6 != 8) {
                return;
            }
            recyclerView.F.a0(c0018a.f1582b, c0018a.f1583c);
        }
    }

    public final RecyclerView.b0 b(int i6) {
        RecyclerView recyclerView = this.f1720a;
        int iH = recyclerView.f1428x.h();
        int i7 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i7 >= iH) {
                break;
            }
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f1428x.g(i7));
            if (b0VarM != null && !b0VarM.h() && b0VarM.f1443c == i6) {
                if (!recyclerView.f1428x.f1590c.contains(b0VarM.f1441a)) {
                    b0Var = b0VarM;
                    break;
                }
                b0Var = b0VarM;
            }
            i7++;
        }
        if (b0Var != null) {
            if (!recyclerView.f1428x.f1590c.contains(b0Var.f1441a)) {
                return b0Var;
            }
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public final void c(int i6, int i7) {
        int i8;
        int i9;
        RecyclerView recyclerView = this.f1720a;
        int iH = recyclerView.f1428x.h();
        int i10 = i7 + i6;
        for (int i11 = 0; i11 < iH; i11++) {
            View viewG = recyclerView.f1428x.g(i11);
            RecyclerView.b0 b0VarM = RecyclerView.M(viewG);
            if (b0VarM != null && !b0VarM.o() && (i9 = b0VarM.f1443c) >= i6 && i9 < i10) {
                b0VarM.a(2);
                b0VarM.a(1024);
                ((RecyclerView.n) viewG.getLayoutParams()).f1494c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f1422u;
        ArrayList<RecyclerView.b0> arrayList = sVar.f1505c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.b0 b0Var = arrayList.get(size);
            if (b0Var != null && (i8 = b0Var.f1443c) >= i6 && i8 < i10) {
                b0Var.a(2);
                sVar.h(size);
            }
        }
        recyclerView.D0 = true;
    }

    public final void d(int i6, int i7) {
        RecyclerView recyclerView = this.f1720a;
        int iH = recyclerView.f1428x.h();
        for (int i8 = 0; i8 < iH; i8++) {
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f1428x.g(i8));
            if (b0VarM != null && !b0VarM.o() && b0VarM.f1443c >= i6) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i8 + " holder " + b0VarM + " now at position " + (b0VarM.f1443c + i7));
                }
                b0VarM.l(i7, false);
                recyclerView.f1433z0.f1531f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.f1422u.f1505c;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView.b0 b0Var = arrayList.get(i9);
            if (b0Var != null && b0Var.f1443c >= i6) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i9 + " holder " + b0Var + " now at position " + (b0Var.f1443c + i7));
                }
                b0Var.l(i7, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.C0 = true;
    }

    public final void e(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RecyclerView recyclerView = this.f1720a;
        int iH = recyclerView.f1428x.h();
        if (i6 < i7) {
            i9 = i6;
            i8 = i7;
            i10 = -1;
        } else {
            i8 = i6;
            i9 = i7;
            i10 = 1;
        }
        boolean z6 = false;
        for (int i16 = 0; i16 < iH; i16++) {
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f1428x.g(i16));
            if (b0VarM != null && (i15 = b0VarM.f1443c) >= i9 && i15 <= i8) {
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + b0VarM);
                }
                if (b0VarM.f1443c == i6) {
                    b0VarM.l(i7 - i6, false);
                } else {
                    b0VarM.l(i10, false);
                }
                recyclerView.f1433z0.f1531f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.f1422u.f1505c;
        if (i6 < i7) {
            i12 = i6;
            i11 = i7;
            i13 = -1;
        } else {
            i11 = i6;
            i12 = i7;
            i13 = 1;
        }
        int size = arrayList.size();
        int i17 = 0;
        while (i17 < size) {
            RecyclerView.b0 b0Var = arrayList.get(i17);
            if (b0Var != null && (i14 = b0Var.f1443c) >= i12 && i14 <= i11) {
                if (i14 == i6) {
                    b0Var.l(i7 - i6, z6);
                } else {
                    b0Var.l(i13, z6);
                }
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i17 + " holder " + b0Var);
                }
            }
            i17++;
            z6 = false;
        }
        recyclerView.requestLayout();
        recyclerView.C0 = true;
    }
}
