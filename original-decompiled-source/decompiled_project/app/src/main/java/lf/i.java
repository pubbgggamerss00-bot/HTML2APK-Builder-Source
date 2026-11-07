package lf;

import cf.u;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import javax.crypto.KeyGenerator;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyTransRecipientId;

/* loaded from: classes2.dex */
public final class i extends l {
    public i() {
    }

    public static void j(StringBuilder sb, KeyTransRecipientId keyTransRecipientId, X509Certificate x509Certificate, X509CertificateHolder x509CertificateHolder) {
        BigInteger serialNumber = keyTransRecipientId.getSerialNumber();
        if (serialNumber != null) {
            BigInteger serialNumber2 = x509Certificate.getSerialNumber();
            String string = serialNumber2 != null ? serialNumber2.toString(16) : "unknown";
            sb.append("serial-#: rid ");
            sb.append(serialNumber.toString(16));
            sb.append(" vs. cert ");
            sb.append(string);
            sb.append(" issuer: rid '");
            sb.append(keyTransRecipientId.getIssuer());
            sb.append("' vs. cert '");
            sb.append(x509CertificateHolder == null ? "null" : x509CertificateHolder.getIssuer());
            sb.append("' ");
        }
    }

    @Override // lf.l
    public final void h(hf.b bVar) throws NoSuchAlgorithmException, IOException {
        int i10;
        byte[] bArrDigest;
        try {
            e eVarL = bVar.l();
            if (eVarL == null) {
                eVarL = new e();
            }
            cf.d dVar = eVarL.f17035a;
            dVar.O0(cf.l.B0, cf.l.g0("Adobe.PubSec"));
            dVar.N0(cf.l.f5485k1, this.f17042a);
            short s10 = this.f17042a;
            if (s10 == 40) {
                i10 = 1;
            } else {
                if (s10 == 128) {
                    this.f17048g.getClass();
                }
                i10 = this.f17042a == 256 ? 5 : 2;
            }
            dVar.N0(cf.l.A2, i10);
            dVar.L0(cf.l.I);
            dVar.L0(cf.l.f5490l2);
            dVar.L0(cf.l.f5494m2);
            int length = 20;
            byte[] bArr = new byte[20];
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(192, new SecureRandom());
                System.arraycopy(keyGenerator.generateKey().getEncoded(), 0, bArr, 0, 20);
                g gVar = (g) this.f17048g;
                int size = gVar.f17037a.size();
                byte[][] bArr2 = new byte[size][];
                Iterator it = gVar.f17037a.iterator();
                if (it.hasNext()) {
                    ((h) it.next()).getClass();
                    throw null;
                }
                int length2 = 20;
                for (int i11 = 0; i11 < size; i11++) {
                    length2 += bArr2[i11].length;
                }
                byte[] bArr3 = new byte[length2];
                System.arraycopy(bArr, 0, bArr3, 0, 20);
                for (int i12 = 0; i12 < size; i12++) {
                    byte[] bArr4 = bArr2[i12];
                    System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                    length += bArr4.length;
                }
                if (i10 == 4) {
                    dVar.R0(cf.l.f5501o2, "adbe.pkcs7.s5");
                    bArrDigest = c.c().digest(bArr3);
                    k(eVarL, cf.l.f5472h, bArr2);
                } else if (i10 != 5) {
                    dVar.R0(cf.l.f5501o2, "adbe.pkcs7.s4");
                    bArrDigest = c.c().digest(bArr3);
                    cf.a aVar = new cf.a();
                    for (int i13 = 0; i13 < size; i13++) {
                        aVar.g0(new u(bArr2[i13]));
                    }
                    dVar.O0(cf.l.U1, aVar);
                    aVar.f5417a = true;
                } else {
                    dVar.R0(cf.l.f5501o2, "adbe.pkcs7.s5");
                    bArrDigest = c.d().digest(bArr3);
                    k(eVarL, cf.l.f5479j, bArr2);
                }
                short s11 = this.f17042a;
                byte[] bArr5 = new byte[s11 / 8];
                this.f17043b = bArr5;
                System.arraycopy(bArrDigest, 0, bArr5, 0, s11 / 8);
                bVar.f12999c = eVarL;
                bVar.f12997a.f5428f.O0(cf.l.f5530w0, dVar);
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new IOException(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // lf.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(e eVar, cf.a aVar, c5.p pVar) throws IOException {
        if (!(pVar instanceof f)) {
            throw new IOException("Provided decryption material is not compatible with the document - did you pass a null keyStore?");
        }
        eVar.getClass();
        d dVarA = eVar.a(cf.l.f5476i0);
        if (dVarA != null) {
            cf.d dVar = dVarA.f17034a;
            cf.l lVar = cf.l.f5485k1;
            if (dVar.G0(lVar, null, 40) != 0) {
                this.f17042a = (short) dVar.G0(lVar, null, 40);
                cf.b bVarV0 = dVar.v0(cf.l.f5534x0);
                this.f17045d = bVarV0 instanceof cf.c ? ((cf.c) bVarV0).f5422b : true;
            } else if (eVar.b() != 0) {
                this.f17042a = (short) eVar.b();
                this.f17045d = eVar.e();
            }
        }
        try {
            ((f) pVar).getClass();
            throw null;
        } catch (KeyStoreException e10) {
            throw new IOException(e10);
        } catch (CertificateEncodingException e11) {
            throw new IOException(e11);
        } catch (CMSException e12) {
            throw new IOException(e12);
        }
    }

    public final void k(e eVar, cf.l lVar, byte[][] bArr) {
        cf.d dVar = eVar.f17035a;
        cf.d dVar2 = new cf.d();
        dVar2.O0(cf.l.K, lVar);
        dVar2.N0(cf.l.f5485k1, this.f17042a);
        cf.a aVar = new cf.a();
        for (byte[] bArr2 : bArr) {
            aVar.g0(new u(bArr2));
        }
        dVar2.O0(cf.l.U1, aVar);
        aVar.f5417a = true;
        dVar2.f5417a = true;
        cf.l lVar2 = cf.l.f5476i0;
        cf.l lVar3 = cf.l.I;
        cf.d dVarL0 = dVar.l0(lVar3);
        if (dVarL0 == null) {
            dVarL0 = new cf.d();
            dVar.O0(lVar3, dVarL0);
        }
        dVarL0.f5417a = true;
        dVarL0.O0(lVar2, dVar2);
        dVar.O0(cf.l.f5490l2, lVar2);
        dVar.O0(cf.l.f5494m2, lVar2);
        dVar2.f5417a = true;
        this.f17047f = true;
    }

    public i(g gVar) {
        this.f17048g = gVar;
        gVar.getClass();
        this.f17042a = (short) 40;
    }
}
