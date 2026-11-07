package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4903b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f4904c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4905d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4906e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g6(boolean z6, String str, int i6, byte[] bArr, int i7, int i8, byte[] bArr2) {
        int i9 = 1;
        y5.n((bArr2 == null) ^ (i6 == 0));
        this.f4902a = z6;
        this.f4903b = str;
        this.f4905d = i6;
        this.f4906e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        qs0.f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                        break;
                    } else {
                        i9 = 2;
                        break;
                    }
                case 3046671:
                    if (str.equals("cbcs")) {
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                    }
                    break;
                case 3049895:
                    if (!str.equals("cens")) {
                    }
                    break;
            }
        }
        this.f4904c = new r1(i9, bArr, i7, i8);
    }
}
