package i0;

import android.text.Spanned;
import androidx.emoji2.text.f;
import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class v2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int a(int i10, String str) {
        androidx.emoji2.text.d dVarA;
        String str2;
        int spanEnd;
        Integer num = null;
        if (androidx.emoji2.text.d.d()) {
            dVarA = androidx.emoji2.text.d.a();
            if (dVarA.c() != 1) {
                dVarA = null;
            }
        }
        if (dVarA != null) {
            if (!(dVarA.c() == 1)) {
                throw new IllegalStateException("Not initialized yet");
            }
            x3.e.a(str, "charSequence cannot be null");
            androidx.emoji2.text.f fVar = dVarA.f2203e.f2208b;
            fVar.getClass();
            if (i10 < 0 || i10 >= str.length()) {
                str2 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                x4.g[] gVarArr = (x4.g[]) spanned.getSpans(i10, i10 + 1, x4.g.class);
                if (gVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(gVarArr[0]);
                    str2 = str;
                } else {
                    str2 = str;
                    spanEnd = ((f.c) fVar.c(str2, Math.max(0, i10 - 16), Math.min(str.length(), i10 + 16), Integer.MAX_VALUE, true, new f.c(i10))).f2225c;
                }
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(int i10, String str) {
        androidx.emoji2.text.d dVarA;
        Integer num = null;
        if (androidx.emoji2.text.d.d()) {
            dVarA = androidx.emoji2.text.d.a();
            if (dVarA.c() != 1) {
                dVarA = null;
            }
        }
        if (dVarA != null) {
            int iB = dVarA.b(str, Math.max(0, i10 - 1));
            Integer numValueOf = Integer.valueOf(iB);
            if (iB != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i10);
    }
}
