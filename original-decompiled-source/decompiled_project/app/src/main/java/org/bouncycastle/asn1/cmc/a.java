package org.bouncycastle.asn1.cmc;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static byte[] a(ASN1Sequence aSN1Sequence, int i10) {
        return Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i10)).getOctets());
    }
}
