package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ii0 implements jl0, al0 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final xa0 f5772t;

    /* renamed from: u, reason: collision with root package name */
    public final tb1 f5773u;

    /* renamed from: v, reason: collision with root package name */
    public final VersionInfoParcel f5774v;

    /* renamed from: w, reason: collision with root package name */
    public vz0 f5775w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f5776x;

    /* renamed from: y, reason: collision with root package name */
    public final uz0 f5777y;

    public ii0(Context context, xa0 xa0Var, tb1 tb1Var, VersionInfoParcel versionInfoParcel, uz0 uz0Var) {
        this.s = context;
        this.f5772t = xa0Var;
        this.f5773u = tb1Var;
        this.f5774v = versionInfoParcel;
        this.f5777y = uz0Var;
    }

    public final synchronized void a() {
        int i6;
        int i7;
        try {
            if (this.f5773u.T && this.f5772t != null) {
                if (((sz0) zzv.zzB()).f(this.s)) {
                    VersionInfoParcel versionInfoParcel = this.f5774v;
                    String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                    l2 l2Var = this.f5773u.V;
                    String str2 = l2Var.d() + (-1) != 1 ? "javascript" : null;
                    if (l2Var.d() == 1) {
                        i6 = 2;
                        i7 = 3;
                    } else if (this.f5773u.f9179e == 1) {
                        i6 = 3;
                        i7 = 1;
                    } else {
                        i6 = 1;
                        i7 = 1;
                    }
                    this.f5775w = ((sz0) zzv.zzB()).a(i6, i7, this.f5772t.u(), str, str2, this.f5773u.f9193l0);
                    View viewZzF = this.f5772t.zzF();
                    vz0 vz0Var = this.f5775w;
                    if (vz0Var != null) {
                        fg1 fg1Var = vz0Var.f9965a;
                        if (((Boolean) zzbe.zzc().a(zn.f11387e5)).booleanValue()) {
                            ((sz0) zzv.zzB()).d(fg1Var, this.f5772t.u());
                            ArrayList arrayListH = this.f5772t.H();
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
                        this.f5772t.m0(this.f5775w);
                        ((sz0) zzv.zzB()).e(fg1Var);
                        this.f5776x = true;
                        this.f5772t.G("onSdkLoaded", new w.a());
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.jl0
    public final synchronized void t() {
        boolean z6;
        if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue()) {
            uz0 uz0Var = this.f5777y;
            synchronized (uz0Var) {
                z6 = uz0Var.f9672f != null;
            }
        }
        if (z6) {
            this.f5777y.c();
        } else {
            if (this.f5776x) {
                return;
            }
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final synchronized void zzr() {
        boolean z6;
        xa0 xa0Var;
        if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue()) {
            uz0 uz0Var = this.f5777y;
            synchronized (uz0Var) {
                z6 = uz0Var.f9672f != null;
            }
        }
        if (z6) {
            this.f5777y.b();
            return;
        }
        if (!this.f5776x) {
            a();
        }
        if (!this.f5773u.T || this.f5775w == null || (xa0Var = this.f5772t) == null) {
            return;
        }
        xa0Var.G("onSdkImpression", new w.a());
    }
}
