package org.bouncycastle.tsp.ers;

/* loaded from: classes3.dex */
class IndexedHash {
    final byte[] digest;
    final int order;

    public IndexedHash(int i10, byte[] bArr) {
        this.order = i10;
        this.digest = bArr;
    }
}
