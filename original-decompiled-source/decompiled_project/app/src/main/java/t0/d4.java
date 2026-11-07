package t0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import x.o;

/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    public float f25641a;

    /* renamed from: b, reason: collision with root package name */
    public float f25642b;

    /* renamed from: c, reason: collision with root package name */
    public float f25643c;

    /* renamed from: d, reason: collision with root package name */
    public float f25644d;

    /* renamed from: e, reason: collision with root package name */
    public final s.b<f3.h, s.o> f25645e;

    /* renamed from: f, reason: collision with root package name */
    public x.k f25646f;

    /* renamed from: g, reason: collision with root package name */
    public x.k f25647g;

    public d4(float f10, float f11, float f12, float f13) {
        this.f25641a = f10;
        this.f25642b = f11;
        this.f25643c = f12;
        this.f25644d = f13;
        this.f25645e = new s.b<>(new f3.h(f10), s.p2.f23870c, null, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(x.k kVar, vg.c cVar) throws Throwable {
        b4 b4Var;
        d4 d4Var;
        s.b<f3.h, s.o> bVar = this.f25645e;
        if (cVar instanceof b4) {
            b4Var = (b4) cVar;
            int i10 = b4Var.f25527e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b4Var.f25527e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b4Var = new b4(this, cVar);
            }
        }
        Object obj = b4Var.f25525c;
        ug.a aVar = ug.a.f29706a;
        int i11 = b4Var.f25527e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = b4Var.f25524b;
            d4Var = b4Var.f25523a;
            try {
                pg.q.b(obj);
                d4Var.f25646f = kVar;
                return pg.f0.f21461a;
            } catch (Throwable th2) {
                th = th2;
                d4Var.f25646f = kVar;
                throw th;
            }
        }
        pg.q.b(obj);
        float f10 = kVar instanceof o.b ? this.f25642b : kVar instanceof x.i ? this.f25643c : kVar instanceof x.e ? this.f25644d : this.f25641a;
        this.f25647g = kVar;
        try {
            if (!f3.h.a(((f3.h) bVar.f23656e.getValue()).f8817a, f10)) {
                x.k kVar2 = this.f25646f;
                b4Var.f25523a = this;
                b4Var.f25524b = kVar;
                b4Var.f25527e = 1;
                if (u0.g0.a(bVar, f10, kVar2, kVar, b4Var) == aVar) {
                    return aVar;
                }
            }
            d4Var = this;
            d4Var.f25646f = kVar;
            return pg.f0.f21461a;
        } catch (Throwable th3) {
            th = th3;
            d4Var = this;
            d4Var.f25646f = kVar;
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vg.c cVar) throws Throwable {
        c4 c4Var;
        d4 d4Var;
        if (cVar instanceof c4) {
            c4Var = (c4) cVar;
            int i10 = c4Var.f25581d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                c4Var.f25581d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                c4Var = new c4(this, cVar);
            }
        }
        Object obj = c4Var.f25579b;
        ug.a aVar = ug.a.f29706a;
        int i11 = c4Var.f25581d;
        if (i11 == 0) {
            pg.q.b(obj);
            x.k kVar = this.f25647g;
            float f10 = kVar instanceof o.b ? this.f25642b : kVar instanceof x.i ? this.f25643c : kVar instanceof x.e ? this.f25644d : this.f25641a;
            s.b<f3.h, s.o> bVar = this.f25645e;
            if (!f3.h.a(((f3.h) bVar.f23656e.getValue()).f8817a, f10)) {
                try {
                    f3.h hVar = new f3.h(f10);
                    c4Var.f25578a = this;
                    c4Var.f25581d = 1;
                    if (bVar.f(hVar, c4Var) == aVar) {
                        return aVar;
                    }
                    d4Var = this;
                    d4Var.f25646f = d4Var.f25647g;
                } catch (Throwable th2) {
                    th = th2;
                    d4Var = this;
                    d4Var.f25646f = d4Var.f25647g;
                    throw th;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d4Var = c4Var.f25578a;
            try {
                pg.q.b(obj);
                d4Var.f25646f = d4Var.f25647g;
            } catch (Throwable th3) {
                th = th3;
                d4Var.f25646f = d4Var.f25647g;
                throw th;
            }
        }
        return pg.f0.f21461a;
    }
}
