package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iT = qa.b.t(parcel);
        Bundle bundleB = null;
        e eVar = null;
        int iN = 0;
        pa.c[] cVarArr = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                bundleB = qa.b.b(i10, parcel);
            } else if (c10 == 2) {
                cVarArr = (pa.c[]) qa.b.h(parcel, i10, pa.c.CREATOR);
            } else if (c10 == 3) {
                iN = qa.b.n(i10, parcel);
            } else if (c10 != 4) {
                qa.b.s(i10, parcel);
            } else {
                eVar = (e) qa.b.e(parcel, i10, e.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        y0 y0Var = new y0();
        y0Var.f6210a = bundleB;
        y0Var.f6211b = cVarArr;
        y0Var.f6212c = iN;
        y0Var.f6213d = eVar;
        return y0Var;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new y0[i10];
    }
}
