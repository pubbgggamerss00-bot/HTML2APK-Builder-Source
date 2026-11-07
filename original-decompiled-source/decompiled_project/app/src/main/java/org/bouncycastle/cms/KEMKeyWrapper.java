package org.bouncycastle.cms;

import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.AsymmetricKeyWrapper;

/* loaded from: classes2.dex */
public abstract class KEMKeyWrapper extends AsymmetricKeyWrapper {
    public KEMKeyWrapper(AlgorithmIdentifier algorithmIdentifier) {
        super(algorithmIdentifier);
    }

    public abstract byte[] getEncapsulation();

    public abstract AlgorithmIdentifier getKdfAlgorithmIdentifier();

    public abstract int getKekLength();

    public abstract AlgorithmIdentifier getWrapAlgorithmIdentifier();
}
