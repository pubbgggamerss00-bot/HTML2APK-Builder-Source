package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class nb0 implements Runnable {
    public final /* synthetic */ ob0 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f7375t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f7376u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f7377v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f7378w;

    public /* synthetic */ nb0(ob0 ob0Var, int i6, int i7, boolean z6, boolean z7) {
        this.s = ob0Var;
        this.f7375t = i6;
        this.f7376u = i7;
        this.f7377v = z6;
        this.f7378w = z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6;
        boolean z6;
        boolean z7;
        zzee zzeeVar;
        zzee zzeeVar2;
        zzee zzeeVar3;
        ob0 ob0Var = this.s;
        int i7 = this.f7375t;
        int i8 = this.f7376u;
        boolean z8 = this.f7377v;
        boolean z9 = this.f7378w;
        synchronized (ob0Var.f7669t) {
            try {
                boolean z10 = ob0Var.f7674y;
                if (z10 || i8 != 1) {
                    i6 = i8;
                    z6 = false;
                } else {
                    i8 = 1;
                    i6 = 1;
                    z6 = true;
                }
                boolean z11 = i7 != i8;
                if (z11 && i6 == 1) {
                    z7 = true;
                    i6 = 1;
                } else {
                    z7 = false;
                }
                boolean z12 = z11 && i6 == 2;
                boolean z13 = z11 && i6 == 3;
                ob0Var.f7674y = z10 || z6;
                if (z6) {
                    try {
                        zzee zzeeVar4 = ob0Var.f7673x;
                        if (zzeeVar4 != null) {
                            zzeeVar4.zzi();
                        }
                    } catch (RemoteException e6) {
                        zzo.zzl("#007 Could not call remote method.", e6);
                    }
                }
                if (z7 && (zzeeVar3 = ob0Var.f7673x) != null) {
                    zzeeVar3.zzh();
                }
                if (z12 && (zzeeVar2 = ob0Var.f7673x) != null) {
                    zzeeVar2.zzg();
                }
                if (z13) {
                    zzee zzeeVar5 = ob0Var.f7673x;
                    if (zzeeVar5 != null) {
                        zzeeVar5.zze();
                    }
                    ob0Var.s.c();
                }
                if (z8 != z9 && (zzeeVar = ob0Var.f7673x) != null) {
                    zzeeVar.zzf(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
