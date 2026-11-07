package org.bouncycastle.pqc.crypto.crystals.kyber;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* loaded from: classes3.dex */
public class KyberParameters implements KEMParameters {

    /* renamed from: k, reason: collision with root package name */
    private final int f20330k;
    private final String name;
    private final int sessionKeySize;
    private final boolean usingAes;
    public static final KyberParameters kyber512 = new KyberParameters("kyber512", 2, 256, false);
    public static final KyberParameters kyber768 = new KyberParameters("kyber768", 3, 256, false);
    public static final KyberParameters kyber1024 = new KyberParameters("kyber1024", 4, 256, false);

    private KyberParameters(String str, int i10, int i11, boolean z10) {
        this.name = str;
        this.f20330k = i10;
        this.sessionKeySize = i11;
        this.usingAes = z10;
    }

    public KyberEngine getEngine() {
        return new KyberEngine(this.f20330k, this.usingAes);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
