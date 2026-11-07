package se;

import java.util.ArrayList;
import java.util.HashMap;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public int f24905e;

    /* renamed from: a, reason: collision with root package name */
    public String f24901a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f24902b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f24903c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f24904d = 4;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24906f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f24907g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f24908h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f24909i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f24910j = new ArrayList();

    public final void a(String str, byte[] bArr) {
        this.f24908h.put(str, bArr.clone());
        int i10 = 0;
        for (byte b10 : bArr) {
            i10 = (i10 << 8) | ((b10 + HPKE.mode_base) % 256);
        }
        this.f24907g.put(Integer.valueOf(i10), str);
        " ".equals(str);
    }

    public final String toString() {
        return this.f24901a;
    }
}
