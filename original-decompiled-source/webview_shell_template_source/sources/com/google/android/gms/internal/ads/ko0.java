package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ko0 implements jl0, zzr, al0 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final xa0 f6452t;

    /* renamed from: u, reason: collision with root package name */
    public final tb1 f6453u;

    /* renamed from: v, reason: collision with root package name */
    public final VersionInfoParcel f6454v;

    /* renamed from: w, reason: collision with root package name */
    public final ok f6455w;

    /* renamed from: x, reason: collision with root package name */
    public final uz0 f6456x;

    /* renamed from: y, reason: collision with root package name */
    public vz0 f6457y;

    public ko0(Context context, xa0 xa0Var, tb1 tb1Var, VersionInfoParcel versionInfoParcel, ok okVar, uz0 uz0Var) {
        this.s = context;
        this.f6452t = xa0Var;
        this.f6453u = tb1Var;
        this.f6454v = versionInfoParcel;
        this.f6455w = okVar;
        this.f6456x = uz0Var;
    }

    public final boolean a() {
        t31 t31Var;
        if (!((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue()) {
            return false;
        }
        uz0 uz0Var = this.f6456x;
        synchronized (uz0Var) {
            t31Var = uz0Var.f9672f;
        }
        return t31Var != null;
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final void t() {
        xa0 xa0Var;
        if (!((Boolean) zzbe.zzc().a(zn.n5)).booleanValue()) {
            ok okVar = ok.REWARD_BASED_VIDEO_AD;
            ok okVar2 = this.f6455w;
            if (okVar2 != okVar && okVar2 != ok.INTERSTITIAL && okVar2 != ok.APP_OPEN) {
                return;
            }
        }
        tb1 tb1Var = this.f6453u;
        if (tb1Var.T && (xa0Var = this.f6452t) != null && ((sz0) zzv.zzB()).f(this.s)) {
            if (a()) {
                this.f6456x.c();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.f6454v;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            l2 l2Var = tb1Var.V;
            int i6 = 1;
            String str2 = l2Var.d() + (-1) != 1 ? "javascript" : null;
            int i7 = 2;
            if (l2Var.d() == 1) {
                i6 = 3;
            } else {
                i7 = tb1Var.Y == 2 ? 4 : 1;
            }
            this.f6457y = ((sz0) zzv.zzB()).a(i7, i6, xa0Var.u(), str, str2, tb1Var.f9193l0);
            View viewZzF = xa0Var.zzF();
            vz0 vz0Var = this.f6457y;
            if (vz0Var != null) {
                fg1 fg1Var = vz0Var.f9965a;
                if (((Boolean) zzbe.zzc().a(zn.f11387e5)).booleanValue()) {
                    ((sz0) zzv.zzB()).d(fg1Var, xa0Var.u());
                    ArrayList arrayListH = xa0Var.H();
                    int size = arrayListH.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj = arrayListH.get(i8);
                        i8++;
                        ((sz0) zzv.zzB()).getClass();
                        sz0.j(new q(8, fg1Var, (View) obj));
                    }
                } else {
                    ((sz0) zzv.zzB()).d(fg1Var, viewZzF);
                }
                xa0Var.m0(this.f6457y);
                ((sz0) zzv.zzB()).e(fg1Var);
                xa0Var.G("onSdkLoaded", new w.a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        xa0 xa0Var;
        if (((Boolean) zzbe.zzc().a(zn.f11427k5)).booleanValue() || (xa0Var = this.f6452t) == null) {
            return;
        }
        if (this.f6457y != null || a()) {
            if (this.f6457y != null) {
                xa0Var.G("onSdkImpression", new w.a());
            } else {
                this.f6456x.b();
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
        this.f6457y = null;
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final void zzr() {
        xa0 xa0Var;
        if (a()) {
            this.f6456x.b();
        } else {
            if (this.f6457y == null || (xa0Var = this.f6452t) == null) {
                return;
            }
            if (((Boolean) zzbe.zzc().a(zn.f11427k5)).booleanValue()) {
                xa0Var.G("onSdkImpression", new w.a());
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }
}
