package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public final class XMSSMTParameters {
    private static final Map<Integer, XMSSMTParameters> paramsLookupTable;
    private final int height;
    private final int layers;
    private final XMSSOid oid;
    private final XMSSParameters xmssParams;

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(numValueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        a.a(20, 4, aSN1ObjectIdentifier, map, Integers.valueOf(2));
        a.a(40, 2, aSN1ObjectIdentifier, map, Integers.valueOf(3));
        a.a(40, 4, aSN1ObjectIdentifier, map, Integers.valueOf(4));
        a.a(40, 8, aSN1ObjectIdentifier, map, Integers.valueOf(5));
        a.a(60, 3, aSN1ObjectIdentifier, map, Integers.valueOf(6));
        a.a(60, 6, aSN1ObjectIdentifier, map, Integers.valueOf(7));
        a.a(60, 12, aSN1ObjectIdentifier, map, Integers.valueOf(8));
        Integer numValueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put(numValueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        a.a(20, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(10));
        a.a(40, 2, aSN1ObjectIdentifier2, map, Integers.valueOf(11));
        a.a(40, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(12));
        a.a(40, 8, aSN1ObjectIdentifier2, map, Integers.valueOf(13));
        a.a(60, 3, aSN1ObjectIdentifier2, map, Integers.valueOf(14));
        a.a(60, 6, aSN1ObjectIdentifier2, map, Integers.valueOf(15));
        a.a(60, 12, aSN1ObjectIdentifier2, map, Integers.valueOf(16));
        Integer numValueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put(numValueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        a.a(20, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(18));
        a.a(40, 2, aSN1ObjectIdentifier3, map, Integers.valueOf(19));
        a.a(40, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(20));
        a.a(40, 8, aSN1ObjectIdentifier3, map, Integers.valueOf(21));
        a.a(60, 3, aSN1ObjectIdentifier3, map, Integers.valueOf(22));
        a.a(60, 6, aSN1ObjectIdentifier3, map, Integers.valueOf(23));
        a.a(60, 12, aSN1ObjectIdentifier3, map, Integers.valueOf(24));
        Integer numValueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put(numValueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        a.a(20, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(26));
        a.a(40, 2, aSN1ObjectIdentifier4, map, Integers.valueOf(27));
        a.a(40, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(28));
        a.a(40, 8, aSN1ObjectIdentifier4, map, Integers.valueOf(29));
        a.a(60, 3, aSN1ObjectIdentifier4, map, Integers.valueOf(30));
        a.a(60, 6, aSN1ObjectIdentifier4, map, Integers.valueOf(31));
        a.a(60, 12, aSN1ObjectIdentifier4, map, Integers.valueOf(32));
        paramsLookupTable = Collections.unmodifiableMap(map);
    }

    public XMSSMTParameters(int i10, int i11, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.height = i10;
        this.layers = i11;
        this.xmssParams = new XMSSParameters(xmssTreeHeight(i10, i11), aSN1ObjectIdentifier);
        this.oid = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i11);
    }

    public static XMSSMTParameters lookupByOID(int i10) {
        return paramsLookupTable.get(Integers.valueOf(i10));
    }

    private static int xmssTreeHeight(int i10, int i11) throws IllegalArgumentException {
        if (i10 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i10 % i11 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i12 = i10 / i11;
        if (i12 != 1) {
            return i12;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public int getLen() {
        return this.xmssParams.getLen();
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    public WOTSPlus getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    public int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    public XMSSParameters getXMSSParameters() {
        return this.xmssParams;
    }

    public XMSSMTParameters(int i10, int i11, Digest digest) {
        this(i10, i11, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }
}
