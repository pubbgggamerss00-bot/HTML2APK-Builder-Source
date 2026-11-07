package org.bouncycastle.asn1.x509;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import sd.d;
import sd.z;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements d {
    public static int a(float f10, float f11, float f12) {
        return Math.round((f10 + f11) * f12);
    }

    public static String c(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    @Override // sd.d
    public Object b(z zVar) {
        return ExecutorsRegistrar.f6874c.get();
    }
}
