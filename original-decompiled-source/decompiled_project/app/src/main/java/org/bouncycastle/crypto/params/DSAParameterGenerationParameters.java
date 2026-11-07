package org.bouncycastle.crypto.params;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class DSAParameterGenerationParameters {
    public static final int DIGITAL_SIGNATURE_USAGE = 1;
    public static final int KEY_ESTABLISHMENT_USAGE = 2;
    private final int certainty;

    /* renamed from: l, reason: collision with root package name */
    private final int f20069l;

    /* renamed from: n, reason: collision with root package name */
    private final int f20070n;
    private final SecureRandom random;
    private final int usageIndex;

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom) {
        this(i10, i11, i12, secureRandom, -1);
    }

    public int getCertainty() {
        return this.certainty;
    }

    public int getL() {
        return this.f20069l;
    }

    public int getN() {
        return this.f20070n;
    }

    public SecureRandom getRandom() {
        return this.random;
    }

    public int getUsageIndex() {
        return this.usageIndex;
    }

    public DSAParameterGenerationParameters(int i10, int i11, int i12, SecureRandom secureRandom, int i13) {
        this.f20069l = i10;
        this.f20070n = i11;
        this.certainty = i12;
        this.usageIndex = i13;
        this.random = secureRandom;
    }
}
