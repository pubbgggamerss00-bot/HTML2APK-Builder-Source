package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.c;
import hb.s0;
import java.util.List;
import qa.b;

/* loaded from: classes2.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final zzj createFromParcel(Parcel parcel) {
        int iT = b.t(parcel);
        s0 s0Var = zzj.zzb;
        List<c> listI = zzj.zza;
        String strF = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                s0Var = (s0) b.e(parcel, i10, s0.CREATOR);
            } else if (c10 == 2) {
                listI = b.i(parcel, i10, c.CREATOR);
            } else if (c10 != 3) {
                b.s(i10, parcel);
            } else {
                strF = b.f(i10, parcel);
            }
        }
        b.j(iT, parcel);
        return new zzj(s0Var, listI, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
