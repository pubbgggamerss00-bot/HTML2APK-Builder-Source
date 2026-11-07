package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: classes3.dex */
class View {
    final byte[] communicatedBits;
    final int[] inputShare;
    final int[] outputShare;

    public View(PicnicEngine picnicEngine) {
        int i10 = picnicEngine.stateSizeWords;
        this.inputShare = new int[i10];
        this.communicatedBits = new byte[picnicEngine.andSizeBytes];
        this.outputShare = new int[i10];
    }
}
