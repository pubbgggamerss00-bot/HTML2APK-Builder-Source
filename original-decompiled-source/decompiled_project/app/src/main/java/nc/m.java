package nc;

import java.util.Iterator;
import nc.j0;

/* loaded from: classes2.dex */
public final class m extends k<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterable[] f18721b;

    public class a extends nc.a<Iterator<Object>> {
        public a(int i10) {
            super(i10, 0);
        }

        @Override // nc.a
        public final Iterator<Object> a(int i10) {
            return m.this.f18721b[i10].iterator();
        }
    }

    public m(Iterable[] iterableArr) {
        this.f18721b = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        a aVar = new a(this.f18721b.length);
        j0.b bVar = new j0.b();
        bVar.f18698b = j0.a.f18695d;
        bVar.f18699c = aVar;
        return bVar;
    }
}
