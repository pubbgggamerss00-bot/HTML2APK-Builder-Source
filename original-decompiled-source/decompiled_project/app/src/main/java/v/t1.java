package v;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.l2;
import t0.cc;
import v.d0;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30086a = new a(3, null);

    @vg.e(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
    public static final class a extends vg.i implements eh.q<u0, p1.c, tg.e<? super pg.f0>, Object> {
        @Override // eh.q
        public final Object b(u0 u0Var, p1.c cVar, tg.e<? super pg.f0> eVar) {
            long j10 = cVar.f21129a;
            return new a(3, eVar).invokeSuspend(pg.f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            pg.q.b(obj);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d A[LOOP:0: B:19:0x004b->B:20:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c2.c cVar, vg.a aVar) {
        x1 x1Var;
        int size;
        int i10;
        int i11;
        int size2;
        if (aVar instanceof x1) {
            x1Var = (x1) aVar;
            int i12 = x1Var.f30121c;
            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                x1Var.f30121c = i12 - PKIFailureInfo.systemUnavail;
            } else {
                x1Var = new x1(aVar);
            }
        }
        Object objC1 = x1Var.f30120b;
        ug.a aVar2 = ug.a.f29706a;
        int i13 = x1Var.f30121c;
        if (i13 == 0) {
            pg.q.b(objC1);
            x1Var.f30119a = cVar;
            x1Var.f30121c = 1;
            objC1 = cVar.C1(c2.t.f4695b, x1Var);
            if (objC1 == aVar2) {
            }
            c2.r rVar = (c2.r) objC1;
            ?? r22 = rVar.f4687a;
            size = r22.size();
            i10 = 0;
            while (i11 < size) {
            }
            ?? r92 = rVar.f4687a;
            size2 = r92.size();
            while (i10 < size2) {
            }
            return pg.f0.f21461a;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = x1Var.f30119a;
        pg.q.b(objC1);
        c2.r rVar2 = (c2.r) objC1;
        ?? r222 = rVar2.f4687a;
        size = r222.size();
        i10 = 0;
        for (i11 = 0; i11 < size; i11++) {
            ((c2.b0) r222.get(i11)).a();
        }
        ?? r922 = rVar2.f4687a;
        size2 = r922.size();
        while (i10 < size2) {
            if (((c2.b0) r922.get(i10)).f4596d) {
                x1Var.f30119a = cVar;
                x1Var.f30121c = 1;
                objC1 = cVar.C1(c2.t.f4695b, x1Var);
                if (objC1 == aVar2) {
                    return aVar2;
                }
                c2.r rVar22 = (c2.r) objC1;
                ?? r2222 = rVar22.f4687a;
                size = r2222.size();
                i10 = 0;
                while (i11 < size) {
                }
                ?? r9222 = rVar22.f4687a;
                size2 = r9222.size();
                while (i10 < size2) {
                }
            } else {
                i10++;
            }
        }
        return pg.f0.f21461a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(c2.c r6, boolean r7, c2.t r8, vg.a r9) {
        /*
            boolean r0 = r9 instanceof v.u1
            if (r0 == 0) goto L13
            r0 = r9
            v.u1 r0 = (v.u1) r0
            int r1 = r0.f30092e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30092e = r1
            goto L18
        L13:
            v.u1 r0 = new v.u1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30091d
            ug.a r1 = ug.a.f29706a
            int r2 = r0.f30092e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r6 = r0.f30090c
            c2.t r7 = r0.f30089b
            c2.c r8 = r0.f30088a
            pg.q.b(r9)
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
            goto L4b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            pg.q.b(r9)
        L3c:
            r0.f30088a = r6
            r0.f30089b = r8
            r0.f30090c = r7
            r0.f30092e = r3
            java.lang.Object r9 = r6.C1(r8, r0)
            if (r9 != r1) goto L4b
            return r1
        L4b:
            c2.r r9 = (c2.r) r9
            r2 = 0
            boolean r4 = f(r9, r7, r2)
            if (r4 == 0) goto L3c
            java.lang.Object r6 = r9.f4687a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v.t1.b(c2.c, boolean, c2.t, vg.a):java.lang.Object");
    }

    public static /* synthetic */ Object c(c2.c cVar, vg.h hVar, int i10) {
        c2.t tVar = c2.t.f4694a;
        boolean z10 = (i10 & 1) != 0;
        if ((i10 & 2) != 0) {
            tVar = c2.t.f4695b;
        }
        return b(cVar, z10, tVar, hVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:18:0x0046). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object d(c2.c r6, c2.t r7, vg.a r8) {
        /*
            boolean r0 = r8 instanceof v.v1
            if (r0 == 0) goto L13
            r0 = r8
            v.v1 r0 = (v.v1) r0
            int r1 = r0.f30104d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30104d = r1
            goto L18
        L13:
            v.v1 r0 = new v.v1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f30103c
            ug.a r1 = ug.a.f29706a
            int r2 = r0.f30104d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            c2.t r6 = r0.f30102b
            c2.c r7 = r0.f30101a
            pg.q.b(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L46
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            pg.q.b(r8)
        L39:
            r0.f30101a = r6
            r0.f30102b = r7
            r0.f30104d = r3
            java.lang.Object r8 = r6.C1(r7, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            c2.r r8 = (c2.r) r8
            r2 = 0
            boolean r4 = f(r8, r2, r3)
            if (r4 == 0) goto L39
            java.lang.Object r6 = r8.f4687a
            java.lang.Object r6 = r6.get(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v.t1.d(c2.c, c2.t, vg.a):java.lang.Object");
    }

    public static Object e(c2.j0 j0Var, cc.a aVar, eh.l lVar, vg.i iVar, int i10) {
        eh.q qVar = aVar;
        if ((i10 & 4) != 0) {
            qVar = f30086a;
        }
        Object objC = ph.j0.c(new z1(j0Var, qVar, null, null, lVar, null), iVar);
        return objC == ug.a.f29706a ? objC : pg.f0.f21461a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean f(c2.r rVar, boolean z10, boolean z11) {
        if (z11) {
            ?? r72 = rVar.f4687a;
            int size = r72.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((c2.b0) r72.get(i10)).f4601i != 2) {
                        break;
                    }
                    i10++;
                } else if ((rVar.f4689c & 33) == 0) {
                    return false;
                }
            }
        }
        ?? r52 = rVar.f4687a;
        int size2 = r52.size();
        int i11 = 0;
        while (true) {
            boolean zA = true;
            if (i11 >= size2) {
                return true;
            }
            c2.b0 b0Var = (c2.b0) r52.get(i11);
            if (!z10) {
                zA = c2.s.a(b0Var);
            } else if (b0Var.b() || b0Var.f4600h || !b0Var.f4596d) {
                zA = false;
            }
            if (!zA) {
                return false;
            }
            i11++;
        }
    }

    public static l2 g(ph.i0 i0Var, ph.s1 s1Var, eh.p pVar) {
        return ph.h.c(i0Var, null, ph.k0.f21556d, new a2(s1Var, pVar, null), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, v.d0$a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(c2.c cVar, c2.t tVar, vg.a aVar) {
        b2 b2Var;
        kotlin.jvm.internal.g0 g0Var;
        if (aVar instanceof b2) {
            b2Var = (b2) aVar;
            int i10 = b2Var.f29786c;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                b2Var.f29786c = i10 - PKIFailureInfo.systemUnavail;
            } else {
                b2Var = new b2(aVar);
            }
        }
        Object obj = b2Var.f29785b;
        Object obj2 = ug.a.f29706a;
        int i11 = b2Var.f29786c;
        try {
            if (i11 == 0) {
                pg.q.b(obj);
                kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                g0Var2.f16327a = d0.a.f29803a;
                long jB = cVar.getViewConfiguration().b();
                eh.p c2Var = new c2(tVar, g0Var2, null);
                b2Var.f29784a = g0Var2;
                b2Var.f29786c = 1;
                if (cVar.y1(jB, c2Var, b2Var) == obj2) {
                    return obj2;
                }
                g0Var = g0Var2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = b2Var.f29784a;
                pg.q.b(obj);
            }
            return g0Var.f16327a;
        } catch (c2.v unused) {
            return d0.c.f29805a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009e -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(c2.c cVar, c2.t tVar, vg.a aVar) {
        d2 d2Var;
        c2.c cVar2;
        c2.t tVar2;
        int size;
        int i10;
        if (aVar instanceof d2) {
            d2Var = (d2) aVar;
            int i11 = d2Var.f29813d;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                d2Var.f29813d = i11 - PKIFailureInfo.systemUnavail;
            } else {
                d2Var = new d2(aVar);
            }
        }
        Object objC1 = d2Var.f29812c;
        ug.a aVar2 = ug.a.f29706a;
        int i12 = d2Var.f29813d;
        if (i12 == 0) {
            pg.q.b(objC1);
            d2Var.f29810a = cVar;
            d2Var.f29811b = tVar;
            d2Var.f29813d = 1;
            objC1 = cVar.C1(tVar, d2Var);
            if (objC1 != aVar2) {
            }
            return aVar2;
        }
        if (i12 == 1) {
            tVar2 = d2Var.f29811b;
            cVar2 = d2Var.f29810a;
            pg.q.b(objC1);
            ?? r15 = ((c2.r) objC1).f4687a;
            size = r15.size();
            while (i10 < size) {
            }
            return r15.get(0);
        }
        if (i12 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tVar2 = d2Var.f29811b;
        cVar2 = d2Var.f29810a;
        pg.q.b(objC1);
        c2.c cVar3 = cVar2;
        tVar = tVar2;
        cVar = cVar3;
        ?? r152 = ((c2.r) objC1).f4687a;
        int size2 = r152.size();
        for (int i13 = 0; i13 < size2; i13++) {
            if (((c2.b0) r152.get(i13)).b()) {
                return null;
            }
        }
        d2Var.f29810a = cVar;
        d2Var.f29811b = tVar;
        d2Var.f29813d = 1;
        objC1 = cVar.C1(tVar, d2Var);
        if (objC1 != aVar2) {
            c2.t tVar3 = tVar;
            cVar2 = cVar;
            tVar2 = tVar3;
            ?? r153 = ((c2.r) objC1).f4687a;
            size = r153.size();
            for (i10 = 0; i10 < size; i10++) {
                if (!c2.s.b((c2.b0) r153.get(i10))) {
                    int size3 = r153.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        c2.b0 b0Var = (c2.b0) r153.get(i14);
                        if (b0Var.b() || c2.s.d(b0Var, cVar2.a(), cVar2.R0())) {
                            return null;
                        }
                    }
                    c2.t tVar4 = c2.t.f4696c;
                    d2Var.f29810a = cVar2;
                    d2Var.f29811b = tVar2;
                    d2Var.f29813d = 2;
                    objC1 = cVar2.C1(tVar4, d2Var);
                }
            }
            return r153.get(0);
        }
        return aVar2;
    }
}
