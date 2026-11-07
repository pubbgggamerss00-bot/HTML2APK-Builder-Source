package zc;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class b<SerializationT> {

    /* renamed from: a, reason: collision with root package name */
    public final hd.a f34999a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<SerializationT> f35000b;

    public interface a<SerializationT> {
        ci.a a(s sVar) throws GeneralSecurityException;
    }

    public b() {
        throw null;
    }

    public b(hd.a aVar) {
        this.f34999a = aVar;
        this.f35000b = s.class;
    }

    public abstract ci.a a(s sVar) throws GeneralSecurityException;
}
