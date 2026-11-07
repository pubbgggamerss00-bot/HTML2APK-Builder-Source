package com.android.apksig.internal.apk.stamp;

import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m0.r;

/* loaded from: classes.dex */
public abstract class V2SourceStampSigner {
    public static final int V2_SOURCE_STAMP_BLOCK_ID = 1845461005;

    public static final class SourceStampBlock {
        public List<Pair<Integer, byte[]>> signedDigests;
        public List<Pair<Integer, byte[]>> signedStampAttributes;
        public byte[] stampAttributes;
        public byte[] stampCertificate;

        private SourceStampBlock() {
        }
    }

    private V2SourceStampSigner() {
    }

    private static byte[] encodeStampAttributes(Map<Integer, byte[]> map) {
        Iterator<byte[]> it = map.values().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().length + 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(length);
        for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
            byteBufferAllocate.putInt(entry.getValue().length + 4);
            byteBufferAllocate.putInt(entry.getKey().intValue());
            byteBufferAllocate.put(entry.getValue());
        }
        return byteBufferAllocate.array();
    }

    public static Pair<byte[], Integer> generateSourceStampBlock(ApkSigningBlockUtils.SignerConfig signerConfig, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> map) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (signerConfig.certificates.isEmpty()) {
            throw new SignatureException("No certificates configured for signer");
        }
        ArrayList arrayList = new ArrayList();
        getSignedDigestsFor(3, map, signerConfig, arrayList);
        getSignedDigestsFor(2, map, signerConfig, arrayList);
        getSignedDigestsFor(1, map, signerConfig, arrayList);
        Collections.sort(arrayList, new c());
        SourceStampBlock sourceStampBlock = new SourceStampBlock();
        try {
            sourceStampBlock.stampCertificate = signerConfig.certificates.get(0).getEncoded();
            sourceStampBlock.signedDigests = arrayList;
            byte[] bArrEncodeStampAttributes = encodeStampAttributes(generateStampAttributes(signerConfig.mSigningCertificateLineage));
            sourceStampBlock.stampAttributes = bArrEncodeStampAttributes;
            sourceStampBlock.signedStampAttributes = ApkSigningBlockUtils.generateSignaturesOverData(signerConfig, bArrEncodeStampAttributes);
            return Pair.of(ApkSigningBlockUtils.encodeAsLengthPrefixedElement(ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedElements(new byte[][]{sourceStampBlock.stampCertificate, ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(sourceStampBlock.signedDigests), sourceStampBlock.stampAttributes, ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(sourceStampBlock.signedStampAttributes)})), 1845461005);
        } catch (CertificateEncodingException e10) {
            throw new SignatureException("Retrieving the encoded form of the stamp certificate failed", e10);
        }
    }

    private static Map<Integer, byte[]> generateStampAttributes(SigningCertificateLineage signingCertificateLineage) {
        HashMap map = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        if (jCurrentTimeMillis <= 0) {
            throw new IllegalStateException(r.a("Received an invalid value from Instant#getTimestamp: ", jCurrentTimeMillis));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(jCurrentTimeMillis);
        map.put(Integer.valueOf(SourceStampConstants.STAMP_TIME_ATTR_ID), byteBufferAllocate.array());
        if (signingCertificateLineage != null) {
            map.put(Integer.valueOf(SourceStampConstants.PROOF_OF_ROTATION_ATTR_ID), signingCertificateLineage.encodeSigningCertificateLineage());
        }
        return map;
    }

    private static void getSignedDigestsFor(int i10, Map<Integer, Map<ContentDigestAlgorithm, byte[]>> map, ApkSigningBlockUtils.SignerConfig signerConfig, List<Pair<Integer, byte[]>> list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (map.containsKey(Integer.valueOf(i10))) {
            Map<ContentDigestAlgorithm, byte[]> map2 = map.get(Integer.valueOf(i10));
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<ContentDigestAlgorithm, byte[]> entry : map2.entrySet()) {
                arrayList.add(Pair.of(Integer.valueOf(entry.getKey().getId()), entry.getValue()));
            }
            Collections.sort(arrayList, new d());
            list.add(Pair.of(Integer.valueOf(i10), ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(ApkSigningBlockUtils.generateSignaturesOverData(signerConfig, ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(arrayList)))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$generateSourceStampBlock$0(Pair pair, Pair pair2) {
        return ((Integer) pair.getFirst()).compareTo((Integer) pair2.getFirst());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSignedDigestsFor$1(Pair pair, Pair pair2) {
        return ((Integer) pair.getFirst()).compareTo((Integer) pair2.getFirst());
    }
}
