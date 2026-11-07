package j2;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c5 implements Comparator<pg.n<? extends p1.e, ? extends List<q2.t>>> {

    /* renamed from: a, reason: collision with root package name */
    public static final c5 f14688a = new c5();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(pg.n<? extends p1.e, ? extends List<q2.t>> nVar, pg.n<? extends p1.e, ? extends List<q2.t>> nVar2) {
        pg.n<? extends p1.e, ? extends List<q2.t>> nVar3 = nVar;
        pg.n<? extends p1.e, ? extends List<q2.t>> nVar4 = nVar2;
        int iCompare = Float.compare(((p1.e) nVar3.f21469a).f21132b, ((p1.e) nVar4.f21469a).f21132b);
        return iCompare != 0 ? iCompare : Float.compare(((p1.e) nVar3.f21469a).f21134d, ((p1.e) nVar4.f21469a).f21134d);
    }
}
