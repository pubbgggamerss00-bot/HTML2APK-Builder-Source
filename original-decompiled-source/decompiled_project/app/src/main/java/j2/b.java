package j2;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public Serializable f14647a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14648b;

    public b(int i10) {
        switch (i10) {
            case 2:
                this.f14647a = new HashMap(250);
                this.f14648b = new HashMap(250);
                break;
            default:
                this.f14648b = new int[2];
                break;
        }
    }

    public void a(int i10, String str) {
        ((HashMap) this.f14647a).put(Integer.valueOf(i10), str);
        ((HashMap) this.f14648b).put(str, Integer.valueOf(i10));
    }

    public abstract int[] b(int i10);

    public int[] c(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f14648b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String d() {
        String str = (String) this.f14647a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.r.h("text");
        throw null;
    }

    public abstract int[] e(int i10);
}
