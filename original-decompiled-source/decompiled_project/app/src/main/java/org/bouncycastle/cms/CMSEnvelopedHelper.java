package org.bouncycastle.cms;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.asn1.cms.KEKRecipientInfo;
import org.bouncycastle.asn1.cms.KEMRecipientInfo;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo;
import org.bouncycastle.asn1.cms.KeyTransRecipientInfo;
import org.bouncycastle.asn1.cms.OtherRecipientInfo;
import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.operator.DigestCalculator;

/* loaded from: classes2.dex */
class CMSEnvelopedHelper {

    public static class CMSAuthEnveSecureReadable extends CMSDefaultSecureReadable {
        private AlgorithmIdentifier algorithm;

        public CMSAuthEnveSecureReadable(AlgorithmIdentifier algorithmIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSReadable cMSReadable) {
            super(aSN1ObjectIdentifier, cMSReadable);
            this.algorithm = algorithmIdentifier;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public InputStream getInputStream() throws CMSException, IOException {
            return this.readable.getInputStream();
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public boolean hasAdditionalData() {
            return false;
        }
    }

    public static abstract class CMSDefaultSecureReadable implements CMSSecureReadable {
        protected ASN1Set authAttrSet;
        protected final ASN1ObjectIdentifier contentType;
        protected CMSReadable readable;

        public CMSDefaultSecureReadable(ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSReadable cMSReadable) {
            this.contentType = aSN1ObjectIdentifier;
            this.readable = cMSReadable;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public ASN1Set getAuthAttrSet() {
            return this.authAttrSet;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public ASN1ObjectIdentifier getContentType() {
            return this.contentType;
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public void setAuthAttrSet(ASN1Set aSN1Set) {
            this.authAttrSet = aSN1Set;
        }
    }

    public static class CMSDigestAuthenticatedSecureReadable extends CMSDefaultSecureReadable {
        private DigestCalculator digestCalculator;

        public CMSDigestAuthenticatedSecureReadable(DigestCalculator digestCalculator, ASN1ObjectIdentifier aSN1ObjectIdentifier, CMSReadable cMSReadable) {
            super(aSN1ObjectIdentifier, cMSReadable);
            this.digestCalculator = digestCalculator;
        }

        public byte[] getDigest() {
            return this.digestCalculator.getDigest();
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public InputStream getInputStream() throws CMSException, IOException {
            return new FilterInputStream(this.readable.getInputStream()) { // from class: org.bouncycastle.cms.CMSEnvelopedHelper.CMSDigestAuthenticatedSecureReadable.1
                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read() throws IOException {
                    int i10 = ((FilterInputStream) this).in.read();
                    if (i10 >= 0) {
                        CMSDigestAuthenticatedSecureReadable.this.digestCalculator.getOutputStream().write(i10);
                    }
                    return i10;
                }

                @Override // java.io.FilterInputStream, java.io.InputStream
                public int read(byte[] bArr, int i10, int i11) throws IOException {
                    int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
                    if (i12 >= 0) {
                        CMSDigestAuthenticatedSecureReadable.this.digestCalculator.getOutputStream().write(bArr, i10, i12);
                    }
                    return i12;
                }
            };
        }

        @Override // org.bouncycastle.cms.CMSSecureReadable
        public boolean hasAdditionalData() {
            return true;
        }
    }

    public static RecipientInformationStore buildRecipientInformationStore(ASN1Set aSN1Set, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 != aSN1Set.size(); i10++) {
            readRecipientInfo(arrayList, RecipientInfo.getInstance(aSN1Set.getObjectAt(i10)), algorithmIdentifier, cMSSecureReadable);
        }
        return new RecipientInformationStore(arrayList);
    }

    private static void readRecipientInfo(List list, RecipientInfo recipientInfo, AlgorithmIdentifier algorithmIdentifier, CMSSecureReadable cMSSecureReadable) {
        ASN1Encodable info = recipientInfo.getInfo();
        if (info instanceof KeyTransRecipientInfo) {
            list.add(new KeyTransRecipientInformation((KeyTransRecipientInfo) info, algorithmIdentifier, cMSSecureReadable));
            return;
        }
        if (info instanceof OtherRecipientInfo) {
            OtherRecipientInfo otherRecipientInfo = OtherRecipientInfo.getInstance(info);
            if (CMSObjectIdentifiers.id_ori_kem.equals((ASN1Primitive) otherRecipientInfo.getType())) {
                list.add(new KEMRecipientInformation(KEMRecipientInfo.getInstance(otherRecipientInfo.getValue()), algorithmIdentifier, cMSSecureReadable));
                return;
            }
            return;
        }
        if (info instanceof KEKRecipientInfo) {
            list.add(new KEKRecipientInformation((KEKRecipientInfo) info, algorithmIdentifier, cMSSecureReadable));
        } else if (info instanceof KeyAgreeRecipientInfo) {
            KeyAgreeRecipientInformation.readRecipientInfo(list, (KeyAgreeRecipientInfo) info, algorithmIdentifier, cMSSecureReadable);
        } else if (info instanceof PasswordRecipientInfo) {
            list.add(new PasswordRecipientInformation((PasswordRecipientInfo) info, algorithmIdentifier, cMSSecureReadable));
        }
    }
}
