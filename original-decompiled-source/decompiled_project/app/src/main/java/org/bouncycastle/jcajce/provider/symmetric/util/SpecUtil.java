package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameters;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes.dex */
class SpecUtil {
    public static AlgorithmParameterSpec extractSpec(AlgorithmParameters algorithmParameters, Class[] clsArr) {
        try {
            return algorithmParameters.getParameterSpec(AlgorithmParameterSpec.class);
        } catch (Exception unused) {
            for (int i10 = 0; i10 != clsArr.length; i10++) {
                Class cls = clsArr[i10];
                if (cls != null) {
                    try {
                        return algorithmParameters.getParameterSpec(cls);
                    } catch (Exception unused2) {
                        continue;
                    }
                }
            }
            return null;
        }
    }
}
