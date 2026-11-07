package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l01 implements jo0 {
    public final cu0 A;
    public final VersionInfoParcel s;

    /* renamed from: t, reason: collision with root package name */
    public final o70 f6546t;

    /* renamed from: u, reason: collision with root package name */
    public final tb1 f6547u;

    /* renamed from: v, reason: collision with root package name */
    public final xa0 f6548v;

    /* renamed from: w, reason: collision with root package name */
    public final ec1 f6549w;

    /* renamed from: x, reason: collision with root package name */
    public final bu f6550x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f6551y;

    /* renamed from: z, reason: collision with root package name */
    public final oz0 f6552z;

    public l01(VersionInfoParcel versionInfoParcel, o70 o70Var, tb1 tb1Var, xa0 xa0Var, ec1 ec1Var, boolean z6, bu buVar, oz0 oz0Var, cu0 cu0Var) {
        this.s = versionInfoParcel;
        this.f6546t = o70Var;
        this.f6547u = tb1Var;
        this.f6548v = xa0Var;
        this.f6549w = ec1Var;
        this.f6551y = z6;
        this.f6550x = buVar;
        this.f6552z = oz0Var;
        this.A = cu0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    @Override // com.google.android.gms.internal.ads.jo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z6, Context context, vk0 vk0Var) {
        boolean z7;
        float f6;
        ec1 ec1Var = this.f6549w;
        bu buVar = this.f6550x;
        tb1 tb1Var = this.f6547u;
        vg0 vg0Var = (vg0) bs1.s(this.f6546t);
        xa0 xa0Var = this.f6548v;
        xa0Var.Y(true);
        boolean z8 = this.f6551y;
        boolean zA = z8 ? buVar.a(true) : true;
        if (z8) {
            synchronized (buVar) {
                z7 = buVar.f3288b;
            }
        } else {
            z7 = false;
        }
        boolean z9 = z7;
        if (z8) {
            synchronized (buVar) {
                f6 = buVar.f3289c;
            }
        } else {
            f6 = 0.0f;
        }
        zzl zzlVar = new zzl(zA, true, z9, f6, -1, z6, tb1Var.O, false);
        if (vk0Var != null) {
            vk0Var.zzf();
        }
        zzv.zzj();
        fo0 fo0VarR = vg0Var.r();
        xa0 xa0Var2 = this.f6548v;
        int i6 = tb1Var.Q;
        if (i6 == -1) {
            zzy zzyVar = ec1Var.f4214j;
            if (zzyVar == null) {
                zzo.zze("Error setting app open orientation; no targeting orientation available.");
                i6 = tb1Var.Q;
            } else {
                int i7 = zzyVar.zza;
                if (i7 == 1) {
                    i6 = 7;
                } else if (i7 == 2) {
                    i6 = 6;
                }
            }
        }
        int i8 = i6;
        VersionInfoParcel versionInfoParcel = this.s;
        String str = tb1Var.B;
        xb1 xb1Var = tb1Var.s;
        zzn.zza(context, new AdOverlayInfoParcel(null, fo0VarR, null, xa0Var2, i8, versionInfoParcel, str, zzlVar, xb1Var.f10473b, xb1Var.f10472a, ec1Var.f4211f, vk0Var, tb1Var.b() ? this.f6552z : null, xa0Var.zzr()), true, this.A);
    }
}
