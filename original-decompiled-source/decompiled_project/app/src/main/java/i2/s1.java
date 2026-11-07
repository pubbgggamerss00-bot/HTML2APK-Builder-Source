package i2;

import androidx.compose.ui.d;
import i2.e0;
import java.lang.ref.SoftReference;

/* loaded from: classes.dex */
public final class s1 implements kotlinx.serialization.internal.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14016a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14017b;

    public s1() {
        this.f14016a = new z0.b(new e0[16]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(e0 e0Var) {
        if (e0Var.K.f13917d == e0.d.f13837e && !e0Var.C() && !e0Var.D() && !e0Var.T && e0Var.x()) {
            d.c cVar = e0Var.I.f13793e;
            if ((cVar.f1147d & 256) != 0) {
                while (cVar != null) {
                    if ((cVar.f1146c & 256) != 0) {
                        m mVarB = cVar;
                        ?? bVar = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof t) {
                                t tVar = (t) mVarB;
                                tVar.g0(k.d(tVar, 256));
                            } else if ((mVarB.f1146c & 256) != 0 && (mVarB instanceof m)) {
                                d.c cVar2 = mVarB.f13947r;
                                int i10 = 0;
                                mVarB = mVarB;
                                bVar = bVar;
                                while (cVar2 != null) {
                                    if ((cVar2.f1146c & 256) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            mVarB = cVar2;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB != 0) {
                                                bVar.b(mVarB);
                                                mVarB = 0;
                                            }
                                            bVar.b(cVar2);
                                        }
                                    }
                                    cVar2 = cVar2.f1149f;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVarB = k.b(bVar);
                        }
                    }
                    if ((cVar.f1147d & 256) == 0) {
                        break;
                    } else {
                        cVar = cVar.f1149f;
                    }
                }
            }
        }
        e0Var.S = false;
        z0.b<e0> bVarJ = e0Var.J();
        e0[] e0VarArr = bVarJ.f34700a;
        int i11 = bVarJ.f34702c;
        for (int i12 = 0; i12 < i11; i12++) {
            b(e0VarArr[i12]);
        }
    }

    @Override // kotlinx.serialization.internal.w0
    public zh.b a(kh.c cVar) {
        Object obj = ((kotlinx.serialization.internal.j) this.f14017b).get(b3.e.c(cVar));
        kotlin.jvm.internal.r.d(obj, "get(...)");
        kotlinx.serialization.internal.d0 d0Var = (kotlinx.serialization.internal.d0) obj;
        Object eVar = d0Var.f16362a.get();
        if (eVar == null) {
            synchronized (d0Var) {
                eVar = d0Var.f16362a.get();
                if (eVar == null) {
                    eVar = new kotlinx.serialization.internal.e((zh.b) ((eh.l) this.f14016a).invoke(cVar));
                    d0Var.f16362a = new SoftReference<>(eVar);
                }
            }
        }
        return ((kotlinx.serialization.internal.e) eVar).f16363a;
    }

    public s1(eh.l lVar) {
        this.f14016a = lVar;
        this.f14017b = new kotlinx.serialization.internal.j();
    }
}
