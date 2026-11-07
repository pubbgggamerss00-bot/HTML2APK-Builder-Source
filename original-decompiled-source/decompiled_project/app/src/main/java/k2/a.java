package k2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p1.c;
import q2.t;
import qg.p;
import qg.x;
import qg.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: k2.a$a, reason: collision with other inner class name */
    public final class C0159a extends s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final C0159a f15940a = new C0159a(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(ArrayList arrayList) {
        List list;
        long j10;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = z.f22752a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int i10 = p.i(arrayList);
                int i11 = 0;
                while (i11 < i10) {
                    i11++;
                    Object obj2 = arrayList.get(i11);
                    t tVar = (t) obj2;
                    t tVar2 = (t) obj;
                    float fAbs = Math.abs(Float.intBitsToFloat((int) (tVar2.e().c() >> 32)) - Float.intBitsToFloat((int) (tVar.e().c() >> 32)));
                    float fAbs2 = Math.abs(Float.intBitsToFloat((int) (tVar2.e().c() & BodyPartID.bodyIdMax)) - Float.intBitsToFloat((int) (tVar.e().c() & BodyPartID.bodyIdMax)));
                    arrayList2.add(new c((Float.floatToRawIntBits(fAbs) << 32) | (Float.floatToRawIntBits(fAbs2) & BodyPartID.bodyIdMax)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j10 = ((c) x.B(list)).f21129a;
            } else {
                if (list.isEmpty()) {
                    h3.a.b("Empty collection can't be reduced.");
                }
                Object objB = x.B(list);
                int i12 = p.i(list);
                if (1 <= i12) {
                    int i13 = 1;
                    while (true) {
                        objB = new c(c.g(((c) objB).f21129a, ((c) list.get(i13)).f21129a));
                        if (i13 == i12) {
                            break;
                        }
                        i13++;
                    }
                }
                j10 = ((c) objB).f21129a;
            }
            if (Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j10)) >= Float.intBitsToFloat((int) (j10 >> 32))) {
                return false;
            }
        }
        return true;
    }
}
