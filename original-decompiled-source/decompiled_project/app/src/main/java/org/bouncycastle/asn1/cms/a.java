package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: classes2.dex */
public final /* synthetic */ class a {
    public static int a(ASN1Sequence aSN1Sequence, int i10) {
        return ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i10)).intValueExact();
    }
}
