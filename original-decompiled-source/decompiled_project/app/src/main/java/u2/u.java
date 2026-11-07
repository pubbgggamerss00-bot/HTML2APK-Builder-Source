package u2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        pg.n nVar = (pg.n) obj;
        pg.n nVar2 = (pg.n) obj2;
        return (((Number) nVar.f21470b).intValue() - ((Number) nVar.f21469a).intValue()) - (((Number) nVar2.f21470b).intValue() - ((Number) nVar2.f21469a).intValue());
    }
}
