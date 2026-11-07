package i0;

import androidx.compose.ui.d;
import org.bouncycastle.asn1.cmc.BodyPartID;
import x0.j;
import x2.f;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.s implements eh.q<androidx.compose.ui.d, x0.j, Integer, androidx.compose.ui.d> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13653a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13654b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2.l0 f13655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(int i10, int i11, t2.l0 l0Var) {
        super(3);
        this.f13653a = i10;
        this.f13654b = i11;
        this.f13655c = l0Var;
    }

    @Override // eh.q
    public final androidx.compose.ui.d b(androidx.compose.ui.d dVar, x0.j jVar, Integer num) {
        f3.d dVar2;
        x0.j jVar2 = jVar;
        num.intValue();
        jVar2.L(408240218);
        int i10 = this.f13653a;
        int i11 = this.f13654b;
        x1.c(i10, i11);
        d.a aVar = d.a.f1143b;
        if (i10 == 1 && i11 == Integer.MAX_VALUE) {
            jVar2.B();
            return aVar;
        }
        f3.d dVar3 = (f3.d) jVar2.f(j2.j2.f14779h);
        f.a aVar2 = (f.a) jVar2.f(j2.j2.f14782k);
        f3.r rVar = (f3.r) jVar2.f(j2.j2.f14785n);
        t2.l0 l0Var = this.f13655c;
        boolean zK = jVar2.K(l0Var) | jVar2.K(rVar);
        Object objG = jVar2.g();
        j.a.C0321a c0321a = j.a.f31715a;
        if (zK || objG == c0321a) {
            objG = qg.n0.e(l0Var, rVar);
            jVar2.C(objG);
        }
        t2.l0 l0Var2 = (t2.l0) objG;
        boolean zK2 = jVar2.K(aVar2) | jVar2.K(l0Var2);
        Object objG2 = jVar2.g();
        if (zK2 || objG2 == c0321a) {
            t2.b0 b0Var = l0Var2.f27852a;
            x2.f fVar = b0Var.f27780f;
            x2.p pVar = b0Var.f27777c;
            if (pVar == null) {
                pVar = x2.p.f32030c;
            }
            x2.n nVar = b0Var.f27778d;
            int i12 = nVar != null ? nVar.f32027a : 0;
            x2.o oVar = b0Var.f27779e;
            objG2 = aVar2.a(fVar, pVar, i12, oVar != null ? oVar.f32028a : 65535);
            jVar2.C(objG2);
        }
        x0.r3 r3Var = (x0.r3) objG2;
        boolean zK3 = jVar2.K(r3Var.getValue()) | jVar2.K(dVar3) | jVar2.K(aVar2) | jVar2.K(l0Var) | jVar2.K(rVar);
        Object objG3 = jVar2.g();
        if (zK3 || objG3 == c0321a) {
            dVar2 = dVar3;
            objG3 = Integer.valueOf((int) (j3.a(l0Var2, dVar3, aVar2, j3.f13380a, 1) & BodyPartID.bodyIdMax));
            jVar2.C(objG3);
        } else {
            dVar2 = dVar3;
        }
        int iIntValue = ((Number) objG3).intValue();
        f3.d dVar4 = dVar2;
        boolean zK4 = jVar2.K(r3Var.getValue()) | jVar2.K(rVar) | jVar2.K(l0Var) | jVar2.K(dVar4) | jVar2.K(aVar2);
        Object objG4 = jVar2.g();
        if (zK4 || objG4 == c0321a) {
            StringBuilder sb = new StringBuilder();
            String str = j3.f13380a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objG4 = Integer.valueOf((int) (j3.a(l0Var2, dVar4, aVar2, sb.toString(), 2) & BodyPartID.bodyIdMax));
            jVar2.C(objG4);
        }
        int iIntValue2 = ((Number) objG4).intValue() - iIntValue;
        Integer numValueOf = i10 == 1 ? null : Integer.valueOf(((i10 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i11 != Integer.MAX_VALUE ? Integer.valueOf(((i11 - 1) * iIntValue2) + iIntValue) : null;
        androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.g.g(aVar, numValueOf != null ? dVar4.u(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? dVar4.u(numValueOf2.intValue()) : Float.NaN);
        jVar2.B();
        return dVarG;
    }
}
