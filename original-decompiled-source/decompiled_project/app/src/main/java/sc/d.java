package sc;

import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p0;
import com.google.crypto.tink.shaded.protobuf.z;
import ed.e0;
import java.security.GeneralSecurityException;
import zc.e;

/* loaded from: classes2.dex */
public final class d<PrimitiveT, KeyProtoT extends p0> {

    /* renamed from: a, reason: collision with root package name */
    public final zc.e<KeyProtoT> f24796a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<PrimitiveT> f24797b;

    public d(zc.e<KeyProtoT> eVar, Class<PrimitiveT> cls) {
        if (!eVar.f35004b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(b6.a.b("Given internalKeyMananger ", eVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f24796a = eVar;
        this.f24797b = cls;
    }

    public final e0 a(com.google.crypto.tink.shaded.protobuf.h hVar) throws GeneralSecurityException {
        zc.e<KeyProtoT> eVar = this.f24796a;
        try {
            e.a<?, KeyProtoT> aVarD = eVar.d();
            p0 p0VarC = aVarD.c(hVar);
            aVarD.d(p0VarC);
            p0 p0VarA = aVarD.a(p0VarC);
            e0.a aVarD2 = e0.D();
            String strB = eVar.b();
            aVarD2.e();
            e0.w((e0) aVarD2.f6808b, strB);
            h.f fVarF = ((com.google.crypto.tink.shaded.protobuf.a) p0VarA).f();
            aVarD2.e();
            e0.x((e0) aVarD2.f6808b, fVarF);
            e0.b bVarE = eVar.e();
            aVarD2.e();
            e0.y((e0) aVarD2.f6808b, bVarE);
            return aVarD2.b();
        } catch (z e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }
}
