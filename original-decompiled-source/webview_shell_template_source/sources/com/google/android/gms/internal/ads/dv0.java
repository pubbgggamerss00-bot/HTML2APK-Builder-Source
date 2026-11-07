package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dv0 extends sh implements uv {
    public final /* synthetic */ Object s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f4040t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f4041u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ de1 f4042v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o70 f4043w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ fv0 f4044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv0(long j6, o70 o70Var, fv0 fv0Var, de1 de1Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.s = obj;
        this.f4040t = str;
        this.f4041u = j6;
        this.f4042v = de1Var;
        this.f4043w = o70Var;
        this.f4044x = fv0Var;
    }

    @Override // com.google.android.gms.internal.ads.sh
    public final boolean zzdD(int i6, Parcel parcel, Parcel parcel2, int i7) {
        if (i6 == 2) {
            zzf();
        } else {
            if (i6 != 3) {
                return false;
            }
            String string = parcel.readString();
            th.b(parcel);
            zze(string);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uv
    public final void zze(String str) {
        synchronized (this.s) {
            this.f4044x.d(this.f4040t, (int) (zzv.zzC().b() - this.f4041u), str, false);
            this.f4044x.f4797l.a(this.f4040t, "error");
            this.f4044x.f4800o.a(this.f4040t, "error");
            ie1 ie1Var = this.f4044x.f4801p;
            de1 de1Var = this.f4042v;
            de1Var.e(str);
            de1Var.s(false);
            ie1Var.b(de1Var.zzm());
            this.f4043w.a(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.uv
    public final void zzf() {
        synchronized (this.s) {
            this.f4044x.d(this.f4040t, (int) (zzv.zzC().b() - this.f4041u), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
            this.f4044x.f4797l.c(this.f4040t);
            this.f4044x.f4800o.f(this.f4040t);
            ie1 ie1Var = this.f4044x.f4801p;
            de1 de1Var = this.f4042v;
            de1Var.s(true);
            ie1Var.b(de1Var.zzm());
            this.f4043w.a(Boolean.TRUE);
        }
    }
}
