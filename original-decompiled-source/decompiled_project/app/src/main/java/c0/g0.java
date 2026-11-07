package c0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public class g0 {
    public static rg.b a(rg.b bVar) {
        bVar.j();
        bVar.f23536c = true;
        return bVar.f23535b > 0 ? bVar : rg.b.f23533d;
    }

    public static rg.b b() {
        return new rg.b(10);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.r.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final Object d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final int e(f0 f0Var) {
        boolean z10 = f0Var.getOrientation() == v.t0.f30083a;
        List<o> listI = f0Var.i();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < listI.size()) {
            o oVar = f0Var.i().get(i10);
            int iG = z10 ? oVar.g() : oVar.m();
            if (iG == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < listI.size()) {
                    o oVar2 = f0Var.i().get(i10);
                    if ((z10 ? oVar2.g() : oVar2.m()) != iG) {
                        break;
                    }
                    iMax = Math.max(iMax, (int) (z10 ? listI.get(i10).a() & BodyPartID.bodyIdMax : listI.get(i10).a() >> 32));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return f0Var.g() + (i11 / i12);
    }
}
