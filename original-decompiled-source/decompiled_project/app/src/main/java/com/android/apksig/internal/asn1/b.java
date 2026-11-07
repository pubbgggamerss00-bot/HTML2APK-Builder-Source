package com.android.apksig.internal.asn1;

import com.android.apksig.internal.asn1.Asn1DerEncoder;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Asn1DerEncoder.lambda$toSequence$0((Asn1DerEncoder.AnnotatedField) obj, (Asn1DerEncoder.AnnotatedField) obj2);
    }
}
