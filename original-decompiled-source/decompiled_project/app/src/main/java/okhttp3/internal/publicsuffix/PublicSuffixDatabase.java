package okhttp3.internal.publicsuffix;

import ad.b;
import c0.g0;
import hi.f0;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.r;
import lh.c;
import lh.g;
import lh.j;
import mh.x;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import qg.w;
import qg.z;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f19798e = new Companion(0);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f19799f = {42};

    /* renamed from: g, reason: collision with root package name */
    public static final List<String> f19800g = g0.c("*");

    /* renamed from: h, reason: collision with root package name */
    public static final PublicSuffixDatabase f19801h = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19802a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f19803b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f19804c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f19805d;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static final String a(Companion companion, byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            companion.getClass();
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > -1 && bArr[i15] != 10) {
                    i15--;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i11 = i16 + i17;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i17++;
                }
                int i18 = i11 - i16;
                int i19 = i10;
                boolean z11 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i19][i20];
                        byte[] bArr3 = Util.f19393a;
                        int i22 = b10 & 255;
                        z10 = z11;
                        i12 = i22;
                    }
                    byte b11 = bArr[i16 + i21];
                    byte[] bArr4 = Util.f19393a;
                    i13 = i12 - (b11 & 255);
                    if (i13 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    }
                    if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else {
                        if (i19 == bArr2.length - 1) {
                            break;
                        }
                        i19++;
                        i20 = -1;
                        z11 = true;
                    }
                }
                if (i13 >= 0) {
                    if (i13 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                r.d(UTF_8, "UTF_8");
                                return new String(bArr, i16, i18, UTF_8);
                            }
                        }
                    }
                    i14 = i11 + 1;
                }
                length = i15;
            }
            return null;
        }

        private Companion() {
        }
    }

    public static List c(String str) {
        List listP = x.P(str, new char[]{'.'});
        if (!r.a(qg.x.J(listP), "")) {
            return listP;
        }
        int size = listP.size() - 1;
        return qg.x.W(listP, size >= 0 ? size : 0);
    }

    public final String a(String str) throws InterruptedException {
        String strA;
        String strA2;
        String strA3;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        r.d(unicodeDomain, "unicodeDomain");
        List listC = c(unicodeDomain);
        List<String> listP = z.f22752a;
        if (this.f19802a.get() || !this.f19802a.compareAndSet(false, true)) {
            try {
                this.f19803b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z10 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z10 = true;
                    } catch (IOException e10) {
                        Platform.f19768a.getClass();
                        Platform.f19769b.getClass();
                        Platform.i("Failed to read public suffix list", 5, e10);
                        if (z10) {
                        }
                    }
                } finally {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (this.f19804c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size3 = listC.size();
        byte[][] bArr = new byte[size3][];
        for (int i10 = 0; i10 < size3; i10++) {
            String str2 = (String) listC.get(i10);
            Charset UTF_8 = StandardCharsets.UTF_8;
            r.d(UTF_8, "UTF_8");
            byte[] bytes = str2.getBytes(UTF_8);
            r.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                strA = null;
                break;
            }
            Companion companion = f19798e;
            byte[] bArr2 = this.f19804c;
            if (bArr2 == null) {
                r.h("publicSuffixListBytes");
                throw null;
            }
            strA = Companion.a(companion, bArr2, bArr, i11);
            if (strA != null) {
                break;
            }
            i11++;
        }
        if (size3 > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                bArr3[i12] = f19799f;
                Companion companion2 = f19798e;
                byte[] bArr4 = this.f19804c;
                if (bArr4 == null) {
                    r.h("publicSuffixListBytes");
                    throw null;
                }
                strA2 = Companion.a(companion2, bArr4, bArr3, i12);
                if (strA2 != null) {
                    break;
                }
            }
            strA2 = null;
        } else {
            strA2 = null;
        }
        if (strA2 != null) {
            int i13 = size3 - 1;
            for (int i14 = 0; i14 < i13; i14++) {
                Companion companion3 = f19798e;
                byte[] bArr5 = this.f19805d;
                if (bArr5 == null) {
                    r.h("publicSuffixExceptionListBytes");
                    throw null;
                }
                strA3 = Companion.a(companion3, bArr5, bArr, i14);
                if (strA3 != null) {
                    break;
                }
            }
            strA3 = null;
        } else {
            strA3 = null;
        }
        if (strA3 != null) {
            listP = x.P("!".concat(strA3), new char[]{'.'});
        } else if (strA == null && strA2 == null) {
            listP = f19800g;
        } else {
            List<String> listP2 = strA != null ? x.P(strA, new char[]{'.'}) : listP;
            if (strA2 != null) {
                listP = x.P(strA2, new char[]{'.'});
            }
            if (listP2.size() > listP.size()) {
                listP = listP2;
            }
        }
        if (listC.size() == listP.size() && listP.get(0).charAt(0) != '!') {
            return null;
        }
        if (listP.get(0).charAt(0) == '!') {
            size = listC.size();
            size2 = listP.size();
        } else {
            size = listC.size();
            size2 = listP.size() + 1;
        }
        int i15 = size - size2;
        g wVar = new w(c(str));
        if (i15 < 0) {
            throw new IllegalArgumentException(b.b(i15, "Requested element count ", " is less than zero.").toString());
        }
        if (i15 != 0) {
            wVar = wVar instanceof c ? ((c) wVar).a(i15) : new lh.b(wVar, i15);
        }
        return j.j(wVar, ".");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, byte[]] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, byte[]] */
    public final void b() throws IOException {
        try {
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                f0 f0VarB = hi.x.b(new hi.r(hi.x.h(resourceAsStream)));
                try {
                    long j10 = f0VarB.readInt();
                    f0VarB.u0(j10);
                    g0Var.f16327a = f0VarB.f13058b.N(j10);
                    long j11 = f0VarB.readInt();
                    f0VarB.u0(j11);
                    g0Var2.f16327a = f0VarB.f13058b.N(j11);
                    pg.f0 f0Var = pg.f0.f21461a;
                    f0VarB.close();
                    synchronized (this) {
                        T t3 = g0Var.f16327a;
                        r.b(t3);
                        this.f19804c = (byte[]) t3;
                        T t10 = g0Var2.f16327a;
                        r.b(t10);
                        this.f19805d = (byte[]) t10;
                    }
                } finally {
                }
            }
        } finally {
            this.f19803b.countDown();
        }
    }
}
