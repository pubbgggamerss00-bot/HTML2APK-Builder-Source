package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzga;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b7 implements z0, zb0 {
    public final Object s;

    /* renamed from: t, reason: collision with root package name */
    public Object f2944t;

    /* renamed from: u, reason: collision with root package name */
    public Object f2945u;

    public /* synthetic */ b7(kd0 kd0Var) {
        this.s = kd0Var;
    }

    public r0 a() {
        ih1.k((Context) this.f2944t, Context.class);
        return new r0((kd0) this.s, (Context) this.f2944t, (String) this.f2945u);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public void d() {
        ((z0) this.s).d();
    }

    @Override // com.google.android.gms.internal.ads.z0
    public void f(m1 m1Var) {
        ((z0) this.s).f(m1Var);
    }

    @Override // com.google.android.gms.internal.ads.z0
    public s1 g(int i6, int i7) {
        SparseArray sparseArray = (SparseArray) this.f2945u;
        z0 z0Var = (z0) this.s;
        if (i7 != 3) {
            return z0Var.g(i6, i7);
        }
        d7 d7Var = (d7) sparseArray.get(i6);
        if (d7Var != null) {
            return d7Var;
        }
        d7 d7Var2 = new d7(z0Var.g(i6, 3), (z6) this.f2944t);
        sparseArray.put(i6, d7Var2);
        return d7Var2;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    public void zza(boolean z6, int i6, String str, String str2) {
        qr0 qr0Var = (qr0) this.s;
        xa0 xa0Var = (xa0) this.f2944t;
        n70 n70Var = (n70) this.f2945u;
        qr0Var.getClass();
        ec1 ec1Var = qr0Var.f8445a;
        if (!((Boolean) zzbe.zzc().a(zn.Z3)).booleanValue()) {
            zzga zzgaVar = ec1Var.f4206a;
            if (zzgaVar != null && xa0Var.zzq() != null) {
                xa0Var.zzq().e2(zzgaVar);
            }
            n70Var.c();
            return;
        }
        if (z6) {
            zzga zzgaVar2 = ec1Var.f4206a;
            if (zzgaVar2 != null && xa0Var.zzq() != null) {
                xa0Var.zzq().e2(zzgaVar2);
            }
            n70Var.c();
            return;
        }
        n70Var.b(new p21(1, "Native Video WebView failed to load. Error code: " + i6 + ", Description: " + str + ", Failing URL: " + str2));
    }

    public /* synthetic */ b7(qr0 qr0Var, xa0 xa0Var, n70 n70Var) {
        this.s = qr0Var;
        this.f2944t = xa0Var;
        this.f2945u = n70Var;
    }

    public b7(z0 z0Var, z6 z6Var) {
        this.s = z0Var;
        this.f2944t = z6Var;
        this.f2945u = new SparseArray();
    }
}
