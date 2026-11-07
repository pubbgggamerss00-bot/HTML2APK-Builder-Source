package org.bouncycastle.jcajce.provider.asymmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import p1.e;
import t2.f0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements f0 {
    public static StringBuilder b(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        return new StringBuilder(str2);
    }

    @Override // t2.f0
    public boolean a(e eVar, e eVar2) {
        return eVar.h(eVar2);
    }
}
