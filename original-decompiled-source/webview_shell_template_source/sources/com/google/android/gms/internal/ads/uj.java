package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class uj extends f3.a {
    public static final Parcelable.Creator<uj> CREATOR = new vj();
    public ParcelFileDescriptor s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f9570t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f9571u;

    /* renamed from: v, reason: collision with root package name */
    public final long f9572v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f9573w;

    public uj() {
        this(null, false, false, 0L, false);
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream l() {
        if (this.s == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.s);
        this.s = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean m() {
        return this.s != null;
    }

    public final synchronized boolean n() {
        return this.f9571u;
    }

    public final synchronized boolean o() {
        return this.f9573w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z6;
        long j6;
        int iS = e5.i.s(20293, parcel);
        synchronized (this) {
            parcelFileDescriptor = this.s;
        }
        e5.i.l(parcel, 2, parcelFileDescriptor, i6);
        synchronized (this) {
            z6 = this.f9570t;
        }
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean zN = n();
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(zN ? 1 : 0);
        synchronized (this) {
            j6 = this.f9572v;
        }
        e5.i.r(parcel, 5, 8);
        parcel.writeLong(j6);
        boolean zO = o();
        e5.i.r(parcel, 6, 4);
        parcel.writeInt(zO ? 1 : 0);
        e5.i.t(iS, parcel);
    }

    public uj(ParcelFileDescriptor parcelFileDescriptor, boolean z6, boolean z7, long j6, boolean z8) {
        this.s = parcelFileDescriptor;
        this.f9570t = z6;
        this.f9571u = z7;
        this.f9572v = j6;
        this.f9573w = z8;
    }
}
