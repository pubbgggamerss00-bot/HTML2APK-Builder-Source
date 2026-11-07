package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ti1 extends f3.a {
    public static final Parcelable.Creator<ti1> CREATOR = new ui1();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public yd f9296t = null;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f9297u;

    public ti1(int i6, byte[] bArr) {
        this.s = i6;
        this.f9297u = bArr;
        l();
    }

    public final void l() {
        yd ydVar = this.f9296t;
        if (ydVar != null || this.f9297u == null) {
            if (ydVar == null || this.f9297u != null) {
                if (ydVar != null && this.f9297u != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (ydVar != null || this.f9297u != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        byte[] bArrI = this.f9297u;
        if (bArrI == null) {
            bArrI = this.f9296t.i();
        }
        e5.i.j(parcel, 2, bArrI);
        e5.i.t(iS, parcel);
    }
}
