package zc;

import com.google.crypto.tink.shaded.protobuf.p0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class q<PrimitiveT, KeyProtoT extends p0> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<PrimitiveT> f35024a;

    public q(Class<PrimitiveT> cls) {
        this.f35024a = cls;
    }

    public abstract PrimitiveT a(KeyProtoT keyprotot) throws GeneralSecurityException;
}
