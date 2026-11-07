package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: classes3.dex */
class NodeEntry {
    final int nodeHeight;
    final byte[] nodeValue;

    public NodeEntry(byte[] bArr, int i10) {
        this.nodeValue = bArr;
        this.nodeHeight = i10;
    }
}
