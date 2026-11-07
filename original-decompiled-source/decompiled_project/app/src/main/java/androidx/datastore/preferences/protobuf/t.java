package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static volatile t f2150b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f2151c = new t(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.c<?, ?>> f2152a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2153a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2154b;

        public a(int i10, MessageLite messageLite) {
            this.f2153a = messageLite;
            this.f2154b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2153a == aVar.f2153a && this.f2154b == aVar.f2154b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2153a) * 65535) + this.f2154b;
        }
    }

    public t() {
        this.f2152a = new HashMap();
    }

    public static t b() {
        t tVar;
        k1 k1Var = k1.f2075c;
        t tVar2 = f2150b;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (t.class) {
            try {
                tVar = f2150b;
                if (tVar == null) {
                    Class<?> cls = s.f2149a;
                    t tVar3 = null;
                    if (cls != null) {
                        try {
                            tVar3 = (t) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    tVar = tVar3 != null ? tVar3 : f2151c;
                    f2150b = tVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tVar;
    }

    public final GeneratedMessageLite.c a(int i10, MessageLite messageLite) {
        return this.f2152a.get(new a(i10, messageLite));
    }

    public t(int i10) {
        this.f2152a = Collections.EMPTY_MAP;
    }
}
