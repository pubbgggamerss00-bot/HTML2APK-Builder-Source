package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.w;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static volatile o f6732b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f6733c = new o(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, w.e<?, ?>> f6734a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f6735a;

        /* renamed from: b, reason: collision with root package name */
        public final int f6736b;

        public a(int i10, p0 p0Var) {
            this.f6735a = p0Var;
            this.f6736b = i10;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6735a == aVar.f6735a && this.f6736b == aVar.f6736b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f6735a) * 65535) + this.f6736b;
        }
    }

    public o() {
        this.f6734a = new HashMap();
    }

    public static o a() {
        o oVar;
        o oVar2 = f6732b;
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (o.class) {
            try {
                oVar = f6732b;
                if (oVar == null) {
                    Class<?> cls = n.f6731a;
                    o oVar3 = null;
                    if (cls != null) {
                        try {
                            oVar3 = (o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    oVar = oVar3 != null ? oVar3 : f6733c;
                    f6732b = oVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return oVar;
    }

    public o(int i10) {
        this.f6734a = Collections.EMPTY_MAP;
    }
}
