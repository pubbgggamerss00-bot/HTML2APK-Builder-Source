package r0;

import java.util.Comparator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i6 = 0; i6 < bArr.length; i6++) {
            byte b7 = bArr[i6];
            byte b8 = bArr2[i6];
            if (b7 != b8) {
                return b7 - b8;
            }
        }
        return 0;
    }
}
