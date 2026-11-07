package com.basitce.htmltoapk.data.licenses;

import ai.a;
import bi.f;
import ci.c;
import ci.e;
import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.n0;
import pg.d;
import zh.b;
import zh.q;

@d
/* loaded from: classes.dex */
public /* synthetic */ class OpenSourceLicenses$Named$$serializer implements GeneratedSerializer<OpenSourceLicenses.Named> {
    public static final int $stable;
    public static final OpenSourceLicenses$Named$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OpenSourceLicenses$Named$$serializer openSourceLicenses$Named$$serializer = new OpenSourceLicenses$Named$$serializer();
        INSTANCE = openSourceLicenses$Named$$serializer;
        $stable = 8;
        n0 n0Var = new n0("com.basitce.htmltoapk.data.licenses.OpenSourceLicenses.Named", openSourceLicenses$Named$$serializer, 1);
        n0Var.j("name", true);
        descriptor = n0Var;
    }

    private OpenSourceLicenses$Named$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] childSerializers() {
        return new b[]{a.d(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
    public final OpenSourceLicenses.Named deserialize(ci.d decoder) {
        r.e(decoder, "decoder");
        f fVar = descriptor;
        ci.b bVarC = decoder.c(fVar);
        String str = null;
        boolean z10 = true;
        int i10 = 0;
        while (z10) {
            int iG = bVarC.g(fVar);
            if (iG == -1) {
                z10 = false;
            } else {
                if (iG != 0) {
                    throw new q(iG);
                }
                str = (String) bVarC.s(fVar, 0, StringSerializer.INSTANCE, str);
                i10 = 1;
            }
        }
        bVarC.b(fVar);
        return new OpenSourceLicenses.Named(i10, str);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
    public final void serialize(e encoder, OpenSourceLicenses.Named value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        String str = value.f5692a;
        f fVar = descriptor;
        c cVarC = encoder.c(fVar);
        OpenSourceLicenses.Named.a aVar = OpenSourceLicenses.Named.Companion;
        if (cVarC.i(fVar) || str != null) {
            cVarC.g(fVar, 0, StringSerializer.INSTANCE, str);
        }
        cVarC.b(fVar);
    }
}
