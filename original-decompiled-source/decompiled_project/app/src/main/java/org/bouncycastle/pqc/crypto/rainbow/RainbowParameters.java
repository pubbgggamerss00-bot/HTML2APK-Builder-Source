package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;

/* loaded from: classes3.dex */
public class RainbowParameters implements CipherParameters {
    private static final int len_pkseed = 32;
    private static final int len_salt = 16;
    private static final int len_skseed = 32;
    public static final RainbowParameters rainbowIIIcircumzenithal;
    public static final RainbowParameters rainbowIIIclassic;
    public static final RainbowParameters rainbowIIIcompressed;
    public static final RainbowParameters rainbowVcircumzenithal;
    public static final RainbowParameters rainbowVclassic;
    public static final RainbowParameters rainbowVcompressed;
    private final Digest hash_algo;

    /* renamed from: m, reason: collision with root package name */
    private final int f20412m;

    /* renamed from: n, reason: collision with root package name */
    private final int f20413n;
    private final String name;

    /* renamed from: o1, reason: collision with root package name */
    private final int f20414o1;

    /* renamed from: o2, reason: collision with root package name */
    private final int f20415o2;

    /* renamed from: v1, reason: collision with root package name */
    private final int f20416v1;

    /* renamed from: v2, reason: collision with root package name */
    private final int f20417v2;
    private final Version version;

    static {
        Version version = Version.CLASSIC;
        rainbowIIIclassic = new RainbowParameters("rainbow-III-classic", 3, version);
        Version version2 = Version.CIRCUMZENITHAL;
        rainbowIIIcircumzenithal = new RainbowParameters("rainbow-III-circumzenithal", 3, version2);
        Version version3 = Version.COMPRESSED;
        rainbowIIIcompressed = new RainbowParameters("rainbow-III-compressed", 3, version3);
        rainbowVclassic = new RainbowParameters("rainbow-V-classic", 5, version);
        rainbowVcircumzenithal = new RainbowParameters("rainbow-V-circumzenithal", 5, version2);
        rainbowVcompressed = new RainbowParameters("rainbow-V-compressed", 5, version3);
    }

    private RainbowParameters(String str, int i10, Version version) {
        Digest sHA384Digest;
        this.name = str;
        if (i10 == 3) {
            this.f20416v1 = 68;
            this.f20414o1 = 32;
            this.f20415o2 = 48;
            sHA384Digest = new SHA384Digest();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f20416v1 = 96;
            this.f20414o1 = 36;
            this.f20415o2 = 64;
            sHA384Digest = new SHA512Digest();
        }
        this.hash_algo = sHA384Digest;
        int i11 = this.f20416v1;
        int i12 = this.f20414o1;
        this.f20417v2 = i11 + i12;
        int i13 = this.f20415o2;
        this.f20413n = i11 + i12 + i13;
        this.f20412m = i12 + i13;
        this.version = version;
    }

    public Digest getHash_algo() {
        return this.hash_algo;
    }

    public int getLen_pkseed() {
        return 32;
    }

    public int getLen_salt() {
        return 16;
    }

    public int getLen_skseed() {
        return 32;
    }

    public int getM() {
        return this.f20412m;
    }

    public int getN() {
        return this.f20413n;
    }

    public String getName() {
        return this.name;
    }

    public int getO1() {
        return this.f20414o1;
    }

    public int getO2() {
        return this.f20415o2;
    }

    public int getV1() {
        return this.f20416v1;
    }

    public int getV2() {
        return this.f20417v2;
    }

    public Version getVersion() {
        return this.version;
    }
}
