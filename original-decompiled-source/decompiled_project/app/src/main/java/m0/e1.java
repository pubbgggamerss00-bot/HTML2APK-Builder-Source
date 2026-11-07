package m0;

import j2.k5;
import java.util.concurrent.CancellationException;
import m0.e0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class e1 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c2.c cVar, vg.a aVar) {
        x0 x0Var;
        int size;
        int i10;
        if (aVar instanceof x0) {
            x0Var = (x0) aVar;
            int i11 = x0Var.f17545c;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                x0Var.f17545c = i11 - PKIFailureInfo.systemUnavail;
            } else {
                x0Var = new x0(aVar);
            }
        }
        Object objC1 = x0Var.f17544b;
        ug.a aVar2 = ug.a.f29706a;
        int i12 = x0Var.f17545c;
        if (i12 == 0) {
            pg.q.b(objC1);
            c2.t tVar = c2.t.f4695b;
            x0Var.f17543a = cVar;
            x0Var.f17545c = 1;
            objC1 = cVar.C1(tVar, x0Var);
            if (objC1 == aVar2) {
            }
            c2.r rVar = (c2.r) objC1;
            ?? r22 = rVar.f4687a;
            size = r22.size();
            i10 = 0;
            while (i10 < size) {
            }
            return rVar;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = x0Var.f17543a;
        pg.q.b(objC1);
        c2.r rVar2 = (c2.r) objC1;
        ?? r222 = rVar2.f4687a;
        size = r222.size();
        i10 = 0;
        while (i10 < size) {
            if (c2.s.a((c2.b0) r222.get(i10))) {
                i10++;
            } else {
                c2.t tVar2 = c2.t.f4695b;
                x0Var.f17543a = cVar;
                x0Var.f17545c = 1;
                objC1 = cVar.C1(tVar2, x0Var);
                if (objC1 == aVar2) {
                    return aVar2;
                }
                c2.r rVar22 = (c2.r) objC1;
                ?? r2222 = rVar22.f4687a;
                size = r2222.size();
                i10 = 0;
                while (i10 < size) {
                }
            }
        }
        return rVar22;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c2.c cVar, q qVar, m mVar, c2.r rVar, vg.a aVar) {
        y0 y0Var;
        c2.b0 b0Var;
        e0 e0Var;
        c2.c cVar2;
        kotlin.jvm.internal.b0 b0Var2;
        int size;
        if (aVar instanceof y0) {
            y0Var = (y0) aVar;
            int i10 = y0Var.f17584e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                y0Var.f17584e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                y0Var = new y0(aVar);
            }
        }
        Object objD = y0Var.f17583d;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = y0Var.f17584e;
        int i12 = 0;
        if (i11 == 0) {
            pg.q.b(objD);
            k5 k5Var = mVar.f17410a;
            c2.b0 b0Var3 = mVar.f17412c;
            c2.b0 b0Var4 = (c2.b0) rVar.f4687a.get(0);
            if (b0Var3 == null || b0Var4.f4594b - b0Var3.f4594b >= k5Var.a()) {
                mVar.f17411b = 1;
                mVar.f17412c = b0Var4;
                b0Var = (c2.b0) rVar.f4687a.get(0);
                int i13 = mVar.f17411b;
                e0Var = i13 == 1 ? i13 != 2 ? e0.a.f17304c : e0.a.f17303b : e0.a.f17302a;
                if (qVar.b(b0Var.f4595c, e0Var)) {
                    kotlin.jvm.internal.b0 b0Var5 = new kotlin.jvm.internal.b0();
                    b0Var5.f16318a = !e0Var.equals(r15);
                    long j10 = b0Var.f4593a;
                    z0 z0Var = new z0(qVar, e0Var, b0Var5);
                    y0Var.f17580a = cVar;
                    y0Var.f17581b = qVar;
                    y0Var.f17582c = b0Var5;
                    y0Var.f17584e = 2;
                    objD = v.u.d(cVar, j10, z0Var, y0Var);
                    if (objD == aVar2) {
                        return aVar2;
                    }
                    cVar2 = cVar;
                    b0Var2 = b0Var5;
                    if (((Boolean) objD).booleanValue()) {
                        ?? r11 = cVar2.M().f4687a;
                        size = r11.size();
                        while (i12 < size) {
                        }
                    }
                    qVar.c();
                }
            } else {
                if (p1.c.c(p1.c.f(b0Var3.f4595c, b0Var4.f4595c)) < v.u.f(k5Var, b0Var3.f4601i)) {
                    mVar.f17411b++;
                }
                mVar.f17412c = b0Var4;
                b0Var = (c2.b0) rVar.f4687a.get(0);
                int i132 = mVar.f17411b;
                if (i132 == 1) {
                }
                if (qVar.b(b0Var.f4595c, e0Var)) {
                }
            }
        } else if (i11 == 1) {
            q qVar2 = y0Var.f17581b;
            c2.c cVar3 = y0Var.f17580a;
            pg.q.b(objD);
            if (((Boolean) objD).booleanValue()) {
                ?? r12 = cVar3.M().f4687a;
                int size2 = r12.size();
                while (i12 < size2) {
                    c2.b0 b0Var6 = (c2.b0) r12.get(i12);
                    if (c2.s.b(b0Var6)) {
                        b0Var6.a();
                    }
                    i12++;
                }
            }
            qVar2.c();
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var2 = y0Var.f17582c;
            qVar = y0Var.f17581b;
            cVar2 = y0Var.f17580a;
            pg.q.b(objD);
            if (((Boolean) objD).booleanValue() && b0Var2.f16318a) {
                ?? r112 = cVar2.M().f4687a;
                size = r112.size();
                while (i12 < size) {
                    c2.b0 b0Var7 = (c2.b0) r112.get(i12);
                    if (c2.s.b(b0Var7)) {
                        b0Var7.a();
                    }
                    i12++;
                }
            }
            qVar.c();
        }
        return pg.f0.f21461a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009d, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c2.c cVar, i0.b3 b3Var, c2.r rVar, vg.a aVar) {
        b1 b1Var;
        c2.b0 b0Var;
        if (aVar instanceof b1) {
            b1Var = (b1) aVar;
            int i10 = b1Var.f17263e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b1Var.f17263e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b1Var = new b1(aVar);
            }
        }
        Object objC = b1Var.f17262d;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = b1Var.f17263e;
        boolean z10 = true;
        try {
            if (i11 == 0) {
                pg.q.b(objC);
                b0Var = (c2.b0) qg.x.B(rVar.f4687a);
                long j10 = b0Var.f4593a;
                b1Var.f17259a = cVar;
                b1Var.f17260b = b3Var;
                b1Var.f17261c = b0Var;
                b1Var.f17263e = 1;
                objC = v.u.c(cVar, j10, b1Var);
                if (objC == aVar2) {
                }
                return aVar2;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b3Var = b1Var.f17260b;
                cVar = b1Var.f17259a;
                pg.q.b(objC);
                if (((Boolean) objC).booleanValue()) {
                    ?? r11 = cVar.M().f4687a;
                    int size = r11.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        c2.b0 b0Var2 = (c2.b0) r11.get(i12);
                        if (c2.s.b(b0Var2)) {
                            b0Var2.a();
                        }
                    }
                    b3Var.b();
                } else {
                    b3Var.onCancel();
                }
                return pg.f0.f21461a;
            }
            c2.b0 b0Var3 = b1Var.f17261c;
            b3Var = b1Var.f17260b;
            c2.c cVar2 = b1Var.f17259a;
            pg.q.b(objC);
            b0Var = b0Var3;
            cVar = cVar2;
            c2.b0 b0Var4 = (c2.b0) objC;
            if (b0Var4 != null) {
                long j11 = b0Var4.f4595c;
                if (p1.c.c(p1.c.f(b0Var.f4595c, j11)) >= v.u.f(cVar.getViewConfiguration(), b0Var.f4601i)) {
                    z10 = false;
                }
                if (z10) {
                    b3Var.a(j11);
                    long j12 = b0Var4.f4593a;
                    c1 c1Var = new c1(b3Var);
                    b1Var.f17259a = cVar;
                    b1Var.f17260b = b3Var;
                    b1Var.f17261c = null;
                    b1Var.f17263e = 2;
                    objC = v.u.d(cVar, j12, c1Var, b1Var);
                }
            }
            return pg.f0.f21461a;
        } catch (CancellationException e10) {
            b3Var.onCancel();
            throw e10;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean d(c2.r rVar) {
        ?? r52 = rVar.f4687a;
        int size = r52.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((c2.b0) r52.get(i10)).f4601i != 2) {
                return false;
            }
        }
        return true;
    }
}
