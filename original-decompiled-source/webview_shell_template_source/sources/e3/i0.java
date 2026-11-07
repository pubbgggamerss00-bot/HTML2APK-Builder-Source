package e3;

import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f12886a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12887b;

    public i0(c3.b bVar, int i6) {
        com.google.android.gms.common.internal.l.f(bVar);
        this.f12887b = bVar;
        this.f12886a = i6;
    }

    public void a(z.b bVar) {
        int i6 = this.f12886a;
        Object[] objArr = (Object[]) this.f12887b;
        if (i6 < objArr.length) {
            objArr[i6] = bVar;
            this.f12886a = i6 + 1;
        }
    }

    public i0(String str) {
        this.f12887b = str;
        this.f12886a = 0;
    }

    public i0(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f12887b = null;
        this.f12886a = 1;
    }

    public i0() {
        this.f12887b = new Object[256];
    }
}
