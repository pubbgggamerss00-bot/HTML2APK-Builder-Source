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
public /* synthetic */ class OpenSourceLicenses$LicenseJson$$serializer implements GeneratedSerializer<OpenSourceLicenses.LicenseJson> {
    public static final int $stable;
    public static final OpenSourceLicenses$LicenseJson$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OpenSourceLicenses$LicenseJson$$serializer openSourceLicenses$LicenseJson$$serializer = new OpenSourceLicenses$LicenseJson$$serializer();
        INSTANCE = openSourceLicenses$LicenseJson$$serializer;
        $stable = 8;
        n0 n0Var = new n0("com.basitce.htmltoapk.data.licenses.OpenSourceLicenses.LicenseJson", openSourceLicenses$LicenseJson$$serializer, 3);
        n0Var.j("name", false);
        n0Var.j("url", true);
        n0Var.j("content", true);
        descriptor = n0Var;
    }

    private OpenSourceLicenses$LicenseJson$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new b[]{stringSerializer, a.d(stringSerializer), a.d(stringSerializer)};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
    public final OpenSourceLicenses.LicenseJson deserialize(ci.d decoder) {
        r.e(decoder, "decoder");
        f fVar = descriptor;
        ci.b bVarC = decoder.c(fVar);
        String strZ = null;
        boolean z10 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        while (z10) {
            int iG = bVarC.g(fVar);
            if (iG == -1) {
                z10 = false;
            } else if (iG == 0) {
                strZ = bVarC.z(fVar, 0);
                i10 |= 1;
            } else if (iG == 1) {
                str = (String) bVarC.s(fVar, 1, StringSerializer.INSTANCE, str);
                i10 |= 2;
            } else {
                if (iG != 2) {
                    throw new q(iG);
                }
                str2 = (String) bVarC.s(fVar, 2, StringSerializer.INSTANCE, str2);
                i10 |= 4;
            }
        }
        bVarC.b(fVar);
        return new OpenSourceLicenses.LicenseJson(i10, strZ, str, str2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
    public final void serialize(e encoder, OpenSourceLicenses.LicenseJson value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        f fVar = descriptor;
        c cVarC = encoder.c(fVar);
        String str = value.f5689a;
        String str2 = value.f5691c;
        String str3 = value.f5690b;
        cVarC.M(fVar, 0, str);
        if (cVarC.i(fVar) || str3 != null) {
            cVarC.g(fVar, 1, StringSerializer.INSTANCE, str3);
        }
        if (cVarC.i(fVar) || str2 != null) {
            cVarC.g(fVar, 2, StringSerializer.INSTANCE, str2);
        }
        cVarC.b(fVar);
    }
}
