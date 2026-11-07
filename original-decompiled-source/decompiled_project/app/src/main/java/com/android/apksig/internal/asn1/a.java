package com.android.apksig.internal.asn1;

import com.android.apksig.internal.asn1.Asn1BerParser;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Asn1BerParser.lambda$parseSequence$0((Asn1BerParser.AnnotatedField) obj, (Asn1BerParser.AnnotatedField) obj2);
    }
}
