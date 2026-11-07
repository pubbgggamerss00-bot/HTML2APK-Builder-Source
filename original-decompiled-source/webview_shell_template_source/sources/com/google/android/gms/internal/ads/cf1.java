package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cf1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3553a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f3554b;

    /* renamed from: c, reason: collision with root package name */
    public final is1 f3555c;

    /* renamed from: d, reason: collision with root package name */
    public final zzu f3556d;

    /* renamed from: e, reason: collision with root package name */
    public final ze1 f3557e;

    /* renamed from: f, reason: collision with root package name */
    public final ie1 f3558f;

    public cf1(Context context, h70 h70Var, is1 is1Var, zzu zzuVar, ze1 ze1Var, ie1 ie1Var) {
        this.f3553a = context;
        this.f3554b = h70Var;
        this.f3555c = is1Var;
        this.f3556d = zzuVar;
        this.f3557e = ze1Var;
        this.f3558f = ie1Var;
    }

    public final void a(String str, zzv zzvVar, he1 he1Var) {
        c5.a aVarU;
        boolean zA = ie1.a();
        Executor executor = this.f3554b;
        if (!zA || !((Boolean) mp.f7200d.c()).booleanValue()) {
            executor.execute(new c11(this, str, zzvVar, 1));
            return;
        }
        de1 de1VarE = d0.e(this.f3553a, 14);
        de1VarE.zzi();
        is1 is1Var = this.f3555c;
        if (zzvVar != null) {
            try {
                aVarU = new ye1(zzvVar.zzb(), this.f3556d, is1Var, this.f3557e).a(1, str, 0L);
            } catch (NullPointerException | RejectedExecutionException unused) {
                aVarU = bs1.m(zzt.PERMANENT_FAILURE);
            }
        } else {
            aVarU = is1Var.u(new vw0(3, this, str));
        }
        aVarU.addListener(new as1(0, aVarU, new wv0(this, de1VarE, he1Var)), executor);
    }

    public final void b(List list, zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), zzvVar, null);
        }
    }
}
