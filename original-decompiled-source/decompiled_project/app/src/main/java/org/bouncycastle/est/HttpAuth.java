package org.bouncycastle.est;

import ad.b;
import b.o;
import e.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k4.i;
import m3.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestAlgorithmIdentifierFinder;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.operator.DigestCalculatorProvider;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;
import org.bouncycastle.util.encoders.Hex;
import p3.c;

/* loaded from: classes2.dex */
public class HttpAuth implements ESTAuth {
    private static final DigestAlgorithmIdentifierFinder digestAlgorithmIdentifierFinder = new DefaultDigestAlgorithmIdentifierFinder();
    private static final Set<String> validParts;
    private final DigestCalculatorProvider digestCalculatorProvider;
    private final SecureRandom nonceGenerator;
    private final char[] password;
    private final String realm;
    private final String username;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("realm");
        hashSet.add("nonce");
        hashSet.add("opaque");
        hashSet.add("algorithm");
        hashSet.add("qop");
        validParts = Collections.unmodifiableSet(hashSet);
    }

    public HttpAuth(String str, String str2, char[] cArr) {
        this(str, str2, cArr, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ESTResponse doDigestFunction(ESTResponse eSTResponse) throws IOException {
        eSTResponse.close();
        ESTRequest originalRequest = eSTResponse.getOriginalRequest();
        try {
            Map<String, String> mapSplitCSL = HttpUtil.splitCSL("Digest", eSTResponse.getHeader("WWW-Authenticate"));
            try {
                String path = originalRequest.getURL().toURI().getPath();
                for (String str : mapSplitCSL.keySet()) {
                    if (!validParts.contains(str)) {
                        throw new ESTException("Unrecognised entry in WWW-Authenticate header: '" + ((Object) str) + "'");
                    }
                }
                String method = originalRequest.getMethod();
                String str2 = mapSplitCSL.get("realm");
                String str3 = mapSplitCSL.get("nonce");
                String str4 = mapSplitCSL.get("opaque");
                String str5 = "algorithm";
                String str6 = mapSplitCSL.get("algorithm");
                String str7 = mapSplitCSL.get("qop");
                ArrayList arrayList = new ArrayList();
                String str8 = this.realm;
                String str9 = str6;
                if (str8 != null && !str8.equals(str2)) {
                    throw new ESTException("Supplied realm '" + this.realm + "' does not match server realm '" + str2 + "'", null, 401, null);
                }
                if (str9 == null) {
                    str9 = "MD5";
                }
                if (str9.length() == 0) {
                    throw new ESTException("WWW-Authenticate no algorithm defined.");
                }
                String upperCase = Strings.toUpperCase(str9);
                if (str7 == null) {
                    throw new ESTException("Qop is not defined in WWW-Authenticate header.");
                }
                if (str7.length() == 0) {
                    throw new ESTException("QoP value is empty.");
                }
                String[] strArrSplit = Strings.toLowerCase(str7).split(",");
                int i10 = 0;
                while (true) {
                    String[] strArr = strArrSplit;
                    String str10 = str5;
                    if (i10 == strArrSplit.length) {
                        AlgorithmIdentifier algorithmIdentifierLookupDigest = lookupDigest(upperCase);
                        if (algorithmIdentifierLookupDigest == null || algorithmIdentifierLookupDigest.getAlgorithm() == null) {
                            throw new IOException(a.a("auth digest algorithm unknown: ", upperCase));
                        }
                        DigestCalculator digestCalculator = getDigestCalculator(upperCase, algorithmIdentifierLookupDigest);
                        OutputStream outputStream = digestCalculator.getOutputStream();
                        String strMakeNonce = makeNonce(10);
                        update(outputStream, this.username);
                        update(outputStream, ":");
                        update(outputStream, str2);
                        update(outputStream, ":");
                        update(outputStream, this.password);
                        outputStream.close();
                        byte[] digest = digestCalculator.getDigest();
                        if (upperCase.endsWith("-SESS")) {
                            DigestCalculator digestCalculator2 = getDigestCalculator(upperCase, algorithmIdentifierLookupDigest);
                            OutputStream outputStream2 = digestCalculator2.getOutputStream();
                            update(outputStream2, Hex.toHexString(digest));
                            update(outputStream2, ":");
                            update(outputStream2, str3);
                            update(outputStream2, ":");
                            update(outputStream2, strMakeNonce);
                            outputStream2.close();
                            digest = digestCalculator2.getDigest();
                        }
                        String hexString = Hex.toHexString(digest);
                        DigestCalculator digestCalculator3 = getDigestCalculator(upperCase, algorithmIdentifierLookupDigest);
                        OutputStream outputStream3 = digestCalculator3.getOutputStream();
                        if (((String) arrayList.get(0)).equals("auth-int")) {
                            DigestCalculator digestCalculator4 = getDigestCalculator(upperCase, algorithmIdentifierLookupDigest);
                            OutputStream outputStream4 = digestCalculator4.getOutputStream();
                            originalRequest.writeData(outputStream4);
                            outputStream4.close();
                            byte[] digest2 = digestCalculator4.getDigest();
                            update(outputStream3, method);
                            update(outputStream3, ":");
                            update(outputStream3, path);
                            update(outputStream3, ":");
                            update(outputStream3, Hex.toHexString(digest2));
                        } else if (((String) arrayList.get(0)).equals("auth")) {
                            update(outputStream3, method);
                            update(outputStream3, ":");
                            update(outputStream3, path);
                        }
                        outputStream3.close();
                        String hexString2 = Hex.toHexString(digestCalculator3.getDigest());
                        DigestCalculator digestCalculator5 = getDigestCalculator(upperCase, algorithmIdentifierLookupDigest);
                        OutputStream outputStream5 = digestCalculator5.getOutputStream();
                        boolean zContains = arrayList.contains("missing");
                        update(outputStream5, hexString);
                        update(outputStream5, ":");
                        update(outputStream5, str3);
                        update(outputStream5, ":");
                        if (!zContains) {
                            update(outputStream5, "00000001");
                            update(outputStream5, ":");
                            update(outputStream5, strMakeNonce);
                            update(outputStream5, ":");
                            if (((String) arrayList.get(0)).equals("auth-int")) {
                                update(outputStream5, "auth-int");
                            } else {
                                update(outputStream5, "auth");
                            }
                            update(outputStream5, ":");
                        }
                        update(outputStream5, hexString2);
                        outputStream5.close();
                        String hexString3 = Hex.toHexString(digestCalculator5.getDigest());
                        HashMap map = new HashMap();
                        map.put("username", this.username);
                        map.put("realm", str2);
                        map.put("nonce", str3);
                        map.put("uri", path);
                        map.put("response", hexString3);
                        if (!((String) arrayList.get(0)).equals("auth-int")) {
                            if (((String) arrayList.get(0)).equals("auth")) {
                                map.put("qop", "auth");
                            }
                            map.put(str10, upperCase);
                            if (str4 != null || str4.length() == 0) {
                                map.put("opaque", makeNonce(20));
                            }
                            ESTRequestBuilder eSTRequestBuilderWithHijacker = new ESTRequestBuilder(originalRequest).withHijacker(null);
                            eSTRequestBuilderWithHijacker.setHeader("Authorization", HttpUtil.mergeCSL("Digest", map));
                            return originalRequest.getClient().doRequest(eSTRequestBuilderWithHijacker.build());
                        }
                        map.put("qop", "auth-int");
                        map.put("nc", "00000001");
                        map.put("cnonce", strMakeNonce);
                        map.put(str10, upperCase);
                        if (str4 != null) {
                            map.put("opaque", makeNonce(20));
                        }
                        ESTRequestBuilder eSTRequestBuilderWithHijacker2 = new ESTRequestBuilder(originalRequest).withHijacker(null);
                        eSTRequestBuilderWithHijacker2.setHeader("Authorization", HttpUtil.mergeCSL("Digest", map));
                        return originalRequest.getClient().doRequest(eSTRequestBuilderWithHijacker2.build());
                    }
                    if (!strArr[i10].equals("auth") && !strArr[i10].equals("auth-int")) {
                        throw new ESTException(b.b(i10, "QoP value unknown: '", "'"));
                    }
                    String strTrim = strArr[i10].trim();
                    if (!arrayList.contains(strTrim)) {
                        arrayList.add(strTrim);
                    }
                    i10++;
                    strArrSplit = strArr;
                    str5 = str10;
                }
            } catch (Exception e10) {
                throw new IOException(i.a(e10, new StringBuilder("unable to process URL in request: ")));
            }
        } catch (Throwable th2) {
            throw new ESTException("Parsing WWW-Authentication header: " + th2.getMessage(), th2, eSTResponse.getStatusCode(), new ByteArrayInputStream(eSTResponse.getHeader("WWW-Authenticate").getBytes()));
        }
    }

    private DigestCalculator getDigestCalculator(String str, AlgorithmIdentifier algorithmIdentifier) throws IOException {
        try {
            return this.digestCalculatorProvider.get(algorithmIdentifier);
        } catch (OperatorCreationException e10) {
            StringBuilder sbA = e.a("cannot create digest calculator for ", str, ": ");
            sbA.append(e10.getMessage());
            throw new IOException(sbA.toString());
        }
    }

    private AlgorithmIdentifier lookupDigest(String str) {
        if (str.endsWith("-SESS")) {
            str = c.a(5, 0, str);
        }
        return str.equals("SHA-512-256") ? digestAlgorithmIdentifierFinder.find(NISTObjectIdentifiers.id_sha512_256) : digestAlgorithmIdentifierFinder.find(str);
    }

    private String makeNonce(int i10) {
        byte[] bArr = new byte[i10];
        this.nonceGenerator.nextBytes(bArr);
        return Hex.toHexString(bArr);
    }

    private void update(OutputStream outputStream, String str) throws IOException {
        outputStream.write(Strings.toUTF8ByteArray(str));
    }

    @Override // org.bouncycastle.est.ESTAuth
    public void applyAuth(ESTRequestBuilder eSTRequestBuilder) {
        eSTRequestBuilder.withHijacker(new ESTHijacker() { // from class: org.bouncycastle.est.HttpAuth.1
            @Override // org.bouncycastle.est.ESTHijacker
            public ESTResponse hijack(ESTRequest eSTRequest, Source source) throws IOException {
                ESTResponse eSTResponse = new ESTResponse(eSTRequest, source);
                if (eSTResponse.getStatusCode() != 401) {
                    return eSTResponse;
                }
                String header = eSTResponse.getHeader("WWW-Authenticate");
                if (header == null) {
                    throw new ESTException("Status of 401 but no WWW-Authenticate header");
                }
                String lowerCase = Strings.toLowerCase(header);
                if (lowerCase.startsWith(CMSAttributeTableGenerator.DIGEST)) {
                    return HttpAuth.this.doDigestFunction(eSTResponse);
                }
                if (!lowerCase.startsWith("basic")) {
                    throw new ESTException("Unknown auth mode: ".concat(lowerCase));
                }
                eSTResponse.close();
                Map<String, String> mapSplitCSL = HttpUtil.splitCSL("Basic", eSTResponse.getHeader("WWW-Authenticate"));
                if (HttpAuth.this.realm != null && !HttpAuth.this.realm.equals(mapSplitCSL.get("realm"))) {
                    StringBuilder sb = new StringBuilder("Supplied realm '");
                    sb.append(HttpAuth.this.realm);
                    sb.append("' does not match server realm '");
                    throw new ESTException(o.a(sb, mapSplitCSL.get("realm"), "'"), null, 401, null);
                }
                ESTRequestBuilder eSTRequestBuilderWithHijacker = new ESTRequestBuilder(eSTRequest).withHijacker(null);
                if (HttpAuth.this.realm != null && HttpAuth.this.realm.length() > 0) {
                    eSTRequestBuilderWithHijacker.setHeader("WWW-Authenticate", "Basic realm=\"" + HttpAuth.this.realm + "\"");
                }
                if (HttpAuth.this.username.contains(":")) {
                    throw new IllegalArgumentException("User must not contain a ':'");
                }
                char[] cArr = new char[HttpAuth.this.username.length() + 1 + HttpAuth.this.password.length];
                System.arraycopy(HttpAuth.this.username.toCharArray(), 0, cArr, 0, HttpAuth.this.username.length());
                cArr[HttpAuth.this.username.length()] = ':';
                System.arraycopy(HttpAuth.this.password, 0, cArr, HttpAuth.this.username.length() + 1, HttpAuth.this.password.length);
                eSTRequestBuilderWithHijacker.setHeader("Authorization", "Basic " + Base64.toBase64String(Strings.toByteArray(cArr)));
                ESTResponse eSTResponseDoRequest = eSTRequest.getClient().doRequest(eSTRequestBuilderWithHijacker.build());
                Arrays.fill(cArr, (char) 0);
                return eSTResponseDoRequest;
            }
        });
    }

    public HttpAuth(String str, String str2, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this.realm = str;
        this.username = str2;
        this.password = cArr;
        this.nonceGenerator = secureRandom;
        this.digestCalculatorProvider = digestCalculatorProvider;
    }

    private void update(OutputStream outputStream, char[] cArr) throws IOException {
        outputStream.write(Strings.toUTF8ByteArray(cArr));
    }

    public HttpAuth(String str, char[] cArr) {
        this(null, str, cArr, null, null);
    }

    public HttpAuth(String str, char[] cArr, SecureRandom secureRandom, DigestCalculatorProvider digestCalculatorProvider) {
        this(null, str, cArr, secureRandom, digestCalculatorProvider);
    }
}
