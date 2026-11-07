package com.android.apksig.internal.apk.stamp;

import com.android.apksig.ApkVerifier;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class V1SourceStampVerifier {
    private V1SourceStampVerifier() {
    }

    private static List<Pair<Integer, byte[]>> getApkDigests(Map<ContentDigestAlgorithm, byte[]> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ContentDigestAlgorithm, byte[]> entry : map.entrySet()) {
            arrayList.add(Pair.of(Integer.valueOf(entry.getKey().getId()), entry.getValue()));
        }
        Collections.sort(arrayList, new b());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getApkDigests$0(Pair pair, Pair pair2) {
        return ((Integer) pair.getFirst()).compareTo((Integer) pair2.getFirst());
    }

    public static ApkSigningBlockUtils.Result verify(DataSource dataSource, ApkUtils.ZipSections zipSections, byte[] bArr, Map<ContentDigestAlgorithm, byte[]> map, int i10, int i11) throws ApkSigningBlockUtils.SignatureNotFoundException, NoSuchAlgorithmException, IOException {
        ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(0);
        verify(ApkSigningBlockUtils.findSignature(dataSource, zipSections, 722016414, result).signatureBlock, bArr, map, i10, i11, result);
        return result;
    }

    private static void verify(ByteBuffer byteBuffer, byte[] bArr, Map<ContentDigestAlgorithm, byte[]> map, int i10, int i11, ApkSigningBlockUtils.Result result) throws NoSuchAlgorithmException {
        ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
        result.signers.add(signerInfo);
        try {
            SourceStampVerifier.verifyV1SourceStamp(ApkSigningBlockUtils.getLengthPrefixedSlice(byteBuffer), CertificateFactory.getInstance("X.509"), signerInfo, ApkSigningBlockUtils.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(getApkDigests(map)), bArr, i10, i11);
            result.verified = (result.containsErrors() || result.containsWarnings()) ? false : true;
        } catch (ApkFormatException | BufferUnderflowException unused) {
            signerInfo.addWarning(ApkVerifier.Issue.SOURCE_STAMP_MALFORMED_SIGNATURE, new Object[0]);
        } catch (CertificateException e10) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e10);
        }
    }
}
