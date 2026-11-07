package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bw extends f3.a {
    public static final Parcelable.Creator<bw> CREATOR = new dw();
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final int f3308t;

    /* renamed from: u, reason: collision with root package name */
    public final String f3309u;

    /* renamed from: v, reason: collision with root package name */
    public final int f3310v;

    public bw(String str, int i6, int i7, int i8) {
        this.s = i6;
        this.f3308t = i7;
        this.f3309u = str;
        this.f3310v = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.f3308t);
        e5.i.m(parcel, 2, this.f3309u);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f3310v);
        e5.i.r(parcel, CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, 4);
        parcel.writeInt(this.s);
        e5.i.t(iS, parcel);
    }
}
