package org.bouncycastle.crypto.constraints;

import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.crypto.CryptoServiceConstraintsException;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;

/* loaded from: classes2.dex */
public class LegacyBitsOfSecurityConstraint extends ServicesConstraint {
    private final int legacyRequiredBitsOfSecurity;
    private final int requiredBitsOfSecurity;

    /* renamed from: org.bouncycastle.crypto.constraints.LegacyBitsOfSecurityConstraint$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose;

        static {
            int[] iArr = new int[CryptoServicePurpose.values().length];
            $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose = iArr;
            try {
                iArr[CryptoServicePurpose.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[CryptoServicePurpose.VERIFYING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[CryptoServicePurpose.DECRYPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[CryptoServicePurpose.VERIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public LegacyBitsOfSecurityConstraint(int i10) {
        this(i10, 0);
    }

    @Override // org.bouncycastle.crypto.CryptoServicesConstraints
    public void check(CryptoServiceProperties cryptoServiceProperties) {
        if (isException(cryptoServiceProperties.getServiceName())) {
            return;
        }
        CryptoServicePurpose purpose = cryptoServiceProperties.getPurpose();
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$crypto$CryptoServicePurpose[purpose.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            if (cryptoServiceProperties.bitsOfSecurity() >= this.requiredBitsOfSecurity) {
                return;
            }
            throw new CryptoServiceConstraintsException("service does not provide " + this.requiredBitsOfSecurity + " bits of security only " + cryptoServiceProperties.bitsOfSecurity());
        }
        if (cryptoServiceProperties.bitsOfSecurity() < this.legacyRequiredBitsOfSecurity) {
            throw new CryptoServiceConstraintsException("service does not provide " + this.legacyRequiredBitsOfSecurity + " bits of security only " + cryptoServiceProperties.bitsOfSecurity());
        }
        if (purpose != CryptoServicePurpose.ANY) {
            Logger logger = ServicesConstraint.LOG;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("usage of legacy cryptography service for algorithm " + cryptoServiceProperties.getServiceName());
            }
        }
    }

    public LegacyBitsOfSecurityConstraint(int i10, int i11) {
        super(Collections.EMPTY_SET);
        this.requiredBitsOfSecurity = i10;
        this.legacyRequiredBitsOfSecurity = i11;
    }

    public LegacyBitsOfSecurityConstraint(int i10, int i11, Set<String> set) {
        super(set);
        this.requiredBitsOfSecurity = i10;
        this.legacyRequiredBitsOfSecurity = i11;
    }

    public LegacyBitsOfSecurityConstraint(int i10, Set<String> set) {
        this(i10, 0, set);
    }
}
