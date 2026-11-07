package org.jf.util;

/* loaded from: classes3.dex */
public class SparseIntArray {
    private int[] mKeys;
    private int mSize;
    private int[] mValues;

    public SparseIntArray() {
        this(10);
    }

    private static int binarySearch(int[] iArr, int i10, int i11, int i12) {
        int i13 = i11 + i10;
        int i14 = i10 - 1;
        int i15 = i13;
        while (i15 - i14 > 1) {
            int i16 = (i15 + i14) / 2;
            if (iArr[i16] < i12) {
                i14 = i16;
            } else {
                i15 = i16;
            }
        }
        return i15 == i13 ? ~i13 : iArr[i15] == i12 ? i15 : ~i15;
    }

    public void append(int i10, int i11) {
        int i12 = this.mSize;
        if (i12 != 0 && i10 <= this.mKeys[i12 - 1]) {
            put(i10, i11);
            return;
        }
        int[] iArr = this.mKeys;
        if (i12 >= iArr.length) {
            int iMax = Math.max(i12 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            int[] iArr3 = new int[iMax];
            int[] iArr4 = this.mKeys;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            int[] iArr5 = this.mValues;
            System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
            this.mKeys = iArr2;
            this.mValues = iArr3;
        }
        this.mKeys[i12] = i10;
        this.mValues[i12] = i11;
        this.mSize = i12 + 1;
    }

    public void clear() {
        this.mSize = 0;
    }

    public void delete(int i10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            removeAt(iBinarySearch);
        }
    }

    public int get(int i10) {
        return get(i10, 0);
    }

    public int getClosestSmaller(int i10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            return this.mValues[iBinarySearch];
        }
        int i11 = ~iBinarySearch;
        if (i11 > 0) {
            i11--;
        }
        return this.mValues[i11];
    }

    public int indexOfKey(int i10) {
        return binarySearch(this.mKeys, 0, this.mSize, i10);
    }

    public int indexOfValue(int i10) {
        for (int i11 = 0; i11 < this.mSize; i11++) {
            if (this.mValues[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public int keyAt(int i10) {
        return this.mKeys[i10];
    }

    public void put(int i10, int i11) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = i11;
            return;
        }
        int i12 = ~iBinarySearch;
        int i13 = this.mSize;
        int[] iArr = this.mKeys;
        if (i13 >= iArr.length) {
            int iMax = Math.max(i13 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            int[] iArr3 = new int[iMax];
            int[] iArr4 = this.mKeys;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            int[] iArr5 = this.mValues;
            System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
            this.mKeys = iArr2;
            this.mValues = iArr3;
        }
        int i14 = this.mSize;
        if (i14 - i12 != 0) {
            int[] iArr6 = this.mKeys;
            int i15 = i12 + 1;
            System.arraycopy(iArr6, i12, iArr6, i15, i14 - i12);
            int[] iArr7 = this.mValues;
            System.arraycopy(iArr7, i12, iArr7, i15, this.mSize - i12);
        }
        this.mKeys[i12] = i10;
        this.mValues[i12] = i11;
        this.mSize++;
    }

    public void removeAt(int i10) {
        int[] iArr = this.mKeys;
        int i11 = i10 + 1;
        System.arraycopy(iArr, i11, iArr, i10, this.mSize - i11);
        int[] iArr2 = this.mValues;
        System.arraycopy(iArr2, i11, iArr2, i10, this.mSize - i11);
        this.mSize--;
    }

    public int size() {
        return this.mSize;
    }

    public int valueAt(int i10) {
        return this.mValues[i10];
    }

    public SparseIntArray(int i10) {
        this.mKeys = new int[i10];
        this.mValues = new int[i10];
        this.mSize = 0;
    }

    public int get(int i10, int i11) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        return iBinarySearch < 0 ? i11 : this.mValues[iBinarySearch];
    }
}
