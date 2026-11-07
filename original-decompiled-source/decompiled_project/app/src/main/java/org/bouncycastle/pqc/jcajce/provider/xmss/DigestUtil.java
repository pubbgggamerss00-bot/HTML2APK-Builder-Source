package org.bouncycastle.pqc.jcajce.provider.xmss;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.cms.a;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* loaded from: classes3.dex */
class DigestUtil {

    public static class DoubleDigest implements Digest {
        private SHAKEDigest digest;

        public DoubleDigest(SHAKEDigest sHAKEDigest) {
            this.digest = sHAKEDigest;
        }

        @Override // org.bouncycastle.crypto.Digest
        public int doFinal(byte[] bArr, int i10) {
            return this.digest.doFinal(bArr, i10, getDigestSize());
        }

        @Override // org.bouncycastle.crypto.Digest
        public String getAlgorithmName() {
            return this.digest.getAlgorithmName() + "/" + (this.digest.getDigestSize() * 16);
        }

        @Override // org.bouncycastle.crypto.Digest
        public int getDigestSize() {
            return this.digest.getDigestSize() * 2;
        }

        @Override // org.bouncycastle.crypto.Digest
        public void reset() {
            this.digest.reset();
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte b10) {
            this.digest.update(b10);
        }

        @Override // org.bouncycastle.crypto.Digest
        public void update(byte[] bArr, int i10, int i11) {
            this.digest.update(bArr, i10, i11);
        }
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException(a.a("unrecognized digest OID: ", aSN1ObjectIdentifier));
    }

    public static ASN1ObjectIdentifier getDigestOID(String str) {
        if (str.equals("SHA-256")) {
            return NISTObjectIdentifiers.id_sha256;
        }
        if (str.equals("SHA-512")) {
            return NISTObjectIdentifiers.id_sha512;
        }
        if (str.equals("SHAKE128")) {
            return NISTObjectIdentifiers.id_shake128;
        }
        if (str.equals("SHAKE256")) {
            return NISTObjectIdentifiers.id_shake256;
        }
        throw new IllegalArgumentException("unrecognized digest: ".concat(str));
    }

    public static byte[] getDigestResult(Digest digest) {
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    public static String getXMSSDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return "SHA256";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return "SHA512";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return "SHAKE128";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return "SHAKE256";
        }
        throw new IllegalArgumentException(a.a("unrecognized digest OID: ", aSN1ObjectIdentifier));
    }
}
