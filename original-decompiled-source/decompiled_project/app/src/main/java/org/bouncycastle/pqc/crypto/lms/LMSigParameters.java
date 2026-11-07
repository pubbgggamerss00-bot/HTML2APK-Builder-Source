package org.bouncycastle.pqc.crypto.lms;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

/* loaded from: classes3.dex */
public class LMSigParameters {
    public static final LMSigParameters lms_sha256_n24_h10;
    public static final LMSigParameters lms_sha256_n24_h15;
    public static final LMSigParameters lms_sha256_n24_h20;
    public static final LMSigParameters lms_sha256_n24_h25;
    public static final LMSigParameters lms_sha256_n24_h5;
    public static final LMSigParameters lms_sha256_n32_h10;
    public static final LMSigParameters lms_sha256_n32_h15;
    public static final LMSigParameters lms_sha256_n32_h20;
    public static final LMSigParameters lms_sha256_n32_h25;
    public static final LMSigParameters lms_sha256_n32_h5;
    public static final LMSigParameters lms_shake256_n24_h10;
    public static final LMSigParameters lms_shake256_n24_h15;
    public static final LMSigParameters lms_shake256_n24_h20;
    public static final LMSigParameters lms_shake256_n24_h25;
    public static final LMSigParameters lms_shake256_n24_h5;
    public static final LMSigParameters lms_shake256_n32_h10;
    public static final LMSigParameters lms_shake256_n32_h15;
    public static final LMSigParameters lms_shake256_n32_h20;
    public static final LMSigParameters lms_shake256_n32_h25;
    public static final LMSigParameters lms_shake256_n32_h5;
    private static Map<Object, LMSigParameters> paramBuilders;
    private final ASN1ObjectIdentifier digestOid;

    /* renamed from: h, reason: collision with root package name */
    private final int f20390h;

    /* renamed from: m, reason: collision with root package name */
    private final int f20391m;
    private final int type;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        lms_sha256_n32_h5 = new LMSigParameters(5, 32, 5, aSN1ObjectIdentifier);
        lms_sha256_n32_h10 = new LMSigParameters(6, 32, 10, aSN1ObjectIdentifier);
        lms_sha256_n32_h15 = new LMSigParameters(7, 32, 15, aSN1ObjectIdentifier);
        lms_sha256_n32_h20 = new LMSigParameters(8, 32, 20, aSN1ObjectIdentifier);
        lms_sha256_n32_h25 = new LMSigParameters(9, 32, 25, aSN1ObjectIdentifier);
        lms_sha256_n24_h5 = new LMSigParameters(10, 24, 5, aSN1ObjectIdentifier);
        lms_sha256_n24_h10 = new LMSigParameters(11, 24, 10, aSN1ObjectIdentifier);
        lms_sha256_n24_h15 = new LMSigParameters(12, 24, 15, aSN1ObjectIdentifier);
        lms_sha256_n24_h20 = new LMSigParameters(13, 24, 20, aSN1ObjectIdentifier);
        lms_sha256_n24_h25 = new LMSigParameters(14, 24, 25, aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_shake256_len;
        lms_shake256_n32_h5 = new LMSigParameters(15, 32, 5, aSN1ObjectIdentifier2);
        lms_shake256_n32_h10 = new LMSigParameters(16, 32, 10, aSN1ObjectIdentifier2);
        lms_shake256_n32_h15 = new LMSigParameters(17, 32, 15, aSN1ObjectIdentifier2);
        lms_shake256_n32_h20 = new LMSigParameters(18, 32, 20, aSN1ObjectIdentifier2);
        lms_shake256_n32_h25 = new LMSigParameters(19, 32, 25, aSN1ObjectIdentifier2);
        lms_shake256_n24_h5 = new LMSigParameters(20, 24, 5, aSN1ObjectIdentifier2);
        lms_shake256_n24_h10 = new LMSigParameters(21, 24, 10, aSN1ObjectIdentifier2);
        lms_shake256_n24_h15 = new LMSigParameters(22, 24, 15, aSN1ObjectIdentifier2);
        lms_shake256_n24_h20 = new LMSigParameters(23, 24, 20, aSN1ObjectIdentifier2);
        lms_shake256_n24_h25 = new LMSigParameters(24, 24, 25, aSN1ObjectIdentifier2);
        paramBuilders = new HashMap<Object, LMSigParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMSigParameters.1
            {
                LMSigParameters lMSigParameters = LMSigParameters.lms_sha256_n32_h5;
                a.a(lMSigParameters, this, lMSigParameters);
                LMSigParameters lMSigParameters2 = LMSigParameters.lms_sha256_n32_h10;
                a.a(lMSigParameters2, this, lMSigParameters2);
                LMSigParameters lMSigParameters3 = LMSigParameters.lms_sha256_n32_h15;
                a.a(lMSigParameters3, this, lMSigParameters3);
                LMSigParameters lMSigParameters4 = LMSigParameters.lms_sha256_n32_h20;
                a.a(lMSigParameters4, this, lMSigParameters4);
                LMSigParameters lMSigParameters5 = LMSigParameters.lms_sha256_n32_h25;
                a.a(lMSigParameters5, this, lMSigParameters5);
                LMSigParameters lMSigParameters6 = LMSigParameters.lms_sha256_n24_h5;
                a.a(lMSigParameters6, this, lMSigParameters6);
                LMSigParameters lMSigParameters7 = LMSigParameters.lms_sha256_n24_h10;
                a.a(lMSigParameters7, this, lMSigParameters7);
                LMSigParameters lMSigParameters8 = LMSigParameters.lms_sha256_n24_h15;
                a.a(lMSigParameters8, this, lMSigParameters8);
                LMSigParameters lMSigParameters9 = LMSigParameters.lms_sha256_n24_h20;
                a.a(lMSigParameters9, this, lMSigParameters9);
                LMSigParameters lMSigParameters10 = LMSigParameters.lms_sha256_n24_h25;
                a.a(lMSigParameters10, this, lMSigParameters10);
                LMSigParameters lMSigParameters11 = LMSigParameters.lms_shake256_n32_h5;
                a.a(lMSigParameters11, this, lMSigParameters11);
                LMSigParameters lMSigParameters12 = LMSigParameters.lms_shake256_n32_h10;
                a.a(lMSigParameters12, this, lMSigParameters12);
                LMSigParameters lMSigParameters13 = LMSigParameters.lms_shake256_n32_h15;
                a.a(lMSigParameters13, this, lMSigParameters13);
                LMSigParameters lMSigParameters14 = LMSigParameters.lms_shake256_n32_h20;
                a.a(lMSigParameters14, this, lMSigParameters14);
                LMSigParameters lMSigParameters15 = LMSigParameters.lms_shake256_n32_h25;
                a.a(lMSigParameters15, this, lMSigParameters15);
                LMSigParameters lMSigParameters16 = LMSigParameters.lms_shake256_n24_h5;
                a.a(lMSigParameters16, this, lMSigParameters16);
                LMSigParameters lMSigParameters17 = LMSigParameters.lms_shake256_n24_h10;
                a.a(lMSigParameters17, this, lMSigParameters17);
                LMSigParameters lMSigParameters18 = LMSigParameters.lms_shake256_n24_h15;
                a.a(lMSigParameters18, this, lMSigParameters18);
                LMSigParameters lMSigParameters19 = LMSigParameters.lms_shake256_n24_h20;
                a.a(lMSigParameters19, this, lMSigParameters19);
                LMSigParameters lMSigParameters20 = LMSigParameters.lms_shake256_n24_h25;
                a.a(lMSigParameters20, this, lMSigParameters20);
            }
        };
    }

    public LMSigParameters(int i10, int i11, int i12, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.type = i10;
        this.f20391m = i11;
        this.f20390h = i12;
        this.digestOid = aSN1ObjectIdentifier;
    }

    public static LMSigParameters getParametersForType(int i10) {
        return paramBuilders.get(Integer.valueOf(i10));
    }

    public ASN1ObjectIdentifier getDigestOID() {
        return this.digestOid;
    }

    public int getH() {
        return this.f20390h;
    }

    public int getM() {
        return this.f20391m;
    }

    public int getType() {
        return this.type;
    }
}
