package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes3.dex */
class Tree {
    private static final Logger LOG = Logger.getLogger(Tree.class.getName());
    private static final int MAX_SEED_SIZE_BYTES = 32;
    private int dataSize;
    private int depth;
    private PicnicEngine engine;
    private boolean[] exists;
    private boolean[] haveNode;
    byte[][] nodes;
    private int numLeaves;
    private int numNodes;

    public Tree(PicnicEngine picnicEngine, int i10, int i11) {
        int i12;
        this.engine = picnicEngine;
        int iCeil_log2 = Utils.ceil_log2(i10);
        int i13 = iCeil_log2 + 1;
        this.depth = i13;
        int i14 = ((1 << i13) - 1) - ((1 << iCeil_log2) - i10);
        this.numNodes = i14;
        this.numLeaves = i10;
        this.dataSize = i11;
        this.nodes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i14, i11);
        int i15 = 0;
        while (true) {
            i12 = this.numNodes;
            if (i15 >= i12) {
                break;
            }
            this.nodes[i15] = new byte[i11];
            i15++;
        }
        this.haveNode = new boolean[i12];
        boolean[] zArr = new boolean[i12];
        this.exists = zArr;
        Arrays.fill(zArr, i12 - this.numLeaves, i12, true);
        for (int i16 = this.numNodes - this.numLeaves; i16 > 0; i16--) {
            int i17 = i16 * 2;
            if (exists(i17 + 1) || exists(i17 + 2)) {
                this.exists[i16] = true;
            }
        }
        this.exists[0] = true;
    }

    private void computeParentHash(int i10, byte[] bArr) {
        if (exists(i10)) {
            int parent = getParent(i10);
            boolean[] zArr = this.haveNode;
            if (zArr[parent]) {
                return;
            }
            int i11 = parent * 2;
            int i12 = i11 + 1;
            if (zArr[i12]) {
                int i13 = i11 + 2;
                if (!exists(i13) || this.haveNode[i13]) {
                    this.engine.digest.update((byte) 3);
                    PicnicEngine picnicEngine = this.engine;
                    picnicEngine.digest.update(this.nodes[i12], 0, picnicEngine.digestSizeBytes);
                    if (hasRightChild(parent)) {
                        PicnicEngine picnicEngine2 = this.engine;
                        picnicEngine2.digest.update(this.nodes[i13], 0, picnicEngine2.digestSizeBytes);
                    }
                    this.engine.digest.update(bArr, 0, 32);
                    this.engine.digest.update(Pack.intToLittleEndian(parent), 0, 2);
                    PicnicEngine picnicEngine3 = this.engine;
                    picnicEngine3.digest.doFinal(this.nodes[parent], 0, picnicEngine3.digestSizeBytes);
                    this.haveNode[parent] = true;
                }
            }
        }
    }

    private boolean contains(int[] iArr, int i10, int i11) {
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr[i12] == i11) {
                return true;
            }
        }
        return false;
    }

    private boolean exists(int i10) {
        if (i10 >= this.numNodes) {
            return false;
        }
        return this.exists[i10];
    }

    private void expandSeeds(byte[] bArr, int i10) {
        byte[] bArr2;
        int i11;
        byte[] bArr3 = new byte[64];
        int parent = getParent(this.numNodes - 1);
        int i12 = 0;
        while (i12 <= parent) {
            if (this.haveNode[i12]) {
                bArr2 = bArr;
                i11 = i10;
                hashSeed(bArr3, this.nodes[i12], bArr2, (byte) 1, i11, i12);
                int i13 = i12 * 2;
                int i14 = i13 + 1;
                if (!this.haveNode[i14]) {
                    System.arraycopy(bArr3, 0, this.nodes[i14], 0, this.engine.seedSizeBytes);
                    this.haveNode[i14] = true;
                }
                int i15 = i13 + 2;
                if (exists(i15) && !this.haveNode[i15]) {
                    int i16 = this.engine.seedSizeBytes;
                    System.arraycopy(bArr3, i16, this.nodes[i15], 0, i16);
                    this.haveNode[i15] = true;
                }
            } else {
                bArr2 = bArr;
                i11 = i10;
            }
            i12++;
            bArr = bArr2;
            i10 = i11;
        }
    }

    private int getParent(int i10) {
        return (isLeftChild(i10) ? i10 - 1 : i10 - 2) / 2;
    }

    private int[] getRevealedMerkleNodes(int[] iArr, int i10, int[] iArr2) {
        int i11 = this.numNodes;
        int i12 = i11 - this.numLeaves;
        boolean[] zArr = new boolean[i11];
        for (int i13 = 0; i13 < i10; i13++) {
            zArr[iArr[i13] + i12] = true;
        }
        for (int parent = getParent(this.numNodes - 1); parent > 0; parent--) {
            if (exists(parent)) {
                int i14 = parent * 2;
                int i15 = i14 + 2;
                int i16 = i14 + 1;
                if (exists(i15)) {
                    if (zArr[i16] && zArr[i15]) {
                        zArr[parent] = true;
                    }
                } else if (zArr[i16]) {
                    zArr[parent] = true;
                }
            }
        }
        int[] iArr3 = new int[this.numLeaves];
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            int parent2 = iArr[i18] + i12;
            while (true) {
                if (zArr[getParent(parent2)]) {
                    parent2 = getParent(parent2);
                    if (parent2 == 0) {
                        break;
                    }
                } else if (!contains(iArr3, i17, parent2)) {
                    iArr3[i17] = parent2;
                    i17++;
                }
            }
        }
        iArr2[0] = i17;
        return iArr3;
    }

    private int[] getRevealedNodes(int[] iArr, int i10, int[] iArr2) {
        int i11 = this.depth - 1;
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i11, i10);
        for (int i12 = 0; i12 < i10; i12++) {
            int parent = (this.numNodes - this.numLeaves) + iArr[i12];
            iArr3[0][i12] = parent;
            int i13 = 1;
            while (true) {
                parent = getParent(parent);
                if (parent != 0) {
                    iArr3[i13][i12] = parent;
                    i13++;
                }
            }
        }
        int[] iArr4 = new int[this.numLeaves];
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            for (int i16 = 0; i16 < i10; i16++) {
                if (hasSibling(iArr3[i15][i16])) {
                    int sibling = getSibling(iArr3[i15][i16]);
                    if (!contains(iArr3[i15], i10, sibling)) {
                        while (!hasRightChild(sibling) && !isLeafNode(sibling)) {
                            sibling = (sibling * 2) + 1;
                        }
                        if (!contains(iArr4, i14, sibling)) {
                            iArr4[i14] = sibling;
                            i14++;
                        }
                    }
                }
            }
        }
        iArr2[0] = i14;
        return iArr4;
    }

    private int getSibling(int i10) {
        if (!isLeftChild(i10)) {
            return i10 - 1;
        }
        int i11 = i10 + 1;
        if (i11 < this.numNodes) {
            return i11;
        }
        LOG.fine("getSibling: request for node with not sibling");
        return 0;
    }

    private boolean hasRightChild(int i10) {
        return (i10 * 2) + 2 < this.numNodes && exists(i10);
    }

    private boolean hasSibling(int i10) {
        if (exists(i10)) {
            return !isLeftChild(i10) || exists(i10 + 1);
        }
        return false;
    }

    private void hashSeed(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b10, int i10, int i11) {
        this.engine.digest.update(b10);
        PicnicEngine picnicEngine = this.engine;
        picnicEngine.digest.update(bArr2, 0, picnicEngine.seedSizeBytes);
        this.engine.digest.update(bArr3, 0, 32);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (i10 & 65535)), 0, 2);
        this.engine.digest.update(Pack.shortToLittleEndian((short) (65535 & i11)), 0, 2);
        PicnicEngine picnicEngine2 = this.engine;
        picnicEngine2.digest.doFinal(bArr, 0, picnicEngine2.seedSizeBytes * 2);
    }

    private boolean isLeafNode(int i10) {
        return (i10 * 2) + 1 >= this.numNodes;
    }

    private boolean isLeftChild(int i10) {
        return i10 % 2 == 1;
    }

    public int addMerkleNodes(int[] iArr, int i10, byte[] bArr, int i11) {
        int[] iArr2 = {0};
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i10, iArr2);
        for (int i12 = 0; i12 < iArr2[0]; i12++) {
            int i13 = this.dataSize;
            i11 -= i13;
            if (i11 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i12 * i13, this.nodes[revealedMerkleNodes[i12]], 0, i13);
            this.haveNode[revealedMerkleNodes[i12]] = true;
        }
        return i11 != 0 ? -1 : 0;
    }

    public void buildMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i10 = this.numNodes - this.numLeaves;
        for (int i11 = 0; i11 < this.numLeaves; i11++) {
            byte[] bArr3 = bArr[i11];
            if (bArr3 != null) {
                int i12 = i10 + i11;
                System.arraycopy(bArr3, 0, this.nodes[i12], 0, this.dataSize);
                this.haveNode[i12] = true;
            }
        }
        for (int i13 = this.numNodes; i13 > 0; i13--) {
            computeParentHash(i13, bArr2);
        }
    }

    public void generateSeeds(byte[] bArr, byte[] bArr2, int i10) {
        this.nodes[0] = bArr;
        this.haveNode[0] = true;
        expandSeeds(bArr2, i10);
    }

    public byte[] getLeaf(int i10) {
        return this.nodes[(this.numNodes - this.numLeaves) + i10];
    }

    public byte[][] getLeaves() {
        return this.nodes;
    }

    public int getLeavesOffset() {
        return this.numNodes - this.numLeaves;
    }

    public boolean hasLeftChild(Tree tree, int i10) {
        return (i10 * 2) + 1 < this.numNodes;
    }

    public byte[] openMerkleTree(int[] iArr, int i10, int[] iArr2) {
        int[] iArr3 = new int[1];
        int[] revealedMerkleNodes = getRevealedMerkleNodes(iArr, i10, iArr3);
        int i11 = iArr3[0] * this.dataSize;
        iArr2[0] = i11;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < iArr3[0]; i12++) {
            byte[] bArr2 = this.nodes[revealedMerkleNodes[i12]];
            int i13 = this.dataSize;
            System.arraycopy(bArr2, 0, bArr, i12 * i13, i13);
        }
        return bArr;
    }

    public int openMerkleTreeSize(int[] iArr, int i10) {
        int[] iArr2 = new int[1];
        getRevealedMerkleNodes(iArr, i10, iArr2);
        return iArr2[0] * this.engine.digestSizeBytes;
    }

    public int reconstructSeeds(int[] iArr, int i10, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i10, iArr2);
        for (int i13 = 0; i13 < iArr2[0]; i13++) {
            int i14 = this.engine.seedSizeBytes;
            i11 -= i14;
            if (i11 < 0) {
                return -1;
            }
            System.arraycopy(bArr, i13 * i14, this.nodes[revealedNodes[i13]], 0, i14);
            this.haveNode[revealedNodes[i13]] = true;
        }
        expandSeeds(bArr2, i12);
        return 0;
    }

    public int revealSeeds(int[] iArr, int i10, byte[] bArr, int i11) {
        int[] iArr2 = {0};
        int[] revealedNodes = getRevealedNodes(iArr, i10, iArr2);
        for (int i12 = 0; i12 < iArr2[0]; i12++) {
            int i13 = this.engine.seedSizeBytes;
            i11 -= i13;
            if (i11 < 0) {
                LOG.fine("Insufficient sized buffer provided to revealSeeds");
                return 0;
            }
            System.arraycopy(this.nodes[revealedNodes[i12]], 0, bArr, i12 * i13, i13);
        }
        return bArr.length - i11;
    }

    public int revealSeedsSize(int[] iArr, int i10) {
        int[] iArr2 = {0};
        getRevealedNodes(iArr, i10, iArr2);
        return iArr2[0] * this.engine.seedSizeBytes;
    }

    public int verifyMerkleTree(byte[][] bArr, byte[] bArr2) {
        int i10 = this.numNodes - this.numLeaves;
        for (int i11 = 0; i11 < this.numLeaves; i11++) {
            byte[] bArr3 = bArr[i11];
            if (bArr3 != null) {
                int i12 = i10 + i11;
                if (this.haveNode[i12]) {
                    return -1;
                }
                if (bArr3 != null) {
                    System.arraycopy(bArr3, 0, this.nodes[i12], 0, this.dataSize);
                    this.haveNode[i12] = true;
                }
            }
        }
        for (int i13 = this.numNodes; i13 > 0; i13--) {
            computeParentHash(i13, bArr2);
        }
        return !this.haveNode[0] ? -1 : 0;
    }
}
