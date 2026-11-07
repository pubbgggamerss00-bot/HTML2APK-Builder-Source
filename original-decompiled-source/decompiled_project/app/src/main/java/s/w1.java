package s;

import com.yalantis.ucrop.view.CropImageView;
import j1.i;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class w1 {
    public static final Object a(float f10, float f11, float f12, l lVar, eh.p pVar, vg.c cVar) {
        o2 o2Var = p2.f23868a;
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        Float f15 = new Float(f12);
        eh.l<T, V> lVar2 = o2Var.f23857a;
        s sVarC = (s) lVar2.invoke(f15);
        if (sVarC == null) {
            sVarC = ((s) lVar2.invoke(f13)).c();
        }
        s sVar = sVarC;
        Object objB = b(new n(o2Var, f13, sVar, 56), new x1(lVar, o2Var, f13, f14, sVar), Long.MIN_VALUE, new o1(pVar), cVar);
        ug.a aVar = ug.a.f29706a;
        if (objB != aVar) {
            objB = pg.f0.f21461a;
        }
        return objB == aVar ? objB : pg.f0.f21461a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, s.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(n nVar, h hVar, long j10, eh.l lVar, vg.c cVar) {
        p1 p1Var;
        kotlin.jvm.internal.g0 g0Var;
        n nVar2;
        n nVar3;
        kotlin.jvm.internal.g0 g0Var2;
        Object objF0;
        eh.l lVar2;
        k kVar;
        k kVar2;
        Object objF02;
        h hVar2 = hVar;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i10 = p1Var.f23867f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                p1Var.f23867f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                p1Var = new p1(cVar);
            }
        }
        p1 p1Var2 = p1Var;
        Object obj = p1Var2.f23866e;
        ug.a aVar = ug.a.f29706a;
        int i11 = p1Var2.f23867f;
        if (i11 == 0) {
            pg.q.b(obj);
            Object objF = hVar2.f(0L);
            s sVarD = hVar2.d(0L);
            g0Var = new kotlin.jvm.internal.g0();
            if (j10 == Long.MIN_VALUE) {
                try {
                    nVar2 = nVar;
                } catch (CancellationException e10) {
                    e = e10;
                    nVar2 = nVar;
                }
                try {
                    r1 r1Var = new r1(g0Var, objF, hVar2, sVarD, nVar2, h(p1Var2.getContext()), lVar);
                    g0Var2 = g0Var;
                    try {
                        p1Var2.f23862a = nVar2;
                        p1Var2.f23863b = hVar2;
                        p1Var2.f23864c = lVar;
                        p1Var2.f23865d = g0Var2;
                        p1Var2.f23867f = 1;
                        if (hVar2.a()) {
                            objF0 = j0.a(r1Var, p1Var2);
                        } else {
                            objF0 = x0.f1.a(p1Var2.getContext()).f0(new v1(r1Var), p1Var2);
                        }
                        if (objF0 != aVar) {
                            nVar3 = nVar2;
                            lVar2 = lVar;
                            g0Var = g0Var2;
                        }
                        return aVar;
                    } catch (CancellationException e11) {
                        e = e11;
                        nVar3 = nVar2;
                        g0Var = g0Var2;
                        kVar = (k) g0Var.f16327a;
                        if (kVar != null) {
                        }
                        kVar2 = (k) g0Var.f16327a;
                        if (kVar2 != null) {
                        }
                        throw e;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    nVar3 = nVar2;
                    kVar = (k) g0Var.f16327a;
                    if (kVar != null) {
                    }
                    kVar2 = (k) g0Var.f16327a;
                    if (kVar2 != null) {
                    }
                    throw e;
                }
            }
            g0Var2 = g0Var;
            try {
                ?? kVar3 = new k(objF, hVar2.c(), sVarD, j10, hVar2.g(), j10, new s1(nVar));
                g(kVar3, j10, h(p1Var2.getContext()), hVar2, nVar, lVar);
                g0Var2.f16327a = kVar3;
                nVar3 = nVar;
                hVar2 = hVar;
                lVar2 = lVar;
                g0Var = g0Var2;
            } catch (CancellationException e13) {
                e = e13;
                nVar3 = nVar;
                g0Var = g0Var2;
                kVar = (k) g0Var.f16327a;
                if (kVar != null) {
                    kVar.f23795i.setValue(Boolean.FALSE);
                }
                kVar2 = (k) g0Var.f16327a;
                if (kVar2 != null && kVar2.f23793g == nVar3.f23845d) {
                    nVar3.f23847f = false;
                }
                throw e;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = p1Var2.f23865d;
            lVar2 = p1Var2.f23864c;
            hVar2 = p1Var2.f23863b;
            nVar3 = p1Var2.f23862a;
            try {
                pg.q.b(obj);
            } catch (CancellationException e14) {
                e = e14;
                kVar = (k) g0Var.f16327a;
                if (kVar != null) {
                }
                kVar2 = (k) g0Var.f16327a;
                if (kVar2 != null) {
                    nVar3.f23847f = false;
                }
                throw e;
            }
        }
        do {
            T t3 = g0Var.f16327a;
            kotlin.jvm.internal.r.b(t3);
            if (!((Boolean) ((k) t3).f23795i.getValue()).booleanValue()) {
                return pg.f0.f21461a;
            }
            kotlin.jvm.internal.g0 g0Var3 = g0Var;
            eh.l lVar3 = lVar2;
            h hVar3 = hVar2;
            n nVar4 = nVar3;
            try {
                t1 t1Var = new t1(g0Var3, h(p1Var2.getContext()), hVar3, nVar4, lVar3);
                g0Var = g0Var3;
                hVar2 = hVar3;
                nVar3 = nVar4;
                lVar2 = lVar3;
                p1Var2.f23862a = nVar3;
                p1Var2.f23863b = hVar2;
                p1Var2.f23864c = lVar2;
                p1Var2.f23865d = g0Var;
                p1Var2.f23867f = 2;
                if (hVar2.a()) {
                    objF02 = j0.a(t1Var, p1Var2);
                } else {
                    objF02 = x0.f1.a(p1Var2.getContext()).f0(new v1(t1Var), p1Var2);
                }
            } catch (CancellationException e15) {
                e = e15;
                g0Var = g0Var3;
                nVar3 = nVar4;
                kVar = (k) g0Var.f16327a;
                if (kVar != null) {
                }
                kVar2 = (k) g0Var.f16327a;
                if (kVar2 != null) {
                }
                throw e;
            }
        } while (objF02 != aVar);
        return aVar;
    }

    public static /* synthetic */ Object c(float f10, float f11, l lVar, eh.p pVar, vg.c cVar, int i10) {
        if ((i10 & 8) != 0) {
            lVar = m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
        }
        return a(f10, f11, CropImageView.DEFAULT_ASPECT_RATIO, lVar, pVar, cVar);
    }

    public static final Object d(n nVar, y yVar, boolean z10, eh.l lVar, vg.c cVar) {
        Object objB = b(nVar, new x(yVar, nVar.f23842a, nVar.f23843b.getValue(), nVar.f23844c), z10 ? nVar.f23845d : Long.MIN_VALUE, lVar, cVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }

    public static final Object e(n nVar, Float f10, l lVar, boolean z10, eh.l lVar2, vg.c cVar) {
        Object objB = b(nVar, new x1(lVar, nVar.f23842a, nVar.f23843b.getValue(), f10, nVar.f23844c), z10 ? nVar.f23845d : Long.MIN_VALUE, lVar2, cVar);
        return objB == ug.a.f29706a ? objB : pg.f0.f21461a;
    }

    public static /* synthetic */ Object f(n nVar, Float f10, l lVar, boolean z10, eh.l lVar2, vg.c cVar, int i10) {
        if ((i10 & 2) != 0) {
            lVar = m.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7);
        }
        l lVar3 = lVar;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            lVar2 = u1.f23948a;
        }
        return e(nVar, f10, lVar3, z11, lVar2, cVar);
    }

    public static final <T, V extends s> void g(k<T, V> kVar, long j10, float f10, h<T, V> hVar, n<T, V> nVar, eh.l<? super k<T, V>, pg.f0> lVar) {
        long jB = f10 == CropImageView.DEFAULT_ASPECT_RATIO ? hVar.b() : (long) ((j10 - kVar.f23789c) / f10);
        kVar.f23793g = j10;
        kVar.f23791e.setValue(hVar.f(jB));
        kVar.f23792f = (V) hVar.d(jB);
        if (hVar.e(jB)) {
            kVar.f23794h = kVar.f23793g;
            kVar.f23795i.setValue(Boolean.FALSE);
        }
        i(kVar, nVar);
        lVar.invoke(kVar);
    }

    public static final float h(tg.h hVar) {
        j1.i iVar = (j1.i) hVar.get(i.a.f14624a);
        float fP = iVar != null ? iVar.p() : 1.0f;
        if (fP >= CropImageView.DEFAULT_ASPECT_RATIO) {
            return fP;
        }
        x0.b("negative scale factor");
        return fP;
    }

    public static final <T, V extends s> void i(k<T, V> kVar, n<T, V> nVar) {
        nVar.f23843b.setValue(kVar.f23791e.getValue());
        V v10 = nVar.f23844c;
        V v11 = kVar.f23792f;
        int iB = v10.b();
        for (int i10 = 0; i10 < iB; i10++) {
            v10.e(v11.a(i10), i10);
        }
        nVar.f23846e = kVar.f23794h;
        nVar.f23845d = kVar.f23793g;
        nVar.f23847f = ((Boolean) kVar.f23795i.getValue()).booleanValue();
    }
}
