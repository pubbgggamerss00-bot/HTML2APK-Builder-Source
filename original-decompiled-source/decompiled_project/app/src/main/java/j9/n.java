package j9;

import androidx.compose.ui.d;
import f9.m7;
import java.util.ArrayList;
import x0.h2;
import x0.j;

/* loaded from: classes.dex */
public final class n {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final ArrayList arrayList, final eh.p onOpen, x0.j jVar, final int i10) {
        final ArrayList arrayList2;
        kotlin.jvm.internal.r.e(onOpen, "onOpen");
        x0.k kVarP = jVar.p(-301734014);
        if ((((kVarP.l(arrayList) ? 4 : 2) | i10 | (kVarP.l(onOpen) ? 32 : 16)) & 19) == 18 && kVarP.s()) {
            kVarP.v();
            arrayList2 = arrayList;
        } else {
            if (arrayList.isEmpty()) {
                h2 h2VarV = kVarP.V();
                if (h2VarV != null) {
                    h2VarV.f31703d = new eh.p(arrayList, onOpen, i10) { // from class: j9.g

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ ArrayList f15401a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ eh.p f15402b;

                        @Override // eh.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iN = f3.i.n(1);
                            n.a(this.f15401a, this.f15402b, (x0.j) obj, iN);
                            return pg.f0.f21461a;
                        }
                    };
                    return;
                }
                return;
            }
            int size = 1073741823 - (1073741823 % arrayList.size());
            kVarP.L(-475955230);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new m7(1);
                kVarP.C(objG);
            }
            kVarP.T(false);
            e0.b bVarB = e0.e1.b(size, (eh.a) objG, kVarP);
            kVarP.L(-475953928);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new x.n();
                kVarP.C(objG2);
            }
            x.m mVar = (x.m) objG2;
            kVarP.T(false);
            x0.n1 n1VarD = h1.m.d(mVar, kVarP, 6);
            x.n nVar = bVarB.f8160r;
            Object objG3 = kVarP.g();
            if (objG3 == c0321a) {
                objG3 = bg.b.h(Boolean.FALSE);
                kVarP.C(objG3);
            }
            x0.n1 n1Var = (x0.n1) objG3;
            boolean zK = kVarP.K(nVar);
            Object objG4 = kVarP.g();
            if (zK || objG4 == c0321a) {
                objG4 = new x.d(nVar, n1Var, null);
                kVarP.C(objG4);
            }
            x0.o0.d((eh.p) objG4, nVar, kVarP);
            Boolean bool = (Boolean) n1VarD.getValue();
            bool.getClass();
            x0.n1 n1VarK = bg.b.k(bool, kVarP);
            Boolean bool2 = (Boolean) n1Var.getValue();
            bool2.getClass();
            x0.n1 n1VarK2 = bg.b.k(bool2, kVarP);
            androidx.lifecycle.l lifecycle = ((androidx.lifecycle.t) kVarP.f(h5.k.f12264a)).getLifecycle();
            kVarP.L(-475940989);
            boolean zL = kVarP.l(lifecycle) | kVarP.K(n1VarK) | kVarP.K(n1VarK2) | kVarP.K(bVarB) | kVarP.l(arrayList);
            Object objG5 = kVarP.g();
            if (zL || objG5 == c0321a) {
                arrayList2 = arrayList;
                i iVar = new i(lifecycle, bVarB, arrayList2, n1VarK, n1VarK2, null);
                kVarP.C(iVar);
                objG5 = iVar;
            } else {
                arrayList2 = arrayList;
            }
            kVarP.T(false);
            x0.o0.e(bVarB, lifecycle, (eh.p) objG5, kVarP);
            z.m.a(androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f), null, f1.c.b(1057404780, new m(bVarB, onOpen, arrayList2, mVar), kVarP), kVarP, 3078, 6);
        }
        h2 h2VarV2 = kVarP.V();
        if (h2VarV2 != null) {
            h2VarV2.f31703d = new eh.p(arrayList2, onOpen, i10) { // from class: j9.h

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ ArrayList f15410a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ eh.p f15411b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(1);
                    n.a(this.f15410a, this.f15411b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }
}
