package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: classes3.dex */
class Signature2 {
    int[] challengeC;
    byte[] challengeHash;
    int[] challengeP;
    byte[] cvInfo;
    int cvInfoLen;
    byte[] iSeedInfo;
    int iSeedInfoLen;
    Proof2[] proofs;
    byte[] salt = new byte[32];

    public static class Proof2 {
        byte[] C;
        byte[] aux;
        byte[] input;
        byte[] msgs;
        byte[] seedInfo = null;
        int seedInfoLen = 0;

        public Proof2(PicnicEngine picnicEngine) {
            this.C = new byte[picnicEngine.digestSizeBytes];
            this.input = new byte[picnicEngine.stateSizeBytes];
            int i10 = picnicEngine.andSizeBytes;
            this.aux = new byte[i10];
            this.msgs = new byte[i10];
        }
    }

    public Signature2(PicnicEngine picnicEngine) {
        this.challengeHash = new byte[picnicEngine.digestSizeBytes];
        int i10 = picnicEngine.numOpenedRounds;
        this.challengeC = new int[i10];
        this.challengeP = new int[i10];
        this.proofs = new Proof2[picnicEngine.numMPCRounds];
    }
}
