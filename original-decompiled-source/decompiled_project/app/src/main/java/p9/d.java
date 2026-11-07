package p9;

import android.util.Base64;
import eh.p;
import q8.i;
import q8.y0;
import x0.h2;
import x0.j;
import x0.k;

/* loaded from: classes.dex */
public final class d {
    public static final void a(final float f10, final f1.b bVar, j jVar, final int i10) {
        k kVarP = jVar.p(1082229008);
        if ((((kVarP.h(f10) ? 4 : 2) | i10) & 19) == 18 && kVarP.s()) {
            kVarP.v();
        } else {
            i.a(null, null, f1.c.b(307255273, new y0(bVar, f10), kVarP), kVarP, 384);
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new p(f10, bVar, i10) { // from class: q8.x0

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f22491a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f1.b f22492b;

                @Override // eh.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iN = f3.i.n(49);
                    p9.d.a(this.f22491a, this.f22492b, (x0.j) obj, iN);
                    return pg.f0.f21461a;
                }
            };
        }
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }
}
