package org.bouncycastle.pqc.crypto.xmss;

import java.util.HashMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static void a(int i10, int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap map, Integer num) {
        map.put(num, new XMSSMTParameters(i10, i11, aSN1ObjectIdentifier));
    }
}
