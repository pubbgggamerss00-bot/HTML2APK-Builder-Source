package u0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t0.gb;
import t0.ib;
import x0.u3;

/* loaded from: classes.dex */
public final class a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final k3.f f28941a;

    /* renamed from: b, reason: collision with root package name */
    public final gb f28942b;

    /* renamed from: c, reason: collision with root package name */
    public final s.l<Float> f28943c;

    /* renamed from: d, reason: collision with root package name */
    public final eh.l<T, Boolean> f28944d;

    /* renamed from: g, reason: collision with root package name */
    public final x0.x1 f28947g;

    /* renamed from: k, reason: collision with root package name */
    public final x0.u1 f28951k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.x1 f28952l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.x1 f28953m;

    /* renamed from: n, reason: collision with root package name */
    public final u f28954n;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f28945e = new i0();

    /* renamed from: f, reason: collision with root package name */
    public final x f28946f = new x(this);

    /* renamed from: h, reason: collision with root package name */
    public final x0.g0 f28948h = bg.b.d(new g2.q1(this, 1));

    /* renamed from: i, reason: collision with root package name */
    public final x0.g0 f28949i = bg.b.d(new v(this));

    /* renamed from: j, reason: collision with root package name */
    public final x0.u1 f28950j = new x0.u1(Float.NaN);

    public a0(ib ibVar, k3.f fVar, gb gbVar, s.l lVar, eh.l lVar2) {
        this.f28941a = fVar;
        this.f28942b = gbVar;
        this.f28943c = lVar;
        this.f28944d = lVar2;
        this.f28947g = bg.b.h(ibVar);
        bg.b.e(new y(this), u3.f31923a);
        this.f28951k = new x0.u1(CropImageView.DEFAULT_ASPECT_RATIO);
        this.f28952l = bg.b.h(null);
        this.f28953m = bg.b.h(new o0(qg.a0.f22708a));
        this.f28954n = new u(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, t.b1 b1Var, n nVar, vg.c cVar) {
        s sVar;
        a0<T> a0Var;
        T tC;
        T tC2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i10 = sVar.f29135d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f29135d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(this, cVar);
            }
        }
        Object obj2 = sVar.f29133b;
        ug.a aVar = ug.a.f29706a;
        int i11 = sVar.f29135d;
        if (i11 == 0) {
            pg.q.b(obj2);
            if (e().e(obj)) {
                try {
                    i0 i0Var = this.f28945e;
                    t tVar = new t(this, obj, nVar, null);
                    sVar.f29132a = this;
                    sVar.f29135d = 1;
                    try {
                        i0Var.getClass();
                        if (ph.j0.c(new j0(b1Var, i0Var, tVar, null), sVar) == aVar) {
                            return aVar;
                        }
                        a0Var = this;
                        a0Var.i(null);
                        x0.u1 u1Var = a0Var.f28950j;
                        tC2 = a0Var.e().c(u1Var.getFloatValue());
                        if (tC2 != null) {
                            a0Var.h(tC2);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a0Var = this;
                        a0Var.i(null);
                        x0.u1 u1Var2 = a0Var.f28950j;
                        tC = a0Var.e().c(u1Var2.getFloatValue());
                        if (tC != null && Math.abs(u1Var2.getFloatValue() - a0Var.e().d(tC)) <= 0.5f && a0Var.f28944d.invoke(tC).booleanValue()) {
                            a0Var.h(tC);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                h(obj);
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = sVar.f29132a;
            try {
                pg.q.b(obj2);
                a0Var.i(null);
                x0.u1 u1Var3 = a0Var.f28950j;
                tC2 = a0Var.e().c(u1Var3.getFloatValue());
                if (tC2 != null && Math.abs(u1Var3.getFloatValue() - a0Var.e().d(tC2)) <= 0.5f && a0Var.f28944d.invoke(tC2).booleanValue()) {
                    a0Var.h(tC2);
                }
            } catch (Throwable th4) {
                th = th4;
                a0Var.i(null);
                x0.u1 u1Var22 = a0Var.f28950j;
                tC = a0Var.e().c(u1Var22.getFloatValue());
                if (tC != null) {
                    a0Var.h(tC);
                }
                throw th;
            }
        }
        return pg.f0.f21461a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(t.b1 b1Var, w wVar, vg.c cVar) throws Throwable {
        q qVar;
        a0<T> a0Var;
        i0 i0Var;
        r rVar;
        T tC;
        T tC2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i10 = qVar.f29118d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f29118d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(this, cVar);
            }
        }
        Object obj = qVar.f29116b;
        ug.a aVar = ug.a.f29706a;
        int i11 = qVar.f29118d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = qVar.f29115a;
            try {
                pg.q.b(obj);
                c0<T> c0VarE = a0Var.e();
                x0.u1 u1Var = a0Var.f28950j;
                tC2 = c0VarE.c(u1Var.getFloatValue());
                if (tC2 != null && Math.abs(u1Var.getFloatValue() - a0Var.e().d(tC2)) <= 0.5f && a0Var.f28944d.invoke(tC2).booleanValue()) {
                    a0Var.h(tC2);
                }
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                th = th2;
                c0<T> c0VarE2 = a0Var.e();
                x0.u1 u1Var2 = a0Var.f28950j;
                tC = c0VarE2.c(u1Var2.getFloatValue());
                if (tC != null && Math.abs(u1Var2.getFloatValue() - a0Var.e().d(tC)) <= 0.5f && a0Var.f28944d.invoke(tC).booleanValue()) {
                    a0Var.h(tC);
                }
                throw th;
            }
        }
        pg.q.b(obj);
        try {
            i0Var = this.f28945e;
            rVar = new r(wVar, null, this);
            qVar.f29115a = this;
            qVar.f29118d = 1;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            i0Var.getClass();
            if (ph.j0.c(new j0(b1Var, i0Var, rVar, null), qVar) == aVar) {
                return aVar;
            }
            a0Var = this;
            c0<T> c0VarE3 = a0Var.e();
            x0.u1 u1Var3 = a0Var.f28950j;
            tC2 = c0VarE3.c(u1Var3.getFloatValue());
            if (tC2 != null) {
                a0Var.h(tC2);
            }
            return pg.f0.f21461a;
        } catch (Throwable th4) {
            th = th4;
            a0Var = this;
            c0<T> c0VarE22 = a0Var.e();
            x0.u1 u1Var22 = a0Var.f28950j;
            tC = c0VarE22.c(u1Var22.getFloatValue());
            if (tC != null) {
                a0Var.h(tC);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(float f10, float f11, Object obj) {
        c0<T> c0VarE = e();
        float fD = c0VarE.d(obj);
        float fFloatValue = ((Number) this.f28942b.invoke()).floatValue();
        if (fD != f10 && !Float.isNaN(fD)) {
            k3.f fVar = this.f28941a;
            if (fD < f10) {
                if (f11 >= fFloatValue) {
                    T tB = c0VarE.b(f10, true);
                    kotlin.jvm.internal.r.b(tB);
                    return tB;
                }
                T tB2 = c0VarE.b(f10, true);
                kotlin.jvm.internal.r.b(tB2);
                if (f10 >= Math.abs(Math.abs(((Number) fVar.invoke(Float.valueOf(Math.abs(c0VarE.d(tB2) - fD)))).floatValue()) + fD)) {
                    return tB2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    T tB3 = c0VarE.b(f10, false);
                    kotlin.jvm.internal.r.b(tB3);
                    return tB3;
                }
                T tB4 = c0VarE.b(f10, false);
                kotlin.jvm.internal.r.b(tB4);
                float fAbs = Math.abs(fD - Math.abs(((Number) fVar.invoke(Float.valueOf(Math.abs(fD - c0VarE.d(tB4))))).floatValue()));
                if (f10 >= CropImageView.DEFAULT_ASPECT_RATIO ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return tB4;
                }
            }
        }
        return obj;
    }

    public final float d(float f10) {
        float f11 = f(f10);
        x0.u1 u1Var = this.f28950j;
        float floatValue = Float.isNaN(u1Var.getFloatValue()) ? CropImageView.DEFAULT_ASPECT_RATIO : u1Var.getFloatValue();
        u1Var.e(f11);
        return f11 - floatValue;
    }

    public final c0<T> e() {
        return (c0) this.f28953m.getValue();
    }

    public final float f(float f10) {
        x0.u1 u1Var = this.f28950j;
        return jh.j.l((Float.isNaN(u1Var.getFloatValue()) ? CropImageView.DEFAULT_ASPECT_RATIO : u1Var.getFloatValue()) + f10, e().a(), e().f());
    }

    public final float g() {
        x0.u1 u1Var = this.f28950j;
        if (Float.isNaN(u1Var.getFloatValue())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return u1Var.getFloatValue();
    }

    public final void h(T t3) {
        this.f28947g.setValue(t3);
    }

    public final void i(T t3) {
        this.f28952l.setValue(t3);
    }
}
