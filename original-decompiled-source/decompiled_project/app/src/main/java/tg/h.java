package tg;

import eh.p;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public interface h {

    public interface a extends h {

        /* renamed from: tg.h$a$a, reason: collision with other inner class name */
        public static final class C0291a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends a> E a(a aVar, b<E> key) {
                r.e(key, "key");
                if (r.a(aVar.getKey(), key)) {
                    return aVar;
                }
                return null;
            }

            public static h b(a aVar, b<?> key) {
                r.e(key, "key");
                return r.a(aVar.getKey(), key) ? i.f28768a : aVar;
            }

            public static h c(a aVar, h context) {
                r.e(context, "context");
                return context == i.f28768a ? aVar : (h) context.fold(aVar, new g());
            }
        }

        b<?> getKey();
    }

    public interface b<E extends a> {
    }

    <R> R fold(R r10, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    h minusKey(b<?> bVar);

    h plus(h hVar);
}
