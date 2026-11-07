package w5;

import java.util.Iterator;
import x5.b.a;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k implements Iterable<Object>, q5.a {
    public final /* synthetic */ x5.b s;

    public k(x5.b bVar) {
        this.s = bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.s.new a();
    }
}
