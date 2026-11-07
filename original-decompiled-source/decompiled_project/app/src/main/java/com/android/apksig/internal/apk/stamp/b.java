package com.android.apksig.internal.apk.stamp;

import com.android.apksig.internal.util.Pair;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return V1SourceStampVerifier.lambda$getApkDigests$0((Pair) obj, (Pair) obj2);
    }
}
