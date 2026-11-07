package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
class FalconRNG {

    /* renamed from: bd, reason: collision with root package name */
    byte[] f20338bd = new byte[512];
    long bdummy_u64 = 0;
    int ptr = 0;

    /* renamed from: sd, reason: collision with root package name */
    byte[] f20339sd = new byte[256];
    long sdummy_u64 = 0;
    int type = 0;
    FalconConversions convertor = new FalconConversions();

    private void QROUND(int i10, int i11, int i12, int i13, int[] iArr) {
        int i14 = iArr[i10] + iArr[i11];
        iArr[i10] = i14;
        int i15 = i14 ^ iArr[i13];
        iArr[i13] = i15;
        int i16 = (i15 >>> 16) | (i15 << 16);
        iArr[i13] = i16;
        int i17 = iArr[i12] + i16;
        iArr[i12] = i17;
        int i18 = iArr[i11] ^ i17;
        iArr[i11] = i18;
        int i19 = (i18 >>> 20) | (i18 << 12);
        iArr[i11] = i19;
        int i20 = iArr[i10] + i19;
        iArr[i10] = i20;
        int i21 = iArr[i13] ^ i20;
        iArr[i13] = i21;
        int i22 = (i21 >>> 24) | (i21 << 8);
        iArr[i13] = i22;
        int i23 = iArr[i12] + i22;
        iArr[i12] = i23;
        int i24 = iArr[i11] ^ i23;
        iArr[i11] = i24;
        iArr[i11] = (i24 >>> 25) | (i24 << 7);
    }

    public void prng_get_bytes(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            byte[] bArr2 = this.f20338bd;
            int length = bArr2.length - this.ptr;
            if (length > i11) {
                length = i11;
            }
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
            i11 -= length;
            int i12 = this.ptr + length;
            this.ptr = i12;
            if (i12 == this.f20338bd.length) {
                prng_refill();
            }
        }
    }

    public long prng_get_u64() {
        int i10 = this.ptr;
        if (i10 >= this.f20338bd.length - 9) {
            prng_refill();
            i10 = 0;
        }
        this.ptr = i10 + 8;
        byte[] bArr = this.f20338bd;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public byte prng_get_u8() {
        byte[] bArr = this.f20338bd;
        int i10 = this.ptr;
        int i11 = i10 + 1;
        this.ptr = i11;
        byte b10 = bArr[i10];
        if (i11 == bArr.length) {
            prng_refill();
        }
        return b10;
    }

    public void prng_init(SHAKE256 shake256) {
        byte[] bArr = new byte[56];
        shake256.inner_shake256_extract(bArr, 0, 56);
        for (int i10 = 0; i10 < 14; i10++) {
            int i11 = i10 << 2;
            System.arraycopy(this.convertor.int_to_bytes(((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255) | ((bArr[i11 + 2] & 255) << 16) | ((bArr[i11 + 3] & 255) << 24)), 0, this.f20339sd, i11, 4);
        }
        System.arraycopy(this.convertor.long_to_bytes((this.convertor.bytes_to_int(this.f20339sd, 48) & BodyPartID.bodyIdMax) + ((BodyPartID.bodyIdMax & this.convertor.bytes_to_int(this.f20339sd, 52)) << 32)), 0, this.f20339sd, 48, 8);
        prng_refill();
    }

    public void prng_refill() {
        FalconRNG falconRNG = this;
        int[] iArr = {1634760805, 857760878, 2036477234, 1797285236};
        long jBytes_to_long = falconRNG.convertor.bytes_to_long(falconRNG.f20339sd, 48);
        for (int i10 = 0; i10 < 8; i10++) {
            int[] iArr2 = new int[16];
            System.arraycopy(iArr, 0, iArr2, 0, 4);
            System.arraycopy(falconRNG.convertor.bytes_to_int_array(falconRNG.f20339sd, 0, 12), 0, iArr2, 4, 12);
            int i11 = (int) jBytes_to_long;
            iArr2[14] = iArr2[14] ^ i11;
            int i12 = (int) (jBytes_to_long >>> 32);
            iArr2[15] = iArr2[15] ^ i12;
            int i13 = 0;
            while (i13 < 10) {
                falconRNG.QROUND(0, 4, 8, 12, iArr2);
                falconRNG = this;
                falconRNG.QROUND(1, 5, 9, 13, iArr2);
                falconRNG.QROUND(2, 6, 10, 14, iArr2);
                falconRNG.QROUND(3, 7, 11, 15, iArr2);
                falconRNG.QROUND(0, 5, 10, 15, iArr2);
                falconRNG.QROUND(1, 6, 11, 12, iArr2);
                falconRNG.QROUND(2, 7, 8, 13, iArr2);
                falconRNG.QROUND(3, 4, 9, 14, iArr2);
                i13++;
                i12 = i12;
            }
            int i14 = i12;
            for (int i15 = 0; i15 < 4; i15++) {
                iArr2[i15] = iArr2[i15] + iArr[i15];
            }
            for (int i16 = 4; i16 < 14; i16++) {
                iArr2[i16] = iArr2[i16] + falconRNG.convertor.bytes_to_int(falconRNG.f20339sd, (i16 * 4) - 16);
            }
            iArr2[14] = iArr2[14] + (falconRNG.convertor.bytes_to_int(falconRNG.f20339sd, 40) ^ i11);
            iArr2[15] = iArr2[15] + (falconRNG.convertor.bytes_to_int(falconRNG.f20339sd, 44) ^ i14);
            jBytes_to_long++;
            for (int i17 = 0; i17 < 16; i17++) {
                byte[] bArr = falconRNG.f20338bd;
                int i18 = (i10 << 2) + (i17 << 5);
                int i19 = iArr2[i17];
                bArr[i18] = (byte) i19;
                bArr[i18 + 1] = (byte) (i19 >>> 8);
                bArr[i18 + 2] = (byte) (i19 >>> 16);
                bArr[i18 + 3] = (byte) (i19 >>> 24);
            }
        }
        System.arraycopy(falconRNG.convertor.long_to_bytes(jBytes_to_long), 0, falconRNG.f20339sd, 48, 8);
        falconRNG.ptr = 0;
    }
}
