package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: classes3.dex */
class KMatrices {
    private int columns;
    private int[] data;
    private int nmatrices;
    private int rows;

    public KMatrices(int i10, int i11, int i12, int[] iArr) {
        this.nmatrices = i10;
        this.rows = i11;
        this.columns = i12;
        this.data = iArr;
    }

    public int getColumns() {
        return this.columns;
    }

    public int[] getData() {
        return this.data;
    }

    public int getNmatrices() {
        return this.nmatrices;
    }

    public int getRows() {
        return this.rows;
    }

    public int getSize() {
        return this.rows * this.columns;
    }
}
