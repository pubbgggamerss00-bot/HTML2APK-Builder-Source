package r;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class w implements g2.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f22970a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22971b;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f22972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList arrayList) {
            super(1);
            this.f22972a = arrayList;
        }

        @Override // eh.l
        public final pg.f0 invoke(g1.a aVar) {
            g1.a aVar2 = aVar;
            ArrayList arrayList = this.f22972a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                aVar2.d((g2.g1) arrayList.get(i10), 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
            }
            return pg.f0.f21461a;
        }
    }

    public w(i0 i0Var) {
        this.f22970a = i0Var;
    }

    @Override // g2.l0
    public final int c(g2.q qVar, List<? extends g2.p> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = list.get(0).O(i10);
        int i11 = qg.p.i(list);
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iO2 = list.get(i12).O(i10);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return iO;
    }

    @Override // g2.l0
    public final int f(g2.q qVar, List<? extends g2.p> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iJ = list.get(0).J(i10);
        int i11 = qg.p.i(list);
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iJ2 = list.get(i12).J(i10);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return iJ;
    }

    @Override // g2.l0
    public final int g(g2.q qVar, List<? extends g2.p> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iB0 = list.get(0).b0(i10);
        int i11 = qg.p.i(list);
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iB02 = list.get(i12).b0(i10);
                if (iB02 > iB0) {
                    iB0 = iB02;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return iB0;
    }

    @Override // g2.l0
    public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            g2.g1 g1VarP = list.get(i10).P(j10);
            iMax = Math.max(iMax, g1VarP.f11382a);
            iMax2 = Math.max(iMax2, g1VarP.f11383b);
            arrayList.add(g1VarP);
        }
        boolean zI0 = o0Var.I0();
        i0 i0Var = this.f22970a;
        if (zI0) {
            this.f22971b = true;
            i0Var.f22852b.setValue(new f3.p((BodyPartID.bodyIdMax & iMax2) | (iMax << 32)));
        } else if (!this.f22971b) {
            i0Var.f22852b.setValue(new f3.p((BodyPartID.bodyIdMax & iMax2) | (iMax << 32)));
        }
        return o0Var.i0(iMax, iMax2, qg.a0.f22708a, new a(arrayList));
    }

    @Override // g2.l0
    public final int i(g2.q qVar, List<? extends g2.p> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iZ = list.get(0).z(i10);
        int i11 = qg.p.i(list);
        int i12 = 1;
        if (1 <= i11) {
            while (true) {
                int iZ2 = list.get(i12).z(i10);
                if (iZ2 > iZ) {
                    iZ = iZ2;
                }
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return iZ;
    }
}
