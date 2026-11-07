package com.android.apksig.internal.apk.v4;

import com.android.apksig.ApkVerifier;
import com.android.apksig.internal.apk.ApkSigningBlockUtils;
import com.android.apksig.internal.apk.ContentDigestAlgorithm;
import com.android.apksig.internal.apk.SignatureAlgorithm;
import com.android.apksig.internal.apk.v4.V4Signature;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.util.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class V4SchemeVerifier {
    private V4SchemeVerifier() {
    }

    private static ApkSigningBlockUtils.Result.SignerInfo parseAndVerifySignatureBlock(V4Signature.SigningInfo signingInfo, byte[] bArr) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, InvalidAlgorithmParameterException {
        byte[] encoded;
        ApkSigningBlockUtils.Result.SignerInfo signerInfo = new ApkSigningBlockUtils.Result.SignerInfo();
        signerInfo.index = 0;
        int i10 = signingInfo.signatureAlgorithmId;
        byte[] bArr2 = signingInfo.signature;
        signerInfo.signatures.add(new ApkSigningBlockUtils.Result.SignerInfo.Signature(i10, bArr2));
        SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(i10);
        if (signatureAlgorithmFindById == null) {
            signerInfo.addError(ApkVerifier.Issue.V4_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i10));
            return signerInfo;
        }
        String first = signatureAlgorithmFindById.getJcaSignatureAlgorithmAndParams().getFirst();
        AlgorithmParameterSpec second = signatureAlgorithmFindById.getJcaSignatureAlgorithmAndParams().getSecond();
        String jcaKeyAlgorithm = signatureAlgorithmFindById.getJcaKeyAlgorithm();
        byte[] bArr3 = signingInfo.publicKey;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(jcaKeyAlgorithm).generatePublic(new X509EncodedKeySpec(bArr3));
            try {
                Signature signature = Signature.getInstance(first);
                signature.initVerify(publicKeyGeneratePublic);
                if (second != null) {
                    signature.setParameter(second);
                }
                signature.update(bArr);
                if (!signature.verify(bArr2)) {
                    signerInfo.addError(ApkVerifier.Issue.V4_SIG_DID_NOT_VERIFY, signatureAlgorithmFindById);
                    return signerInfo;
                }
                signerInfo.verifiedSignatures.put(signatureAlgorithmFindById, bArr2);
                if (signingInfo.certificate == null) {
                    signerInfo.addError(ApkVerifier.Issue.V4_SIG_NO_CERTIFICATE, new Object[0]);
                    return signerInfo;
                }
                try {
                    GuaranteedEncodedFormX509Certificate guaranteedEncodedFormX509Certificate = new GuaranteedEncodedFormX509Certificate(X509CertificateUtils.generateCertificate(signingInfo.certificate), signingInfo.certificate);
                    signerInfo.certs.add(guaranteedEncodedFormX509Certificate);
                    try {
                        encoded = ApkSigningBlockUtils.encodePublicKey(guaranteedEncodedFormX509Certificate.getPublicKey());
                    } catch (InvalidKeyException e10) {
                        System.out.println("Caught an exception encoding the public key: " + e10);
                        e10.printStackTrace();
                        encoded = guaranteedEncodedFormX509Certificate.getPublicKey().getEncoded();
                    }
                    if (!Arrays.equals(bArr3, encoded)) {
                        signerInfo.addError(ApkVerifier.Issue.V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, ApkSigningBlockUtils.toHex(encoded), ApkSigningBlockUtils.toHex(bArr3));
                        return signerInfo;
                    }
                    signerInfo.contentDigests.add(new ApkSigningBlockUtils.Result.SignerInfo.ContentDigest(0, signingInfo.apkDigest));
                    return signerInfo;
                } catch (CertificateException e11) {
                    signerInfo.addError(ApkVerifier.Issue.V4_SIG_MALFORMED_CERTIFICATE, e11);
                    return signerInfo;
                }
            } catch (InvalidAlgorithmParameterException e12) {
                e = e12;
                signerInfo.addError(ApkVerifier.Issue.V4_SIG_VERIFY_EXCEPTION, signatureAlgorithmFindById, e);
                return signerInfo;
            } catch (InvalidKeyException e13) {
                e = e13;
                signerInfo.addError(ApkVerifier.Issue.V4_SIG_VERIFY_EXCEPTION, signatureAlgorithmFindById, e);
                return signerInfo;
            } catch (SignatureException e14) {
                e = e14;
                signerInfo.addError(ApkVerifier.Issue.V4_SIG_VERIFY_EXCEPTION, signatureAlgorithmFindById, e);
                return signerInfo;
            }
        } catch (Exception e15) {
            signerInfo.addError(ApkVerifier.Issue.V4_SIG_MALFORMED_PUBLIC_KEY, e15);
            return signerInfo;
        }
    }

    public static ApkSigningBlockUtils.Result verify(DataSource dataSource, File file) throws NoSuchAlgorithmException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            V4Signature from = V4Signature.readFrom(fileInputStream);
            byte[] bytes = V4Signature.readBytes(fileInputStream);
            fileInputStream.close();
            ApkSigningBlockUtils.Result result = new ApkSigningBlockUtils.Result(4);
            if (from == null) {
                result.addError(ApkVerifier.Issue.V4_SIG_NO_SIGNATURES, "Signature file does not contain a v4 signature.");
                return result;
            }
            int i10 = from.version;
            if (i10 != 2) {
                result.addWarning(ApkVerifier.Issue.V4_SIG_VERSION_NOT_CURRENT, Integer.valueOf(i10), 2);
            }
            V4Signature.HashingInfo hashingInfoFromByteArray = V4Signature.HashingInfo.fromByteArray(from.hashingInfo);
            V4Signature.SigningInfos signingInfosFromByteArray = V4Signature.SigningInfos.fromByteArray(from.signingInfos);
            V4Signature.SigningInfo signingInfo = signingInfosFromByteArray.signingInfo;
            ApkSigningBlockUtils.Result.SignerInfo andVerifySignatureBlock = parseAndVerifySignatureBlock(signingInfo, V4Signature.getSignedData(dataSource.size(), hashingInfoFromByteArray, signingInfo));
            result.signers.add(andVerifySignatureBlock);
            if (!result.containsErrors()) {
                V4Signature.SigningInfoBlock[] signingInfoBlockArr = signingInfosFromByteArray.signingInfoBlocks;
                int length = signingInfoBlockArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length) {
                        V4Signature.SigningInfo signingInfoFromByteArray = V4Signature.SigningInfo.fromByteArray(signingInfoBlockArr[i11].signingInfo);
                        result.signers.add(parseAndVerifySignatureBlock(signingInfoFromByteArray, V4Signature.getSignedData(dataSource.size(), hashingInfoFromByteArray, signingInfoFromByteArray)));
                        if (result.containsErrors()) {
                            break;
                        }
                        i11++;
                    } else {
                        verifyRootHashAndTree(dataSource, andVerifySignatureBlock, hashingInfoFromByteArray.rawRootHash, bytes);
                        if (!result.containsErrors()) {
                            result.verified = true;
                        }
                    }
                }
            }
            return result;
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void verifyRootHashAndTree(DataSource dataSource, ApkSigningBlockUtils.Result.SignerInfo signerInfo, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, IOException {
        ApkSigningBlockUtils.VerityTreeAndDigest verityTreeAndDigestComputeChunkVerityTreeAndDigest = ApkSigningBlockUtils.computeChunkVerityTreeAndDigest(dataSource);
        ContentDigestAlgorithm contentDigestAlgorithm = verityTreeAndDigestComputeChunkVerityTreeAndDigest.contentDigestAlgorithm;
        byte[] bArr3 = verityTreeAndDigestComputeChunkVerityTreeAndDigest.rootHash;
        byte[] bArr4 = verityTreeAndDigestComputeChunkVerityTreeAndDigest.tree;
        if (!Arrays.equals(bArr, bArr3)) {
            signerInfo.addError(ApkVerifier.Issue.V4_SIG_APK_ROOT_DID_NOT_VERIFY, contentDigestAlgorithm, ApkSigningBlockUtils.toHex(bArr), ApkSigningBlockUtils.toHex(bArr3));
        } else if (bArr2 == null || Arrays.equals(bArr2, bArr4)) {
            signerInfo.verifiedContentDigests.put(contentDigestAlgorithm, bArr3);
        } else {
            signerInfo.addError(ApkVerifier.Issue.V4_SIG_APK_TREE_DID_NOT_VERIFY, contentDigestAlgorithm, ApkSigningBlockUtils.toHex(bArr), ApkSigningBlockUtils.toHex(bArr3));
        }
    }
}
