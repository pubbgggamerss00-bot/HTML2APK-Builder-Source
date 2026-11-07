package org.bouncycastle.eac.operator.jcajce;

import java.security.NoSuchAlgorithmException;
import java.security.Signature;

/* loaded from: classes2.dex */
class DefaultEACHelper extends EACHelper {
    @Override // org.bouncycastle.eac.operator.jcajce.EACHelper
    public Signature createSignature(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }
}
