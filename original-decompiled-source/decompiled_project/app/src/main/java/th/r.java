package th;

/* loaded from: classes2.dex */
public interface r<T> extends sh.f<T> {

    public static final class a {
        public static /* synthetic */ sh.f a(r rVar, tg.h hVar, int i10, rh.a aVar, int i11) {
            if ((i11 & 1) != 0) {
                hVar = tg.i.f28768a;
            }
            if ((i11 & 2) != 0) {
                i10 = -3;
            }
            if ((i11 & 4) != 0) {
                aVar = rh.a.f23576a;
            }
            return rVar.d(hVar, i10, aVar);
        }
    }

    sh.f<T> d(tg.h hVar, int i10, rh.a aVar);
}
