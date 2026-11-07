package com.android.apksig.internal.apk.stamp;

import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.ApkSigningBlockUtilsLite;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class SourceStampCertificateLineage {
    private static final int CURRENT_VERSION = 1;
    private static final int FIRST_VERSION = 1;

    public static class SigningCertificateNode {
        public int flags;
        public final SignatureAlgorithm parentSigAlgorithm;
        public SignatureAlgorithm sigAlgorithm;
        public final byte[] signature;
        public final X509Certificate signingCert;

        public SigningCertificateNode(X509Certificate x509Certificate, SignatureAlgorithm signatureAlgorithm, SignatureAlgorithm signatureAlgorithm2, byte[] bArr, int i10) {
            this.signingCert = x509Certificate;
            this.parentSigAlgorithm = signatureAlgorithm;
            this.sigAlgorithm = signatureAlgorithm2;
            this.signature = bArr;
            this.flags = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SigningCertificateNode)) {
                return false;
            }
            SigningCertificateNode signingCertificateNode = (SigningCertificateNode) obj;
            return this.signingCert.equals(signingCertificateNode.signingCert) && this.parentSigAlgorithm == signingCertificateNode.parentSigAlgorithm && this.sigAlgorithm == signingCertificateNode.sigAlgorithm && Arrays.equals(this.signature, signingCertificateNode.signature) && this.flags == signingCertificateNode.flags;
        }

        public int hashCode() {
            X509Certificate x509Certificate = this.signingCert;
            int iHashCode = ((x509Certificate == null ? 0 : x509Certificate.hashCode()) + 31) * 31;
            SignatureAlgorithm signatureAlgorithm = this.parentSigAlgorithm;
            int iHashCode2 = (iHashCode + (signatureAlgorithm == null ? 0 : signatureAlgorithm.hashCode())) * 31;
            SignatureAlgorithm signatureAlgorithm2 = this.sigAlgorithm;
            return ((Arrays.hashCode(this.signature) + ((iHashCode2 + (signatureAlgorithm2 != null ? signatureAlgorithm2.hashCode() : 0)) * 31)) * 31) + this.flags;
        }
    }

    public static List<SigningCertificateNode> readSigningCertificateLineage(ByteBuffer byteBuffer) throws IOException {
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate;
        ArrayList arrayList = new ArrayList();
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate2 = null;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return null;
        }
        ApkSigningBlockUtilsLite.checkByteOrderLittleEndian(byteBuffer);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int i10 = 0;
            try {
                try {
                    if (byteBuffer.getInt() != 1) {
                        throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                    }
                    HashSet hashSet = new HashSet();
                    int i11 = 0;
                    while (byteBuffer.hasRemaining()) {
                        i10++;
                        ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(byteBuffer);
                        ByteBuffer lengthPrefixedSlice2 = ApkSigningBlockUtilsLite.getLengthPrefixedSlice(lengthPrefixedSlice);
                        int i12 = lengthPrefixedSlice.getInt();
                        int i13 = lengthPrefixedSlice.getInt();
                        SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(i11);
                        byte[] lengthPrefixedByteArray = ApkSigningBlockUtilsLite.readLengthPrefixedByteArray(lengthPrefixedSlice);
                        if (guaranteedEncodedFormX509Certificate2 != null) {
                            String first = signatureAlgorithmFindById.getJcaSignatureAlgorithmAndParams().getFirst();
                            AlgorithmParameterSpec second = signatureAlgorithmFindById.getJcaSignatureAlgorithmAndParams().getSecond();
                            PublicKey publicKey = guaranteedEncodedFormX509Certificate2.getPublicKey();
                            guaranteedEncodedFormX509Certificate = guaranteedEncodedFormX509Certificate2;
                            Signature signature = Signature.getInstance(first);
                            signature.initVerify(publicKey);
                            if (second != null) {
                                signature.setParameter(second);
                            }
                            signature.update(lengthPrefixedSlice2);
                            if (!signature.verify(lengthPrefixedByteArray)) {
                                throw new SecurityException("Unable to verify signature of certificate #" + i10 + " using " + first + " when verifying SourceStampCertificateLineage object");
                            }
                        } else {
                            guaranteedEncodedFormX509Certificate = guaranteedEncodedFormX509Certificate2;
                        }
                        lengthPrefixedSlice2.rewind();
                        byte[] lengthPrefixedByteArray2 = ApkSigningBlockUtilsLite.readLengthPrefixedByteArray(lengthPrefixedSlice2);
                        int i14 = lengthPrefixedSlice2.getInt();
                        if (guaranteedEncodedFormX509Certificate != null && i11 != i14) {
                            throw new SecurityException("Signing algorithm ID mismatch for certificate #" + lengthPrefixedSlice + " when verifying SourceStampCertificateLineage object");
                        }
                        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate3 = new GuaranteedEncodedFormX509Certificate((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(lengthPrefixedByteArray2)), lengthPrefixedByteArray2);
                        if (hashSet.contains(guaranteedEncodedFormX509Certificate3)) {
                            throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i10 + ".  All signing certificates should be unique");
                        }
                        hashSet.add(guaranteedEncodedFormX509Certificate3);
                        arrayList.add(new SigningCertificateNode(guaranteedEncodedFormX509Certificate3, SignatureAlgorithm.findById(i14), SignatureAlgorithm.findById(i13), lengthPrefixedByteArray, i12));
                        guaranteedEncodedFormX509Certificate2 = guaranteedEncodedFormX509Certificate3;
                        i11 = i13;
                    }
                    return arrayList;
                } catch (ApkFormatException | BufferUnderflowException e10) {
                    throw new IOException("Failed to parse SourceStampCertificateLineage object", e10);
                }
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                throw new SecurityException(ad.b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (InvalidKeyException e12) {
                e = e12;
                throw new SecurityException(ad.b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                throw new SecurityException(ad.b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (SignatureException e14) {
                e = e14;
                throw new SecurityException(ad.b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing SourceStampCertificateLineage object"), e);
            } catch (CertificateException e15) {
                throw new SecurityException(ad.b.b(0, "Failed to decode certificate #", " when parsing SourceStampCertificateLineage object"), e15);
            }
        } catch (CertificateException e16) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e16);
        }
    }
}
