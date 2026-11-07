package e6;

import android.view.inputmethod.ExtractedText;
import mh.x;
import t2.j0;
import y2.c0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8397a = 0;

    public static final ExtractedText a(c0 c0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c0Var.f33682a.f27761b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j10 = c0Var.f33683b;
        extractedText.selectionStart = j0.e(j10);
        extractedText.selectionEnd = j0.d(j10);
        extractedText.flags = !x.s(c0Var.f33682a.f27761b, '\n') ? 1 : 0;
        return extractedText;
    }
}
