package v;

import j2.k5;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final float f30087a = ((float) 0.125d) / 18;

    /* JADX WARN: Path cross not found for [B:32:0x00c4, B:38:0x00e0], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:23:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c2.c cVar, c2.b0 b0Var, c2.t tVar, vg.a aVar) {
        k kVar;
        kotlin.jvm.internal.f0 f0Var;
        g2 g2Var;
        int i10;
        c2.t tVar2;
        k kVar2;
        float f10;
        c2.c cVar2;
        Object objC1;
        k kVar3;
        Object obj;
        int size;
        int i11;
        Object obj2;
        c2.b0 b0Var2;
        int size2;
        int i12;
        if (aVar instanceof k) {
            kVar = (k) aVar;
            int i13 = kVar.f29963h;
            if ((i13 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f29963h = i13 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(aVar);
            }
        }
        Object obj3 = kVar.f29962g;
        ug.a aVar2 = ug.a.f29706a;
        int i14 = kVar.f29963h;
        int i15 = 1;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            float f11 = kVar.f29961f;
            int i16 = kVar.f29960e;
            g2 g2Var2 = kVar.f29959d;
            kotlin.jvm.internal.f0 f0Var2 = kVar.f29958c;
            c2.t tVar3 = kVar.f29957b;
            c2.c cVar3 = kVar.f29956a;
            pg.q.b(obj3);
            k kVar4 = kVar;
            f10 = f11;
            cVar2 = cVar3;
            kotlin.jvm.internal.f0 f0Var3 = f0Var2;
            g2Var = g2Var2;
            k kVar5 = kVar4;
            ?? r12 = ((c2.r) obj3).f4687a;
            int size3 = r12.size();
            int i17 = 0;
            while (true) {
                if (i17 < size3) {
                    kVar3 = kVar5;
                    obj = null;
                    break;
                }
                obj = r12.get(i17);
                kVar3 = kVar5;
                if (b0.a0.b(((c2.b0) obj).f4593a, f0Var3.f16326a)) {
                    break;
                }
                i17++;
                kVar5 = kVar3;
            }
            c2.b0 b0Var3 = (c2.b0) obj;
            if (b0Var3 == null && !c2.s.c(b0Var3)) {
                if ((g2Var.a(b0Var3, f10) & 9223372034707292159L) != 9205357640488583168L) {
                    i10 = 1;
                }
                size2 = r12.size();
                for (i12 = 0; i12 < size2; i12++) {
                    if (((c2.b0) r12.get(i12)).f4596d) {
                        kVar2 = kVar3;
                        tVar2 = tVar3;
                        f0Var = f0Var3;
                        i15 = 1;
                        kVar2.f29956a = cVar2;
                        kVar2.f29957b = tVar2;
                        kVar2.f29958c = f0Var;
                        kVar2.f29959d = g2Var;
                        kVar2.f29960e = i10;
                        kVar2.f29961f = f10;
                        kVar2.f29963h = i15;
                        objC1 = cVar2.C1(tVar2, kVar2);
                        if (objC1 != aVar2) {
                            return aVar2;
                        }
                        kotlin.jvm.internal.f0 f0Var4 = f0Var;
                        tVar3 = tVar2;
                        obj3 = objC1;
                        f0Var3 = f0Var4;
                        int i18 = i10;
                        kVar5 = kVar2;
                        i16 = i18;
                        ?? r122 = ((c2.r) obj3).f4687a;
                        int size32 = r122.size();
                        int i172 = 0;
                        while (true) {
                            if (i172 < size32) {
                            }
                            i172++;
                            kVar5 = kVar3;
                        }
                        c2.b0 b0Var32 = (c2.b0) obj;
                        if (b0Var32 == null) {
                        }
                        size = r122.size();
                        i11 = 0;
                        while (true) {
                            if (i11 < size) {
                            }
                            i11++;
                        }
                        b0Var2 = (c2.b0) obj2;
                        if (b0Var2 != null) {
                        }
                    }
                }
                return Boolean.valueOf(i10 == 0);
            }
            size = r122.size();
            i11 = 0;
            while (true) {
                if (i11 < size) {
                    obj2 = null;
                    break;
                }
                obj2 = r122.get(i11);
                if (((c2.b0) obj2).f4596d) {
                    break;
                }
                i11++;
            }
            b0Var2 = (c2.b0) obj2;
            if (b0Var2 != null) {
                return Boolean.valueOf(i16 != 0);
            }
            f0Var3.f16326a = b0Var2.f4593a;
            i10 = i16;
            size2 = r122.size();
            while (i12 < size2) {
            }
            return Boolean.valueOf(i10 == 0);
        }
        pg.q.b(obj3);
        if (c0.a(cVar)) {
            return Boolean.FALSE;
        }
        kotlin.jvm.internal.f0 f0Var5 = new kotlin.jvm.internal.f0();
        f0Var5.f16326a = b0Var.f4593a;
        float f12 = f(cVar.getViewConfiguration(), b0Var.f4601i);
        f0Var = f0Var5;
        g2Var = new g2(0L, null);
        i10 = 0;
        tVar2 = tVar;
        kVar2 = kVar;
        f10 = f12;
        cVar2 = cVar;
        kVar2.f29956a = cVar2;
        kVar2.f29957b = tVar2;
        kVar2.f29958c = f0Var;
        kVar2.f29959d = g2Var;
        kVar2.f29960e = i10;
        kVar2.f29961f = f10;
        kVar2.f29963h = i15;
        objC1 = cVar2.C1(tVar2, kVar2);
        if (objC1 != aVar2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        if (p1.c.b(c2.s.e(r11, true), 0) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0064 -> B:22:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(c2.c cVar, long j10, vg.c cVar2) {
        l lVar;
        kotlin.jvm.internal.f0 f0Var;
        c2.c cVar3;
        Object objC1;
        Object obj;
        Object obj2;
        if (cVar2 instanceof l) {
            lVar = (l) cVar2;
            int i10 = lVar.f29983d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                lVar.f29983d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                lVar = new l(cVar2);
            }
        }
        Object obj3 = lVar.f29982c;
        ug.a aVar = ug.a.f29706a;
        int i11 = lVar.f29983d;
        if (i11 == 0) {
            pg.q.b(obj3);
            if (!e(cVar.M(), j10)) {
                f0Var = new kotlin.jvm.internal.f0();
                f0Var.f16326a = j10;
                cVar3 = cVar;
                lVar.f29980a = cVar3;
                lVar.f29981b = f0Var;
                lVar.f29983d = 1;
                objC1 = cVar3.C1(c2.t.f4695b, lVar);
                if (objC1 != aVar) {
                }
            }
            return null;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.jvm.internal.f0 f0Var2 = lVar.f29981b;
        c2.c cVar4 = lVar.f29980a;
        pg.q.b(obj3);
        kotlin.jvm.internal.f0 f0Var3 = f0Var2;
        cVar3 = cVar4;
        c2.r rVar = (c2.r) obj3;
        ?? r52 = rVar.f4687a;
        int size = r52.size();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 < size) {
                obj = null;
                break;
            }
            obj = r52.get(i13);
            if (b0.a0.b(((c2.b0) obj).f4593a, f0Var3.f16326a)) {
                break;
            }
            i13++;
        }
        c2.b0 b0Var = (c2.b0) obj;
        if (b0Var == null) {
            if (c2.s.c(b0Var)) {
                ?? r22 = rVar.f4687a;
                int size2 = r22.size();
                while (true) {
                    if (i12 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = r22.get(i12);
                    if (((c2.b0) obj2).f4596d) {
                        break;
                    }
                    i12++;
                }
                c2.b0 b0Var2 = (c2.b0) obj2;
                if (b0Var2 != null) {
                    f0Var3.f16326a = b0Var2.f4593a;
                    f0Var = f0Var3;
                    lVar.f29980a = cVar3;
                    lVar.f29981b = f0Var;
                    lVar.f29983d = 1;
                    objC1 = cVar3.C1(c2.t.f4695b, lVar);
                    if (objC1 != aVar) {
                        return aVar;
                    }
                    kotlin.jvm.internal.f0 f0Var4 = f0Var;
                    obj3 = objC1;
                    f0Var3 = f0Var4;
                }
            }
            c2.r rVar2 = (c2.r) obj3;
            ?? r522 = rVar2.f4687a;
            int size3 = r522.size();
            int i122 = 0;
            int i132 = 0;
            while (true) {
                if (i132 < size3) {
                }
                i132++;
            }
            c2.b0 b0Var3 = (c2.b0) obj;
            if (b0Var3 == null) {
                b0Var3 = null;
            }
        }
        if (b0Var3 == null || b0Var3.b()) {
            return null;
        }
        return b0Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.g0] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, c2.b0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c2.c cVar, long j10, vg.a aVar) {
        m mVar;
        Object obj;
        kotlin.jvm.internal.b0 b0Var;
        c2.b0 b0Var2;
        if (aVar instanceof m) {
            mVar = (m) aVar;
            int i10 = mVar.f29990e;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f29990e = i10 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(aVar);
            }
        }
        Object obj2 = mVar.f29989d;
        Object obj3 = ug.a.f29706a;
        int i11 = mVar.f29990e;
        try {
            if (i11 == 0) {
                pg.q.b(obj2);
                if (!e(cVar.M(), j10)) {
                    ?? r12 = cVar.M().f4687a;
                    int size = r12.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r12.get(i12);
                        if (b0.a0.b(((c2.b0) obj).f4593a, j10)) {
                            break;
                        }
                        i12++;
                    }
                    ?? r11 = (c2.b0) obj;
                    if (r11 != 0) {
                        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
                        kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                        g0Var2.f16327a = r11;
                        long jB = cVar.getViewConfiguration().b();
                        kotlin.jvm.internal.b0 b0Var3 = new kotlin.jvm.internal.b0();
                        eh.p nVar = new n(b0Var3, g0Var2, g0Var, null);
                        mVar.f29986a = r11;
                        mVar.f29987b = g0Var;
                        mVar.f29988c = b0Var3;
                        mVar.f29990e = 1;
                        if (cVar.y1(jB, nVar, mVar) == obj3) {
                            return obj3;
                        }
                        b0Var = b0Var3;
                        j10 = g0Var;
                        b0Var2 = r11;
                    }
                }
                return null;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = mVar.f29988c;
            kotlin.jvm.internal.g0 g0Var3 = mVar.f29987b;
            c2.b0 b0Var4 = mVar.f29986a;
            pg.q.b(obj2);
            j10 = g0Var3;
            b0Var2 = b0Var4;
            if (b0Var.f16318a) {
                c2.b0 b0Var5 = (c2.b0) j10.f16327a;
                return b0Var5 == null ? b0Var2 : b0Var5;
            }
            return null;
        } catch (c2.v unused) {
            c2.b0 b0Var6 = (c2.b0) j10.f16327a;
            return b0Var6 == null ? b0Var2 : b0Var6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(c2.c cVar, long j10, eh.l lVar, vg.a aVar) {
        t tVar;
        c2.b0 b0Var;
        if (aVar instanceof t) {
            tVar = (t) aVar;
            int i10 = tVar.f30082d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                tVar.f30082d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                tVar = new t(aVar);
            }
        }
        Object objB = tVar.f30081c;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = tVar.f30082d;
        if (i11 == 0) {
            pg.q.b(objB);
            tVar.f30079a = cVar;
            tVar.f30080b = lVar;
            tVar.f30082d = 1;
            objB = b(cVar, j10, tVar);
            if (objB == aVar2) {
            }
            b0Var = (c2.b0) objB;
            if (b0Var == null) {
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eh.l lVar2 = tVar.f30080b;
            c2.c cVar2 = tVar.f30079a;
            pg.q.b(objB);
            lVar = lVar2;
            cVar = cVar2;
            b0Var = (c2.b0) objB;
            if (b0Var == null) {
                if (c2.s.c(b0Var)) {
                    return Boolean.TRUE;
                }
                lVar.invoke(b0Var);
                j10 = b0Var.f4593a;
                tVar.f30079a = cVar;
                tVar.f30080b = lVar;
                tVar.f30082d = 1;
                objB = b(cVar, j10, tVar);
                if (objB == aVar2) {
                    return aVar2;
                }
                b0Var = (c2.b0) objB;
                if (b0Var == null) {
                    return Boolean.FALSE;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean e(c2.r rVar, long j10) {
        Object obj;
        ?? r62 = rVar.f4687a;
        int size = r62.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = r62.get(i10);
            if (b0.a0.b(((c2.b0) obj).f4593a, j10)) {
                break;
            }
            i10++;
        }
        c2.b0 b0Var = (c2.b0) obj;
        if (b0Var != null && b0Var.f4596d) {
            z10 = true;
        }
        return true ^ z10;
    }

    public static final float f(k5 k5Var, int i10) {
        return i10 == 2 ? k5Var.f() * f30087a : k5Var.f();
    }
}
