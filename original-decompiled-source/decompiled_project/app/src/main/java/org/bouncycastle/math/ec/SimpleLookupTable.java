package org.bouncycastle.math.ec;

/* loaded from: classes3.dex */
public class SimpleLookupTable extends AbstractECLookupTable {
    private final ECPoint[] points;

    public SimpleLookupTable(ECPoint[] eCPointArr, int i10, int i11) {
        this.points = copy(eCPointArr, i10, i11);
    }

    private static ECPoint[] copy(ECPoint[] eCPointArr, int i10, int i11) {
        ECPoint[] eCPointArr2 = new ECPoint[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            eCPointArr2[i12] = eCPointArr[i10 + i12];
        }
        return eCPointArr2;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public int getSize() {
        return this.points.length;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookup(int i10) {
        throw new UnsupportedOperationException("Constant-time lookup not supported");
    }

    @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i10) {
        return this.points[i10];
    }
}
