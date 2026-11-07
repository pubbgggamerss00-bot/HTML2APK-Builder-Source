package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class BinaryTreeRootCalculator implements ERSRootNodeCalculator {
    private List<List<byte[]>> tree;

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public PartialHashtree[] computePathToRoot(DigestCalculator digestCalculator, PartialHashtree partialHashtree, int i10) {
        List<byte[]> list;
        int i11;
        ArrayList arrayList = new ArrayList();
        byte[] bArrComputeNodeHash = ERSUtil.computeNodeHash(digestCalculator, partialHashtree);
        arrayList.add(partialHashtree);
        int i12 = 0;
        while (i12 < this.tree.size() - 1) {
            if (i10 == this.tree.get(i12).size() - 1) {
                while (true) {
                    int i13 = i12 + 1;
                    if (!Arrays.areEqual(bArrComputeNodeHash, this.tree.get(i13).get(r3.size() - 1))) {
                        break;
                    }
                    i10 = this.tree.get(i13).size() - 1;
                    i12 = i13;
                }
            }
            if ((i10 & 1) == 0) {
                list = this.tree.get(i12);
                i11 = i10 + 1;
            } else {
                list = this.tree.get(i12);
                i11 = i10 - 1;
            }
            byte[] bArr = list.get(i11);
            arrayList.add(new PartialHashtree(bArr));
            bArrComputeNodeHash = ERSUtil.calculateBranchHash(digestCalculator, bArrComputeNodeHash, bArr);
            i10 /= 2;
            i12++;
        }
        return (PartialHashtree[]) arrayList.toArray(new PartialHashtree[0]);
    }

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] computeRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr) {
        ArrayList arrayList;
        SortedHashList sortedHashList = new SortedHashList();
        for (PartialHashtree partialHashtree : partialHashtreeArr) {
            sortedHashList.add(ERSUtil.computeNodeHash(digestCalculator, partialHashtree));
        }
        List<byte[]> list = sortedHashList.toList();
        ArrayList arrayList2 = new ArrayList();
        this.tree = arrayList2;
        arrayList2.add(list);
        if (list.size() > 1) {
            while (true) {
                arrayList = new ArrayList((list.size() / 2) + 1);
                for (int i10 = 0; i10 <= list.size() - 2; i10 += 2) {
                    arrayList.add(ERSUtil.calculateBranchHash(digestCalculator, list.get(i10), list.get(i10 + 1)));
                }
                if (list.size() % 2 == 1) {
                    arrayList.add(list.get(list.size() - 1));
                }
                this.tree.add(arrayList);
                if (arrayList.size() <= 1) {
                    break;
                }
                list = arrayList;
            }
            list = arrayList;
        }
        return list.get(0);
    }

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] recoverRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr) {
        byte[] bArrComputeNodeHash = ERSUtil.computeNodeHash(digestCalculator, partialHashtreeArr[0]);
        for (int i10 = 1; i10 < partialHashtreeArr.length; i10++) {
            bArrComputeNodeHash = ERSUtil.calculateBranchHash(digestCalculator, bArrComputeNodeHash, ERSUtil.computeNodeHash(digestCalculator, partialHashtreeArr[i10]));
        }
        return bArrComputeNodeHash;
    }
}
