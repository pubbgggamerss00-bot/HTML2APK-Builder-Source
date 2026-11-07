package y2;

import android.view.inputmethod.ExtractedText;

/* loaded from: classes.dex */
public final class q {
    public static final ExtractedText a(c0 c0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0Var.f33682a.f27761b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = c0Var.f33683b;
        extractedText.selectionStart = t2.j0.e(j10);
        extractedText.selectionEnd = t2.j0.d(j10);
        extractedText.flags = !mh.x.s(c0Var.f33682a.f27761b, '\n') ? 1 : 0;
        return extractedText;
    }
}
