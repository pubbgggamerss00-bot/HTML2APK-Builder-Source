package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class lg0 implements bi, bl0, zzr, al0 {
    public final gg0 s;

    /* renamed from: t, reason: collision with root package name */
    public final hg0 f6713t;

    /* renamed from: v, reason: collision with root package name */
    public final ux f6715v;

    /* renamed from: w, reason: collision with root package name */
    public final Executor f6716w;

    /* renamed from: x, reason: collision with root package name */
    public final i3.a f6717x;

    /* renamed from: u, reason: collision with root package name */
    public final HashSet f6714u = new HashSet();

    /* renamed from: y, reason: collision with root package name */
    public final AtomicBoolean f6718y = new AtomicBoolean(false);

    /* renamed from: z, reason: collision with root package name */
    public final kg0 f6719z = new kg0();
    public boolean A = false;
    public WeakReference B = new WeakReference(this);

    public lg0(rx rxVar, hg0 hg0Var, Executor executor, gg0 gg0Var, i3.a aVar) {
        this.s = gg0Var;
        Charset charset = kx.f6518a;
        rxVar.a();
        this.f6715v = new ux(rxVar.f8727b);
        this.f6713t = hg0Var;
        this.f6716w = executor;
        this.f6717x = aVar;
    }

    @Override // com.google.android.gms.internal.ads.bi
    public final synchronized void C(ai aiVar) {
        kg0 kg0Var = this.f6719z;
        kg0Var.f6401a = aiVar.f2772j;
        kg0Var.f6405e = aiVar;
        c();
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final synchronized void a(Context context) {
        this.f6719z.f6404d = "u";
        c();
        f();
        this.A = true;
    }

    public final synchronized void c() {
        try {
            if (this.B.get() == null) {
                synchronized (this) {
                    f();
                    this.A = true;
                }
                return;
            }
            if (this.A || !this.f6718y.get()) {
                return;
            }
            try {
                this.f6719z.f6403c = this.f6717x.b();
                JSONObject jSONObjectB = this.f6713t.a(this.f6719z);
                Iterator it = this.f6714u.iterator();
                while (it.hasNext()) {
                    this.f6716w.execute(new jg0((xa0) it.next(), jSONObjectB, 0));
                }
                ux uxVar = this.f6715v;
                uxVar.getClass();
                sx sxVar = new sx(uxVar, jSONObjectB);
                c5.a aVar = uxVar.f9655a;
                h70 h70Var = i70.f5592g;
                gr1 gr1VarP = bs1.p(aVar, sxVar, h70Var);
                gr1VarP.addListener(new as1(0, gr1VarP, new jv1("ActiveViewListener.callActiveViewJs", 3)), h70Var);
                return;
            } catch (Exception e6) {
                zze.zzb("Failed to call ActiveViewJS", e6);
                return;
            }
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final synchronized void e(Context context) {
        this.f6719z.f6402b = true;
        c();
    }

    public final void f() {
        Iterator it = this.f6714u.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            final String str = "/untrackActiveViewUnit";
            final String str2 = "/updateActiveView";
            gg0 gg0Var = this.s;
            if (!zHasNext) {
                rx rxVar = gg0Var.f5034b;
                final eg0 eg0Var = gg0Var.f5037e;
                c5.a aVar = rxVar.f8727b;
                pl1 pl1Var = new pl1() { // from class: com.google.android.gms.internal.ads.px
                    @Override // com.google.android.gms.internal.ads.pl1
                    public final Object apply(Object obj) {
                        dx dxVar = (dx) obj;
                        dxVar.Q(str2, eg0Var);
                        return dxVar;
                    }
                };
                h70 h70Var = i70.f5592g;
                hr1 hr1VarO = bs1.o(aVar, pl1Var, h70Var);
                rxVar.f8727b = hr1VarO;
                final fg0 fg0Var = gg0Var.f5038f;
                rxVar.f8727b = bs1.o(hr1VarO, new pl1() { // from class: com.google.android.gms.internal.ads.px
                    @Override // com.google.android.gms.internal.ads.pl1
                    public final Object apply(Object obj) {
                        dx dxVar = (dx) obj;
                        dxVar.Q(str, fg0Var);
                        return dxVar;
                    }
                }, h70Var);
                return;
            }
            xa0 xa0Var = (xa0) it.next();
            xa0Var.L("/updateActiveView", gg0Var.f5037e);
            xa0Var.L("/untrackActiveViewUnit", gg0Var.f5038f);
        }
    }

    @Override // com.google.android.gms.internal.ads.bl0
    public final synchronized void i(Context context) {
        this.f6719z.f6402b = false;
        c();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdE() {
        this.f6719z.f6402b = false;
        c();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdi() {
        this.f6719z.f6402b = true;
        c();
    }

    @Override // com.google.android.gms.internal.ads.al0
    public final synchronized void zzr() {
        if (this.f6718y.compareAndSet(false, true)) {
            gg0 gg0Var = this.s;
            rx rxVar = gg0Var.f5034b;
            final String str = "/updateActiveView";
            final eg0 eg0Var = gg0Var.f5037e;
            rxVar.a();
            c5.a aVar = rxVar.f8727b;
            pr1 pr1Var = new pr1() { // from class: com.google.android.gms.internal.ads.qx
                @Override // com.google.android.gms.internal.ads.pr1
                public final c5.a zza(Object obj) {
                    dx dxVar = (dx) obj;
                    dxVar.M(str, eg0Var);
                    return bs1.m(dxVar);
                }
            };
            h70 h70Var = i70.f5592g;
            rxVar.f8727b = bs1.p(aVar, pr1Var, h70Var);
            final String str2 = "/untrackActiveViewUnit";
            final fg0 fg0Var = gg0Var.f5038f;
            rxVar.a();
            rxVar.f8727b = bs1.p(rxVar.f8727b, new pr1() { // from class: com.google.android.gms.internal.ads.qx
                @Override // com.google.android.gms.internal.ads.pr1
                public final c5.a zza(Object obj) {
                    dx dxVar = (dx) obj;
                    dxVar.M(str2, fg0Var);
                    return bs1.m(dxVar);
                }
            }, h70Var);
            gg0Var.f5036d = this;
            c();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i6) {
    }
}
