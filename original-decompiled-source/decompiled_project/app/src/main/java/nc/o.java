package nc;

import java.util.Collection;
import nc.s;

/* loaded from: classes2.dex */
public abstract class o<K, V> extends s<K, V> implements e<K, V> {

    public static final class a<K, V> extends s.a<K, V> {
        @Override // nc.s.a
        public final /* bridge */ /* synthetic */ s a() {
            throw null;
        }

        @Override // nc.s.a
        public final s.a b(Object obj, Object obj2) {
            throw null;
        }

        public final t0 c() {
            return this.f18745b == 0 ? t0.f18746j : new t0(this.f18744a, this.f18745b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(Object obj, String str) {
            super.b(obj, str);
        }
    }

    @Override // nc.s
    public final p f() {
        throw new AssertionError("should never be called");
    }

    @Override // nc.s
    /* renamed from: i */
    public final p values() {
        return ((t0) this).f18751h.keySet();
    }

    @Override // nc.s, java.util.Map
    public final Collection values() {
        return ((t0) this).f18751h.keySet();
    }
}
