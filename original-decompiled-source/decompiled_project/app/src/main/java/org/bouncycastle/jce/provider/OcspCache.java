package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Extension;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.b;
import org.bouncycastle.asn1.ocsp.BasicOCSPResponse;
import org.bouncycastle.asn1.ocsp.CertID;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPRequest;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.Request;
import org.bouncycastle.asn1.ocsp.ResponseBytes;
import org.bouncycastle.asn1.ocsp.ResponseData;
import org.bouncycastle.asn1.ocsp.SingleResponse;
import org.bouncycastle.asn1.ocsp.TBSRequest;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.jcajce.PKIXCertRevocationCheckerParameters;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes.dex */
class OcspCache {
    private static final int DEFAULT_MAX_RESPONSE_SIZE = 32768;
    private static final int DEFAULT_TIMEOUT = 15000;
    private static Map<URI, WeakReference<Map<CertID, OCSPResponse>>> cache = Collections.synchronizedMap(new WeakHashMap());

    /* JADX WARN: Multi-variable type inference failed */
    public static OCSPResponse getOcspResponse(CertID certID, PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters, URI uri, X509Certificate x509Certificate, List<Extension> list, JcaJceHelper jcaJceHelper) throws IOException, CertPathValidatorException {
        PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters2;
        OutputStream outputStream;
        OCSPResponse oCSPResponse;
        PKIXCertRevocationCheckerParameters pKIXCertRevocationCheckerParameters3;
        boolean zValidatedOcspResponse;
        OCSPResponse oCSPResponse2;
        ASN1GeneralizedTime nextUpdate;
        WeakReference<Map<CertID, OCSPResponse>> weakReference = cache.get(uri);
        Map<CertID, OCSPResponse> map = weakReference != null ? weakReference.get() : null;
        if (map != null && (oCSPResponse2 = map.get(certID)) != null) {
            ASN1Sequence responses = ResponseData.getInstance(BasicOCSPResponse.getInstance(ASN1OctetString.getInstance(oCSPResponse2.getResponseBytes().getResponse()).getOctets()).getTbsResponseData()).getResponses();
            for (int i10 = 0; i10 != responses.size(); i10++) {
                SingleResponse singleResponse = SingleResponse.getInstance(responses.getObjectAt(i10));
                if (certID.equals(singleResponse.getCertID()) && (nextUpdate = singleResponse.getNextUpdate()) != null) {
                    try {
                    } catch (ParseException unused) {
                        map.remove(certID);
                    }
                    if (pKIXCertRevocationCheckerParameters.getValidDate().after(nextUpdate.getDate())) {
                        map.remove(certID);
                        oCSPResponse2 = null;
                    }
                }
            }
            if (oCSPResponse2 != null) {
                return oCSPResponse2;
            }
        }
        try {
            URL url = uri.toURL();
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new Request(certID, null));
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            byte[] bArr = null;
            for (int i11 = 0; i11 != list.size(); i11++) {
                Extension extension = list.get(i11);
                byte[] value = extension.getValue();
                if (OCSPObjectIdentifiers.id_pkix_ocsp_nonce.getId().equals(extension.getId())) {
                    bArr = value;
                }
                aSN1EncodableVector2.add(new org.bouncycastle.asn1.x509.Extension(new ASN1ObjectIdentifier(extension.getId()), extension.isCritical(), value));
            }
            try {
                byte[] encoded = new OCSPRequest(aSN1EncodableVector2.size() != 0 ? new TBSRequest((GeneralName) null, new DERSequence(aSN1EncodableVector), Extensions.getInstance(new DERSequence(aSN1EncodableVector2))) : new TBSRequest((GeneralName) null, new DERSequence(aSN1EncodableVector), (Extensions) null), null).getEncoded();
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setReadTimeout(DEFAULT_TIMEOUT);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-type", "application/ocsp-request");
                httpURLConnection.setRequestProperty("Content-length", String.valueOf(encoded.length));
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(encoded);
                outputStream.flush();
                InputStream inputStream = httpURLConnection.getInputStream();
                int contentLength = httpURLConnection.getContentLength();
                if (contentLength < 0) {
                    contentLength = 32768;
                }
                oCSPResponse = OCSPResponse.getInstance(Streams.readAllLimited(inputStream, contentLength));
            } catch (IOException e10) {
                e = e10;
                pKIXCertRevocationCheckerParameters2 = pKIXCertRevocationCheckerParameters;
            }
            try {
                if (oCSPResponse.getResponseStatus().getIntValue() != 0) {
                    throw new CertPathValidatorException("OCSP responder failed: " + oCSPResponse.getResponseStatus().getValue(), null, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
                }
                ResponseBytes responseBytes = ResponseBytes.getInstance(oCSPResponse.getResponseBytes());
                if (responseBytes.getResponseType().equals((ASN1Primitive) OCSPObjectIdentifiers.id_pkix_ocsp_basic)) {
                    pKIXCertRevocationCheckerParameters3 = pKIXCertRevocationCheckerParameters;
                    zValidatedOcspResponse = ProvOcspRevocationChecker.validatedOcspResponse(BasicOCSPResponse.getInstance(responseBytes.getResponse().getOctets()), pKIXCertRevocationCheckerParameters3, bArr, x509Certificate, jcaJceHelper);
                } else {
                    pKIXCertRevocationCheckerParameters3 = pKIXCertRevocationCheckerParameters;
                    zValidatedOcspResponse = false;
                }
                if (!zValidatedOcspResponse) {
                    throw new CertPathValidatorException("OCSP response failed to validate", null, pKIXCertRevocationCheckerParameters3.getCertPath(), pKIXCertRevocationCheckerParameters3.getIndex());
                }
                WeakReference<Map<CertID, OCSPResponse>> weakReference2 = cache.get(uri);
                if (weakReference2 != null) {
                    map = weakReference2.get();
                }
                if (map != null) {
                    map.put(certID, oCSPResponse);
                } else {
                    HashMap map2 = new HashMap();
                    map2.put(certID, oCSPResponse);
                    cache.put(uri, new WeakReference<>(map2));
                }
                return oCSPResponse;
            } catch (IOException e11) {
                e = e11;
                pKIXCertRevocationCheckerParameters2 = outputStream;
                throw new CertPathValidatorException(b.a(e, new StringBuilder("configuration error: ")), e, pKIXCertRevocationCheckerParameters2.getCertPath(), pKIXCertRevocationCheckerParameters2.getIndex());
            }
        } catch (MalformedURLException e12) {
            throw new CertPathValidatorException("configuration error: " + e12.getMessage(), e12, pKIXCertRevocationCheckerParameters.getCertPath(), pKIXCertRevocationCheckerParameters.getIndex());
        }
    }
}
