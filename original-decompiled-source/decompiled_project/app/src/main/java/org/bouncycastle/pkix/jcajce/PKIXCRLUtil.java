package org.bouncycastle.pkix.jcajce;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jcajce.PKIXCRLStoreSelector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;

/* loaded from: classes3.dex */
abstract class PKIXCRLUtil {
    public static Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, pKIXCRLStoreSelector, pKIXParameters.getCertStores());
            return hashSet;
        } catch (AnnotatedException e10) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e10);
        }
    }

    public static Set findCRLs(PKIXCRLStoreSelector pKIXCRLStoreSelector, Date date, List list, List list2) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, pKIXCRLStoreSelector, list2);
            findCRLs(hashSet, pKIXCRLStoreSelector, list);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e10) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e10);
        }
    }

    public static Set findCRLs(X509CRLStoreSelector x509CRLStoreSelector, PKIXParameters pKIXParameters) throws AnnotatedException {
        return findCRLs(new PKIXCRLStoreSelector.Builder(x509CRLStoreSelector).build(), pKIXParameters);
    }

    private static void findCRLs(HashSet hashSet, PKIXCRLStoreSelector pKIXCRLStoreSelector, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z10 = false;
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(pKIXCRLStoreSelector));
                    z10 = true;
                } catch (StoreException e10) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e10);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (CertStore) obj));
                    z10 = true;
                } catch (CertStoreException e11) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e11);
                    annotatedException2 = annotatedException;
                }
            }
        }
        if (!z10 && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}
