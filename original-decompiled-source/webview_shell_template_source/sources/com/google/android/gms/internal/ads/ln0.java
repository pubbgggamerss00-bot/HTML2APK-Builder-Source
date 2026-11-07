package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ln0 extends pm0 implements bi {

    /* renamed from: t, reason: collision with root package name */
    public final WeakHashMap f6793t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f6794u;

    /* renamed from: v, reason: collision with root package name */
    public final tb1 f6795v;

    public ln0(Context context, Set set, tb1 tb1Var) {
        super(set);
        this.f6793t = new WeakHashMap(1);
        this.f6794u = context;
        this.f6795v = tb1Var;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final synchronized void C(ai aiVar) {
        o0(new ej0(9, aiVar));
    }

    public final synchronized void p0(View view) {
        try {
            ci ciVar = (ci) this.f6793t.get(view);
            if (ciVar == null) {
                ci ciVar2 = new ci(this.f6794u, view);
                ciVar2.D.add(this);
                ciVar2.c(3);
                this.f6793t.put(view, ciVar2);
                ciVar = ciVar2;
            }
            if (this.f6795v.X) {
                if (((Boolean) zzbe.zzc().a(zn.f11504x1)).booleanValue()) {
                    ciVar.A.zza(((Long) zzbe.zzc().a(zn.f11497w1)).longValue());
                    return;
                }
            }
            ciVar.A.zza(ci.G);
        } catch (Throwable th) {
            throw th;
        }
    }
}
