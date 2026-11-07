package org.bouncycastle.crypto.signers;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.DSAKeyParameters;
import org.bouncycastle.crypto.params.ECKeyParameters;
import org.bouncycastle.crypto.params.GOST3410KeyParameters;

/* loaded from: classes2.dex */
class Utils {
    public static CryptoServiceProperties getDefaultProperties(String str, int i10, CipherParameters cipherParameters, boolean z10) {
        return new DefaultServiceProperties(str, i10, cipherParameters, getPurpose(z10));
    }

    public static CryptoServicePurpose getPurpose(boolean z10) {
        return z10 ? CryptoServicePurpose.SIGNING : CryptoServicePurpose.VERIFYING;
    }

    public static CryptoServiceProperties getDefaultProperties(String str, DSAKeyParameters dSAKeyParameters, boolean z10) {
        return new DefaultServiceProperties(str, ConstraintUtils.bitsOfSecurityFor(dSAKeyParameters.getParameters().getP()), dSAKeyParameters, getPurpose(z10));
    }

    public static CryptoServiceProperties getDefaultProperties(String str, ECKeyParameters eCKeyParameters, boolean z10) {
        return new DefaultServiceProperties(str, ConstraintUtils.bitsOfSecurityFor(eCKeyParameters.getParameters().getCurve()), eCKeyParameters, getPurpose(z10));
    }

    public static CryptoServiceProperties getDefaultProperties(String str, GOST3410KeyParameters gOST3410KeyParameters, boolean z10) {
        return new DefaultServiceProperties(str, ConstraintUtils.bitsOfSecurityFor(gOST3410KeyParameters.getParameters().getP()), gOST3410KeyParameters, getPurpose(z10));
    }
}
