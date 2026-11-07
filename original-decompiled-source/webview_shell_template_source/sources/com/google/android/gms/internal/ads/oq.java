package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.nativead.NativeAdOptions;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oq extends f3.a {
    public static final Parcelable.Creator<oq> CREATOR = new pq();
    public final int A;
    public final boolean B;
    public final int C;
    public final int s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f7838t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7839u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f7840v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7841w;

    /* renamed from: x, reason: collision with root package name */
    public final zzga f7842x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f7843y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7844z;

    public oq(int i6, boolean z6, int i7, boolean z7, int i8, zzga zzgaVar, boolean z8, int i9, int i10, boolean z9, int i11) {
        this.s = i6;
        this.f7838t = z6;
        this.f7839u = i7;
        this.f7840v = z7;
        this.f7841w = i8;
        this.f7842x = zzgaVar;
        this.f7843y = z8;
        this.f7844z = i9;
        this.B = z9;
        this.A = i10;
        this.C = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static NativeAdOptions l(oq oqVar) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        if (oqVar == null) {
            return builder.build();
        }
        int i6 = oqVar.s;
        int i7 = 2;
        if (i6 == 2) {
            builder.setAdChoicesPlacement(oqVar.f7841w);
        } else {
            if (i6 != 3) {
                if (i6 == 4) {
                    builder.setRequestCustomMuteThisAd(oqVar.f7843y);
                    builder.setMediaAspectRatio(oqVar.f7844z);
                    builder.enableCustomClickGestureDirection(oqVar.A, oqVar.B);
                    int i8 = oqVar.C;
                    if (i8 != 0) {
                        if (i8 == 2) {
                            i7 = 3;
                        } else if (i8 != 1) {
                            i7 = 1;
                        }
                        builder.zzi(i7);
                    }
                }
            }
            zzga zzgaVar = oqVar.f7842x;
            if (zzgaVar != null) {
                builder.setVideoOptions(new VideoOptions(zzgaVar));
            }
            builder.setAdChoicesPlacement(oqVar.f7841w);
        }
        builder.setReturnUrlsForImageAssets(oqVar.f7838t);
        builder.setRequestMultipleImages(oqVar.f7840v);
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iS = e5.i.s(20293, parcel);
        e5.i.r(parcel, 1, 4);
        parcel.writeInt(this.s);
        e5.i.r(parcel, 2, 4);
        parcel.writeInt(this.f7838t ? 1 : 0);
        e5.i.r(parcel, 3, 4);
        parcel.writeInt(this.f7839u);
        e5.i.r(parcel, 4, 4);
        parcel.writeInt(this.f7840v ? 1 : 0);
        e5.i.r(parcel, 5, 4);
        parcel.writeInt(this.f7841w);
        e5.i.l(parcel, 6, this.f7842x, i6);
        e5.i.r(parcel, 7, 4);
        parcel.writeInt(this.f7843y ? 1 : 0);
        e5.i.r(parcel, 8, 4);
        parcel.writeInt(this.f7844z);
        e5.i.r(parcel, 9, 4);
        parcel.writeInt(this.A);
        e5.i.r(parcel, 10, 4);
        parcel.writeInt(this.B ? 1 : 0);
        e5.i.r(parcel, 11, 4);
        parcel.writeInt(this.C);
        e5.i.t(iS, parcel);
    }

    @Deprecated
    public oq(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
