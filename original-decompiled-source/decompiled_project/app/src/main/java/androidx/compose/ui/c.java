package androidx.compose.ui;

import androidx.compose.ui.d;
import eh.l;
import eh.p;
import eh.q;
import j2.e3;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import pg.f0;
import x0.j;

/* loaded from: classes.dex */
public final class c {

    public static final class a extends s implements l<d.b, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1141a = new a(1);

        @Override // eh.l
        public final Boolean invoke(d.b bVar) {
            return Boolean.valueOf(!(bVar instanceof androidx.compose.ui.b));
        }
    }

    public static final class b extends s implements p<d, d.b, d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f1142a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(2);
            this.f1142a = jVar;
        }

        @Override // eh.p
        public final d invoke(d dVar, d.b bVar) {
            d dVar2 = dVar;
            d.b bVarB = bVar;
            if (bVarB instanceof androidx.compose.ui.b) {
                q<d, j, Integer, d> qVar = ((androidx.compose.ui.b) bVarB).f1140c;
                r.c(qVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                m0.b(3, qVar);
                d.a aVar = d.a.f1143b;
                j jVar = this.f1142a;
                bVarB = c.b(qVar.b(aVar, jVar, 0), jVar);
            }
            return dVar2.h(bVarB);
        }
    }

    public static final d a(d dVar, l<? super e3, f0> lVar, q<? super d, ? super j, ? super Integer, ? extends d> qVar) {
        return dVar.h(new androidx.compose.ui.b(lVar, qVar));
    }

    public static final d b(d dVar, j jVar) {
        if (dVar.d(a.f1141a)) {
            return dVar;
        }
        jVar.e(1219399079);
        d dVar2 = (d) dVar.c(d.a.f1143b, new b(jVar));
        jVar.G();
        return dVar2;
    }

    public static final d c(d dVar, j jVar) {
        jVar.L(439770924);
        d dVarB = b(dVar, jVar);
        jVar.B();
        return dVarB;
    }
}
