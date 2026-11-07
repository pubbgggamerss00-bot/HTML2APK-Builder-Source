package di;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final z f8032a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8033b = true;

    public k(z zVar) {
        this.f8032a = zVar;
    }

    public void a() {
        this.f8033b = false;
    }

    public void b(byte b10) {
        this.f8032a.d(b10);
    }

    public final void c(char c10) {
        z zVar = this.f8032a;
        zVar.a(zVar.f8085b, 1);
        char[] cArr = zVar.f8084a;
        int i10 = zVar.f8085b;
        zVar.f8085b = i10 + 1;
        cArr[i10] = c10;
    }

    public void d(int i10) {
        this.f8032a.d(i10);
    }

    public void e(long j10) {
        this.f8032a.d(j10);
    }

    public final void f(String v10) {
        kotlin.jvm.internal.r.e(v10, "v");
        this.f8032a.c(v10);
    }

    public void g(short s10) {
        this.f8032a.d(s10);
    }

    public void h(String value) {
        byte b10;
        kotlin.jvm.internal.r.e(value, "value");
        int length = value.length() + 2;
        z zVar = this.f8032a;
        zVar.a(zVar.f8085b, length);
        char[] cArr = zVar.f8084a;
        int i10 = zVar.f8085b;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length2 = value.length();
        value.getChars(0, length2, cArr, i11);
        int i12 = length2 + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = o0.f8064b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length3 = value.length();
                for (int i14 = i13 - i11; i14 < length3; i14++) {
                    zVar.a(i13, 2);
                    char cCharAt = value.charAt(i14);
                    byte[] bArr2 = o0.f8064b;
                    if (cCharAt >= bArr2.length || (b10 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        zVar.f8084a[i13] = cCharAt;
                        i13 = i15;
                    } else {
                        if (b10 == 1) {
                            String str = o0.f8063a[cCharAt];
                            kotlin.jvm.internal.r.b(str);
                            zVar.a(i13, str.length());
                            str.getChars(0, str.length(), zVar.f8084a, i13);
                            int length4 = str.length() + i13;
                            zVar.f8085b = length4;
                            i13 = length4;
                        } else {
                            char[] cArr2 = zVar.f8084a;
                            cArr2[i13] = '\\';
                            cArr2[i13 + 1] = (char) b10;
                            i13 += 2;
                            zVar.f8085b = i13;
                        }
                    }
                }
                zVar.a(i13, 1);
                zVar.f8084a[i13] = '\"';
                zVar.f8085b = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        zVar.f8085b = i12 + 1;
    }

    public void i() {
    }

    public void j() {
    }
}
