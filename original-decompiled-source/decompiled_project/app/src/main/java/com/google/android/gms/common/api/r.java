package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public static final r f6078a = new r();

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() != -204102970) {
            parcel.setDataPosition(iDataPosition - 4);
            return c.f5918b;
        }
        int iT = qa.b.t(parcel);
        e eVar = null;
        while (parcel.dataPosition() < iT) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                qa.b.s(i10, parcel);
            } else {
                eVar = (e) qa.b.e(parcel, i10, e.CREATOR);
            }
        }
        qa.b.j(iT, parcel);
        return new c(eVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
