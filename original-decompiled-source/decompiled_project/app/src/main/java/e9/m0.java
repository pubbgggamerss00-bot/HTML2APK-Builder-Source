package e9;

import java.util.List;
import t0.ff;
import t0.nf;
import t0.of;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8468a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(List list) {
        super(4);
        this.f8468a = list;
    }

    @Override // eh.r
    public final pg.f0 f(b0.e eVar, Integer num, x0.j jVar, Integer num2) {
        int i10;
        b0.e eVar2 = eVar;
        int iIntValue = num.intValue();
        x0.j jVar2 = jVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i10 = (jVar2.K(eVar2) ? 4 : 2) | iIntValue2;
        } else {
            i10 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i10 |= jVar2.i(iIntValue) ? 32 : 16;
        }
        if (jVar2.A(i10 & 1, (i10 & 147) != 146)) {
            String str = (String) this.f8468a.get(iIntValue);
            jVar2.L(-581695246);
            ff.b(str, null, mh.x.r(str, "[SUCCESS]", false) ? c2.n0.c(4285132974L) : mh.x.r(str, "[ERROR]", false) ? c2.n0.c(4294922834L) : c2.n0.c(4289767616L), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, t2.l0.a(((nf) jVar2.f(of.f26647a)).f26549l, 0L, 0L, null, x2.f.f32016c, 0L, 0L, null, null, 16777183), jVar2, 0, 0, 65530);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
