package j2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class t4 implements Comparator<q2.t> {

    /* renamed from: a, reason: collision with root package name */
    public static final t4 f14906a = new t4();

    @Override // java.util.Comparator
    public final int compare(q2.t tVar, q2.t tVar2) {
        p1.e eVarF = tVar.f();
        p1.e eVarF2 = tVar2.f();
        int iCompare = Float.compare(eVarF2.f21133c, eVarF.f21133c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(eVarF.f21132b, eVarF2.f21132b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(eVarF.f21134d, eVarF2.f21134d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(eVarF2.f21131a, eVarF.f21131a);
    }
}
