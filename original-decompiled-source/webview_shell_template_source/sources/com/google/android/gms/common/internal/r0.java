package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO = f3.b.o(parcel);
        Bundle bundleA = null;
        d dVar = null;
        int iK = 0;
        c3.d[] dVarArr = null;
        while (parcel.dataPosition() < iO) {
            int i6 = parcel.readInt();
            char c7 = (char) i6;
            if (c7 == 1) {
                bundleA = f3.b.a(i6, parcel);
            } else if (c7 == 2) {
                dVarArr = (c3.d[]) f3.b.g(parcel, i6, c3.d.CREATOR);
            } else if (c7 == 3) {
                iK = f3.b.k(i6, parcel);
            } else if (c7 != 4) {
                f3.b.n(i6, parcel);
            } else {
                dVar = (d) f3.b.c(parcel, i6, d.CREATOR);
            }
        }
        f3.b.h(iO, parcel);
        q0 q0Var = new q0();
        q0Var.s = bundleA;
        q0Var.f2480t = dVarArr;
        q0Var.f2481u = iK;
        q0Var.f2482v = dVar;
        return q0Var;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i6) {
        return new q0[i6];
    }
}
