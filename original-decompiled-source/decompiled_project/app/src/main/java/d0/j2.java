package d0;

import java.util.ArrayList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public interface j2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0077a f7168a = new C0077a();

        /* renamed from: d0.j2$a$a, reason: collision with other inner class name */
        public static final class C0077a implements j2 {
            @Override // d0.j2
            public final p.x a(int i10, int i11, p.x xVar) {
                int i12;
                if (i11 - i10 < 0 || (i12 = xVar.f20751b) == 0) {
                    return p.h.f20635a;
                }
                jh.g gVarQ = jh.j.q(0, i12);
                int i13 = gVarQ.f15744a;
                int i14 = gVarQ.f15745b;
                int iC = -1;
                if (i13 <= i14) {
                    while (xVar.c(i13) <= i10) {
                        iC = xVar.c(i13);
                        if (i13 == i14) {
                            break;
                        }
                        i13++;
                    }
                }
                if (iC == -1) {
                    return p.h.f20635a;
                }
                p.x xVar2 = p.h.f20635a;
                p.x xVar3 = new p.x(1);
                xVar3.a(iC);
                return xVar3;
            }

            @Override // d0.j2
            public final int b(ArrayList arrayList, int i10, int i11, int i12, int i13) {
                Object obj;
                int i14;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i15);
                    if (((s0) obj).getIndex() != i10) {
                        break;
                    }
                    i15++;
                }
                s0 s0Var = (s0) obj;
                if (s0Var != null) {
                    long j10 = s0Var.j(0);
                    i14 = (int) (s0Var.h() ? j10 & BodyPartID.bodyIdMax : j10 >> 32);
                } else {
                    i14 = Integer.MIN_VALUE;
                }
                int iMax = i12 == Integer.MIN_VALUE ? -i13 : Math.max(-i13, i12);
                return i14 != Integer.MIN_VALUE ? Math.min(iMax, i14 - i11) : iMax;
            }
        }
    }

    p.x a(int i10, int i11, p.x xVar);

    int b(ArrayList arrayList, int i10, int i11, int i12, int i13);
}
