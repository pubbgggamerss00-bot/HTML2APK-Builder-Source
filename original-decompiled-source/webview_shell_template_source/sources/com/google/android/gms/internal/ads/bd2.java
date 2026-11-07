package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.IOException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bd2 implements wc2 {

    /* renamed from: a, reason: collision with root package name */
    public final el0 f3041a;

    /* renamed from: b, reason: collision with root package name */
    public final jx f3042b;

    /* renamed from: c, reason: collision with root package name */
    public final cy f3043c;

    /* renamed from: d, reason: collision with root package name */
    public final ad2 f3044d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f3045e;

    /* renamed from: f, reason: collision with root package name */
    public as0 f3046f;

    /* renamed from: g, reason: collision with root package name */
    public q72 f3047g;
    public xo0 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3048i;

    public bd2(el0 el0Var) {
        el0Var.getClass();
        this.f3041a = el0Var;
        int i6 = j31.f5914a;
        Looper looperMyLooper = Looper.myLooper();
        this.f3046f = new as0(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, el0Var, new ih1(20));
        jx jxVar = new jx();
        this.f3042b = jxVar;
        this.f3043c = new cy();
        this.f3044d = new ad2(jxVar);
        this.f3045e = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void a(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        q(s(i6, oh2Var), 1002, new aa1(21));
    }

    @Override // com.google.android.gms.internal.ads.wc2
    public final void b() {
        q(t(), 1033, new yz1(11));
    }

    @Override // com.google.android.gms.internal.ads.wc2
    public final void c(cp1 cp1Var, oh2 oh2Var) {
        q72 q72Var = this.f3047g;
        q72Var.getClass();
        ad2 ad2Var = this.f3044d;
        ad2Var.getClass();
        ad2Var.f2666b = bo1.l(cp1Var);
        if (!cp1Var.isEmpty()) {
            ad2Var.f2669e = (oh2) cp1Var.get(0);
            oh2Var.getClass();
            ad2Var.f2670f = oh2Var;
        }
        if (ad2Var.f2668d == null) {
            ad2Var.f2668d = ad2.a(q72Var, ad2Var.f2666b, ad2Var.f2669e, ad2Var.f2665a);
        }
        ad2Var.c(q72Var.v());
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void d(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        q(s(i6, oh2Var), CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL, new yz1(8));
    }

    @Override // com.google.android.gms.internal.ads.wc2
    public final void e(int i6, long j6, long j7) {
        Object next;
        Object obj;
        oh2 oh2Var;
        ad2 ad2Var = this.f3044d;
        if (ad2Var.f2666b.isEmpty()) {
            oh2Var = null;
        } else {
            bo1 bo1Var = ad2Var.f2666b;
            if (bo1Var == null) {
                zn1 zn1VarListIterator = bo1Var.listIterator(0);
                do {
                    next = zn1VarListIterator.next();
                } while (zn1VarListIterator.hasNext());
                obj = next;
            } else {
                if (bo1Var.isEmpty()) {
                    throw new NoSuchElementException();
                }
                obj = bo1Var.get(bo1Var.size() - 1);
            }
            oh2Var = (oh2) obj;
        }
        xc2 xc2VarR = r(oh2Var);
        q(xc2VarR, 1006, new c7(xc2VarR, i6, j6, j7));
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void f(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var) {
        q(s(i6, oh2Var), 1001, new ih1(21));
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void g(int i6, oh2 oh2Var, lh2 lh2Var) {
        xc2 xc2VarS = s(i6, oh2Var);
        q(xc2VarS, 1004, new s70(7, xc2VarS, lh2Var));
    }

    @Override // com.google.android.gms.internal.ads.th2
    public final void h(int i6, oh2 oh2Var, fh2 fh2Var, lh2 lh2Var, IOException iOException, boolean z6) {
        xc2 xc2VarS = s(i6, oh2Var);
        q(xc2VarS, 1003, new xj1(xc2VarS, fh2Var, lh2Var, iOException, z6));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void i(int i6) {
        xc2 xc2VarO = o();
        q(xc2VarO, 4, new ql0(xc2VarO, i6));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void j(no noVar) {
        oh2 oh2Var;
        q((!(noVar instanceof wa2) || (oh2Var = ((wa2) noVar).f10147z) == null) ? o() : r(oh2Var), 10, new rj1(24));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void k(final bt btVar, final bt btVar2, final int i6) {
        if (i6 == 1) {
            this.f3048i = false;
            i6 = 1;
        }
        q72 q72Var = this.f3047g;
        q72Var.getClass();
        ad2 ad2Var = this.f3044d;
        ad2Var.f2668d = ad2.a(q72Var, ad2Var.f2666b, ad2Var.f2669e, ad2Var.f2665a);
        final xc2 xc2VarO = o();
        q(xc2VarO, 11, new eq0(xc2VarO, i6, btVar, btVar2) { // from class: com.google.android.gms.internal.ads.zc2
            public final /* synthetic */ int s;

            {
                this.s = i6;
            }

            @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
            /* renamed from: zza */
            public final void mo6zza(Object obj) {
                ((yc2) obj).p(this.s);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void l(n90 n90Var) {
        xc2 xc2VarT = t();
        q(xc2VarT, 25, new ck1(xc2VarT, n90Var, 18));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void m(no noVar) {
        oh2 oh2Var;
        xc2 xc2VarO = (!(noVar instanceof wa2) || (oh2Var = ((wa2) noVar).f10147z) == null) ? o() : r(oh2Var);
        q(xc2VarO, 10, new ck1(xc2VarO, noVar, 17));
    }

    public final void n(uc2 uc2Var, Looper looper) {
        boolean z6 = true;
        if (this.f3047g != null && !this.f3044d.f2666b.isEmpty()) {
            z6 = false;
        }
        y5.r(z6);
        uc2Var.getClass();
        this.f3047g = uc2Var;
        this.h = this.f3041a.a(looper, null);
        as0 as0Var = this.f3046f;
        this.f3046f = new as0(as0Var.f2839d, looper, as0Var.f2836a, new j00(7, this, uc2Var), as0Var.f2843i);
    }

    public final xc2 o() {
        return r(this.f3044d.f2668d);
    }

    public final xc2 p(zy zyVar, int i6, oh2 oh2Var) {
        oh2 oh2Var2 = true == zyVar.o() ? null : oh2Var;
        long jZzb = this.f3041a.zzb();
        boolean z6 = zyVar.equals(this.f3047g.v()) && i6 == this.f3047g.h();
        long jV = 0;
        if (oh2Var2 == null || !oh2Var2.b()) {
            if (z6) {
                jV = this.f3047g.s();
            } else if (!zyVar.o()) {
                zyVar.e(i6, this.f3043c, 0L).getClass();
                jV = j31.v(0L);
            }
        } else if (z6 && this.f3047g.e() == oh2Var2.f7770b && this.f3047g.g() == oh2Var2.f7771c) {
            jV = this.f3047g.t();
        }
        return new xc2(jZzb, zyVar, i6, oh2Var2, jV, this.f3047g.v(), this.f3047g.h(), this.f3044d.f2668d, this.f3047g.t(), this.f3047g.u());
    }

    public final void q(xc2 xc2Var, int i6, eq0 eq0Var) {
        this.f3045e.put(i6, xc2Var);
        as0 as0Var = this.f3046f;
        as0Var.c(i6, eq0Var);
        as0Var.b();
    }

    public final xc2 r(oh2 oh2Var) {
        this.f3047g.getClass();
        zy zyVar = oh2Var == null ? null : (zy) this.f3044d.f2667c.get(oh2Var);
        if (oh2Var != null && zyVar != null) {
            return p(zyVar, zyVar.n(oh2Var.f7769a, this.f3042b).f6182c, oh2Var);
        }
        int iH = this.f3047g.h();
        zy zyVarV = this.f3047g.v();
        if (iH >= zyVarV.c()) {
            zyVarV = zy.f11601a;
        }
        return p(zyVarV, iH, null);
    }

    public final xc2 s(int i6, oh2 oh2Var) {
        q72 q72Var = this.f3047g;
        q72Var.getClass();
        if (oh2Var != null) {
            return ((zy) this.f3044d.f2667c.get(oh2Var)) != null ? r(oh2Var) : p(zy.f11601a, i6, oh2Var);
        }
        zy zyVarV = q72Var.v();
        if (i6 >= zyVarV.c()) {
            zyVarV = zy.f11601a;
        }
        return p(zyVarV, i6, null);
    }

    public final xc2 t() {
        return r(this.f3044d.f2670f);
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zza() {
        q(o(), 13, new ih1(17));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzb() {
        q(o(), 3, new rj1(22));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzc() {
        q(o(), 7, new sj1(18));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzd() {
        q(o(), 1, new ov1(12));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zze() {
        q(o(), 14, new iu1(20));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzf() {
        q(o(), 5, new sj1(19));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzg() {
        q(o(), 12, new iu1(16));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzi() {
        q(o(), 6, new iu1(18));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzl() {
        q(o(), -1, new aa1(20));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzn() {
        q(t(), 23, new aa1(19));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzo() {
        q(t(), 24, new ov1(15));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzp() {
        q72 q72Var = this.f3047g;
        q72Var.getClass();
        ad2 ad2Var = this.f3044d;
        ad2Var.f2668d = ad2.a(q72Var, ad2Var.f2666b, ad2Var.f2669e, ad2Var.f2665a);
        ad2Var.c(q72Var.v());
        q(o(), 0, new iu1(17));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzq() {
        q(o(), 2, new yz1(10));
    }

    @Override // com.google.android.gms.internal.ads.bs
    public final void zzs() {
        q(t(), 22, new sj1(17));
    }
}
