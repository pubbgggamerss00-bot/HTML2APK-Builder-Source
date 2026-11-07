package org.bouncycastle.math.ec;

/* loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static ECFieldElement a(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement eCFieldElement3) {
        return eCFieldElement.square().add(eCFieldElement2).add(eCFieldElement3);
    }
}
