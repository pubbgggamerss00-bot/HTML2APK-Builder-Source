package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q62 implements b72 {

    /* renamed from: a, reason: collision with root package name */
    public final m62 f8235a;

    /* renamed from: b, reason: collision with root package name */
    public final ed0 f8236b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8237c;

    public q62(ed0 ed0Var, m62 m62Var) {
        w42 w42Var = x42.f10359a;
        this.f8236b = ed0Var;
        this.f8237c = m62Var instanceof g52;
        this.f8235a = m62Var;
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final void a(Object obj) {
        this.f8236b.getClass();
        m72 m72Var = ((j52) obj).zzt;
        if (m72Var.f6963e) {
            m72Var.f6963e = false;
        }
        w42 w42Var = x42.f10359a;
        ((g52) obj).zza.c();
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final boolean b(j52 j52Var, j52 j52Var2) {
        if (!j52Var.zzt.equals(j52Var2.zzt)) {
            return false;
        }
        if (this.f8237c) {
            return ((g52) j52Var).zza.equals(((g52) j52Var2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final void c(Object obj, l42 l42Var, u42 u42Var) {
        this.f8236b.getClass();
        ed0.i(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final int d(j52 j52Var) {
        int iHashCode = j52Var.zzt.hashCode();
        if (!this.f8237c) {
            return iHashCode;
        }
        return ((g52) j52Var).zza.f11175a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final void e(Object obj, y72 y72Var) {
        Iterator itB = ((g52) obj).zza.b();
        if (itB.hasNext()) {
            ((y42) ((Map.Entry) itB.next()).getKey()).zzc();
            throw null;
        }
        m72 m72Var = ((j52) obj).zzt;
        for (int i6 = 0; i6 < m72Var.f6959a; i6++) {
            int i7 = m72Var.f6960b[i6] >>> 3;
            Object obj2 = m72Var.f6961c[i6];
            p42 p42Var = ((q42) y72Var).f8227a;
            if (obj2 instanceof g42) {
                p42Var.F(i7, (g42) obj2);
            } else {
                p42Var.E(i7, (m62) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final void f(Object obj, byte[] bArr, int i6, int i7, x32 x32Var) {
        j52 j52Var = (j52) obj;
        if (j52Var.zzt == m72.f6958f) {
            j52Var.zzt = new m72();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final boolean g(Object obj) {
        ((g52) obj).zza.e();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final int h(j52 j52Var) {
        m72 m72Var = j52Var.zzt;
        int iC = m72Var.f6962d;
        if (iC == -1) {
            iC = 0;
            for (int i6 = 0; i6 < m72Var.f6959a; i6++) {
                int i7 = m72Var.f6960b[i6] >>> 3;
                g42 g42Var = (g42) m72Var.f6961c[i6];
                int iR = p42.r(8);
                int iR2 = p42.r(i7) + p42.r(16);
                int iR3 = p42.r(24);
                int iG = g42Var.g();
                iC += iR + iR + iR2 + androidx.camera.view.g.c(iG, iG, iR3);
            }
            m72Var.f6962d = iC;
        }
        if (this.f8237c) {
            d72 d72Var = ((g52) j52Var).zza.f11175a;
            if (d72Var.f5963t > 0) {
                z42.g(d72Var.d(0));
                throw null;
            }
            Iterator it = d72Var.b().iterator();
            if (it.hasNext()) {
                z42.g((Map.Entry) it.next());
                throw null;
            }
        }
        return iC;
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final void i(Object obj, Object obj2) {
        c72.t(obj, obj2);
        if (this.f8237c) {
            w42 w42Var = x42.f10359a;
            if (((g52) obj2).zza.f11175a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.b72
    public final j52 zze() {
        m62 m62Var = this.f8235a;
        return m62Var instanceof j52 ? ((j52) m62Var).t() : ((e52) m62Var.b()).h();
    }
}
