package t;

import x0.h2;

/* loaded from: classes.dex */
public final class w {

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f25399a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.l<s1.e, pg.f0> f25400b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f25401c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.compose.ui.d dVar, eh.l<? super s1.e, pg.f0> lVar, int i10) {
            super(2);
            this.f25399a = dVar;
            this.f25400b = lVar;
            this.f25401c = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f25401c | 1);
            w.a(this.f25399a, this.f25400b, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, eh.l<? super s1.e, pg.f0> lVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-932836462);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.l(lVar) ? 32 : 16;
        }
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            p1.d.b(androidx.compose.ui.draw.a.a(dVar, lVar), kVarP);
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(dVar, lVar, i10);
        }
    }
}
