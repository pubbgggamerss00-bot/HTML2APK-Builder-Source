package di;

import androidx.lifecycle.b1;
import j5.a;
import x0.f2;
import x0.h2;
import x0.j;

/* loaded from: classes2.dex */
public final class p0 {
    public static final void a(final p5.s sVar, final g1.d dVar, final f1.b bVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(233973821);
        if ((((kVarP.l(sVar) ? 4 : 2) | i10 | (kVarP.l(dVar) ? 32 : 16)) & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            x0.y.b(new f2[]{k5.b.f16000a.a(sVar), h5.k.f12264a.a(sVar), d6.b.f7372a.a(sVar)}, f1.c.b(1808964477, new q5.r(dVar, bVar), kVarP), kVarP, 56);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(dVar, bVar, i10) { // from class: q5.p

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g1.d f22031b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ f1.b f22032c;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(385);
                    di.p0.a(this.f22030a, this.f22031b, this.f22032c, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final void b(final g1.d dVar, final f1.b bVar, x0.j jVar, final int i10) {
        x0.k kVarP = jVar.p(832919318);
        int i11 = (kVarP.l(dVar) ? 4 : 2) | i10 | (kVarP.l(bVar) ? 32 : 16);
        if ((i11 & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new l9.m0(1);
                kVarP.C(objG);
            }
            eh.l lVar = (eh.l) objG;
            b1 b1VarA = k5.b.a(kVarP);
            if (b1VarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            kotlin.jvm.internal.h hVarA = kotlin.jvm.internal.h0.a(q5.a.class);
            j5.c cVar = new j5.c();
            cVar.a(kotlin.jvm.internal.h0.a(q5.a.class), lVar);
            q5.a aVar = (q5.a) k5.c.a(b1VarA, hVarA, cVar.b(), b1VarA instanceof androidx.lifecycle.i ? ((androidx.lifecycle.i) b1VarA).getDefaultViewModelCreationExtras() : a.C0143a.f15159b);
            aVar.f21916c = new gb.i(dVar);
            dVar.e(aVar.f21915b, bVar, kVarP, ((i11 << 6) & 896) | (i11 & 112));
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new eh.p(bVar, i10) { // from class: q5.q

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.b f22036b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    di.p0.b(this.f22035a, this.f22036b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static final Object c(kotlinx.serialization.json.b bVar, String discriminator, kotlinx.serialization.json.v vVar, zh.a aVar) {
        kotlin.jvm.internal.r.e(bVar, "<this>");
        kotlin.jvm.internal.r.e(discriminator, "discriminator");
        return new a0(bVar, vVar, discriminator, aVar.getDescriptor()).q(aVar);
    }
}
