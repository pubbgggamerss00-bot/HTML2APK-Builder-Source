package com.basitce.htmltoapk.data.licenses;

import ai.a;
import bi.f;
import ci.c;
import ci.e;
import com.basitce.htmltoapk.data.licenses.OpenSourceLicenses;
import java.util.List;
import kotlin.jvm.internal.r;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.n0;
import pg.d;
import qg.z;
import zh.b;
import zh.q;

@d
/* loaded from: classes.dex */
public /* synthetic */ class OpenSourceLicenses$LibraryJson$$serializer implements GeneratedSerializer<OpenSourceLicenses.LibraryJson> {
    public static final int $stable;
    public static final OpenSourceLicenses$LibraryJson$$serializer INSTANCE;
    private static final f descriptor;

    static {
        OpenSourceLicenses$LibraryJson$$serializer openSourceLicenses$LibraryJson$$serializer = new OpenSourceLicenses$LibraryJson$$serializer();
        INSTANCE = openSourceLicenses$LibraryJson$$serializer;
        $stable = 8;
        n0 n0Var = new n0("com.basitce.htmltoapk.data.licenses.OpenSourceLicenses.LibraryJson", openSourceLicenses$LibraryJson$$serializer, 8);
        n0Var.j("uniqueId", false);
        n0Var.j("name", true);
        n0Var.j("artifactVersion", true);
        n0Var.j("description", true);
        n0Var.j("website", true);
        n0Var.j("developers", true);
        n0Var.j("organization", true);
        n0Var.j("licenses", true);
        descriptor = n0Var;
    }

    private OpenSourceLicenses$LibraryJson$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final b<?>[] childSerializers() {
        b<?>[] bVarArr = OpenSourceLicenses.LibraryJson.f5680i;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new b[]{stringSerializer, a.d(stringSerializer), a.d(stringSerializer), a.d(stringSerializer), a.d(stringSerializer), bVarArr[5], a.d(OpenSourceLicenses$Named$$serializer.INSTANCE), bVarArr[7]};
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.a
    public final OpenSourceLicenses.LibraryJson deserialize(ci.d decoder) {
        r.e(decoder, "decoder");
        f fVar = descriptor;
        ci.b bVarC = decoder.c(fVar);
        b<Object>[] bVarArr = OpenSourceLicenses.LibraryJson.f5680i;
        String strZ = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        OpenSourceLicenses.Named named = null;
        List list2 = null;
        int i10 = 0;
        boolean z10 = true;
        while (z10) {
            int iG = bVarC.g(fVar);
            switch (iG) {
                case -1:
                    z10 = false;
                    break;
                case 0:
                    strZ = bVarC.z(fVar, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str = (String) bVarC.s(fVar, 1, StringSerializer.INSTANCE, str);
                    i10 |= 2;
                    break;
                case 2:
                    str2 = (String) bVarC.s(fVar, 2, StringSerializer.INSTANCE, str2);
                    i10 |= 4;
                    break;
                case 3:
                    str3 = (String) bVarC.s(fVar, 3, StringSerializer.INSTANCE, str3);
                    i10 |= 8;
                    break;
                case 4:
                    str4 = (String) bVarC.s(fVar, 4, StringSerializer.INSTANCE, str4);
                    i10 |= 16;
                    break;
                case 5:
                    list = (List) bVarC.u(fVar, 5, bVarArr[5], list);
                    i10 |= 32;
                    break;
                case 6:
                    named = (OpenSourceLicenses.Named) bVarC.s(fVar, 6, OpenSourceLicenses$Named$$serializer.INSTANCE, named);
                    i10 |= 64;
                    break;
                case 7:
                    list2 = (List) bVarC.u(fVar, 7, bVarArr[7], list2);
                    i10 |= 128;
                    break;
                default:
                    throw new q(iG);
            }
        }
        bVarC.b(fVar);
        return new OpenSourceLicenses.LibraryJson(i10, strZ, str, str2, str3, str4, list, named, list2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i, zh.a
    public final f getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer, zh.i
    public final void serialize(e encoder, OpenSourceLicenses.LibraryJson value) {
        r.e(encoder, "encoder");
        r.e(value, "value");
        f fVar = descriptor;
        c cVarC = encoder.c(fVar);
        b<Object>[] bVarArr = OpenSourceLicenses.LibraryJson.f5680i;
        String str = value.f5681a;
        List<String> list = value.f5688h;
        OpenSourceLicenses.Named named = value.f5687g;
        List<OpenSourceLicenses.Named> list2 = value.f5686f;
        String str2 = value.f5685e;
        String str3 = value.f5684d;
        String str4 = value.f5683c;
        String str5 = value.f5682b;
        cVarC.M(fVar, 0, str);
        if (cVarC.i(fVar) || str5 != null) {
            cVarC.g(fVar, 1, StringSerializer.INSTANCE, str5);
        }
        if (cVarC.i(fVar) || str4 != null) {
            cVarC.g(fVar, 2, StringSerializer.INSTANCE, str4);
        }
        if (cVarC.i(fVar) || str3 != null) {
            cVarC.g(fVar, 3, StringSerializer.INSTANCE, str3);
        }
        if (cVarC.i(fVar) || str2 != null) {
            cVarC.g(fVar, 4, StringSerializer.INSTANCE, str2);
        }
        boolean zI = cVarC.i(fVar);
        z zVar = z.f22752a;
        if (zI || !r.a(list2, zVar)) {
            cVarC.y(fVar, 5, bVarArr[5], list2);
        }
        if (cVarC.i(fVar) || named != null) {
            cVarC.g(fVar, 6, OpenSourceLicenses$Named$$serializer.INSTANCE, named);
        }
        if (cVarC.i(fVar) || !r.a(list, zVar)) {
            cVarC.y(fVar, 7, bVarArr[7], list);
        }
        cVarC.b(fVar);
    }
}
