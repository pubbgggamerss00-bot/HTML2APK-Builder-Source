package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mq extends sh implements yq {
    public final Drawable s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f7205t;

    /* renamed from: u, reason: collision with root package name */
    public final double f7206u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7207v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7208w;

    public mq() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static yq i1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof yq ? (yq) iInterfaceQueryLocalInterface : new xq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final double zzb() {
        return this.f7206u;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final int zzc() {
        return this.f7208w;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final int zzd() {
        return this.f7207v;
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 1) {
            k3.a aVarZzf = zzf();
            parcel2.writeNoException();
            th.e(parcel2, aVarZzf);
        } else if (i6 == 2) {
            parcel2.writeNoException();
            th.d(parcel2, this.f7205t);
        } else if (i6 == 3) {
            parcel2.writeNoException();
            parcel2.writeDouble(this.f7206u);
        } else if (i6 == 4) {
            parcel2.writeNoException();
            parcel2.writeInt(this.f7207v);
        } else {
            if (i6 != 5) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.f7208w);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final Uri zze() {
        return this.f7205t;
    }

    @Override // com.google.android.gms.internal.ads.yq
    public final k3.a zzf() {
        return new k3.b(this.s);
    }

    public mq(Drawable drawable, Uri uri, double d7, int i6, int i7) {
        this();
        this.s = drawable;
        this.f7205t = uri;
        this.f7206u = d7;
        this.f7207v = i6;
        this.f7208w = i7;
    }
}
