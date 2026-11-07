package com.google.android.gms.internal.ads;

import androidx.work.ListenableWorker;
import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class tf0 implements Runnable {
    public final /* synthetic */ int s = 0;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f9264t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9265u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f9266v;

    public /* synthetic */ tf0(cf1 cf1Var, String str, zzv zzvVar) {
        this.f9264t = cf1Var;
        this.f9265u = str;
        this.f9266v = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                ((cf1) this.f9264t).a((String) this.f9265u, (zzv) this.f9266v, null);
                break;
            default:
                t2.c cVar = (t2.c) this.f9265u;
                j2.m mVar = (j2.m) this.f9266v;
                try {
                    ((c5.a) this.f9264t).get();
                    androidx.work.k.c().a(j2.m.L, "Starting work for " + mVar.f13487w.f14282c, new Throwable[0]);
                    c5.a<ListenableWorker.a> aVarStartWork = mVar.f13488x.startWork();
                    mVar.J = aVarStartWork;
                    cVar.j(aVarStartWork);
                    break;
                } catch (Throwable th) {
                    cVar.i(th);
                }
        }
    }

    public tf0(j2.m mVar, t2.c cVar, t2.c cVar2) {
        this.f9266v = mVar;
        this.f9264t = cVar;
        this.f9265u = cVar2;
    }
}
