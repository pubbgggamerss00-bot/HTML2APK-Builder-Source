package zc;

import ci.a;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class p<KeyT extends ci.a, PrimitiveT> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<KeyT> f35022a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f35023b;

    public interface a<KeyT extends ci.a, PrimitiveT> {
        PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
    }

    public p() {
        throw null;
    }

    public p(Class cls) {
        this.f35022a = cls;
        this.f35023b = ad.h.class;
    }

    public abstract PrimitiveT a(KeyT keyt) throws GeneralSecurityException;
}
