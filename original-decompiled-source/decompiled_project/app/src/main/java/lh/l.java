package lh;

import b9.q0;
import java.util.Iterator;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public class l extends e1.d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class a<T> implements g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f17080a;

        public a(Iterator it) {
            this.f17080a = it;
        }

        @Override // lh.g
        public final Iterator<T> iterator() {
            return this.f17080a;
        }
    }

    public static <T> g<T> g(Iterator<? extends T> it) {
        r.e(it, "<this>");
        return new lh.a(new a(it));
    }

    public static g h(eh.l nextFunction, Object obj) {
        r.e(nextFunction, "nextFunction");
        return obj == null ? d.f17062a : new f(new q0(obj, 2), nextFunction);
    }
}
