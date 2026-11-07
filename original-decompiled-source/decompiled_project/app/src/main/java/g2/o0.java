package g2;

import g2.g1;
import java.util.Map;

/* loaded from: classes.dex */
public interface o0 extends q {
    default m0 K0(int i10, int i11, Map map, eh.l lVar) {
        if ((i10 & (-16777216)) != 0 || ((-16777216) & i11) != 0) {
            f2.a.b("Size(" + i10 + " x " + i11 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new n0(i10, i11, map, this, lVar);
    }

    default m0 i0(int i10, int i11, Map<a, Integer> map, eh.l<? super g1.a, pg.f0> lVar) {
        return K0(i10, i11, map, lVar);
    }
}
