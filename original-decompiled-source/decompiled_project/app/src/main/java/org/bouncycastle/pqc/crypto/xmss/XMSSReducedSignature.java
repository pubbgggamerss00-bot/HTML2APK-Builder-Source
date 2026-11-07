package org.bouncycastle.pqc.crypto.xmss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class XMSSReducedSignature implements XMSSStoreableObjectInterface {
    private final List<XMSSNode> authPath;
    private final XMSSParameters params;
    private final WOTSPlusSignature wotsPlusSignature;

    public static class Builder {
        private final XMSSParameters params;
        private WOTSPlusSignature wotsPlusSignature = null;
        private List<XMSSNode> authPath = null;
        private byte[] reducedSignature = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.params = xMSSParameters;
        }

        public XMSSReducedSignature build() {
            return new XMSSReducedSignature(this);
        }

        public Builder withAuthPath(List<XMSSNode> list) {
            this.authPath = list;
            return this;
        }

        public Builder withReducedSignature(byte[] bArr) {
            this.reducedSignature = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withWOTSPlusSignature(WOTSPlusSignature wOTSPlusSignature) {
            this.wotsPlusSignature = wOTSPlusSignature;
            return this;
        }
    }

    public XMSSReducedSignature(Builder builder) {
        XMSSParameters xMSSParameters = builder.params;
        this.params = xMSSParameters;
        if (xMSSParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        int len = xMSSParameters.getWOTSPlus().getParams().getLen();
        int height = xMSSParameters.getHeight();
        byte[] bArr = builder.reducedSignature;
        if (bArr == null) {
            WOTSPlusSignature wOTSPlusSignature = builder.wotsPlusSignature;
            this.wotsPlusSignature = wOTSPlusSignature == null ? new WOTSPlusSignature(xMSSParameters.getWOTSPlus().getParams(), (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, len, treeDigestSize)) : wOTSPlusSignature;
            List<XMSSNode> list = builder.authPath;
            if (list == null) {
                this.authPath = new ArrayList();
                return;
            } else {
                if (list.size() != height) {
                    throw new IllegalArgumentException("size of authPath needs to be equal to height of tree");
                }
                this.authPath = list;
                return;
            }
        }
        if (bArr.length != (height * treeDigestSize) + (len * treeDigestSize)) {
            throw new IllegalArgumentException("signature has wrong size");
        }
        byte[][] bArr2 = new byte[len][];
        int i10 = 0;
        for (int i11 = 0; i11 < len; i11++) {
            bArr2[i11] = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
            i10 += treeDigestSize;
        }
        this.wotsPlusSignature = new WOTSPlusSignature(this.params.getWOTSPlus().getParams(), bArr2);
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < height; i12++) {
            arrayList.add(new XMSSNode(i12, XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize)));
            i10 += treeDigestSize;
        }
        this.authPath = arrayList;
    }

    public List<XMSSNode> getAuthPath() {
        return this.authPath;
    }

    public XMSSParameters getParams() {
        return this.params;
    }

    public WOTSPlusSignature getWOTSPlusSignature() {
        return this.wotsPlusSignature;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = this.params.getTreeDigestSize();
        byte[] bArr = new byte[(this.params.getHeight() * treeDigestSize) + (this.params.getWOTSPlus().getParams().getLen() * treeDigestSize)];
        int i10 = 0;
        for (byte[] bArr2 : this.wotsPlusSignature.toByteArray()) {
            XMSSUtil.copyBytesAtOffset(bArr, bArr2, i10);
            i10 += treeDigestSize;
        }
        for (int i11 = 0; i11 < this.authPath.size(); i11++) {
            XMSSUtil.copyBytesAtOffset(bArr, this.authPath.get(i11).getValue(), i10);
            i10 += treeDigestSize;
        }
        return bArr;
    }
}
