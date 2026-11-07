package org.bouncycastle.pqc.legacy.crypto.gmss;

import b.o;
import k1.q;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;
import v5.b;
import x0.a;

/* loaded from: classes3.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* renamed from: i, reason: collision with root package name */
    private int f20456i;

    /* renamed from: j, reason: collision with root package name */
    private int f20457j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w, reason: collision with root package name */
    private int f20458w;

    public GMSSLeaf(Digest digest, int i10, int i11) {
        this.f20458w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d10 = i10;
        this.keysize = ((int) Math.ceil((r7 << 3) / d10)) + ((int) Math.ceil(getLog((r7 << i10) + 1) / d10));
        this.two_power_w = 1 << i10;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i11);
        int i12 = this.mdsize;
        this.seed = new byte[i12];
        this.leaf = new byte[i12];
        this.privateKeyOTS = new byte[i12];
        this.concHashs = new byte[i12 * this.keysize];
    }

    private int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i10 = 0; i10 < this.steps + 10000; i10++) {
            int i11 = this.f20456i;
            if (i11 == this.keysize && this.f20457j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i11 == 0 || this.f20457j == this.two_power_w - 1) {
                this.f20456i = i11 + 1;
                this.f20457j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i12 = this.f20457j + 1;
                this.f20457j = i12;
                if (i12 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i13 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f20456i - 1) * i13, i13);
                }
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.f20456i + " " + this.f20457j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        return new byte[][]{this.privateKeyOTS, this.seed, this.concHashs, this.leaf};
    }

    public int[] getStatInt() {
        return new int[]{this.f20456i, this.f20457j, this.steps, this.f20458w};
    }

    public void initLeafCalc(byte[] bArr) {
        this.f20456i = 0;
        this.f20457j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String strA = "";
        for (int i10 = 0; i10 < 4; i10++) {
            strA = a.a(q.a(strA), getStatInt()[i10], " ");
        }
        StringBuilder sbA = b.a(strA, " ");
        sbA.append(this.mdsize);
        sbA.append(" ");
        sbA.append(this.keysize);
        sbA.append(" ");
        String strA2 = a.a(sbA, this.two_power_w, " ");
        byte[][] statByte = getStatByte();
        for (int i11 = 0; i11 < 4; i11++) {
            strA2 = statByte[i11] != null ? o.a(q.a(strA2), new String(Hex.encode(statByte[i11])), " ") : k3.a.a(strA2, "null ");
        }
        return strA2;
    }

    public GMSSLeaf(Digest digest, int i10, int i11, byte[] bArr) {
        this.f20458w = i10;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d10 = i10;
        this.keysize = ((int) Math.ceil((r7 << 3) / d10)) + ((int) Math.ceil(getLog((r7 << i10) + 1) / d10));
        this.two_power_w = 1 << i10;
        this.steps = (int) Math.ceil(((((r8 - 1) * r7) + 1) + r7) / i11);
        int i12 = this.mdsize;
        this.seed = new byte[i12];
        this.leaf = new byte[i12];
        this.privateKeyOTS = new byte[i12];
        this.concHashs = new byte[i12 * this.keysize];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f20456i = iArr[0];
        this.f20457j = iArr[1];
        this.steps = iArr[2];
        this.f20458w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.keysize = ((int) Math.ceil((r9 << 3) / this.f20458w)) + ((int) Math.ceil(getLog((r9 << this.f20458w) + 1) / this.f20458w));
        this.two_power_w = 1 << this.f20458w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f20456i = gMSSLeaf.f20456i;
        this.f20457j = gMSSLeaf.f20457j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f20458w = gMSSLeaf.f20458w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}
