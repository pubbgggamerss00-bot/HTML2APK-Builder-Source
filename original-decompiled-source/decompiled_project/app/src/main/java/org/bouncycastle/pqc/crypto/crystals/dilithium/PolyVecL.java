package org.bouncycastle.pqc.crypto.crystals.dilithium;

import k3.a;
import v5.b;

/* loaded from: classes3.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;
    Poly[] vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).addPoly(polyVecL.getVectorIndex(i10));
        }
    }

    public boolean checkNorm(int i10) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            if (getVectorIndex(i11).checkNorm(i10)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            for (int i11 = 0; i11 < 256; i11++) {
                polyVecL.getVectorIndex(i10).setCoeffIndex(i11, getVectorIndex(i10).getCoeffIndex(i11));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i10) {
        for (int i11 = 0; i11 < this.dilithiumL; i11++) {
            this.vec[i11].uniformBlocks(bArr, (short) ((i10 << 8) + i11));
        }
    }

    public Poly getVectorIndex(int i10) {
        return this.vec[i10];
    }

    public void invNttToMont() {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i10));
        }
    }

    public void polyVecNtt() {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            this.vec[i10].polyNtt();
        }
    }

    public void reduce() {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).reduce();
        }
    }

    public String toString() {
        String strA = "\n[";
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            strA = strA + "Inner Matrix " + i10 + " " + getVectorIndex(i10).toString();
            if (i10 != this.dilithiumL - 1) {
                strA = a.a(strA, ",\n");
            }
        }
        return a.a(strA, "]");
    }

    public void uniformEta(byte[] bArr, short s10) {
        int i10 = 0;
        while (i10 < this.dilithiumL) {
            getVectorIndex(i10).uniformEta(bArr, s10);
            i10++;
            s10 = (short) (s10 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s10) {
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            getVectorIndex(i10).uniformGamma1(bArr, (short) ((this.dilithiumL * s10) + i10));
        }
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.vec = new Poly[this.dilithiumL];
        for (int i10 = 0; i10 < this.dilithiumL; i10++) {
            this.vec[i10] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbA = b.a(str, ": ");
        sbA.append(toString());
        return sbA.toString();
    }
}
