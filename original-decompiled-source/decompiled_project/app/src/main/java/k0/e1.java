package k0;

import android.view.inputmethod.HandwritingGesture;
import k0.s1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class e1 {
    public static int a(HandwritingGesture handwritingGesture, s1.a aVar) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        aVar.invoke(new y2.a(fallbackText, 1));
        return 5;
    }

    public static void b(long j10, t2.b bVar, boolean z10, s1.a aVar) {
        if (z10) {
            int i10 = t2.j0.f27838c;
            int iCharCount = (int) (j10 >> 32);
            int iCharCount2 = (int) (j10 & BodyPartID.bodyIdMax);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(bVar, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < bVar.f27761b.length() ? Character.codePointAt(bVar, iCharCount2) : 10;
            if (g1.i(iCodePointBefore) && (g1.h(iCodePointAt) || g1.g(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(bVar, iCharCount);
                    }
                } while (g1.i(iCodePointBefore));
                j10 = t2.k0.a(iCharCount, iCharCount2);
            } else if (g1.i(iCodePointAt) && (g1.h(iCodePointBefore) || g1.g(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == bVar.f27761b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(bVar, iCharCount2);
                    }
                } while (g1.i(iCodePointAt));
                j10 = t2.k0.a(iCharCount, iCharCount2);
            }
        }
        int i11 = (int) (BodyPartID.bodyIdMax & j10);
        aVar.invoke(new f1(new y2.i[]{new y2.b0(i11, i11), new y2.g(t2.j0.c(j10), 0)}));
    }
}
