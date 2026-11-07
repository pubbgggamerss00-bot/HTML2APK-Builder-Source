package okhttp3.internal.http2;

import b.o;
import hi.j;
import kotlin.jvm.internal.r;
import mh.t;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Http2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Http2 f19609a = new Http2();

    /* renamed from: b, reason: collision with root package name */
    public static final j f19610b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f19611c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f19612d;

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f19613e;

    static {
        j jVar = j.f13075d;
        f19610b = j.a.b("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f19611c = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f19612d = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            r.d(binaryString, "toBinaryString(it)");
            strArr[i10] = t.m(Util.h("%8s", binaryString), ' ', '0');
        }
        f19613e = strArr;
        String[] strArr2 = f19612d;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = o.a(new StringBuilder(), strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f19612d;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + '|' + strArr3[i13];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i14]);
            sb.append('|');
            strArr3[i15 | 8] = o.a(sb, strArr3[i13], "|PADDED");
        }
        int length = f19612d.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f19612d;
            if (strArr4[i16] == null) {
                strArr4[i16] = f19613e[i16];
            }
        }
    }

    private Http2() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(boolean z10, int i10, int i11, int i12, int i13) {
        String strN;
        String str;
        String[] strArr = f19611c;
        String strH = i12 < strArr.length ? strArr[i12] : Util.h("0x%02x", Integer.valueOf(i12));
        if (i13 == 0) {
            strN = "";
        } else {
            String[] strArr2 = f19613e;
            if (i12 == 2 || i12 == 3) {
                strN = strArr2[i13];
            } else if (i12 == 4 || i12 == 6) {
                strN = i13 == 1 ? "ACK" : strArr2[i13];
            } else if (i12 != 7 && i12 != 8) {
                String[] strArr3 = f19612d;
                if (i13 < strArr3.length) {
                    str = strArr3[i13];
                    r.b(str);
                } else {
                    str = strArr2[i13];
                }
                strN = (i12 != 5 || (i13 & 4) == 0) ? (i12 != 0 || (i13 & 32) == 0) ? str : t.n(str, "PRIORITY", "COMPRESSED") : t.n(str, "HEADERS", "PUSH_PROMISE");
            }
        }
        return Util.h("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), strH, strN);
    }
}
