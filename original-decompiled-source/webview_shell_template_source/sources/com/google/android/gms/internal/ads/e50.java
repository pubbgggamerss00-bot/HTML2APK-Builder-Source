package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e50 extends f3.a {
    public static final Parcelable.Creator<e50> CREATOR = new f50();
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final String f4122t;

    public e50(ServerSideVerificationOptions serverSideVerificationOptions) {
        this(serverSideVerificationOptions.getUserId(), serverSideVerificationOptions.getCustomData());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.m(parcel, 1, this.s);
        e5.i.m(parcel, 2, this.f4122t);
        e5.i.t(iS, parcel);
    }

    public e50(String str, String str2) {
        this.s = str;
        this.f4122t = str2;
    }
}
