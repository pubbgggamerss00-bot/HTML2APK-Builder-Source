package androidx.recyclerview.widget;

import androidx.recyclerview.widget.v;
import p.b1;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final b1<v.a0, a> f2534a = new b1<>();

    /* renamed from: b, reason: collision with root package name */
    public final p.q<v.a0> f2535b = new p.q<>();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final x3.c f2536d = new x3.c(20);

        /* renamed from: a, reason: collision with root package name */
        public int f2537a;

        /* renamed from: b, reason: collision with root package name */
        public v.i.b f2538b;

        /* renamed from: c, reason: collision with root package name */
        public v.i.b f2539c;

        public static a a() {
            a aVar = (a) f2536d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    public final void a(v.a0 a0Var, v.i.b bVar) {
        b1<v.a0, a> b1Var = this.f2534a;
        a aVarA = b1Var.get(a0Var);
        if (aVarA == null) {
            aVarA = a.a();
            b1Var.put(a0Var, aVarA);
        }
        aVarA.f2539c = bVar;
        aVarA.f2537a |= 8;
    }

    public final v.i.b b(v.a0 a0Var, int i10) {
        a aVarK;
        v.i.b bVar;
        b1<v.a0, a> b1Var = this.f2534a;
        int iF = b1Var.f(a0Var);
        if (iF >= 0 && (aVarK = b1Var.k(iF)) != null) {
            int i11 = aVarK.f2537a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                aVarK.f2537a = i12;
                if (i10 == 4) {
                    bVar = aVarK.f2538b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVarK.f2539c;
                }
                if ((i12 & 12) == 0) {
                    b1Var.i(iF);
                    aVarK.f2537a = 0;
                    aVarK.f2538b = null;
                    aVarK.f2539c = null;
                    a.f2536d.b(aVarK);
                }
                return bVar;
            }
        }
        return null;
    }

    public final void c(v.a0 a0Var) {
        a aVar = this.f2534a.get(a0Var);
        if (aVar == null) {
            return;
        }
        aVar.f2537a &= -2;
    }

    public final void d(v.a0 a0Var) {
        p.q<v.a0> qVar = this.f2535b;
        int iF = qVar.f() - 1;
        while (true) {
            if (iF < 0) {
                break;
            }
            if (a0Var == qVar.g(iF)) {
                Object[] objArr = qVar.f20704c;
                Object obj = objArr[iF];
                Object obj2 = p.r.f20709a;
                if (obj != obj2) {
                    objArr[iF] = obj2;
                    qVar.f20702a = true;
                }
            } else {
                iF--;
            }
        }
        a aVarRemove = this.f2534a.remove(a0Var);
        if (aVarRemove != null) {
            aVarRemove.f2537a = 0;
            aVarRemove.f2538b = null;
            aVarRemove.f2539c = null;
            a.f2536d.b(aVarRemove);
        }
    }
}
