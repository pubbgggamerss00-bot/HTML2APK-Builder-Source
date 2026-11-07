package org.bouncycastle.pqc.crypto.crystals.dilithium;

import k1.q;
import k3.a;

/* loaded from: classes3.dex */
class PolyVecMatrix {
    private final int dilithiumK;
    private final int dilithiumL;
    private final PolyVecL[] mat;

    public PolyVecMatrix(DilithiumEngine dilithiumEngine) {
        int dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumK = dilithiumK;
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.mat = new PolyVecL[dilithiumK];
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            this.mat[i10] = new PolyVecL(dilithiumEngine);
        }
    }

    private String addString() {
        String strA = "[";
        int i10 = 0;
        while (i10 < this.dilithiumK) {
            StringBuilder sbA = q.a(strA + "Outer Matrix " + i10 + " [");
            sbA.append(this.mat[i10].toString());
            String string = sbA.toString();
            strA = i10 == this.dilithiumK + (-1) ? a.a(string, "]\n") : a.a(string, "],\n");
            i10++;
        }
        return a.a(strA, "]\n");
    }

    public void expandMatrix(byte[] bArr) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            for (int i11 = 0; i11 < this.dilithiumL; i11++) {
                this.mat[i10].getVectorIndex(i11).uniformBlocks(bArr, (short) ((i10 << 8) + i11));
            }
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i10 = 0; i10 < this.dilithiumK; i10++) {
            polyVecK.getVectorIndex(i10).pointwiseAccountMontgomery(this.mat[i10], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
