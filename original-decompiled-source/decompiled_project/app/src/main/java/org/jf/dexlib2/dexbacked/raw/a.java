package org.jf.dexlib2.dexbacked.raw;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20548a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20548a) {
            case 0:
                return ((Integer) obj).compareTo((Integer) obj2);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
        }
    }
}
