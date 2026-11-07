package org.bouncycastle.pqc.crypto.sphincs;

/* loaded from: classes3.dex */
class Tree {

    public static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    public static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i11);
        l_tree(hashFunctions, bArr, i10, bArr5, 0, bArr2, i11);
    }

    public static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        int i13;
        int i14 = 67;
        for (int i15 = 0; i15 < 7; i15++) {
            int i16 = 0;
            while (true) {
                i13 = i14 >>> 1;
                if (i16 >= i13) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, (i16 * 32) + i11, bArr2, (i16 * 64) + i11, bArr3, (i15 * 64) + i12);
                i16++;
            }
            if ((i14 & 1) != 0) {
                System.arraycopy(bArr2, ((i14 - 1) * 32) + i11, bArr2, (i13 * 32) + i11, 32);
                i13++;
            }
            i14 = i13;
        }
        System.arraycopy(bArr2, i11, bArr, i10, 32);
    }

    public static void treehash(HashFunctions hashFunctions, byte[] bArr, int i10, int i11, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i12) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i13 = i11 + 1;
        byte[] bArr4 = new byte[i13 * 32];
        int[] iArr = new int[i13];
        int i14 = (int) (leafaddrVar2.subleaf + (1 << i11));
        int i15 = 0;
        while (leafaddrVar2.subleaf < i14) {
            gen_leaf_wots(hashFunctions, bArr4, i15 * 32, bArr3, i12, bArr2, leafaddrVar2);
            iArr[i15] = 0;
            int i16 = i15 + 1;
            while (i16 > 1) {
                int i17 = iArr[i16 - 1];
                int i18 = i16 - 2;
                if (i17 == iArr[i18]) {
                    int i19 = i18 * 32;
                    hashFunctions.hash_2n_n_mask(bArr4, i19, bArr4, i19, bArr3, i12 + ((i17 + 7) * 64));
                    iArr[i18] = iArr[i18] + 1;
                    i16--;
                    i14 = i14;
                }
            }
            leafaddrVar2.subleaf++;
            i15 = i16;
            i14 = i14;
        }
        for (int i20 = 0; i20 < 32; i20++) {
            bArr[i10 + i20] = bArr4[i20];
        }
    }
}
