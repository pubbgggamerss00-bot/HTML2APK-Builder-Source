package f9;

import androidx.compose.ui.d;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class j4 extends kotlin.jvm.internal.s implements eh.r<b0.e, Integer, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f9863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.e2 f9864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.p f9865c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f9866d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(List list, t0.e2 e2Var, eh.p pVar, long j10) {
        super(4);
        this.f9863a = list;
        this.f9864b = e2Var;
        this.f9865c = pVar;
        this.f9866d = j10;
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
            b bVar = (b) this.f9863a.get(iIntValue);
            jVar2.L(-2041132805);
            h0.e eVarA = h0.f.a(16);
            t0.e2 e2Var = this.f9864b;
            long j10 = e2Var.I;
            t.v vVarA = a9.d2.a(1, q1.b1.c(0.5f, e2Var.B));
            androidx.compose.ui.d dVarD = androidx.compose.foundation.layout.g.d(d.a.f1143b, 1.0f);
            jVar2.L(1873818987);
            eh.p pVar = this.f9865c;
            boolean zK = jVar2.K(pVar) | jVar2.K(bVar);
            Object objG = jVar2.g();
            if (zK || objG == j.a.f31715a) {
                objG = new f4(pVar, bVar);
                jVar2.C(objG);
            }
            jVar2.B();
            t0.md.b((eh.a) objG, dVarD, false, eVarA, j10, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, vVarA, null, f1.c.b(-1469189055, new g4(bVar, e2Var, this.f9866d), jVar2), jVar2, 48, 740);
            jVar2.B();
        } else {
            jVar2.v();
        }
        return pg.f0.f21461a;
    }
}
