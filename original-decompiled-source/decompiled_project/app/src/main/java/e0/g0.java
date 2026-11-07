package e0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f8190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ArrayList arrayList) {
        super(1);
        this.f8190a = arrayList;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        int i10;
        int i11;
        g1.a aVar2 = aVar;
        ArrayList arrayList = this.f8190a;
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            m mVar = (m) arrayList.get(i12);
            List<g2.g1> list = mVar.f8223b;
            boolean z10 = mVar.f8230i;
            if (mVar.f8234m == Integer.MIN_VALUE) {
                y.c.a("position() should be called first");
            }
            int size2 = list.size();
            int i13 = 0;
            while (i13 < size2) {
                g2.g1 g1Var = list.get(i13);
                int[] iArr = mVar.f8232k;
                int i14 = i13 * 2;
                int i15 = i12;
                long j10 = (iArr[i14 + 1] & BodyPartID.bodyIdMax) | (iArr[i14] << 32);
                if (mVar.f8229h) {
                    if (z10) {
                        i10 = (int) (j10 >> 32);
                    } else {
                        i10 = (mVar.f8234m - ((int) (j10 >> 32))) - (z10 ? g1Var.f11383b : g1Var.f11382a);
                    }
                    if (z10) {
                        i11 = (mVar.f8234m - ((int) (j10 & BodyPartID.bodyIdMax))) - (z10 ? g1Var.f11383b : g1Var.f11382a);
                    } else {
                        i11 = (int) (j10 & BodyPartID.bodyIdMax);
                    }
                    j10 = (i11 & BodyPartID.bodyIdMax) | (i10 << 32);
                }
                long jD = f3.m.d(j10, mVar.f8224c);
                if (z10) {
                    g1.a.l(aVar2, g1Var, jD);
                } else {
                    g1.a.i(aVar2, g1Var, jD);
                }
                i13++;
                i12 = i15;
            }
            i12++;
        }
        return pg.f0.f21461a;
    }
}
