package org.bouncycastle.est;

import b6.a;
import i8.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import k4.i;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.est.CsrAttrs;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cmc.CMCException;
import org.bouncycastle.cmc.SimplePKIResponse;
import org.bouncycastle.mime.BasicMimeParser;
import org.bouncycastle.mime.ConstantMimeContext;
import org.bouncycastle.mime.Headers;
import org.bouncycastle.mime.MimeContext;
import org.bouncycastle.mime.MimeParserContext;
import org.bouncycastle.mime.MimeParserListener;
import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.util.Selector;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.util.encoders.Base64;
import p3.c;

/* loaded from: classes2.dex */
public class ESTService {
    protected static final String CACERTS = "/cacerts";
    protected static final String CSRATTRS = "/csrattrs";
    protected static final String FULLCMC = "/fullcmc";
    protected static final String SERVERGEN = "/serverkeygen";
    protected static final String SIMPLE_ENROLL = "/simpleenroll";
    protected static final String SIMPLE_REENROLL = "/simplereenroll";
    protected static final Set<String> illegalParts;
    private static final Pattern pathInValid;
    private final ESTClientProvider clientProvider;
    private final String server;

    static {
        HashSet hashSet = new HashSet();
        illegalParts = hashSet;
        hashSet.add("cacerts");
        hashSet.add("simpleenroll");
        hashSet.add("simplereenroll");
        hashSet.add("fullcmc");
        hashSet.add("serverkeygen");
        hashSet.add("csrattrs");
        pathInValid = Pattern.compile("^[0-9a-zA-Z_\\-.~!$&'()*+,;:=]+");
    }

    public ESTService(String str, String str2, ESTClientProvider eSTClientProvider) {
        String strVerifyServer = verifyServer(str);
        this.server = str2 != null ? a.b("https://", strVerifyServer, "/.well-known/est/", verifyLabel(str2)) : n.d("https://", strVerifyServer, "/.well-known/est");
        this.clientProvider = eSTClientProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String annotateRequest(byte[] bArr) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        int length = 0;
        do {
            int i10 = length + 48;
            if (i10 < bArr.length) {
                printWriter.print(Base64.toBase64String(bArr, length, 48));
                length = i10;
            } else {
                printWriter.print(Base64.toBase64String(bArr, length, bArr.length - length));
                length = bArr.length;
            }
            printWriter.print('\n');
        } while (length < bArr.length);
        printWriter.flush();
        return stringWriter.toString();
    }

    private ASN1InputStream getASN1InputStream(InputStream inputStream, Long l10) {
        if (l10 != null && l10.intValue() == l10.longValue()) {
            return new ASN1InputStream(inputStream, l10.intValue());
        }
        return new ASN1InputStream(inputStream);
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store) {
        return storeToArray(store, null);
    }

    private String verifyLabel(String str) {
        while (str.endsWith("/") && str.length() > 0) {
            str = c.a(1, 0, str);
        }
        while (str.startsWith("/") && str.length() > 0) {
            str = str.substring(1);
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Label set but after trimming '/' is not zero length string.");
        }
        if (!pathInValid.matcher(str).matches()) {
            throw new IllegalArgumentException(n.d("Server path ", str, " contains invalid characters"));
        }
        if (illegalParts.contains(str)) {
            throw new IllegalArgumentException(n.d("Label ", str, " is a reserved path segment."));
        }
        return str;
    }

    private String verifyServer(String str) {
        while (str.endsWith("/") && str.length() > 0) {
            try {
                str = str.substring(0, str.length() - 1);
            } catch (Exception e10) {
                if (e10 instanceof IllegalArgumentException) {
                    throw ((IllegalArgumentException) e10);
                }
                throw new IllegalArgumentException(i.a(e10, new StringBuilder("Scheme and host is invalid: ")), e10);
            }
        }
        if (str.contains("://")) {
            throw new IllegalArgumentException("Server contains scheme, must only be <dnsname/ipaddress>:port, https:// will be added arbitrarily.");
        }
        URL url = new URL("https://" + str);
        if (url.getPath().length() != 0 && !url.getPath().equals("/")) {
            throw new IllegalArgumentException("Server contains path, must only be <dnsname/ipaddress>:port, a path of '/.well-known/est/<label>' will be added arbitrarily.");
        }
        return str;
    }

    public EnrollmentResponse enroll(boolean z10, PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth, boolean z11) throws IOException {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponseDoRequest = null;
        try {
            byte[] bytes = annotateRequest(pKCS10CertificationRequest.getEncoded()).getBytes();
            StringBuilder sb = new StringBuilder();
            sb.append(this.server);
            sb.append(z11 ? SERVERGEN : z10 ? SIMPLE_REENROLL : SIMPLE_ENROLL);
            URL url = new URL(sb.toString());
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            ESTRequestBuilder eSTRequestBuilderWithClient = new ESTRequestBuilder("POST", url).withData(bytes).withClient(eSTClientMakeClient);
            eSTRequestBuilderWithClient.addHeader("Content-Type", "application/pkcs10");
            eSTRequestBuilderWithClient.addHeader("Content-Length", "" + bytes.length);
            eSTRequestBuilderWithClient.addHeader("Content-Transfer-Encoding", "base64");
            if (eSTAuth != null) {
                eSTAuth.applyAuth(eSTRequestBuilderWithClient);
            }
            eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuilderWithClient.build());
            EnrollmentResponse enrollmentResponseHandleEnrollResponse = handleEnrollResponse(eSTResponseDoRequest);
            if (eSTResponseDoRequest != null) {
                eSTResponseDoRequest.close();
            }
            return enrollmentResponseHandleEnrollResponse;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof ESTException) {
                    throw th2;
                }
                throw new ESTException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                if (eSTResponseDoRequest != null) {
                    eSTResponseDoRequest.close();
                }
                throw th3;
            }
        }
    }

    public EnrollmentResponse enrollPop(boolean z10, final PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, final ContentSigner contentSigner, ESTAuth eSTAuth, boolean z11) throws IOException {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponseDoRequest = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.server);
            sb.append(z10 ? SIMPLE_REENROLL : SIMPLE_ENROLL);
            URL url = new URL(sb.toString());
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            ESTRequestBuilder eSTRequestBuilderWithConnectionListener = new ESTRequestBuilder("POST", url).withClient(eSTClientMakeClient).withConnectionListener(new ESTSourceConnectionListener() { // from class: org.bouncycastle.est.ESTService.1
                @Override // org.bouncycastle.est.ESTSourceConnectionListener
                public ESTRequest onConnection(Source source, ESTRequest eSTRequest) throws IOException {
                    if (source instanceof TLSUniqueProvider) {
                        TLSUniqueProvider tLSUniqueProvider = (TLSUniqueProvider) source;
                        if (tLSUniqueProvider.isTLSUniqueAvailable()) {
                            PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder2 = new PKCS10CertificationRequestBuilder(pKCS10CertificationRequestBuilder);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            pKCS10CertificationRequestBuilder2.setAttribute(PKCSObjectIdentifiers.pkcs_9_at_challengePassword, new DERPrintableString(Base64.toBase64String(tLSUniqueProvider.getTLSUnique())));
                            byteArrayOutputStream.write(ESTService.this.annotateRequest(pKCS10CertificationRequestBuilder2.build(contentSigner).getEncoded()).getBytes());
                            byteArrayOutputStream.flush();
                            ESTRequestBuilder eSTRequestBuilderWithData = new ESTRequestBuilder(eSTRequest).withData(byteArrayOutputStream.toByteArray());
                            eSTRequestBuilderWithData.setHeader("Content-Type", "application/pkcs10");
                            eSTRequestBuilderWithData.setHeader("Content-Transfer-Encoding", "base64");
                            eSTRequestBuilderWithData.setHeader("Content-Length", Long.toString(byteArrayOutputStream.size()));
                            return eSTRequestBuilderWithData.build();
                        }
                    }
                    throw new IOException("Source does not supply TLS unique.");
                }
            });
            if (eSTAuth != null) {
                eSTAuth.applyAuth(eSTRequestBuilderWithConnectionListener);
            }
            eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuilderWithConnectionListener.build());
            EnrollmentResponse enrollmentResponseHandleEnrollResponse = handleEnrollResponse(eSTResponseDoRequest);
            if (eSTResponseDoRequest != null) {
                eSTResponseDoRequest.close();
            }
            return enrollmentResponseHandleEnrollResponse;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof ESTException) {
                    throw th2;
                }
                throw new ESTException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                if (eSTResponseDoRequest != null) {
                    eSTResponseDoRequest.close();
                }
                throw th3;
            }
        }
    }

    public CACertsResponse getCACerts() throws ESTException {
        Store<X509CertificateHolder> certificates;
        Store<X509CRLHolder> cRLs;
        ESTResponse eSTResponse = null;
        try {
            URL url = new URL(this.server + CACERTS);
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            ESTRequest eSTRequestBuild = new ESTRequestBuilder("GET", url).withClient(eSTClientMakeClient).build();
            ESTResponse eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuild);
            try {
                if (eSTResponseDoRequest.getStatusCode() == 200) {
                    String firstValue = eSTResponseDoRequest.getHeaders().getFirstValue("Content-Type");
                    if (firstValue == null || !firstValue.startsWith("application/pkcs7-mime")) {
                        throw new ESTException("Response : " + url.toString() + "Expecting application/pkcs7-mime " + (firstValue != null ? " got ".concat(firstValue) : " but was not present."), null, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                    try {
                        SimplePKIResponse simplePKIResponse = new SimplePKIResponse(ContentInfo.getInstance(getASN1InputStream(eSTResponseDoRequest.getInputStream(), eSTResponseDoRequest.getContentLength()).readObject()));
                        certificates = simplePKIResponse.getCertificates();
                        cRLs = simplePKIResponse.getCRLs();
                    } catch (Throwable th2) {
                        throw new ESTException("Decoding CACerts: " + url.toString() + " " + th2.getMessage(), th2, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                } else {
                    if (eSTResponseDoRequest.getStatusCode() != 204) {
                        throw new ESTException("Get CACerts: " + url.toString(), null, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                    certificates = null;
                    cRLs = null;
                }
                CACertsResponse cACertsResponse = new CACertsResponse(certificates, cRLs, eSTRequestBuild, eSTResponseDoRequest.getSource(), this.clientProvider.isTrusted());
                try {
                    eSTResponseDoRequest.close();
                    e = null;
                } catch (Exception e10) {
                    e = e10;
                }
                if (e == null) {
                    return cACertsResponse;
                }
                if (e instanceof ESTException) {
                    throw ((ESTException) e);
                }
                throw new ESTException("Get CACerts: " + url.toString(), e, eSTResponseDoRequest.getStatusCode(), null);
            } catch (Throwable th3) {
                th = th3;
                eSTResponse = eSTResponseDoRequest;
                try {
                    if (th instanceof ESTException) {
                        throw th;
                    }
                    throw new ESTException(th.getMessage(), th);
                } catch (Throwable th4) {
                    if (eSTResponse != null) {
                        try {
                            eSTResponse.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public CSRRequestResponse getCSRAttributes() throws ESTException {
        CSRAttributesResponse cSRAttributesResponse;
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponse = null;
        try {
            URL url = new URL(this.server + CSRATTRS);
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            ESTRequest eSTRequestBuild = new ESTRequestBuilder("GET", url).withClient(eSTClientMakeClient).build();
            ESTResponse eSTResponseDoRequest = eSTClientMakeClient.doRequest(eSTRequestBuild);
            try {
                int statusCode = eSTResponseDoRequest.getStatusCode();
                if (statusCode == 200) {
                    try {
                        cSRAttributesResponse = new CSRAttributesResponse(CsrAttrs.getInstance(ASN1Sequence.getInstance(getASN1InputStream(eSTResponseDoRequest.getInputStream(), eSTResponseDoRequest.getContentLength()).readObject())));
                    } catch (Throwable th2) {
                        throw new ESTException("Decoding CACerts: " + url.toString() + " " + th2.getMessage(), th2, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                } else {
                    if (statusCode != 204 && statusCode != 404) {
                        throw new ESTException("CSR Attribute request: " + eSTRequestBuild.getURL().toString(), null, eSTResponseDoRequest.getStatusCode(), eSTResponseDoRequest.getInputStream());
                    }
                    cSRAttributesResponse = null;
                }
                try {
                    eSTResponseDoRequest.close();
                    e = null;
                } catch (Exception e10) {
                    e = e10;
                }
                if (e == null) {
                    return new CSRRequestResponse(cSRAttributesResponse, eSTResponseDoRequest.getSource());
                }
                if (e instanceof ESTException) {
                    throw ((ESTException) e);
                }
                throw new ESTException(e.getMessage(), e, eSTResponseDoRequest.getStatusCode(), null);
            } catch (Throwable th3) {
                th = th3;
                eSTResponse = eSTResponseDoRequest;
                try {
                    if (th instanceof ESTException) {
                        throw th;
                    }
                    throw new ESTException(th.getMessage(), th);
                } catch (Throwable th4) {
                    if (eSTResponse != null) {
                        try {
                            eSTResponse.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public EnrollmentResponse handleEnrollResponse(ESTResponse eSTResponse) throws IOException {
        Object obj;
        long time;
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        if (eSTResponse.getStatusCode() != 202) {
            if (eSTResponse.getStatusCode() == 200 && eSTResponse.getHeaderOrEmpty("content-type").contains("multipart/mixed")) {
                final Object[] objArr = new Object[2];
                new BasicMimeParser(new Headers(eSTResponse.getHeaderOrEmpty("content-type"), "base64"), eSTResponse.getInputStream()).parse(new MimeParserListener() { // from class: org.bouncycastle.est.ESTService.2
                    @Override // org.bouncycastle.mime.MimeParserListener
                    public MimeContext createContext(MimeParserContext mimeParserContext, Headers headers) {
                        return ConstantMimeContext.Instance;
                    }

                    @Override // org.bouncycastle.mime.MimeParserListener
                    public void object(MimeParserContext mimeParserContext, Headers headers, InputStream inputStream) throws IOException {
                        if (headers.getContentType().contains("application/pkcs8")) {
                            ASN1InputStream aSN1InputStream = new ASN1InputStream(inputStream);
                            objArr[0] = PrivateKeyInfo.getInstance(aSN1InputStream.readObject());
                            if (aSN1InputStream.readObject() != null) {
                                throw new ESTException("Unexpected ASN1 object after private key info");
                            }
                            return;
                        }
                        if (headers.getContentType().contains("application/pkcs7-mime")) {
                            ASN1InputStream aSN1InputStream2 = new ASN1InputStream(inputStream);
                            try {
                                objArr[1] = new SimplePKIResponse(ContentInfo.getInstance(aSN1InputStream2.readObject()));
                                if (aSN1InputStream2.readObject() != null) {
                                    throw new ESTException("Unexpected ASN1 object after reading certificates");
                                }
                            } catch (CMCException e10) {
                                throw new IOException(e10.getMessage());
                            }
                        }
                    }
                });
                if (objArr[0] == null || (obj = objArr[1]) == null) {
                    throw new ESTException("received neither private key info and certificates");
                }
                return new EnrollmentResponse(((SimplePKIResponse) obj).getCertificates(), -1L, null, eSTResponse.getSource(), PrivateKeyInfo.getInstance(objArr[0]));
            }
            if (eSTResponse.getStatusCode() == 200) {
                try {
                    return new EnrollmentResponse(new SimplePKIResponse(ContentInfo.getInstance(new ASN1InputStream(eSTResponse.getInputStream()).readObject())).getCertificates(), -1L, null, eSTResponse.getSource());
                } catch (CMCException e10) {
                    throw new ESTException(e10.getMessage(), e10.getCause());
                }
            }
            throw new ESTException("Simple Enroll: " + originalRequest.getURL().toString(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        }
        String header = eSTResponse.getHeader("Retry-After");
        if (header == null) {
            throw new ESTException("Got Status 202 but not Retry-After header from: " + originalRequest.getURL().toString());
        }
        try {
            try {
                time = (Long.parseLong(header) * 1000) + System.currentTimeMillis();
            } catch (NumberFormatException unused) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                time = simpleDateFormat.parse(header).getTime();
            }
            return new EnrollmentResponse(null, time, originalRequest, eSTResponse.getSource());
        } catch (Exception e11) {
            throw new ESTException("Unable to parse Retry-After header:" + originalRequest.getURL().toString() + " " + e11.getMessage(), null, eSTResponse.getStatusCode(), eSTResponse.getInputStream());
        }
    }

    public EnrollmentResponse simpleEnroll(EnrollmentResponse enrollmentResponse) throws Exception {
        if (!this.clientProvider.isTrusted()) {
            throw new IllegalStateException("No trust anchors.");
        }
        ESTResponse eSTResponseDoRequest = null;
        try {
            ESTClient eSTClientMakeClient = this.clientProvider.makeClient();
            eSTResponseDoRequest = eSTClientMakeClient.doRequest(new ESTRequestBuilder(enrollmentResponse.getRequestToRetry()).withClient(eSTClientMakeClient).build());
            EnrollmentResponse enrollmentResponseHandleEnrollResponse = handleEnrollResponse(eSTResponseDoRequest);
            if (eSTResponseDoRequest != null) {
                eSTResponseDoRequest.close();
            }
            return enrollmentResponseHandleEnrollResponse;
        } catch (Throwable th2) {
            try {
                if (th2 instanceof ESTException) {
                    throw th2;
                }
                throw new ESTException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                if (eSTResponseDoRequest != null) {
                    eSTResponseDoRequest.close();
                }
                throw th3;
            }
        }
    }

    public EnrollmentResponse simpleEnrollPoP(boolean z10, PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, ContentSigner contentSigner, ESTAuth eSTAuth) throws IOException {
        return enrollPop(z10, pKCS10CertificationRequestBuilder, contentSigner, eSTAuth, false);
    }

    public EnrollmentResponse simpleEnrollPopWithServersideCreation(PKCS10CertificationRequestBuilder pKCS10CertificationRequestBuilder, ContentSigner contentSigner, ESTAuth eSTAuth) throws IOException {
        return enrollPop(false, pKCS10CertificationRequestBuilder, contentSigner, eSTAuth, true);
    }

    public EnrollmentResponse simpleEnrollWithServersideCreation(PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth) throws IOException {
        return enroll(false, pKCS10CertificationRequest, eSTAuth, true);
    }

    public static X509CertificateHolder[] storeToArray(Store<X509CertificateHolder> store, Selector<X509CertificateHolder> selector) throws StoreException {
        Collection<X509CertificateHolder> matches = store.getMatches(selector);
        return (X509CertificateHolder[]) matches.toArray(new X509CertificateHolder[matches.size()]);
    }

    public EnrollmentResponse simpleEnroll(boolean z10, PKCS10CertificationRequest pKCS10CertificationRequest, ESTAuth eSTAuth) throws IOException {
        return enroll(z10, pKCS10CertificationRequest, eSTAuth, false);
    }
}
