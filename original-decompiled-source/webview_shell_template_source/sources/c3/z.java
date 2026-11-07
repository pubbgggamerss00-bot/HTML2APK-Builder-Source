package c3;

import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z extends y {

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f2191t;

    public z(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f2191t = bArr;
    }

    @Override // c3.y
    public final byte[] r() {
        return this.f2191t;
    }
}
