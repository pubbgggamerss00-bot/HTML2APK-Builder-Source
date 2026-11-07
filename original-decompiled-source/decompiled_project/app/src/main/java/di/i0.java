package di;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f8027a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f8028b;

    /* renamed from: c, reason: collision with root package name */
    public int f8029c;

    public i0(kotlinx.serialization.json.f fVar, n0 n0Var) {
        this.f8027a = n0Var;
        this.f8028b = fVar.f16443b;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i0 i0Var, pg.b bVar, vg.a aVar) {
        h0 h0Var;
        byte bF;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        i0 i0Var2;
        byte bE;
        n0 n0Var = i0Var.f8027a;
        if (aVar instanceof h0) {
            h0Var = (h0) aVar;
            int i10 = h0Var.f8024g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                h0Var.f8024g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                h0Var = new h0(i0Var, aVar);
            }
        }
        Object obj = h0Var.f8022e;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = h0Var.f8024g;
        if (i11 == 0) {
            pg.q.b(obj);
            bF = n0Var.f((byte) 6);
            if (n0Var.r() == 4) {
                n0.n(n0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            linkedHashMap = new LinkedHashMap();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = h0Var.f8021d;
            linkedHashMap2 = h0Var.f8020c;
            i0Var2 = h0Var.f8019b;
            pg.b bVar2 = h0Var.f8018a;
            pg.q.b(obj);
            linkedHashMap2.put(str, (kotlinx.serialization.json.h) obj);
            bE = i0Var2.f8027a.e();
            if (bE != 4) {
                if (bE != 7) {
                    n0.n(i0Var2.f8027a, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
                n0 n0Var2 = i0Var2.f8027a;
                if (bE != 6) {
                    n0Var2.f((byte) 7);
                } else if (bE == 4) {
                    t.f(n0Var2);
                    throw null;
                }
                return new kotlinx.serialization.json.v(linkedHashMap2);
            }
            bF = bE;
            i0Var = i0Var2;
            linkedHashMap = linkedHashMap2;
            bVar = bVar2;
        }
        n0 n0Var3 = i0Var.f8027a;
        if (!n0Var3.b()) {
            linkedHashMap2 = linkedHashMap;
            i0Var2 = i0Var;
            bE = bF;
            n0 n0Var22 = i0Var2.f8027a;
            if (bE != 6) {
            }
            return new kotlinx.serialization.json.v(linkedHashMap2);
        }
        String strJ = i0Var.f8028b ? n0Var3.j() : n0Var3.i();
        n0Var3.f((byte) 5);
        pg.f0 f0Var = pg.f0.f21461a;
        h0Var.f8018a = bVar;
        h0Var.f8019b = i0Var;
        h0Var.f8020c = linkedHashMap;
        h0Var.f8021d = strJ;
        h0Var.f8024g = 1;
        bVar.a(f0Var, h0Var);
        return aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlinx.serialization.json.h b() {
        kotlinx.serialization.json.h vVar;
        Object obj;
        Object objB;
        n0 n0Var = this.f8027a;
        byte bR = n0Var.r();
        if (bR == 1) {
            return d(true);
        }
        if (bR == 0) {
            return d(false);
        }
        if (bR != 6) {
            if (bR == 8) {
                return c();
            }
            n0.n(n0Var, "Cannot read Json element because of unexpected ".concat(a.c(bR)), 0, null, 6);
            throw null;
        }
        int i10 = this.f8029c + 1;
        this.f8029c = i10;
        if (i10 == 200) {
            g0 g0Var = new g0(this, null);
            pg.f0 f0Var = pg.f0.f21461a;
            ug.a aVar = pg.a.f21445a;
            pg.c cVar = new pg.c();
            cVar.f21450a = g0Var;
            cVar.f21451b = f0Var;
            cVar.f21452c = cVar;
            ug.a aVar2 = pg.a.f21445a;
            cVar.f21453d = aVar2;
            while (true) {
                obj = cVar.f21453d;
                tg.e<Object> eVar = cVar.f21452c;
                if (eVar == null) {
                    break;
                }
                if (kotlin.jvm.internal.r.a(aVar2, obj)) {
                    try {
                        g0 g0Var2 = cVar.f21450a;
                        Object obj2 = cVar.f21451b;
                        if (g0Var2 == 0) {
                            kotlin.jvm.internal.r.e(g0Var2, "<this>");
                            tg.h context = eVar.getContext();
                            Object dVar = context == tg.i.f28768a ? new ug.d(eVar) : new ug.e(eVar, context);
                            kotlin.jvm.internal.m0.b(3, g0Var2);
                            objB = g0Var2.b(cVar, obj2, dVar);
                        } else {
                            kotlin.jvm.internal.m0.b(3, g0Var2);
                            objB = g0Var2.b(cVar, obj2, eVar);
                        }
                        if (objB != ug.a.f29706a) {
                            eVar.resumeWith(objB);
                        }
                    } catch (Throwable th2) {
                        eVar.resumeWith(pg.q.a(th2));
                    }
                } else {
                    cVar.f21453d = aVar2;
                    eVar.resumeWith(obj);
                }
            }
            pg.q.b(obj);
            vVar = (kotlinx.serialization.json.h) obj;
        } else {
            byte bF = n0Var.f((byte) 6);
            if (n0Var.r() == 4) {
                n0.n(n0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!n0Var.b()) {
                    break;
                }
                String strJ = this.f8028b ? n0Var.j() : n0Var.i();
                n0Var.f((byte) 5);
                linkedHashMap.put(strJ, b());
                bF = n0Var.e();
                if (bF != 4) {
                    if (bF != 7) {
                        n0.n(n0Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bF == 6) {
                n0Var.f((byte) 7);
            } else if (bF == 4) {
                t.f(n0Var);
                throw null;
            }
            vVar = new kotlinx.serialization.json.v(linkedHashMap);
        }
        this.f8029c--;
        return vVar;
    }

    public final kotlinx.serialization.json.c c() {
        n0 n0Var = this.f8027a;
        byte bE = n0Var.e();
        if (n0Var.r() == 4) {
            n0.n(n0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (n0Var.b()) {
            arrayList.add(b());
            bE = n0Var.e();
            if (bE != 4) {
                boolean z10 = bE == 9;
                int i10 = n0Var.f8056a;
                if (!z10) {
                    n0.n(n0Var, "Expected end of the array or comma", i10, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            n0Var.f((byte) 9);
        } else if (bE == 4) {
            t.e(n0Var, "array");
            throw null;
        }
        return new kotlinx.serialization.json.c(arrayList);
    }

    public final kotlinx.serialization.json.x d(boolean z10) {
        boolean z11 = this.f8028b;
        n0 n0Var = this.f8027a;
        String strJ = (z11 || !z10) ? n0Var.j() : n0Var.i();
        return (z10 || !kotlin.jvm.internal.r.a(strJ, "null")) ? new kotlinx.serialization.json.r(strJ, z10, null) : kotlinx.serialization.json.t.INSTANCE;
    }
}
