package c;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.a0;
import java.util.UUID;
import pg.f0;
import x0.j;
import x0.j0;
import x0.k0;
import x0.l0;
import x0.n1;
import x0.o0;

/* loaded from: classes.dex */
public final class d {

    public static final class a extends kotlin.jvm.internal.s implements eh.l<l0, k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c.a<I> f4287a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e.f f4288b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f4289c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f.a<I, O> f4290d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n1 f4291e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c.a aVar, e.f fVar, String str, f.a aVar2, n1 n1Var) {
            super(1);
            this.f4287a = aVar;
            this.f4288b = fVar;
            this.f4289c = str;
            this.f4290d = aVar2;
            this.f4291e = n1Var;
        }

        @Override // eh.l
        public final k0 invoke(l0 l0Var) {
            final n1 n1Var = this.f4291e;
            e.i iVarC = this.f4288b.c(this.f4289c, this.f4290d, new e.b() { // from class: c.b
                @Override // e.b
                public final void a(Object obj) {
                    ((eh.l) n1Var.getValue()).invoke(obj);
                }
            });
            c.a<I> aVar = this.f4287a;
            aVar.f4284a = iVarC;
            return new c(aVar);
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f4292a = new b(0);

        @Override // eh.a
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    public static final <I, O> k<I, O> a(f.a<I, O> aVar, eh.l<? super O, f0> lVar, x0.j jVar, int i10) {
        f.a<I, O> aVar2;
        n1 n1VarK = bg.b.k(aVar, jVar);
        n1 n1VarK2 = bg.b.k(lVar, jVar);
        String str = (String) a0.d(new Object[0], null, b.f4292a, jVar, 3072, 6);
        e.j jVar2 = (e.j) jVar.f(i.f4307a);
        if (jVar2 == null) {
            jVar.L(1006590171);
            Object baseContext = (Context) jVar.f(AndroidCompositionLocals_androidKt.f1281b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof e.j) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            jVar2 = (e.j) baseContext;
        } else {
            jVar.L(1006589303);
        }
        jVar.B();
        if (jVar2 == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        e.f activityResultRegistry = jVar2.getActivityResultRegistry();
        Object objG = jVar.g();
        Object obj = j.a.f31715a;
        if (objG == obj) {
            objG = new c.a();
            jVar.C(objG);
        }
        c.a aVar3 = (c.a) objG;
        Object objG2 = jVar.g();
        if (objG2 == obj) {
            objG2 = new k(aVar3, n1VarK);
            jVar.C(objG2);
        }
        k<I, O> kVar = (k) objG2;
        boolean zL = jVar.l(aVar3) | jVar.l(activityResultRegistry) | jVar.K(str) | jVar.l(aVar) | jVar.K(n1VarK2);
        Object objG3 = jVar.g();
        if (zL || objG3 == obj) {
            aVar2 = aVar;
            objG3 = new a(aVar3, activityResultRegistry, str, aVar2, n1VarK2);
            jVar.C(objG3);
        } else {
            aVar2 = aVar;
        }
        eh.l lVar2 = (eh.l) objG3;
        l0 l0Var = o0.f31834a;
        boolean zK = jVar.K(activityResultRegistry) | jVar.K(str) | jVar.K(aVar2);
        Object objG4 = jVar.g();
        if (zK || objG4 == obj) {
            objG4 = new j0(lVar2);
            jVar.C(objG4);
        }
        return kVar;
    }
}
