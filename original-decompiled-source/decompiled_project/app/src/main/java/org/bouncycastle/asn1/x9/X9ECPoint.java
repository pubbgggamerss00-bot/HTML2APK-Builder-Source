package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class X9ECPoint extends ASN1Object {

    /* renamed from: c, reason: collision with root package name */
    private ECCurve f19866c;
    private final ASN1OctetString encoding;

    /* renamed from: p, reason: collision with root package name */
    private ECPoint f19867p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f19867p == null) {
                this.f19867p = this.f19866c.decodePoint(this.encoding.getOctets()).normalize();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f19867p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b10;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b10 = octets[0]) == 2 || b10 == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f19866c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z10) {
        this.f19867p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z10));
    }
}
