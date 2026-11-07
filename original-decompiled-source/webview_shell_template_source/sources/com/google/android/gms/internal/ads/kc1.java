package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class kc1 {

    /* renamed from: a, reason: collision with root package name */
    public final tb1 f6324a;

    /* renamed from: b, reason: collision with root package name */
    public final vb1 f6325b;

    /* renamed from: c, reason: collision with root package name */
    public final cf1 f6326c;

    /* renamed from: d, reason: collision with root package name */
    public final ze1 f6327d;

    /* renamed from: e, reason: collision with root package name */
    public final he1 f6328e;

    /* renamed from: f, reason: collision with root package name */
    public final vf0 f6329f;

    public kc1(cf1 cf1Var, ze1 ze1Var, tb1 tb1Var, vb1 vb1Var, vf0 vf0Var, he1 he1Var) {
        this.f6324a = tb1Var;
        this.f6325b = vb1Var;
        this.f6326c = cf1Var;
        this.f6327d = ze1Var;
        this.f6329f = vf0Var;
        this.f6328e = he1Var;
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            String str = (String) obj;
            tb1 tb1Var = this.f6324a;
            if (tb1Var.f9187i0) {
                String str2 = this.f6325b.f9774b;
                ze1 ze1Var = this.f6327d;
                ze1Var.getClass();
                fz0 fz0Var = new fz0(zzv.zzC().a(), str2, str, 2);
                dz0 dz0Var = ze1Var.f11270a;
                dz0Var.getClass();
                dz0Var.b(new ni0(13, dz0Var, fz0Var));
            } else {
                he1 he1Var = this.f6328e;
                this.f6326c.a(str, tb1Var.f9215x0, he1Var);
            }
        }
    }

    public final void b(int i6, ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str = (String) obj;
            c5.a aVarA = (((Boolean) zzbe.zzc().a(zn.T9)).booleanValue() && vf0.b(str)) ? this.f6329f.a(str, zzbc.zze()) : bs1.m(str);
            aVarA.addListener(new as1(0, aVarA, new ti(i6, this)), i70.f5586a);
        }
    }
}
