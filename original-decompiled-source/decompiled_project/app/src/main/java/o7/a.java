package o7;

import android.graphics.Bitmap;
import androidx.datastore.preferences.protobuf.z0;
import b8.s;
import g7.h0;
import g7.t;
import j7.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import l7.k;
import l7.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.n;
import pg.q;
import r.o2;
import r7.c;
import w7.m;
import w7.o;
import x0.s1;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final t f18977a;

    /* renamed from: b, reason: collision with root package name */
    public final b8.a f18978b;

    /* renamed from: c, reason: collision with root package name */
    public final w7.a f18979c;

    /* renamed from: d, reason: collision with root package name */
    public final r7.d f18980d;

    /* renamed from: o7.a$a, reason: collision with other inner class name */
    public static final class C0215a {

        /* renamed from: a, reason: collision with root package name */
        public final g7.l f18981a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f18982b;

        /* renamed from: c, reason: collision with root package name */
        public final j7.f f18983c;

        /* renamed from: d, reason: collision with root package name */
        public final String f18984d;

        public C0215a(g7.l lVar, boolean z10, j7.f fVar, String str) {
            this.f18981a = lVar;
            this.f18982b = z10;
            this.f18983c = fVar;
            this.f18984d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0215a)) {
                return false;
            }
            C0215a c0215a = (C0215a) obj;
            return r.a(this.f18981a, c0215a.f18981a) && this.f18982b == c0215a.f18982b && this.f18983c == c0215a.f18983c && r.a(this.f18984d, c0215a.f18984d);
        }

        public final int hashCode() {
            int iHashCode = (this.f18983c.hashCode() + o2.a(this.f18981a.hashCode() * 31, 31, this.f18982b)) * 31;
            String str = this.f18984d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ExecuteResult(image=");
            sb.append(this.f18981a);
            sb.append(", isSampled=");
            sb.append(this.f18982b);
            sb.append(", dataSource=");
            sb.append(this.f18983c);
            sb.append(", diskCacheKey=");
            return s1.a(sb, this.f18984d, ')');
        }
    }

    public a(t tVar, b8.a aVar, w7.a aVar2) {
        this.f18977a = tVar;
        this.f18978b = aVar;
        this.f18979c = aVar2;
        this.f18980d = new r7.d(tVar, aVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00af -> B:26:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, p pVar, g7.f fVar, w7.f fVar2, Object obj, m mVar, g7.h hVar, vg.c cVar) {
        b bVar;
        int i10;
        int size;
        n nVar;
        aVar.getClass();
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i11 = bVar.f18996m;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f18996m = i11 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(aVar, cVar);
            }
        }
        Object objA = bVar.f18994k;
        ug.a aVar2 = ug.a.f29706a;
        int i12 = bVar.f18996m;
        if (i12 == 0) {
            q.b(objA);
            i10 = 0;
            t tVar = aVar.f18977a;
            size = ((List) fVar.f11493g.getValue()).size();
            while (true) {
                if (i10 >= size) {
                }
                i10++;
            }
            if (nVar != null) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = bVar.f18993j;
            g7.h hVar2 = bVar.f18991g;
            m mVar2 = bVar.f18990f;
            Object obj2 = bVar.f18989e;
            w7.f fVar3 = bVar.f18988d;
            g7.f fVar4 = bVar.f18987c;
            p pVar2 = bVar.f18986b;
            a aVar3 = bVar.f18985a;
            q.b(objA);
            int iIntValue = i13;
            aVar = aVar3;
            hVar = hVar2;
            pVar = pVar2;
            mVar = mVar2;
            fVar = fVar4;
            obj = obj2;
            fVar2 = fVar3;
            j7.g gVar = (j7.g) objA;
            hVar.getClass();
            if (gVar == null) {
                g7.l lVar = gVar.f15225a;
                boolean z10 = gVar.f15226b;
                j7.f fVar5 = pVar.f16763c;
                j7.q qVar = pVar.f16761a;
                j7.p pVar3 = qVar instanceof j7.p ? (j7.p) qVar : null;
                return new C0215a(lVar, z10, fVar5, pVar3 != null ? pVar3.f15237c : null);
            }
            i10 = iIntValue;
            t tVar2 = aVar.f18977a;
            size = ((List) fVar.f11493g.getValue()).size();
            while (true) {
                if (i10 >= size) {
                    nVar = null;
                    break;
                }
                j7.i iVarA = ((i.a) ((List) fVar.f11493g.getValue()).get(i10)).a(pVar, mVar);
                if (iVarA != null) {
                    nVar = new n(iVarA, Integer.valueOf(i10));
                    break;
                }
                i10++;
            }
            if (nVar != null) {
                throw new IllegalStateException(z0.a(obj, "Unable to create a decoder that supports: ").toString());
            }
            j7.i iVar = (j7.i) nVar.f21469a;
            iIntValue = ((Number) nVar.f21470b).intValue() + 1;
            hVar.getClass();
            bVar.f18985a = aVar;
            bVar.f18986b = pVar;
            bVar.f18987c = fVar;
            bVar.f18988d = fVar2;
            bVar.f18989e = obj;
            bVar.f18990f = mVar;
            bVar.f18991g = hVar;
            bVar.f18992h = iVar;
            bVar.f18993j = iIntValue;
            bVar.f18996m = 1;
            objA = iVar.a(bVar);
            if (objA == aVar2) {
                return aVar2;
            }
            j7.g gVar2 = (j7.g) objA;
            hVar.getClass();
            if (gVar2 == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0173, code lost:
    
        if (r1 == r7) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, g7.f] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, w7.m] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, w7.f fVar, Object obj, m mVar, g7.h hVar, vg.c cVar) {
        c cVar2;
        p pVar;
        j7.q qVar;
        a aVar2;
        Object obj2;
        g7.h hVar2;
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        w7.f fVar2;
        T t3;
        w7.f fVar3;
        g0 g0Var5;
        g7.h hVar3;
        C0215a c0215a;
        g0 g0Var6;
        a aVar3;
        p pVar2;
        j7.q qVar2;
        Object obj3;
        Object obj4;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f19007l;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                cVar2.f19007l = i10 - PKIFailureInfo.systemUnavail;
            } else {
                cVar2 = new c(aVar, cVar);
            }
        }
        c cVar3 = cVar2;
        Object obj5 = cVar3.f19005j;
        ug.a aVar4 = ug.a.f29706a;
        g0 g0Var7 = cVar3.f19007l;
        try {
            if (g0Var7 == 0) {
                q.b(obj5);
                g0 g0Var8 = new g0();
                g0Var8.f16327a = mVar;
                g0 g0Var9 = new g0();
                g0Var9.f16327a = aVar.f18977a.f11528d;
                g0 g0Var10 = new g0();
                try {
                    ?? r12 = (m) g0Var8.f16327a;
                    g7.j jVar = r12.f31410j;
                    b8.b.a((Bitmap.Config) g7.k.b(r12, w7.h.f31392b));
                    g0Var8.f16327a = r12;
                    fVar.getClass();
                    g7.f fVar4 = (g7.f) g0Var9.f16327a;
                    m mVar2 = (m) g0Var8.f16327a;
                    cVar3.f18997a = aVar;
                    cVar3.f18998b = fVar;
                    cVar3.f18999c = obj;
                    cVar3.f19000d = hVar;
                    cVar3.f19001e = g0Var8;
                    cVar3.f19002f = g0Var9;
                    cVar3.f19003g = g0Var10;
                    cVar3.f19004h = g0Var10;
                    cVar3.f19007l = 1;
                    Object objD = aVar.d(fVar4, fVar, obj, mVar2, hVar, cVar3);
                    if (objD != aVar4) {
                        aVar2 = aVar;
                        obj2 = obj;
                        hVar2 = hVar;
                        g0Var = g0Var8;
                        g0Var2 = g0Var9;
                        g0Var3 = g0Var10;
                        g0Var4 = g0Var3;
                        fVar2 = fVar;
                        t3 = objD;
                    }
                    return aVar4;
                } catch (Throwable th2) {
                    th = th2;
                    g0Var7 = g0Var10;
                    T t10 = g0Var7.f16327a;
                    pVar = t10 instanceof p ? (p) t10 : null;
                    if (pVar != null && (qVar = pVar.f16761a) != null) {
                        try {
                            androidx.documentfile.provider.a.a(qVar);
                        } catch (RuntimeException e10) {
                            throw e10;
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            if (g0Var7 == 1) {
                g0Var3 = cVar3.f19004h;
                g0Var4 = cVar3.f19003g;
                g0 g0Var11 = cVar3.f19002f;
                g0 g0Var12 = cVar3.f19001e;
                g7.h hVar4 = (g7.h) cVar3.f19000d;
                Object obj6 = cVar3.f18999c;
                fVar2 = cVar3.f18998b;
                a aVar5 = cVar3.f18997a;
                q.b(obj5);
                g0Var2 = g0Var11;
                g0Var = g0Var12;
                hVar2 = hVar4;
                obj2 = obj6;
                aVar2 = aVar5;
                t3 = obj5;
            } else {
                if (g0Var7 != 2) {
                    if (g0Var7 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q.b(obj5);
                    obj4 = obj5;
                    C0215a c0215a2 = (C0215a) obj4;
                    g7.l lVar = c0215a2.f18981a;
                    Bitmap.Config[] configArr = b8.t.f3682a;
                    if (lVar instanceof g7.a) {
                        ((g7.a) lVar).f11477a.prepareToDraw();
                    }
                    return c0215a2;
                }
                g0Var4 = cVar3.f19001e;
                g0Var6 = (g0) cVar3.f19000d;
                hVar3 = (g7.h) cVar3.f18999c;
                fVar3 = cVar3.f18998b;
                aVar3 = cVar3.f18997a;
                q.b(obj5);
                obj3 = obj5;
                c0215a = (C0215a) obj3;
                g0Var5 = g0Var6;
                aVar2 = aVar3;
                w7.f fVar5 = fVar3;
                T t11 = g0Var4.f16327a;
                pVar2 = t11 instanceof p ? (p) t11 : null;
                if (pVar2 != null && (qVar2 = pVar2.f16761a) != null) {
                    try {
                        androidx.documentfile.provider.a.a(qVar2);
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused2) {
                    }
                }
                m mVar3 = (m) g0Var5.f16327a;
                aVar2.getClass();
                cVar3.f18997a = null;
                cVar3.f18998b = null;
                cVar3.f18999c = null;
                cVar3.f19000d = null;
                cVar3.f19001e = null;
                cVar3.f19002f = null;
                cVar3.f19003g = null;
                cVar3.f19004h = null;
                cVar3.f19007l = 3;
                Object objA = i.a(c0215a, fVar5, mVar3, hVar3, cVar3);
                obj4 = objA;
            }
            g0Var3.f16327a = t3;
            T t12 = g0Var4.f16327a;
            l7.j jVar2 = (l7.j) t12;
            if (jVar2 instanceof p) {
                tg.h hVar5 = fVar2.f31335h;
                g0 g0Var13 = g0Var4;
                w7.f fVar6 = fVar2;
                try {
                    d dVar = new d(aVar2, g0Var13, g0Var2, fVar6, obj2, g0Var, hVar2, null);
                    fVar3 = fVar6;
                    g0 g0Var14 = g0Var;
                    hVar3 = hVar2;
                    cVar3.f18997a = aVar2;
                    cVar3.f18998b = fVar3;
                    cVar3.f18999c = hVar3;
                    cVar3.f19000d = g0Var14;
                    cVar3.f19001e = g0Var4;
                    cVar3.f19002f = null;
                    cVar3.f19003g = null;
                    cVar3.f19004h = null;
                    cVar3.f19007l = 2;
                    Object objE = ph.h.e(hVar5, dVar, cVar3);
                    if (objE == aVar4) {
                        return aVar4;
                    }
                    g0Var6 = g0Var14;
                    aVar3 = aVar2;
                    obj3 = objE;
                    c0215a = (C0215a) obj3;
                    g0Var5 = g0Var6;
                    aVar2 = aVar3;
                    w7.f fVar52 = fVar3;
                    T t112 = g0Var4.f16327a;
                    if (t112 instanceof p) {
                    }
                    if (pVar2 != null) {
                        androidx.documentfile.provider.a.a(qVar2);
                    }
                    m mVar32 = (m) g0Var5.f16327a;
                    aVar2.getClass();
                    cVar3.f18997a = null;
                    cVar3.f18998b = null;
                    cVar3.f18999c = null;
                    cVar3.f19000d = null;
                    cVar3.f19001e = null;
                    cVar3.f19002f = null;
                    cVar3.f19003g = null;
                    cVar3.f19004h = null;
                    cVar3.f19007l = 3;
                    Object objA2 = i.a(c0215a, fVar52, mVar32, hVar3, cVar3);
                    obj4 = objA2;
                } catch (Throwable th3) {
                    th = th3;
                    g0Var7 = g0Var13;
                    T t102 = g0Var7.f16327a;
                    if (t102 instanceof p) {
                    }
                    if (pVar != null) {
                        androidx.documentfile.provider.a.a(qVar);
                    }
                    throw th;
                }
            } else {
                fVar3 = fVar2;
                g0Var5 = g0Var;
                hVar3 = hVar2;
                if (!(jVar2 instanceof l7.m)) {
                    throw new pg.l();
                }
                c0215a = new C0215a(((l7.m) t12).f16754a, ((l7.m) t12).f16755b, ((l7.m) t12).f16756c, null);
                w7.f fVar522 = fVar3;
                T t1122 = g0Var4.f16327a;
                if (t1122 instanceof p) {
                }
                if (pVar2 != null) {
                }
                m mVar322 = (m) g0Var5.f16327a;
                aVar2.getClass();
                cVar3.f18997a = null;
                cVar3.f18998b = null;
                cVar3.f18999c = null;
                cVar3.f19000d = null;
                cVar3.f19001e = null;
                cVar3.f19002f = null;
                cVar3.f19003g = null;
                cVar3.f19004h = null;
                cVar3.f19007l = 3;
                Object objA22 = i.a(c0215a, fVar522, mVar322, hVar3, cVar3);
                obj4 = objA22;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    @Override // o7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(l lVar, vg.c cVar) throws Throwable {
        f fVar;
        l lVar2 = lVar;
        r7.d dVar = this.f18980d;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f19030d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f19030d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(this, cVar);
            }
        }
        f fVar2 = fVar;
        Object obj = fVar2.f19028b;
        ug.a aVar = ug.a.f29706a;
        int i11 = fVar2.f19030d;
        if (i11 == 0) {
            q.b(obj);
            try {
                w7.f fVar3 = lVar2.f19056d;
                Object obj2 = fVar3.f31329b;
                x7.h hVar = lVar2.f19057e;
                g7.h hVar2 = lVar2.f19058f;
                m mVarC = this.f18979c.c(fVar3, hVar);
                x7.f fVar4 = mVarC.f31403c;
                List<n<q7.c<? extends Object, ? extends Object>, kh.c<? extends Object>>> list = this.f18977a.f11528d.f11488b;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    n<q7.c<? extends Object, ? extends Object>, kh.c<? extends Object>> nVar = list.get(i12);
                    q7.c<? extends Object, ? extends Object> cVar2 = nVar.f21469a;
                    if (nVar.f21470b.i(obj2)) {
                        r.c(cVar2, "null cannot be cast to non-null type coil3.map.Mapper<kotlin.Any, *>");
                        h0 h0VarA = cVar2.a(obj2, mVarC);
                        if (h0VarA != null) {
                            obj2 = h0VarA;
                        }
                    }
                }
                c.b bVarB = dVar.b(fVar3, obj2, mVarC, hVar2);
                c.C0257c c0257cA = bVarB != null ? dVar.a(fVar3, bVarB, hVar, fVar4) : null;
                if (c0257cA == null) {
                    tg.h hVar3 = fVar3.f31334g;
                    g gVar = new g(this, fVar3, obj2, mVarC, hVar2, bVarB, lVar2, null);
                    fVar2.f19027a = lVar2;
                    fVar2.f19030d = 1;
                    Object objE = ph.h.e(hVar3, gVar, fVar2);
                    return objE == aVar ? aVar : objE;
                }
                Map<String, Object> map = c0257cA.f23223b;
                g7.l lVar3 = c0257cA.f23222a;
                j7.f fVar5 = j7.f.f15220a;
                Object obj3 = map.get("coil#disk_cache_key");
                String str = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("coil#is_sampled");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new o(lVar3, fVar3, fVar5, bVarB, str, bool != null ? bool.booleanValue() : false, lVar2.f19059g);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l lVar4 = fVar2.f19027a;
            try {
                q.b(obj);
                return obj;
            } catch (Throwable th3) {
                th = th3;
                lVar2 = lVar4;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return s.a(lVar2.a(), th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d5 -> B:29:0x00db). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(g7.f fVar, w7.f fVar2, Object obj, m mVar, g7.h hVar, vg.c cVar) {
        e eVar;
        a aVar;
        Object obj2;
        m mVar2;
        g7.h hVar2;
        int i10;
        e eVar2;
        a aVar2;
        g7.f fVar3;
        w7.f fVar4;
        int size;
        n nVar;
        j7.q qVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i11 = eVar.f19026l;
            if ((i11 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f19026l = i11 - PKIFailureInfo.systemUnavail;
                aVar = this;
            } else {
                aVar = this;
                eVar = new e(aVar, cVar);
            }
        }
        Object obj3 = eVar.f19024j;
        ug.a aVar3 = ug.a.f29706a;
        int i12 = eVar.f19026l;
        if (i12 == 0) {
            q.b(obj3);
            obj2 = obj;
            mVar2 = mVar;
            hVar2 = hVar;
            i10 = 0;
            eVar2 = eVar;
            aVar2 = aVar;
            fVar3 = fVar;
            fVar4 = fVar2;
            t tVar = aVar2.f18977a;
            size = ((List) fVar3.f11492f.getValue()).size();
            while (true) {
                if (i10 < size) {
                }
                i10++;
            }
            if (nVar != null) {
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = eVar.f19023h;
            g7.h hVar3 = eVar.f19021f;
            m mVar3 = eVar.f19020e;
            Object obj4 = eVar.f19019d;
            w7.f fVar5 = eVar.f19018c;
            g7.f fVar6 = eVar.f19017b;
            aVar2 = eVar.f19016a;
            q.b(obj3);
            eVar2 = eVar;
            fVar4 = fVar5;
            i10 = i13;
            obj2 = obj4;
            hVar2 = hVar3;
            mVar2 = mVar3;
            l7.j jVar = (l7.j) obj3;
            try {
                hVar2.getClass();
                if (jVar == null) {
                    return jVar;
                }
                fVar3 = fVar6;
                t tVar2 = aVar2.f18977a;
                size = ((List) fVar3.f11492f.getValue()).size();
                while (true) {
                    if (i10 < size) {
                        nVar = null;
                        break;
                    }
                    n nVar2 = (n) ((List) fVar3.f11492f.getValue()).get(i10);
                    k.a aVar4 = (k.a) nVar2.f21469a;
                    if (((kh.c) nVar2.f21470b).i(obj2)) {
                        r.c(aVar4, "null cannot be cast to non-null type coil3.fetch.Fetcher.Factory<kotlin.Any>");
                        l7.k kVarA = aVar4.a(obj2, mVar2, tVar2);
                        if (kVarA != null) {
                            nVar = new n(kVarA, Integer.valueOf(i10));
                            break;
                        }
                    }
                    i10++;
                }
                if (nVar != null) {
                    throw new IllegalStateException(z0.a(obj2, "Unable to create a fetcher that supports: ").toString());
                }
                l7.k kVar = (l7.k) nVar.f21469a;
                int iIntValue = ((Number) nVar.f21470b).intValue() + 1;
                hVar2.getClass();
                eVar2.f19016a = aVar2;
                eVar2.f19017b = fVar3;
                eVar2.f19018c = fVar4;
                eVar2.f19019d = obj2;
                eVar2.f19020e = mVar2;
                eVar2.f19021f = hVar2;
                eVar2.f19022g = kVar;
                eVar2.f19023h = iIntValue;
                eVar2.f19026l = 1;
                Object objA = kVar.a(eVar2);
                if (objA == aVar3) {
                    return aVar3;
                }
                fVar6 = fVar3;
                obj3 = objA;
                i10 = iIntValue;
                l7.j jVar2 = (l7.j) obj3;
                hVar2.getClass();
                if (jVar2 == null) {
                }
            } catch (Throwable th2) {
                p pVar = jVar2 instanceof p ? (p) jVar2 : null;
                if (pVar != null && (qVar = pVar.f16761a) != null) {
                    try {
                        androidx.documentfile.provider.a.a(qVar);
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused) {
                    }
                }
                throw th2;
            }
        }
    }
}
