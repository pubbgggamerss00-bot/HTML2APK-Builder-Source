package org.bouncycastle.crypto;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class KeyGenerationParameters {
    private SecureRandom random;
    private int strength;

    public KeyGenerationParameters(SecureRandom secureRandom, int i10) {
        this.random = CryptoServicesRegistrar.getSecureRandom(secureRandom);
        this.strength = i10;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getStrength() {
        return this.strength;
    }
}
