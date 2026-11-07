package com.android.apksig.internal.apk.v3;

import ad.b;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.X509CertificateUtils;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class V3SigningCertificateLineage {
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
            return Arrays.hashCode(this.signature) + (Objects.hash(this.signingCert, this.parentSigAlgorithm, this.sigAlgorithm, Integer.valueOf(this.flags)) * 31);
        }
    }

    public static byte[] encodeSignedData(X509Certificate x509Certificate, int i10) {
        try {
            byte[] bArrEncodeAsLengthPrefixedElement = ApkSigningBlockUtils.encodeAsLengthPrefixedElement(x509Certificate.getEncoded());
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrEncodeAsLengthPrefixedElement.length + 4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.put(bArrEncodeAsLengthPrefixedElement);
            byteBufferAllocate.putInt(i10);
            return ApkSigningBlockUtils.encodeAsLengthPrefixedElement(byteBufferAllocate.array());
        } catch (CertificateEncodingException e10) {
            throw new RuntimeException("Failed to encode V3SigningCertificateLineage certificate", e10);
        }
    }

    public static byte[] encodeSigningCertificateLineage(List<SigningCertificateNode> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<SigningCertificateNode> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(encodeSigningCertificateNode(it.next()));
        }
        byte[] bArrEncodeAsSequenceOfLengthPrefixedElements = ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedElements(arrayList);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrEncodeAsSequenceOfLengthPrefixedElements.length + 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(1);
        byteBufferAllocate.put(bArrEncodeAsSequenceOfLengthPrefixedElements);
        return byteBufferAllocate.array();
    }

    public static byte[] encodeSigningCertificateNode(SigningCertificateNode signingCertificateNode) {
        SignatureAlgorithm signatureAlgorithm = signingCertificateNode.parentSigAlgorithm;
        int id2 = signatureAlgorithm != null ? signatureAlgorithm.getId() : 0;
        SignatureAlgorithm signatureAlgorithm2 = signingCertificateNode.sigAlgorithm;
        int id3 = signatureAlgorithm2 != null ? signatureAlgorithm2.getId() : 0;
        byte[] bArrEncodeSignedData = encodeSignedData(signingCertificateNode.signingCert, id2);
        byte[] bArrEncodeAsLengthPrefixedElement = ApkSigningBlockUtils.encodeAsLengthPrefixedElement(signingCertificateNode.signature);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrEncodeSignedData.length + 8 + bArrEncodeAsLengthPrefixedElement.length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(bArrEncodeSignedData);
        byteBufferAllocate.putInt(signingCertificateNode.flags);
        byteBufferAllocate.putInt(id3);
        byteBufferAllocate.put(bArrEncodeAsLengthPrefixedElement);
        return byteBufferAllocate.array();
    }

    public static List<SigningCertificateNode> readSigningCertificateLineage(ByteBuffer byteBuffer) throws IOException {
        ArrayList arrayList = new ArrayList();
        GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = null;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return null;
        }
        ApkSigningBlockUtils.checkByteOrderLittleEndian(byteBuffer);
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
                    ByteBuffer lengthPrefixedSlice = ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer);
                    ByteBuffer lengthPrefixedSlice2 = ApkSigningBlockUtils.getLengthPrefixedSlice(lengthPrefixedSlice);
                    int i12 = lengthPrefixedSlice.getInt();
                    int i13 = lengthPrefixedSlice.getInt();
                    SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(i11);
                    byte[] lengthPrefixedByteArray = ApkSigningBlockUtils.readLengthPrefixedByteArray(lengthPrefixedSlice);
                    if (guaranteedEncodedFormX509Certificate != null) {
                        String first = signatureAlgorithmFindById.getJcaSignatureAlgorithmAndParams().getFirst();
                        AlgorithmParameterSpec second = signatureAlgorithmFindById.getJcaSignatureAlgorithmAndParams().getSecond();
                        PublicKey publicKey = guaranteedEncodedFormX509Certificate.getPublicKey();
                        Signature signature = Signature.getInstance(first);
                        signature.initVerify(publicKey);
                        if (second != null) {
                            signature.setParameter(second);
                        }
                        signature.update(lengthPrefixedSlice2);
                        if (!signature.verify(lengthPrefixedByteArray)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i10 + " using " + first + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    lengthPrefixedSlice2.rewind();
                    byte[] lengthPrefixedByteArray2 = ApkSigningBlockUtils.readLengthPrefixedByteArray(lengthPrefixedSlice2);
                    int i14 = lengthPrefixedSlice2.getInt();
                    if (guaranteedEncodedFormX509Certificate != null && i11 != i14) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + lengthPrefixedSlice + " when verifying V3SigningCertificateLineage object");
                    }
                    GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate2 = new GuaranteedEncodedFormX509Certificate(X509CertificateUtils.generateCertificate(lengthPrefixedByteArray2), lengthPrefixedByteArray2);
                    if (hashSet.contains(guaranteedEncodedFormX509Certificate2)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i10 + ".  All signing certificates should be unique");
                    }
                    hashSet.add(guaranteedEncodedFormX509Certificate2);
                    arrayList.add(new SigningCertificateNode(guaranteedEncodedFormX509Certificate2, SignatureAlgorithm.findById(i14), SignatureAlgorithm.findById(i13), lengthPrefixedByteArray, i12));
                    guaranteedEncodedFormX509Certificate = guaranteedEncodedFormX509Certificate2;
                    i11 = i13;
                }
                return arrayList;
            } catch (ApkFormatException | BufferUnderflowException e10) {
                throw new IOException("Failed to parse V3SigningCertificateLineage object", e10);
            }
        } catch (InvalidAlgorithmParameterException e11) {
            e = e11;
            throw new SecurityException(b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (InvalidKeyException e12) {
            e = e12;
            throw new SecurityException(b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (NoSuchAlgorithmException e13) {
            e = e13;
            throw new SecurityException(b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (SignatureException e14) {
            e = e14;
            throw new SecurityException(b.b(0, "Failed to verify signature over signed data for certificate #", " when parsing V3SigningCertificateLineage object"), e);
        } catch (CertificateException e15) {
            throw new SecurityException(b.b(0, "Failed to decode certificate #", " when parsing V3SigningCertificateLineage object"), e15);
        }
    }
}
