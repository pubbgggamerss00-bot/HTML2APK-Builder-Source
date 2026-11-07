package org.bouncycastle.its.jcajce;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes2.dex */
class ClassUtil {
    public static AlgorithmParameterSpec getGCMSpec(byte[] bArr, int i10) {
        return new GCMParameterSpec(i10, bArr);
    }
}
