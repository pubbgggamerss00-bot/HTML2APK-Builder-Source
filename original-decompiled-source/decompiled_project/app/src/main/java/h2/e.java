package h2;

import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidComposeView;
import i2.e0;
import i2.k;
import i2.m;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.s;
import pg.f0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f12222a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.b<i2.c> f12223b = new z0.b<>(new i2.c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final z0.b<c<?>> f12224c = new z0.b<>(new c[16]);

    /* renamed from: d, reason: collision with root package name */
    public final z0.b<e0> f12225d = new z0.b<>(new e0[16]);

    /* renamed from: e, reason: collision with root package name */
    public final z0.b<c<?>> f12226e = new z0.b<>(new c[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f12227f;

    public static final class a extends s implements eh.a<f0> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final f0 invoke() {
            e eVar = e.this;
            z0.b<c<?>> bVar = eVar.f12224c;
            z0.b<i2.c> bVar2 = eVar.f12223b;
            z0.b<c<?>> bVar3 = eVar.f12226e;
            eVar.f12227f = false;
            HashSet hashSet = new HashSet();
            z0.b<e0> bVar4 = eVar.f12225d;
            e0[] e0VarArr = bVar4.f34700a;
            int i10 = bVar4.f34702c;
            for (int i11 = 0; i11 < i10; i11++) {
                e0 e0Var = e0VarArr[i11];
                c<?> cVar = bVar3.f34700a[i11];
                d.c cVar2 = e0Var.I.f13793e;
                if (cVar2.f1157p) {
                    e.b(cVar2, cVar, hashSet);
                }
            }
            bVar4.g();
            bVar3.g();
            i2.c[] cVarArr = bVar2.f34700a;
            int i12 = bVar2.f34702c;
            for (int i13 = 0; i13 < i12; i13++) {
                i2.c cVar3 = cVarArr[i13];
                c<?> cVar4 = bVar.f34700a[i13];
                if (cVar3.f1157p) {
                    e.b(cVar3, cVar4, hashSet);
                }
            }
            bVar2.g();
            bVar.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((i2.c) it.next()).V1();
            }
            return f0.f21461a;
        }
    }

    public e(AndroidComposeView androidComposeView) {
        this.f12222a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
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
    public static void b(d.c cVar, c cVar2, HashSet hashSet) {
        if (!cVar.f1144a.f1157p) {
            f2.a.b("visitSubtreeIf called on an unattached node");
        }
        z0.b bVar = new z0.b(new d.c[16]);
        d.c cVar3 = cVar.f1144a;
        d.c cVar4 = cVar3.f1149f;
        if (cVar4 == null) {
            k.a(bVar, cVar3);
        } else {
            bVar.b(cVar4);
        }
        while (true) {
            int i10 = bVar.f34702c;
            if (i10 == 0) {
                return;
            }
            d.c cVar5 = (d.c) bVar.k(i10 - 1);
            if ((cVar5.f1147d & 32) != 0) {
                for (d.c cVar6 = cVar5; cVar6 != null; cVar6 = cVar6.f1149f) {
                    if ((cVar6.f1146c & 32) != 0) {
                        m mVarB = cVar6;
                        ?? bVar2 = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof f) {
                                f fVar = (f) mVarB;
                                if (fVar instanceof i2.c) {
                                    i2.c cVar7 = (i2.c) fVar;
                                    if ((cVar7.f13773q instanceof d) && cVar7.f13776t.contains(cVar2)) {
                                        hashSet.add(fVar);
                                    }
                                }
                                if (fVar.E0().P(cVar2)) {
                                    break;
                                }
                            } else if ((mVarB.f1146c & 32) != 0 && (mVarB instanceof m)) {
                                d.c cVar8 = mVarB.f13947r;
                                int i11 = 0;
                                mVarB = mVarB;
                                bVar2 = bVar2;
                                while (cVar8 != null) {
                                    if ((cVar8.f1146c & 32) != 0) {
                                        i11++;
                                        bVar2 = bVar2;
                                        if (i11 == 1) {
                                            mVarB = cVar8;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB != 0) {
                                                bVar2.b(mVarB);
                                                mVarB = 0;
                                            }
                                            bVar2.b(cVar8);
                                        }
                                    }
                                    cVar8 = cVar8.f1149f;
                                    mVarB = mVarB;
                                    bVar2 = bVar2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            mVarB = k.b(bVar2);
                        }
                    }
                }
            }
            k.a(bVar, cVar5);
        }
    }

    public final void a() {
        if (this.f12227f) {
            return;
        }
        this.f12227f = true;
        this.f12222a.d(new a());
    }
}
