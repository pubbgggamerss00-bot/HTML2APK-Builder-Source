package org.bouncycastle.cms;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.cms.OriginatorInfo;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.util.Store;

/* loaded from: classes2.dex */
public class OriginatorInfoGenerator {
    private final List origCRLs;
    private final List origCerts;

    public OriginatorInfoGenerator(X509CertificateHolder x509CertificateHolder) {
        ArrayList arrayList = new ArrayList(1);
        this.origCerts = arrayList;
        this.origCRLs = null;
        arrayList.add(x509CertificateHolder.toASN1Structure());
    }

    public OriginatorInformation generate() {
        List list = this.origCerts;
        ASN1Set aSN1SetCreateDerSetFromList = list == null ? null : CMSUtils.createDerSetFromList(list);
        List list2 = this.origCRLs;
        return new OriginatorInformation(new OriginatorInfo(aSN1SetCreateDerSetFromList, list2 != null ? CMSUtils.createDerSetFromList(list2) : null));
    }

    public OriginatorInfoGenerator(Store store) throws CMSException {
        this(store, null);
    }

    public OriginatorInfoGenerator(Store store, Store store2) throws CMSException {
        if (store != null) {
            this.origCerts = CMSUtils.getCertificatesFromStore(store);
        } else {
            this.origCerts = null;
        }
        if (store2 != null) {
            this.origCRLs = CMSUtils.getCRLsFromStore(store2);
        } else {
            this.origCRLs = null;
        }
    }
}
