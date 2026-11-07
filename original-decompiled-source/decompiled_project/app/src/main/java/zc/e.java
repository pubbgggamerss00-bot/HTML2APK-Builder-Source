package zc;

import androidx.room.f0;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.e0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import sc.h;
import wc.a;

/* loaded from: classes2.dex */
public abstract class e<KeyProtoT extends p0> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<KeyProtoT> f35003a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, q<?, KeyProtoT>> f35004b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f35005c;

    public static abstract class a<KeyFormatProtoT extends p0, KeyProtoT extends p0> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<KeyFormatProtoT> f35006a;

        /* renamed from: zc.e$a$a, reason: collision with other inner class name */
        public static final class C0358a<KeyFormatProtoT> {

            /* renamed from: a, reason: collision with root package name */
            public final KeyFormatProtoT f35007a;

            /* renamed from: b, reason: collision with root package name */
            public final h.a f35008b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0358a(com.google.crypto.tink.shaded.protobuf.w wVar, h.a aVar) {
                this.f35007a = wVar;
                this.f35008b = aVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f35006a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        public Map<String, C0358a<KeyFormatProtoT>> b() throws GeneralSecurityException {
            return Collections.EMPTY_MAP;
        }

        public abstract KeyFormatProtoT c(com.google.crypto.tink.shaded.protobuf.h hVar) throws z;

        public abstract void d(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    @SafeVarargs
    public e(Class<KeyProtoT> cls, q<?, KeyProtoT>... qVarArr) {
        this.f35003a = cls;
        HashMap map = new HashMap();
        for (q<?, KeyProtoT> qVar : qVarArr) {
            Class<?> cls2 = qVar.f35024a;
            if (map.containsKey(cls2)) {
                throw new IllegalArgumentException(f0.b(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            }
            map.put(cls2, qVar);
        }
        if (qVarArr.length > 0) {
            this.f35005c = qVarArr[0].f35024a;
        } else {
            this.f35005c = Void.class;
        }
        this.f35004b = Collections.unmodifiableMap(map);
    }

    public a.EnumC0318a a() {
        return a.EnumC0318a.f31490a;
    }

    public abstract String b();

    public final <P> P c(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        q<?, KeyProtoT> qVar = this.f35004b.get(cls);
        if (qVar != null) {
            return (P) qVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> d();

    public abstract e0.b e();

    public abstract KeyProtoT f(com.google.crypto.tink.shaded.protobuf.h hVar) throws z;

    public abstract void g(KeyProtoT keyprotot) throws GeneralSecurityException;
}
