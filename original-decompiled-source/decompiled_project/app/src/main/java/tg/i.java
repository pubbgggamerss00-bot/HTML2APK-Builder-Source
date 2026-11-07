package tg;

import eh.p;
import java.io.Serializable;
import kotlin.jvm.internal.r;
import tg.h;

/* loaded from: classes2.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i f28768a = new i();

    @Override // tg.h
    public final <R> R fold(R r10, p<? super R, ? super h.a, ? extends R> pVar) {
        return r10;
    }

    @Override // tg.h
    public final <E extends h.a> E get(h.b<E> key) {
        r.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // tg.h
    public final h minusKey(h.b<?> key) {
        r.e(key, "key");
        return this;
    }

    @Override // tg.h
    public final h plus(h context) {
        r.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
