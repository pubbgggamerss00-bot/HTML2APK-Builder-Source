package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.sphincs.Tree;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Seed {
    public static void get_seed(HashFunctions hashFunctions, byte[] bArr, int i10, byte[] bArr2, Tree.leafaddr leafaddrVar) {
        byte[] bArr3 = new byte[40];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr3[i11] = bArr2[i11];
        }
        Pack.longToLittleEndian((leafaddrVar.subleaf << 59) | leafaddrVar.level | (leafaddrVar.subtree << 4), bArr3, 32);
        hashFunctions.varlen_hash(bArr, i10, bArr3, 40);
    }

    public static void prg(byte[] bArr, int i10, long j10, byte[] bArr2, int i11) throws DataLengthException, IllegalArgumentException {
        ChaChaEngine chaChaEngine = new ChaChaEngine(12);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr2, i11, 32), new byte[8]));
        chaChaEngine.processBytes(bArr, i10, (int) j10, bArr, i10);
    }
}
