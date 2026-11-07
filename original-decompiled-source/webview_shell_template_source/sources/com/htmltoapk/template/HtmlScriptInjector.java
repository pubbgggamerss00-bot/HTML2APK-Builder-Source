package com.htmltoapk.template;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Collections;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class HtmlScriptInjector {
    private static final int PREFIX_BYTES = 65536;
    public static final HtmlScriptInjector INSTANCE = new HtmlScriptInjector();
    private static final x5.e head = new x5.e("<head(?:\\s[^>]*)?>", 0);

    private HtmlScriptInjector() {
    }

    public final InputStream inject(InputStream inputStream, String str) {
        u5.c cVarB;
        kotlin.jvm.internal.j.e("input", inputStream);
        kotlin.jvm.internal.j.e("scriptTag", str);
        byte[] bArr = new byte[PREFIX_BYTES];
        int i6 = 0;
        while (i6 < PREFIX_BYTES) {
            int i7 = inputStream.read(bArr, i6, PREFIX_BYTES - i6);
            if (i7 < 0) {
                break;
            }
            if (i7 == 0) {
                int i8 = inputStream.read();
                if (i8 < 0) {
                    break;
                }
                bArr[i6] = (byte) i8;
                i6++;
            } else {
                i6 += i7;
            }
        }
        x5.d dVarA = x5.e.a(head, new String(bArr, 0, i6, x5.a.f15158b));
        int i9 = (dVarA == null || (cVarB = dVarA.b()) == null) ? (i6 >= 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65) ? 3 : 0 : cVarB.f14720t + 1;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr, 0, i9);
        byte[] bytes = str.getBytes(x5.a.f15157a);
        kotlin.jvm.internal.j.d("getBytes(...)", bytes);
        return new SequenceInputStream(Collections.enumeration(e5.l.c(byteArrayInputStream, new ByteArrayInputStream(bytes), new ByteArrayInputStream(bArr, i9, i6 - i9), inputStream)));
    }
}
