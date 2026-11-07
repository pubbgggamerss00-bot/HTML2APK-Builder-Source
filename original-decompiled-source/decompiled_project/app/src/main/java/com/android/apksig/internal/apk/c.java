package com.android.apksig.internal.apk;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ApkSigningBlockUtilsLite.lambda$getSignaturesToVerify$0((ApkSupportedSignature) obj, (ApkSupportedSignature) obj2);
    }
}
