package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qr1 extends kr1 {
    public List H;

    public qr1(bo1 bo1Var, boolean z6) {
        List arrayList;
        super(bo1Var, z6, true);
        if (bo1Var.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = bo1Var.size();
            en1.a(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i6 = 0; i6 < bo1Var.size(); i6++) {
            arrayList.add(null);
        }
        this.H = arrayList;
        u();
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final void s(int i6, Object obj) {
        List list = this.H;
        if (list != null) {
            list.set(i6, new rr1(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final void t() {
        List<rr1> list = this.H;
        if (list != null) {
            int size = list.size();
            en1.a(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (rr1 rr1Var : list) {
                arrayList.add(rr1Var != null ? rr1Var.f8690a : null);
            }
            e(Collections.unmodifiableList(arrayList));
        }
    }

    @Override // com.google.android.gms.internal.ads.kr1
    public final void v(int i6) {
        this.D = null;
        this.H = null;
    }
}
